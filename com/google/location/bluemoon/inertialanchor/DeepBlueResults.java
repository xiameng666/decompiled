package com.google.location.bluemoon.inertialanchor;

import java.util.Arrays;

public final class DeepBlueResults {
    private final float[] headingResults;
    private final float[] speedResults;
    public final long timestampNanos;

    public DeepBlueResults(float[] arr_f, float[] arr_f1) {
        this.speedResults = arr_f;
        this.headingResults = arr_f1;
        this.timestampNanos = -1L;
    }

    public final int a() {
        return this.headingResults == null ? 0 : this.headingResults.length;
    }

    public final int b() {
        return this.speedResults == null ? 0 : this.speedResults.length;
    }

    public final float[] c() {
        int v = this.a();
        return Arrays.copyOf(this.headingResults, v);
    }

    public final float[] d() {
        int v = this.b();
        return Arrays.copyOf(this.speedResults, v);
    }
}

