package com.google.android.gms.leveldb;

public final class LevelDb.Options {
    public int mBlockCacheCapacityBytes;
    public int mBlockRestartInterval;
    public int mBlockSize;
    public int mBloomFilterBits;
    public boolean mCreateIfMissing;
    public boolean mDeleteIfCorrupted;
    public boolean mErrorIfExists;
    public int mMaxOpenFiles;
    public boolean mUseSnappy;
    public int mWriteBufferSize;

    public LevelDb.Options() {
        this.mCreateIfMissing = true;
        this.mErrorIfExists = false;
        this.mDeleteIfCorrupted = true;
        this.mWriteBufferSize = 0x8000;
        this.mMaxOpenFiles = 80;
        this.mBlockCacheCapacityBytes = 0;
        this.mBlockSize = 0x1000;
        this.mBlockRestartInterval = 16;
        this.mUseSnappy = true;
        this.mBloomFilterBits = 10;
    }
}

