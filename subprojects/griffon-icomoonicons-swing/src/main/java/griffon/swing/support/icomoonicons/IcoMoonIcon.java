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
package griffon.swing.support.icomoonicons;

import griffon.plugins.icomoonicons.IcoMoon;

import javax.annotation.Nonnull;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.net.URL;

import static griffon.plugins.icomoonicons.IcoMoon.invalidDescription;
import static griffon.plugins.icomoonicons.IcoMoon.requireValidSize;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class IcoMoonIcon extends ImageIcon {
    private static final String ERROR_ICOMOON_NULL = "Argument 'icomoon' must not be null";
    private IcoMoon icomoon;
    private int size;

    public IcoMoonIcon() {
        this(IcoMoon.findByDescription("icomoon:16"));
    }

    public IcoMoonIcon(@Nonnull IcoMoon icomoon) {
        this(icomoon, 16);
    }

    public IcoMoonIcon(@Nonnull IcoMoon icomoon, int size) {
        super(toURL(icomoon, size));
        this.icomoon = requireNonNull(icomoon, ERROR_ICOMOON_NULL);
        this.size = size;
    }

    public IcoMoonIcon(@Nonnull String description) {
        this(IcoMoon.findByDescription(description));
        setIcoMoon(description);
    }

    @Nonnull
    private static URL toURL(@Nonnull IcoMoon icomoon, int size) {
        requireNonNull(icomoon, ERROR_ICOMOON_NULL);
        String resource = icomoon.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + icomoon + " does not exist");
        }
        return url;
    }

    @Nonnull
    public IcoMoon getIcoMoon() {
        return icomoon;
    }

    public void setIcoMoon(@Nonnull IcoMoon icomoon) {
        this.icomoon = requireNonNull(icomoon, ERROR_ICOMOON_NULL);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(icomoon, size)));
    }

    public void setIcoMoon(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");

        String[] parts = description.split(":");
        if (parts.length == 2) {
            try {
                int s = Integer.parseInt(parts[1]);
                this.size = requireValidSize(s);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else if (size == 0) {
            size = 16;
        }

        this.icomoon = IcoMoon.findByDescription(description);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(icomoon, size)));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = requireValidSize(size);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(icomoon, size)));
    }
}