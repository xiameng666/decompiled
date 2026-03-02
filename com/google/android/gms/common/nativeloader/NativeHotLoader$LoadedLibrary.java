package com.google.android.gms.common.nativeloader;

public final class NativeHotLoader.LoadedLibrary implements AutoCloseable {
    private final String a;

    public NativeHotLoader.LoadedLibrary(String s) {
        this.a = s;
    }

    @Override
    public void close() {
        NativeHotLoader.a(this.a);
    }
}

