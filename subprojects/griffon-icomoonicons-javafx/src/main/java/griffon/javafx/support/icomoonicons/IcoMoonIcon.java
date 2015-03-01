/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.javafx.support.icomoonicons;

import griffon.plugins.icomoonicons.IcoMoon;
import javafx.scene.image.Image;

import javax.annotation.Nonnull;
import java.net.URL;

import static griffon.plugins.icomoonicons.IcoMoon.invalidDescription;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class IcoMoonIcon extends Image {
    private static final String ERROR_FEED_NULL = "Argument 'icomoon' must not be null.";
    private IcoMoon icomoon;
    private int size;

    public IcoMoonIcon(@Nonnull IcoMoon icomoon) {
        this(icomoon, 16);
    }

    public IcoMoonIcon(@Nonnull IcoMoon icomoon, int size) {
        super(toURL(icomoon, size), true);
        this.icomoon = requireNonNull(icomoon, ERROR_FEED_NULL);
        this.size = size;
    }

    public IcoMoonIcon(@Nonnull String description) {
        super(toURL(description));
        this.icomoon = IcoMoon.findByDescription(description);

        String[] parts = description.split(":");
        if (parts.length == 2) {
            try {
                this.size = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else if (size == 0) {
            size = 16;
        }
    }

    @Nonnull
    private static String toURL(@Nonnull IcoMoon icomoon, int size) {
        requireNonNull(icomoon, ERROR_FEED_NULL);
        String resource = icomoon.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + icomoon + ":" + size + " does not exist");
        }
        return url.toExternalForm();
    }

    @Nonnull
    private static String toURL(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");
        String resource = IcoMoon.asResource(description);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + description + " does not exist");
        }
        return url.toExternalForm();
    }

    @Nonnull
    public IcoMoon getIcoMoon() {
        return icomoon;
    }

    public int getSize() {
        return size;
    }
}