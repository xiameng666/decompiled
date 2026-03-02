package com.google.autofill.detection.ml.flatbuffers;

import gpgb;
import java.nio.ByteBuffer;

public final class NeuralNetwork.Vector extends gpgb {
    public NeuralNetwork.Vector __assign(int v, int v1, ByteBuffer byteBuffer0) {
        this.__reset(v, v1, byteBuffer0);
        return this;
    }

    public NeuralNetwork get(int v) {
        NeuralNetwork neuralNetwork0 = new NeuralNetwork();
        this.get(neuralNetwork0, v);
        return neuralNetwork0;
    }

    public NeuralNetwork get(NeuralNetwork neuralNetwork0, int v) {
        neuralNetwork0.__assign(NeuralNetwork.__indirect(this.__element(v), this.bb), this.bb);
        return neuralNetwork0;
    }
}

