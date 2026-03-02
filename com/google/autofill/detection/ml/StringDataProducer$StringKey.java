package com.google.autofill.detection.ml;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class StringDataProducer.StringKey extends Enum {
    private static final StringDataProducer.StringKey[] $VALUES;
    public static final enum StringDataProducer.StringKey ACTIVITY_NAME;
    public static final enum StringDataProducer.StringKey ANDROID_CONTENT_DESCRIPTION;
    public static final enum StringDataProducer.StringKey ANDROID_HINT;
    public static final enum StringDataProducer.StringKey ANDROID_ID_ENTRY;
    public static final enum StringDataProducer.StringKey ANDROID_TEXT;
    public static final enum StringDataProducer.StringKey CLASS_NAME;
    public static final enum StringDataProducer.StringKey HTML_INPUT_ID;
    public static final enum StringDataProducer.StringKey HTML_INPUT_LABEL;
    public static final enum StringDataProducer.StringKey HTML_INPUT_NAME;
    public static final enum StringDataProducer.StringKey HTML_INPUT_PLACEHOLDER;
    public static final enum StringDataProducer.StringKey HTML_INPUT_TYPE;
    public static final enum StringDataProducer.StringKey METADATA_TEXT;
    public static final enum StringDataProducer.StringKey UNKNOWN_STRING;
    public static final enum StringDataProducer.StringKey USER_VISIBLE_TEXT;
    private final int ordinal;

    private static StringDataProducer.StringKey[] $values() {
        return new StringDataProducer.StringKey[]{StringDataProducer.StringKey.UNKNOWN_STRING, StringDataProducer.StringKey.ACTIVITY_NAME, StringDataProducer.StringKey.CLASS_NAME, StringDataProducer.StringKey.ANDROID_HINT, StringDataProducer.StringKey.ANDROID_ID_ENTRY, StringDataProducer.StringKey.ANDROID_TEXT, StringDataProducer.StringKey.ANDROID_CONTENT_DESCRIPTION, StringDataProducer.StringKey.HTML_INPUT_NAME, StringDataProducer.StringKey.HTML_INPUT_ID, StringDataProducer.StringKey.HTML_INPUT_TYPE, StringDataProducer.StringKey.HTML_INPUT_PLACEHOLDER, StringDataProducer.StringKey.HTML_INPUT_LABEL, StringDataProducer.StringKey.USER_VISIBLE_TEXT, StringDataProducer.StringKey.METADATA_TEXT};
    }

    static int -$$Nest$fgetordinal(StringDataProducer.StringKey stringDataProducer$StringKey0) {
        return stringDataProducer$StringKey0.ordinal;
    }

    static {
        StringDataProducer.StringKey.UNKNOWN_STRING = new StringDataProducer.StringKey("UNKNOWN_STRING", 0, 0);
        StringDataProducer.StringKey.ACTIVITY_NAME = new StringDataProducer.StringKey("ACTIVITY_NAME", 1, 1);
        StringDataProducer.StringKey.CLASS_NAME = new StringDataProducer.StringKey("CLASS_NAME", 2, 2);
        StringDataProducer.StringKey.ANDROID_HINT = new StringDataProducer.StringKey("ANDROID_HINT", 3, 3);
        StringDataProducer.StringKey.ANDROID_ID_ENTRY = new StringDataProducer.StringKey("ANDROID_ID_ENTRY", 4, 4);
        StringDataProducer.StringKey.ANDROID_TEXT = new StringDataProducer.StringKey("ANDROID_TEXT", 5, 5);
        StringDataProducer.StringKey.ANDROID_CONTENT_DESCRIPTION = new StringDataProducer.StringKey("ANDROID_CONTENT_DESCRIPTION", 6, 6);
        StringDataProducer.StringKey.HTML_INPUT_NAME = new StringDataProducer.StringKey("HTML_INPUT_NAME", 7, 7);
        StringDataProducer.StringKey.HTML_INPUT_ID = new StringDataProducer.StringKey("HTML_INPUT_ID", 8, 8);
        StringDataProducer.StringKey.HTML_INPUT_TYPE = new StringDataProducer.StringKey("HTML_INPUT_TYPE", 9, 9);
        StringDataProducer.StringKey.HTML_INPUT_PLACEHOLDER = new StringDataProducer.StringKey("HTML_INPUT_PLACEHOLDER", 10, 10);
        StringDataProducer.StringKey.HTML_INPUT_LABEL = new StringDataProducer.StringKey("HTML_INPUT_LABEL", 11, 11);
        StringDataProducer.StringKey.USER_VISIBLE_TEXT = new StringDataProducer.StringKey("USER_VISIBLE_TEXT", 12, 12);
        StringDataProducer.StringKey.METADATA_TEXT = new StringDataProducer.StringKey("METADATA_TEXT", 13, 13);
        StringDataProducer.StringKey.$VALUES = StringDataProducer.StringKey.$values();
    }

    private StringDataProducer.StringKey(String s, int v, int v1) {
        super(s, v);
        this.ordinal = v1;
    }

    public static StringDataProducer.StringKey forOrdinal(int v) {
        StringDataProducer.StringKey[] arr_stringDataProducer$StringKey = StringDataProducer.StringKey.values();
        for(int v1 = 0; v1 < arr_stringDataProducer$StringKey.length; ++v1) {
            StringDataProducer.StringKey stringDataProducer$StringKey0 = arr_stringDataProducer$StringKey[v1];
            if(stringDataProducer$StringKey0.ordinal == v) {
                return stringDataProducer$StringKey0;
            }
        }
        throw new IllegalArgumentException("Unsupported ordinal value.");
    }

    public int getOrdinal() {
        return this.ordinal;
    }

    public static StringDataProducer.StringKey valueOf(String s) {
        return (StringDataProducer.StringKey)Enum.valueOf(StringDataProducer.StringKey.class, s);
    }

    public static StringDataProducer.StringKey[] values() {
        return (StringDataProducer.StringKey[])StringDataProducer.StringKey.$VALUES.clone();
    }
}

