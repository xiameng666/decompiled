package com.google.android.libraries.barhopper;

public final class MultiScaleDecodingOptions {
    private float[] extraScales;
    private int minimumDetectedDimension;
    private boolean skipProcessingIfBarcodeFound;

    public MultiScaleDecodingOptions() {
        this.extraScales = new float[0];
        this.minimumDetectedDimension = 10;
        this.skipProcessingIfBarcodeFound = true;
    }

    public float[] getExtraScales() {
        return this.extraScales;
    }

    public int getMinimumDetectedDimension() {
        return this.minimumDetectedDimension;
    }

    public boolean getSkipProcessingIfBarcodeFound() {
        return this.skipProcessingIfBarcodeFound;
    }

    public void setExtraScales(float[] arr_f) {
        this.extraScales = arr_f;
    }

    public void setMinimumDetectedDimension(int v) {
        this.minimumDetectedDimension = v;
    }

    public void setSkipProcessingIfBarcodeFound(boolean z) {
        this.skipProcessingIfBarcodeFound = z;
    }
}

