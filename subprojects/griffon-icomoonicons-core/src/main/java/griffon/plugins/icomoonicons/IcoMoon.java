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
package griffon.plugins.icomoonicons;

import javax.annotation.Nonnull;

import static griffon.util.GriffonClassUtils.requireState;
import static griffon.util.GriffonNameUtils.isBlank;
import static griffon.util.GriffonNameUtils.requireNonBlank;

/**
 * @author Andres Almiray
 */
public enum IcoMoon {
    ACCESSIBILITY("accessibility"),
    ADDRESS_BOOK("address-book"),
    AID("aid"),
    AIRPLANE("airplane"),
    ALARM("alarm"),
    ALARM2("alarm2"),
    ANDROID("android"),
    ANGRY("angry"),
    ANGRY2("angry2"),
    APPLE("apple"),
    ARROW_DOWN_LEFT("arrow-down-left"),
    ARROW_DOWN_LEFT2("arrow-down-left2"),
    ARROW_DOWN_LEFT3("arrow-down-left3"),
    ARROW_DOWN_RIGHT("arrow-down-right"),
    ARROW_DOWN_RIGHT2("arrow-down-right2"),
    ARROW_DOWN_RIGHT3("arrow-down-right3"),
    ARROW_DOWN("arrow-down"),
    ARROW_DOWN2("arrow-down2"),
    ARROW_DOWN3("arrow-down3"),
    ARROW_LEFT("arrow-left"),
    ARROW_LEFT2("arrow-left2"),
    ARROW_LEFT3("arrow-left3"),
    ARROW_RIGHT("arrow-right"),
    ARROW_RIGHT2("arrow-right2"),
    ARROW_RIGHT3("arrow-right3"),
    ARROW_UP_LEFT("arrow-up-left"),
    ARROW_UP_LEFT2("arrow-up-left2"),
    ARROW_UP_LEFT3("arrow-up-left3"),
    ARROW_UP_RIGHT("arrow-up-right"),
    ARROW_UP_RIGHT2("arrow-up-right2"),
    ARROW_UP_RIGHT3("arrow-up-right3"),
    ARROW_UP("arrow-up"),
    ARROW_UP2("arrow-up2"),
    ARROW_UP3("arrow-up3"),
    ATTACHMENT("attachment"),
    BACKWARD("backward"),
    BACKWARD2("backward2"),
    BARCODE("barcode"),
    BARS("bars"),
    BARS2("bars2"),
    BELL("bell"),
    BINOCULARS("binoculars"),
    BLOCKED("blocked"),
    BLOG("blog"),
    BLOGGER("blogger"),
    BLOGGER2("blogger2"),
    BOLD("bold"),
    BOOK("book"),
    BOOKMARK("bookmark"),
    BOOKMARKS("bookmarks"),
    BOOKS("books"),
    BOX_ADD("box-add"),
    BOX_REMOVE("box-remove"),
    BRIEFCASE("briefcase"),
    BRIGHTNESS_CONTRAST("brightness-contrast"),
    BRIGHTNESS_MEDIUM("brightness-medium"),
    BUBBLE("bubble"),
    BUBBLE2("bubble2"),
    BUBBLES("bubbles"),
    BUBBLES2("bubbles2"),
    BUBBLES3("bubbles3"),
    BUBBLES4("bubbles4"),
    BUG("bug"),
    BULLHORN("bullhorn"),
    BUSY("busy"),
    CABINET("cabinet"),
    CALCULATE("calculate"),
    CALENDAR("calendar"),
    CALENDAR2("calendar2"),
    CAMERA("camera"),
    CAMERA2("camera2"),
    CANCEL_CIRCLE("cancel-circle"),
    CART("cart"),
    CART2("cart2"),
    CART3("cart3"),
    CHECKBOX_CHECKED("checkbox-checked"),
    CHECKBOX_PARTIAL("checkbox-partial"),
    CHECKBOX_UNCHECKED("checkbox-unchecked"),
    CHECKMARK_CIRCLE("checkmark-circle"),
    CHECKMARK("checkmark"),
    CHECKMARK2("checkmark2"),
    CHROME("chrome"),
    CLOCK("clock"),
    CLOCK2("clock2"),
    CLOSE("close"),
    CLOUD_DOWNLOAD("cloud-download"),
    CLOUD_UPLOAD("cloud-upload"),
    CLOUD("cloud"),
    CLUBS("clubs"),
    CODE("code"),
    COG("cog"),
    COG2("cog2"),
    COGS("cogs"),
    COIN("coin"),
    COMPASS("compass"),
    CONFUSED("confused"),
    CONFUSED2("confused2"),
    CONNECTION("connection"),
    CONSOLE("console"),
    CONTRACT("contract"),
    CONTRACT2("contract2"),
    CONTRAST("contrast"),
    COOL("cool"),
    COOL2("cool2"),
    COPY("copy"),
    COPY2("copy2"),
    COPY3("copy3"),
    CREDIT("credit"),
    CROP("crop"),
    CSS3("css3"),
    DASHBOARD("dashboard"),
    DELICIOUS("delicious"),
    DEVIANTART("deviantart"),
    DEVIANTART2("deviantart2"),
    DIAMONDS("diamonds"),
    DICE("dice"),
    DISK("disk"),
    DOWNLOAD("download"),
    DOWNLOAD2("download2"),
    DOWNLOAD3("download3"),
    DRAWER("drawer"),
    DRAWER2("drawer2"),
    DRAWER3("drawer3"),
    DRIBBBLE("dribbble"),
    DRIBBBLE2("dribbble2"),
    DRIBBBLE3("dribbble3"),
    DROPLET("droplet"),
    EARTH("earth"),
    EJECT("eject"),
    EMBED("embed"),
    ENTER("enter"),
    ENVELOP("envelop"),
    EQUALIZER("equalizer"),
    EVIL("evil"),
    EVIL2("evil2"),
    EXIT("exit"),
    EXPAND("expand"),
    EXPAND2("expand2"),
    EYE_BLOCKED("eye-blocked"),
    EYE("eye"),
    EYE2("eye2"),
    FACEBOOK("facebook"),
    FACEBOOK2("facebook2"),
    FACEBOOK3("facebook3"),
    FEED("feed"),
    FEED2("feed2"),
    FEED3("feed3"),
    FEED4("feed4"),
    FILE_CSS("file-css"),
    FILE_EXCEL("file-excel"),
    FILE_OPENOFFICE("file-openoffice"),
    FILE_PDF("file-pdf"),
    FILE_POWERPOINT("file-powerpoint"),
    FILE_WORD("file-word"),
    FILE_XML("file-xml"),
    FILE_ZIP("file-zip"),
    FILE("file"),
    FILE2("file2"),
    FILE3("file3"),
    FILE4("file4"),
    FILM("film"),
    FILTER("filter"),
    FILTER2("filter2"),
    FINDER("finder"),
    FIRE("fire"),
    FIREFOX("firefox"),
    FIRST("first"),
    FLAG("flag"),
    FLATTR("flattr"),
    FLICKR("flickr"),
    FLICKR2("flickr2"),
    FLICKR3("flickr3"),
    FLICKR4("flickr4"),
    FLIP("flip"),
    FLIP2("flip2"),
    FOLDER_OPEN("folder-open"),
    FOLDER("folder"),
    FONT("font"),
    FOOD("food"),
    FORRST("forrst"),
    FORRST2("forrst2"),
    FORWARD("forward"),
    FORWARD2("forward2"),
    FORWARD3("forward3"),
    FOURSQUARE("foursquare"),
    FOURSQUARE2("foursquare2"),
    GIFT("gift"),
    GITHUB("github"),
    GITHUB2("github2"),
    GITHUB3("github3"),
    GITHUB4("github4"),
    GITHUB5("github5"),
    GLASS("glass"),
    GLOBE("globe"),
    GOOGLE_DRIVE("google-drive"),
    GOOGLE_PLUS("google-plus"),
    GOOGLE_PLUS2("google-plus2"),
    GOOGLE_PLUS3("google-plus3"),
    GOOGLE_PLUS4("google-plus4"),
    GOOGLE("google"),
    GRIN("grin"),
    GRIN2("grin2"),
    HAMMER("hammer"),
    HAMMER2("hammer2"),
    HAPPY("happy"),
    HAPPY2("happy2"),
    HEADPHONES("headphones"),
    HEART_BROKEN("heart-broken"),
    HEART("heart"),
    HEART2("heart2"),
    HISTORY("history"),
    HOME("home"),
    HOME2("home2"),
    HOME3("home3"),
    HTML5("html5"),
    HTML52("html52"),
    ICOMOON("icomoon"),
    IE("ie"),
    IMAGE("image"),
    IMAGE2("image2"),
    IMAGES("images"),
    INDENT_DECREASE("indent-decrease"),
    INDENT_INCREASE("indent-increase"),
    INFO("info"),
    INFO2("info2"),
    INSERT_TEMPLATE("insert-template"),
    INSTAGRAM("instagram"),
    ITALIC("italic"),
    JOOMLA("joomla"),
    KEY("key"),
    KEY2("key2"),
    KEYBOARD("keyboard"),
    LAB("lab"),
    LANYRD("lanyrd"),
    LAPTOP("laptop"),
    LAST("last"),
    LASTFM("lastfm"),
    LASTFM2("lastfm2"),
    LEAF("leaf"),
    LEFT_TO_RIGHT("left-to-right"),
    LIBRARY("library"),
    LIBREOFFICE("libreoffice"),
    LIGHTNING("lightning"),
    LINK("link"),
    LINKEDIN("linkedin"),
    LIST("list"),
    LIST2("list2"),
    LOCATION("location"),
    LOCATION2("location2"),
    LOCK("lock"),
    LOCK2("lock2"),
    LOOP("loop"),
    LOOP2("loop2"),
    LOOP3("loop3"),
    MAGNET("magnet"),
    MAIL("mail"),
    MAIL2("mail2"),
    MAIL3("mail3"),
    MAIL4("mail4"),
    MAP("map"),
    MAP2("map2"),
    MENU("menu"),
    MENU2("menu2"),
    METER("meter"),
    METER2("meter2"),
    MINUS("minus"),
    MOBILE("mobile"),
    MOBILE2("mobile2"),
    MUG("mug"),
    MUSIC("music"),
    NEUTRAL("neutral"),
    NEUTRAL2("neutral2"),
    NEW_TAB("new-tab"),
    NEWSPAPER("newspaper"),
    NEXT("next"),
    NOTEBOOK("notebook"),
    NOTIFICATION("notification"),
    NUMBERED_LIST("numbered-list"),
    OFFICE("office"),
    OMEGA("omega"),
    OPERA("opera"),
    PACMAN("pacman"),
    PAINT_FORMAT("paint-format"),
    PARAGRAPH_CENTER("paragraph-center"),
    PARAGRAPH_CENTER2("paragraph-center2"),
    PARAGRAPH_JUSTIFY("paragraph-justify"),
    PARAGRAPH_JUSTIFY2("paragraph-justify2"),
    PARAGRAPH_LEFT("paragraph-left"),
    PARAGRAPH_LEFT2("paragraph-left2"),
    PARAGRAPH_RIGHT("paragraph-right"),
    PARAGRAPH_RIGHT2("paragraph-right2"),
    PASTE("paste"),
    PASTE2("paste2"),
    PASTE3("paste3"),
    PAUSE("pause"),
    PAUSE2("pause2"),
    PAWN("pawn"),
    PAYPAL("paypal"),
    PAYPAL2("paypal2"),
    PAYPAL3("paypal3"),
    PEN("pen"),
    PENCIL("pencil"),
    PENCIL2("pencil2"),
    PHONE_HANG_UP("phone-hang-up"),
    PHONE("phone"),
    PICASSA("picassa"),
    PICASSA2("picassa2"),
    PIE("pie"),
    PILCROW("pilcrow"),
    PINTEREST("pinterest"),
    PINTEREST2("pinterest2"),
    PLAY("play"),
    PLAY2("play2"),
    PLAY3("play3"),
    PLUS("plus"),
    PODCAST("podcast"),
    POINT_DOWN("point-down"),
    POINT_LEFT("point-left"),
    POINT_RIGHT("point-right"),
    POINT_UP("point-up"),
    POWER_CORD("power-cord"),
    PREVIOUS("previous"),
    PRINT("print"),
    PROFILE("profile"),
    PUSHPIN("pushpin"),
    QRCODE("qrcode"),
    QUESTION("question"),
    QUILL("quill"),
    QUOTES_LEFT("quotes-left"),
    RADIO_CHECKED("radio-checked"),
    RADIO_UNCHECKED("radio-unchecked"),
    REDDIT("reddit"),
    REDO("redo"),
    REDO2("redo2"),
    REMOVE("remove"),
    REMOVE2("remove2"),
    REPLY("reply"),
    RIGHT_TO_LEFT("right-to-left"),
    ROAD("road"),
    ROCKET("rocket"),
    SAD("sad"),
    SAD2("sad2"),
    SAFARI("safari"),
    SCISSORS("scissors"),
    SCREEN("screen"),
    SEARCH("search"),
    SETTINGS("settings"),
    SHARE("share"),
    SHIELD("shield"),
    SHOCKED("shocked"),
    SHOCKED2("shocked2"),
    SHUFFLE("shuffle"),
    SIGMA("sigma"),
    SIGNUP("signup"),
    SKYPE("skype"),
    SMILEY("smiley"),
    SMILEY2("smiley2"),
    SOUNDCLOUD("soundcloud"),
    SOUNDCLOUD2("soundcloud2"),
    SPADES("spades"),
    SPAM("spam"),
    SPELL_CHECK("spell-check"),
    SPINNER("spinner"),
    SPINNER2("spinner2"),
    SPINNER3("spinner3"),
    SPINNER4("spinner4"),
    SPINNER5("spinner5"),
    SPINNER6("spinner6"),
    STACK("stack"),
    STACKOVERFLOW("stackoverflow"),
    STAR("star"),
    STAR2("star2"),
    STAR3("star3"),
    STATS("stats"),
    STEAM("steam"),
    STEAM2("steam2"),
    STOP("stop"),
    STOP2("stop2"),
    STOPWATCH("stopwatch"),
    STORAGE("storage"),
    STRIKETHROUGH("strikethrough"),
    STUMBLEUPON("stumbleupon"),
    STUMBLEUPON2("stumbleupon2"),
    SUPPORT("support"),
    SWITCH("switch"),
    TAB("tab"),
    TABLE("table"),
    TABLE2("table2"),
    TABLET("tablet"),
    TAG("tag"),
    TAGS("tags"),
    TARGET("target"),
    TEXT_HEIGHT("text-height"),
    TEXT_WIDTH("text-width"),
    THUMBS_UP("thumbs-up"),
    THUMBS_UP2("thumbs-up2"),
    TICKET("ticket"),
    TONGUE("tongue"),
    TONGUE2("tongue2"),
    TREE("tree"),
    TROPHY("trophy"),
    TRUCK("truck"),
    TUMBLR("tumblr"),
    TUMBLR2("tumblr2"),
    TUX("tux"),
    TV("tv"),
    TWITTER("twitter"),
    TWITTER2("twitter2"),
    TWITTER3("twitter3"),
    UNDERLINE("underline"),
    UNDO("undo"),
    UNDO2("undo2"),
    UNLOCKED("unlocked"),
    UPLOAD("upload"),
    UPLOAD2("upload2"),
    UPLOAD3("upload3"),
    USER("user"),
    USER2("user2"),
    USER3("user3"),
    USER4("user4"),
    USERS("users"),
    USERS2("users2"),
    VIMEO("vimeo"),
    VIMEO2("vimeo2"),
    VIMEO3("vimeo3"),
    VOLUME_DECREASE("volume-decrease"),
    VOLUME_HIGH("volume-high"),
    VOLUME_INCREASE("volume-increase"),
    VOLUME_LOW("volume-low"),
    VOLUME_MEDIUM("volume-medium"),
    VOLUME_MUTE("volume-mute"),
    VOLUME_MUTE2("volume-mute2"),
    WAND("wand"),
    WARNING("warning"),
    WINDOWS("windows"),
    WINDOWS8("windows8"),
    WINK("wink"),
    WINK2("wink2"),
    WONDERING("wondering"),
    WONDERING2("wondering2"),
    WORDPRESS("wordpress"),
    WORDPRESS2("wordpress2"),
    WRENCH("wrench"),
    XING("xing"),
    XING2("xing2"),
    YAHOO("yahoo"),
    YELP("yelp"),
    YOUTUBE("youtube"),
    YOUTUBE2("youtube2"),
    ZOOM_IN("zoom-in"),
    ZOOM_OUT("zoom-out");

