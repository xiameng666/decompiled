package com.google.autofill.detection.ml;

import ancs;
import anct;
import ancu;
import gdxo;
import gdxp;
import gfqz;
import gged_interceptors;
import ggna;

public final class MaxTextLengthSignal implements Signal {
    private static final int CURRENT_VERSION_CODE = 1;
    private static final String MAX_LENGTH_HTML_INPUT_ATTRIBUTE = "maxlength";
    public static final gdxp READER;

    static {
        MaxTextLengthSignal.READER = new MaxTextLengthSignal.1();
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public double generate(ancu ancu0) {
        double f = (double)ancu0.q;
        return f > 0.0 ? f : MaxTextLengthSignal.getWebViewMaxTextLength(ancu0);
    }

    private static double getWebViewMaxTextLength(ancu ancu0) {
        anct anct0 = ancu0.v;
        if(anct0 != null && "input".equals(anct0.a)) {
            gged_interceptors gged0 = anct0.b;
            int v = 0;
            while(v < ((ggna)gged0).c) {
                ancs ancs0 = (ancs)gged0.get(v);
                ++v;
                if(gfqz.e("maxlength", ancs0.a)) {
                    try {
                        return Double.parseDouble(ancs0.b);
                    }
                    catch(NumberFormatException unused_ex) {
                        break;
                    }
                }
            }
        }
        return 0.0;
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public void reset() {
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public String toString() {
        return "MaxTextLengthSignal()";
    }

    @Override  // gdxq
    public void writeToBundle(gdxo gdxo0) {
        gdxo0.l(1);
    }
}

