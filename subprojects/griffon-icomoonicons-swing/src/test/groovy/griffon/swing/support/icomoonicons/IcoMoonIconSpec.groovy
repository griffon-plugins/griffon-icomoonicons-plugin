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
package griffon.swing.support.icomoonicons

import griffon.plugins.icomoonicons.IcoMoon
import spock.lang.Specification

/**
 * @author Andres Almiray
 */
class IcoMoonIconSpec extends Specification {
    def 'Can create a IcoMoonIcon instance'() {
        given:
        IcoMoon expected = IcoMoon.GITHUB

        expect:
        IcoMoonIcon icon = new IcoMoonIcon(expected)
        icon.icomoon == expected
        icon.size == 16
    }

    def 'Invalid IcoMoonIcon arguments'() {
        when:
        new IcoMoonIcon(arg)

        then:
        thrown(IllegalArgumentException)

        where:
        arg   | _
        null  | _
        ''    | _
        ' '   | _
        'foo' | _
    }
}
