package com.google.autofill.detection.ml.flatbuffers;

import gpgc;
import gpgf;
import gpgh;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class QuantizedMatrix extends gpgh {
    public static void ValidateVersion() {
    }

    public QuantizedMatrix __assign(int v, ByteBuffer byteBuffer0) {
        this.__init(v, byteBuffer0);
        return this;
    }

    public void __init(int v, ByteBuffer byteBuffer0) {
        this.__reset(v, byteBuffer0);
    }

    static int access$000(int v, ByteBuffer byteBuffer0) {
        return QuantizedMatrix.__indirect(v, byteBuffer0);
    }

    public static void addCols(gpgf gpgf0, int v) {
        gpgf0.E(1, ((short)v));
    }

    public static void addData(gpgf gpgf0, int v) {
        gpgf0.D(2, v);
    }

    public static void addOriginalMax(gpgf gpgf0, double f) {
        gpgf0.B(4, f);
    }

    public static void addOriginalMin(gpgf gpgf0, double f) {
        gpgf0.B(3, f);
    }

    public static void addRows(gpgf gpgf0, int v) {
        gpgf0.E(0, ((short)v));
    }

    public int cols() {
        int v = this.__offset(6);
        return v != 0 ? ((char)this.bb.getShort(v + this.bb_pos)) : 0;
    }

    public static int createDataVector(gpgf gpgf0, ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        gpgf0.x(1, v, 1);
        int v1 = gpgf0.b - v;
        gpgf0.b = v1;
        gpgf0.a.position(v1);
        gpgf0.a.put(byteBuffer0);
        return gpgf0.e();
    }

    public static int createDataVector(gpgf gpgf0, byte[] arr_b) {
        return gpgf0.a(arr_b);
    }

    public static int createQuantizedMatrix(gpgf gpgf0, int v, int v1, int v2, double f, double f1) {
        gpgf0.w(5);
        QuantizedMatrix.addOriginalMax(gpgf0, f1);
        QuantizedMatrix.addOriginalMin(gpgf0, f);
        QuantizedMatrix.addData(gpgf0, v2);
        QuantizedMatrix.addCols(gpgf0, v1);
        QuantizedMatrix.addRows(gpgf0, v);
        return QuantizedMatrix.endQuantizedMatrix(gpgf0);
    }

    public int data(int v) {
        int v1 = this.__offset(8);
        return v1 == 0 ? 0 : this.bb.get(this.__vector(v1) + v) & 0xFF;
    }

    public ByteBuffer dataAsByteBuffer() {
        return this.__vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer dataInByteBuffer(ByteBuffer byteBuffer0) {
        return this.__vector_in_bytebuffer(byteBuffer0, 8, 1);
    }

    public int dataLength() {
        int v = this.__offset(8);
        return v == 0 ? 0 : this.__vector_len(v);
    }

    public gpgc dataVector() {
        return this.dataVector(new gpgc());
    }

    public gpgc dataVector(gpgc gpgc0) {
        int v = this.__offset(8);
        if(v != 0) {
            gpgc0.__reset(this.__vector(v), 1, this.bb);
            return gpgc0;
        }
        return null;
    }

    public static int endQuantizedMatrix(gpgf gpgf0) {
        return gpgf0.d();
    }

    public static QuantizedMatrix getRootAsQuantizedMatrix(ByteBuffer byteBuffer0) {
        QuantizedMatrix quantizedMatrix0 = new QuantizedMatrix();
        QuantizedMatrix.getRootAsQuantizedMatrix(byteBuffer0, quantizedMatrix0);
        return quantizedMatrix0;
    }

    public static QuantizedMatrix getRootAsQuantizedMatrix(ByteBuffer byteBuffer0, QuantizedMatrix quantizedMatrix0) {
        byteBuffer0.order(ByteOrder.LITTLE_ENDIAN);
        quantizedMatrix0.__assign(byteBuffer0.getInt(byteBuffer0.position()) + byteBuffer0.position(), byteBuffer0);
        return quantizedMatrix0;
    }

    public double originalMax() {
        int v = this.__offset(12);
        return v == 0 ? 0.0 : this.bb.getDouble(v + this.bb_pos);
    }

    public double originalMin() {
        int v = this.__offset(10);
        return v == 0 ? 0.0 : this.bb.getDouble(v + this.bb_pos);
    }

    public static int pack(gpgf gpgf0, QuantizedMatrixT quantizedMatrixT0) {
        int v = 0;
        if(quantizedMatrixT0 == null) {
            return 0;
        }
        if(quantizedMatrixT0.getData() != null) {
            byte[] arr_b = new byte[quantizedMatrixT0.getData().length];
            int[] arr_v = quantizedMatrixT0.getData();
            int v1 = 0;
            while(v < arr_v.length) {
                arr_b[v1] = (byte)arr_v[v];
                ++v1;
                ++v;
            }
            v = QuantizedMatrix.createDataVector(gpgf0, arr_b);
        }
        return QuantizedMatrix.createQuantizedMatrix(gpgf0, quantizedMatrixT0.getRows(), quantizedMatrixT0.getCols(), v, quantizedMatrixT0.getOriginalMin(), quantizedMatrixT0.getOriginalMax());
    }

    public int rows() {
        int v = this.__offset(4);
        return v != 0 ? ((char)this.bb.getShort(v + this.bb_pos)) : 0;
    }

    public static void startDataVector(gpgf gpgf0, int v) {
        gpgf0.x(1, v, 1);
    }

    public static void startQuantizedMatrix(gpgf gpgf0) {
        gpgf0.w(5);
    }

    public QuantizedMatrixT unpack() {
        QuantizedMatrixT quantizedMatrixT0 = new QuantizedMatrixT();
        this.unpackTo(quantizedMatrixT0);
        return quantizedMatrixT0;
    }

    public void unpackTo(QuantizedMatrixT quantizedMatrixT0) {
        quantizedMatrixT0.setRows(this.rows());
        quantizedMatrixT0.setCols(this.cols());
        int[] arr_v = new int[this.dataLength()];
        for(int v = 0; v < this.dataLength(); ++v) {
            arr_v[v] = this.data(v);
        }
        quantizedMatrixT0.setData(arr_v);
        quantizedMatrixT0.setOriginalMin(this.originalMin());
        quantizedMatrixT0.setOriginalMax(this.originalMax());
    }
}

