package com.google.autofill.detection.ml.flatbuffers;

import gpgb;
import java.nio.ByteBuffer;

public final class Layer.Vector extends gpgb {
    public Layer.Vector __assign(int v, int v1, ByteBuffer byteBuffer0) {
        this.__reset(v, v1, byteBuffer0);
        return this;
    }

    public Layer get(int v) {
        Layer layer0 = new Layer();
        this.get(layer0, v);
        return layer0;
    }

    public Layer get(Layer layer0, int v) {
        layer0.__assign(Layer.__indirect(this.__element(v), this.bb), this.bb);
        return layer0;
    }
}

