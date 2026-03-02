package com.google.android.gms.leveldb;

import cchd;
import cchh;

public class WriteBatch extends cchd {
    private WriteBatch() {
        super(WriteBatch.nativeCreate());
    }

    public WriteBatch(long v) {
        super(v);
    }

    public void bufferedPut(byte[] arr_b, byte[] arr_b1) {
        this.assertOpen();
        WriteBatch.nativeBufferedPut(this.c, arr_b, arr_b1);
    }

    public void clear() {
        this.assertOpen();
        WriteBatch.nativeClear(this.c);
    }

    @Override  // cchd
    public void close() {
        super.close();
    }

    @Override  // cchd
    protected void closeNativeObject() {
        WriteBatch.nativeDestroy(this.c);
    }

    public static WriteBatch create() {
        return LevelDb.a ? new cchh() : new WriteBatch();
    }

    public void delete(byte[] arr_b) {
        this.assertOpen();
        WriteBatch.nativeDelete(this.c, arr_b);
    }

    private static native void nativeBufferedPut(long arg0, byte[] arg1, byte[] arg2) {
    }

    private static native void nativeClear(long arg0) {
    }

    private static native long nativeCreate() {
    }

    private static native void nativeDelete(long arg0, byte[] arg1) {
    }

    private static native void nativeDestroy(long arg0) {
    }

    private static native void nativePut(long arg0, byte[] arg1, byte[] arg2) {
    }

    public void put(byte[] arr_b, byte[] arr_b1) {
        this.assertOpen();
        WriteBatch.nativePut(this.c, arr_b, arr_b1);
    }
}

