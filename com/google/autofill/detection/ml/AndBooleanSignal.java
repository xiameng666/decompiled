package com.google.autofill.detection.ml;

import ancu;
import gdxo;
import gdxp;
import gged_interceptors;
import java.util.List;

final class AndBooleanSignal extends BooleanSignal {
    private static final int CURRENT_VERSION_CODE = 1;
    public static final gdxp READER;
    final gged_interceptors signals;

    static {
        AndBooleanSignal.READER = new AndBooleanSignal.1();
    }

    public AndBooleanSignal(List list0) {
        this.signals = gged_interceptors.i(list0);
    }

    @Override  // com.google.autofill.detection.ml.BooleanSignal
    protected boolean generateBoolean(ancu ancu0) {
        if(this.signals.isEmpty()) {
            return false;
        }
        gged_interceptors gged0 = this.signals;
        int v = gged0.size();
        int v1 = 0;
        while(v1 < v) {
            boolean z = ((BooleanSignal)gged0.get(v1)).generateBoolean(ancu0);
            ++v1;
            if(!z) {
                return false;
            }
        }
        return true;
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public void reset() {
        gged_interceptors gged0 = this.signals;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Signal)gged0.get(v1)).reset();
        }
    }

    @Override  // com.google.autofill.detection.ml.Signal
    public String toString() {
        return "and(" + this.signals + ")";
    }

    @Override  // gdxq
    public void writeToBundle(gdxo gdxo0) {
        gdxo0.l(1);
        gdxo0.l(this.signals.size());
        gged_interceptors gged0 = this.signals;
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gdxo0.m(((Signal)gged0.get(v1)));
        }
    }
}

