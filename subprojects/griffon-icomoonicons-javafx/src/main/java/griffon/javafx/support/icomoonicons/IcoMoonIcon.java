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

import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class IcoMoonIcon extends Image {
    private final IcoMoon icomoon;
    private final int size;

    public IcoMoonIcon(@Nonnull IcoMoon icomoon) {
        this(icomoon, 16);
    }

    public IcoMoonIcon(@Nonnull IcoMoon icomoon, int size) {
        super(toURL(icomoon, size), true);
        this.icomoon = icomoon;
        this.size = size;
    }

    public IcoMoonIcon(@Nonnull String description) {
        this(IcoMoon.findByDescription(description));
    }

    @Nonnull
    private static String toURL(@Nonnull IcoMoon icomoon, int size) {
        requireNonNull(icomoon, "Argument 'icomoon' must not be null.");
        String resource = icomoon.asResource(size);
        return Thread.currentThread().getContextClassLoader().getResource(resource).toExternalForm();
    }

    @Nonnull
    public IcoMoon getIcoMoon() {
        return icomoon;
    }

    public int getSize() {
        return size;
    }
}