    private static final String ERROR_DESCRIPTION_BLANK = "Argument 'description' must not be blank";

    private final String description;

    IcoMoon(@Nonnull String description) {
        this.description = description;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    @Nonnull
    public String asResource(int size) {
        requireValidSize(size);
        return "io/icomoon/" + size + "px/" + description + ".png";
    }

    @Nonnull
    public static String asResource(@Nonnull String description) {
        int size = 16;
        checkDescription(description);

        String[] parts = description.split(":");
        if (parts.length == 2) {
            try {
                size = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        }

        IcoMoon feed = findByDescription(description, size);
        return feed.asResource(size);
    }

    @Nonnull
    public static IcoMoon findByDescription(@Nonnull String description) {
        checkDescription(description);

        IcoMoon feed = null;
        String[] parts = description.split(":");
        for (IcoMoon f : values()) {
            if (f.description.equalsIgnoreCase(parts[0])) {
                feed = f;
                break;
            }
        }

        if (feed == null) {
            throw invalidDescription(description);
        }

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (parts.length == 2) {
            int size = 16;
            try {
                size = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
            if (classLoader.getResource(feed.asResource(size)) != null) {
                return feed;
            }
        }

        if (classLoader.getResource(feed.asResource(16)) != null) {
            return feed;
        } else if (classLoader.getResource(feed.asResource(32)) != null) {
            return feed;
        }

        throw invalidDescription(description);
    }

    @Nonnull
    public static IcoMoon findByDescription(@Nonnull String description, int size) {
        checkDescription(description);

        IcoMoon feed = null;
        String[] parts = description.split(":");
        for (IcoMoon f : values()) {
            if (f.description.equalsIgnoreCase(parts[0])) {
                feed = f;
                break;
            }
        }

        if (feed == null) {
            throw invalidDescription(description);
        }

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader.getResource(feed.asResource(size)) != null) {
            return feed;
        }

        throw invalidDescription(description);
    }

    public static int requireValidSize(int size) {
        requireState(size == 16 || size == 32, "Argument 'size' must be either 16 or 32.");
        return size;
    }

    private static void checkDescription(String description) {
        if (isBlank(description)) {
            throw invalidDescription(description);
        }
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid IcoMoon icon description");
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description, Exception e) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid IcoMoon icon description", e);
    }
}
