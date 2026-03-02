package com.google.autofill.detection.ml;

import ancu;
import gdxo;
import gdxp;
import gfqx;
import gfsx;

public final class AndroidInputTypeSignal extends BooleanSignal {
    private static final int CURRENT_VERSION_CODE = 3;
    public static final gdxp READER = null;
    public static final int TYPE_CLASS_DATETIME = 4;
    public static final int TYPE_CLASS_NUMBER = 2;
    public static final int TYPE_CLASS_PHONE = 3;
    public static final int TYPE_CLASS_TEXT = 1;
    public static final int TYPE_DATETIME_VARIATION_DATE = 16;
    public static final int TYPE_DATETIME_VARIATION_NORMAL = 0;
    public static final int TYPE_DATETIME_VARIATION_TIME = 0x20;
    private static final int TYPE_MASK_CLASS = 15;
    private static final int TYPE_MASK_FLAGS = 0xFFF000;
    private static final int TYPE_MASK_VARIATION = 0xFF0;
    public static final int TYPE_NUMBER_FLAG_DECIMAL = 0x2000;
    public static final int TYPE_NUMBER_FLAG_SIGNED = 0x1000;
    public static final int TYPE_NUMBER_VARIATION_NORMAL = 0;
    public static final int TYPE_NUMBER_VARIATION_PASSWORD = 16;
    public static final int TYPE_TEXT_FLAG_AUTO_COMPLETE = 0x10000;
    public static final int TYPE_TEXT_FLAG_AUTO_CORRECT = 0x8000;
    public static final int TYPE_TEXT_FLAG_CAP_CHARACTERS = 0x1000;
    public static final int TYPE_TEXT_FLAG_CAP_SENTENCES = 0x4000;
    public static final int TYPE_TEXT_FLAG_CAP_WORDS = 0x2000;
    public static final int TYPE_TEXT_FLAG_IME_MULTI_LINE = 0x40000;
    public static final int TYPE_TEXT_FLAG_MULTI_LINE = 0x20000;
    public static final int TYPE_TEXT_FLAG_NO_SUGGESTIONS = 0x80000;
    public static final int TYPE_TEXT_VARIATION_EMAIL_ADDRESS = 0x20;
    public static final int TYPE_TEXT_VARIATION_EMAIL_SUBJECT = 0x30;
    public static final int TYPE_TEXT_VARIATION_FILTER = 0xB0;
    public static final int TYPE_TEXT_VARIATION_LONG_MESSAGE = 80;
    public static final int TYPE_TEXT_VARIATION_NORMAL = 0;
    public static final int TYPE_TEXT_VARIATION_PASSWORD = 0x80;
    public static final int TYPE_TEXT_VARIATION_PERSON_NAME = 0x60;
    public static final int TYPE_TEXT_VARIATION_PHONETIC = 0xC0;
    public static final int TYPE_TEXT_VARIATION_POSTAL_ADDRESS = 0x70;
    public static final int TYPE_TEXT_VARIATION_SHORT_MESSAGE = 0x40;
    public static final int TYPE_TEXT_VARIATION_URI = 16;
    public static final int TYPE_TEXT_VARIATION_VISIBLE_PASSWORD = 0x90;
    public static final int TYPE_TEXT_VARIATION_WEB_EDIT_TEXT = 0xA0;
    public static final int TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS = 0xD0;
    public static final int TYPE_TEXT_VARIATION_WEB_PASSWORD = 0xE0;
    final gfsx inputClass;
    final gfsx inputFlags;
    final gfsx inputVariation;

    static {
        AndroidInputTypeSignal.READER = new AndroidInputTypeSignal.1();
    }

    private AndroidInputTypeSignal(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2) {
        if(!gfsx0.i() && !gfsx1.i() && !gfsx2.i()) {
            throw new IllegalArgumentException("Either a class, variation, or flags must be supplied.");
        }
        this.inputClass = gfsx0;
        this.inputVariation = gfsx1;
        this.inputFlags = gfsx2;
    }

    public AndroidInputTypeSignal(gfsx gfsx0, gfsx gfsx1, gfsx gfsx2, AndroidInputTypeSignal-IA androidInputTypeSignal-IA0) {
        this(gfsx0, gfsx1, gfsx2);
    }

    @Override  // com.google.autofill.detection.ml.BooleanSignal
    protected boolean generateBoolean(ancu ancu0) {
        return this.matchesClass(ancu0) && this.matchesVariation(ancu0) && this.matchesFlags(ancu0);
    }

    private boolean matchesClass(ancu ancu0) {
        if(this.inputClass.i()) {
            int v = (int)(((Integer)this.inputClass.d()));
            return (ancu0.c & 15) == v;
        }
        return true;
    }

    private boolean matchesFlags(ancu ancu0) {
        if(this.inputFlags.i()) {
            int v = (int)(((Integer)this.inputFlags.d()));
            return (ancu0.c & 0xFFF000) == v;
        }
        return true;
    }

    private boolean matchesVariation(ancu ancu0) {
        if(this.inputVariation.i()) {
            int v = (int)(((Integer)this.inputVariation.d()));
            return (ancu0.c & 0xFF0) == v;
        }
        return true;
    }

    public static AndroidInputTypeSignal matching(int v, int v1, int v2) {
        return new AndroidInputTypeSignal(gfsx.m(Integer.valueOf(v)), gfsx.m(Integer.valueOf(v1)), gfsx.m(Integer.valueOf(v2)));
    }

    public static AndroidInputTypeSignal matchingClass(int v) {
        return new AndroidInputTypeSignal(gfsx.m(Integer.valueOf(v)), gfqx.a, gfqx.a);
    }

    public static AndroidInputTypeSignal matchingFlags(int v, int v1) {
        return new AndroidInputTypeSignal(gfsx.m(Integer.valueOf(v)), gfqx.a, gfsx.m(Integer.valueOf(v1)));
    }

    public static AndroidInputTypeSignal matchingVariation(int v, int v1) {
        return new AndroidInputTypeSignal(gfsx.m(Integer.valueOf(v)), gfsx.m(Integer.valueOf(v1)), gfqx.a);
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public void reset() {
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public String toString() {
        return "AndroidInputTypeSignal(class: " + this.inputClass + ", variation: " + this.inputVariation + ", flags: " + this.inputFlags + ")";
    }

    @Override  // gdxq
    public void writeToBundle(gdxo gdxo0) {
        gdxo0.l(3);
        gdxo0.i(this.inputClass.i());
        if(this.inputClass.i()) {
            gdxo0.l(((Integer)this.inputClass.d()).intValue());
        }
        gdxo0.i(this.inputVariation.i());
        if(this.inputVariation.i()) {
            gdxo0.l(((Integer)this.inputVariation.d()).intValue());
        }
        gdxo0.i(this.inputFlags.i());
        if(this.inputFlags.i()) {
            gdxo0.l(((Integer)this.inputFlags.d()).intValue());
        }
    }
}

