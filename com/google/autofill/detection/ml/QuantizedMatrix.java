package com.google.autofill.detection.ml;

import gftb;
import java.nio.ByteBuffer;

final class QuantizedMatrix extends Matrix {
    private final ByteBuffer backingBuffer;
    private final float originalMin;
    private final int position;
    private final RuntimeConfiguration runtimeConfiguration;
    private final float windowSize;

    public QuantizedMatrix(int v, int v1, ByteBuffer byteBuffer0, float f, float f1) {
        super(v, v1);
        this.backingBuffer = byteBuffer0;
        this.originalMin = f;
        this.windowSize = (f1 - f) / 255.0f;
        this.position = byteBuffer0.position();
        this.runtimeConfiguration = RuntimeConfiguration.getSnapshot();
    }

    private int bufferOffset(int v, int v1) {
        return this.backingBuffer.position() + v * this.width + v1;
    }

    @Override  // com.google.autofill.detection.ml.Matrix
    public float get(int v, int v1) {
        if(this.runtimeConfiguration.isLatencyOptimizationEnabled()) {
            gftb.x(v, this.height);
            gftb.x(v1, this.width);
            int v2 = this.backingBuffer.get(this.position + v * this.width + v1) & 0xFF;
            return this.originalMin + ((float)v2) * this.windowSize;
        }
        float f = (float)this.getQuantizedValue(v, v1);
        return this.originalMin + f * this.windowSize;
    }

    private int getQuantizedValue(int v, int v1) {
        gftb.x(v, this.height);
        gftb.x(v1, this.width);
        int v2 = this.bufferOffset(v, v1);
        return this.backingBuffer.get(v2) & 0xFF;
    }

    @Override  // com.google.autofill.detection.ml.Matrix
    public void set(int v, int v1, float f) {
        throw new UnsupportedOperationException("Quantized matrices are immutable.");
    }
}

