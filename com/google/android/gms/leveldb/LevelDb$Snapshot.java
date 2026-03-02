package com.google.android.gms.leveldb;

import cchd;
import j..util.Objects;

public class LevelDb.Snapshot extends cchd {
    final LevelDb a;

    public LevelDb.Snapshot(LevelDb levelDb0, long v) {
        Objects.requireNonNull(levelDb0);
        this.a = levelDb0;
        super(v);
        levelDb0.ref();
    }

    @Override  // cchd
    public void close() {
        super.close();
    }

    @Override  // cchd
    protected void closeNativeObject() {
        LevelDb.nativeReleaseSnapshot(this.a.c, this.c);
        this.a.unref();
    }

    @Override
    public String toString() {
        return "LevelDB.Snapshot[" + this.a.b + "]";
    }
}

