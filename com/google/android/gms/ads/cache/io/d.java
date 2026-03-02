package com.google.android.gms.ads.cache.io;

import j..util.Objects;
import java.io.IOException;
import java.io.OutputStream;

final class d extends OutputStream {
    final e a;

    public d(e e0) {
        Objects.requireNonNull(e0);
        this.a = e0;
        super();
    }

    private final void a() {
        e e0 = this.a;
        if(this != e0.c) {
            throw new IOException("attempt to reuse closed OutputStream");
        }
        e0.d();
    }

    @Override
    public final void close() {
        synchronized(this.a.a) {
            this.a();
            this.a.c = null;
            this.a.a.notifyAll();
        }
    }

    @Override
    public final void write(int v) {
        synchronized(this.a.a) {
            this.a();
            this.a.d.seek(this.a.f);
            this.a.d.write(v);
            ++this.a.f;
            this.a.a.notifyAll();
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        if(v1 < 0 || v < 0 || v1 > arr_b.length - v) {
            throw new IndexOutOfBoundsException();
        }
        if(v1 == 0) {
            return;
        }
        synchronized(this.a.a) {
            this.a();
            this.a.d.seek(this.a.f);
            this.a.d.write(arr_b, v, v1);
            this.a.f += (long)v1;
            this.a.a.notifyAll();
        }
    }
}

