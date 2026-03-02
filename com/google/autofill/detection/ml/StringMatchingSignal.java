package com.google.autofill.detection.ml;

import ancu;
import gdxo;
import gdxp;
import gfqz;
import gfsx;
import gftb;

public final class StringMatchingSignal extends BooleanSignal {
    private static final int CURRENT_VERSION_CODE = 2;
    public static final gdxp READER;
    @Deprecated
    private final boolean caseSensitive;
    private final String comparisonString;
    private final StringMatchingSignal.MatchingOperation matchingOperation;
    private final DataProducer stringProducer;

    static {
        StringMatchingSignal.READER = new StringMatchingSignal.1();
    }

    private StringMatchingSignal(DataProducer dataProducer0, StringMatchingSignal.MatchingOperation stringMatchingSignal$MatchingOperation0, boolean z, String s) {
        gftb.b(stringMatchingSignal$MatchingOperation0 != StringMatchingSignal.MatchingOperation.UNKNOWN_MATCHING_OPERATION, "Matching operation can not be unknown.");
        this.stringProducer = dataProducer0;
        this.matchingOperation = stringMatchingSignal$MatchingOperation0;
        this.caseSensitive = z;
        this.comparisonString = s.intern();
    }

    public StringMatchingSignal(DataProducer dataProducer0, StringMatchingSignal.MatchingOperation stringMatchingSignal$MatchingOperation0, boolean z, String s, StringMatchingSignal-IA stringMatchingSignal-IA0) {
        this(dataProducer0, stringMatchingSignal$MatchingOperation0, z, s);
    }

    public static StringMatchingSignal.Builder activityName() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.ACTIVITY_NAME));
    }

    public static StringMatchingSignal.Builder androidContentDescription() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_CONTENT_DESCRIPTION));
    }

    public static StringMatchingSignal.Builder androidHint() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_HINT));
    }

    public static StringMatchingSignal.Builder androidIdEntry() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_ID_ENTRY));
    }

    public static StringMatchingSignal.Builder androidText() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.ANDROID_TEXT));
    }

    public static StringMatchingSignal.Builder className() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.CLASS_NAME));
    }

    private static boolean containsWord(String s, String s1) {
        int v = s.length();
        int v1 = s1.length();
        int v2 = 0;
        while(v2 <= v - v1) {
            int v3 = s.indexOf(s1, v2);
            if(v3 == -1) {
                return false;
            }
            int v4 = v3 + v1;
            boolean z = v4 == v || !StringMatchingSignal.isLetter(s.charAt(v4));
            if(v3 - 1 < 0 || !StringMatchingSignal.isLetter(s.charAt(v3 - 1))) {
                if(z) {
                    return true;
                }
            }
            else if(z) {
                v2 = v4 + 1;
                continue;
            }
            v2 = v4 + 2;
        }
        return false;
    }

    @Override  // com.google.autofill.detection.ml.BooleanSignal
    public boolean generateBoolean(ancu ancu0) {
        gfsx gfsx0 = this.stringProducer.produce(ancu0);
        if(!gfsx0.i()) {
            return false;
        }
        String s = (String)gfsx0.d();
        switch(this.matchingOperation.ordinal()) {
            case 1: {
                return this.caseSensitive ? s.equals(this.comparisonString) : gfqz.e(s, this.comparisonString);
            }
            case 2: {
                return this.caseSensitive ? s.contains(this.comparisonString) : gfqz.c(s).contains(this.comparisonString);
            }
            case 3: {
                if(!this.caseSensitive) {
                    s = gfqz.c(s);
                }
                return StringMatchingSignal.containsWord(s, this.comparisonString);
            }
            default: {
                throw new IllegalStateException("Unknown matching operation.");
            }
        }
    }

    public static StringMatchingSignal.Builder htmlInputId() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_ID));
    }

    public static StringMatchingSignal.Builder htmlInputLabel() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_LABEL));
    }

    public static StringMatchingSignal.Builder htmlInputName() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_NAME));
    }

    public static StringMatchingSignal.Builder htmlInputPlaceholder() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_PLACEHOLDER));
    }

    public static StringMatchingSignal.Builder htmlInputType() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.HTML_INPUT_TYPE));
    }

    private static boolean isLetter(char c) {
        return c < 97 || c > 0x7A ? c >= 65 && c <= 90 : true;
    }

    public static StringMatchingSignal.Builder metadataText() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.METADATA_TEXT));
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public void reset() {
    }

    public static StringMatchingSignal.Builder string(DataProducer dataProducer0) {
        return new StringMatchingSignal.Builder(dataProducer0, null);
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public String toString() {
        return "StringMatchingSignal(producer: " + this.stringProducer + ", matchingOp: " + this.matchingOperation + ", comparisonString: " + this.comparisonString + ")";
    }

    public static StringMatchingSignal.Builder userVisibleText() {
        return StringMatchingSignal.string(StringDataProducer.forString(StringDataProducer.StringKey.USER_VISIBLE_TEXT));
    }

    @Override  // gdxq
    public void writeToBundle(gdxo gdxo0) {
        gdxo0.l(2);
        gdxo0.m(this.stringProducer);
        gdxo0.l(this.matchingOperation.key);
        gdxo0.n(this.comparisonString);
    }
}

