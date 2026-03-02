package com.google.autofill.detection.ml.flatbuffers;

public class LayerT {
    private byte activationFunction;
    private QuantizedMatrixT biases;
    private QuantizedMatrixT weights;

    public LayerT() {
        this.weights = null;
        this.biases = null;
        this.activationFunction = 0;
    }

    public byte getActivationFunction() {
        return this.activationFunction;
    }

    public QuantizedMatrixT getBiases() {
        return this.biases;
    }

    public QuantizedMatrixT getWeights() {
        return this.weights;
    }

    public void setActivationFunction(byte b) {
        this.activationFunction = b;
    }

    public void setBiases(QuantizedMatrixT quantizedMatrixT0) {
        this.biases = quantizedMatrixT0;
    }

    public void setWeights(QuantizedMatrixT quantizedMatrixT0) {
        this.weights = quantizedMatrixT0;
    }
}

