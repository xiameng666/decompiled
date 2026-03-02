package com.google.android.gms.leveldb;

import cchd;
import cchi;

public final class LevelDbTable extends cchd {
    static {
        cchi.a();
    }

    private LevelDbTable(long v) {
        super(v);
    }

    @Override  // cchd
    public void close() {
        super.close();
    }

    @Override  // cchd
    public void closeNativeObject() {
        LevelDbTable.nativeClose(this.c);
    }

    public byte[] get(byte[] arr_b) {
        this.assertOpen();
        return LevelDbTable.nativeGet(this.c, arr_b);
    }

    private static native void nativeClose(long arg0) {
    }

    private static native byte[] nativeGet(long arg0, byte[] arg1) {
    }

    private static native long nativeOpen(String arg0) {
    }

    public static LevelDbTable open(String s) {
        if(s != null) {
            return new LevelDbTable(LevelDbTable.nativeOpen(s));
        }
        throw new NullPointerException("Parameter \"tablePath\" was not set.");
    }
}

