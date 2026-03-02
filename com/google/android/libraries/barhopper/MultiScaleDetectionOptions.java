package com.google.android.libraries.barhopper;

public final class MultiScaleDetectionOptions {
    private float[] extraScales;

    public MultiScaleDetectionOptions() {
        this.extraScales = new float[0];
    }

    public float[] getExtraScales() {
        return this.extraScales;
    }

    public void setExtraScales(float[] arr_f) {
        this.extraScales = arr_f;
    }
}

