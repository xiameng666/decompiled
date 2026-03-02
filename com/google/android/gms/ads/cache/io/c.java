package com.google.android.gms.ads.cache.io;

import j..io.DesugarInputStream;
import j..io.InputStreamRetargetInterface;
import j..util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class c extends InputStream implements InputStreamRetargetInterface {
    final e a;
    private boolean b;
    private long c;

    public c(e e0) {
        Objects.requireNonNull(e0);
        this.a = e0;
        super();
    }

    private final void a() {
        if(this.b) {
            throw new IOException("invalidated InputStream");
        }
        this.a.d();
    }

    @Override
    public final int available() {
        synchronized(this.a.a) {
            this.a();
        }
        return Math.max(0, ((int)(this.a.f - this.c)));
    }

    private final void b() {
        this.c(1L);
    }

    private final void c(long v) {
        while(true) {
            e e0 = this.a;
            if(!e0.g() || e0.f - this.c >= v) {
                break;
            }
            try {
                e0.a.wait();
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new IOException("interrupted while waiting for data", interruptedException0);
            }
            this.a();
        }
    }

    @Override
    public final void close() {
        synchronized(this.a.a) {
            this.a();
            this.b = true;
            this.a.e.remove(this);
            this.a.a.notifyAll();
        }
    }

    private final boolean d() {
        return !this.a.g() && this.a.f <= this.c;
    }

    @Override
    public final int read() {
        int v1;
        e e0 = this.a;
        synchronized(e0.a) {
            this.a();
            this.b();
            if(this.d()) {
                return -1;
            }
            e0.d.seek(this.c);
            v1 = e0.d.read();
            ++this.c;
        }
        return v1;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        int v4;
        if(v1 < 0 || v < 0 || v1 > arr_b.length - v) {
            throw new IndexOutOfBoundsException();
        }
        if(v1 == 0) {
            return 0;
        }
        e e0 = this.a;
        synchronized(e0.a) {
            this.a();
            this.b();
            if(this.d()) {
                return -1;
            }
            int v3 = Math.min(this.available(), v1);
            e0.d.seek(this.c);
            v4 = e0.d.read(arr_b, v, v3);
            if(v4 >= 0) {
                this.c += (long)v4;
            }
        }
        return v4;
    }

    @Override
    public final long skip(long v) {
        if(v <= 0L) {
            return 0L;
        }
        e e0 = this.a;
        synchronized(e0.a) {
            while(e0.g() && ((long)this.available()) < v) {
                this.c(v);
            }
            if(!e0.g()) {
                v = Math.min(v, this.available());
            }
            this.c += v;
        }
        return v;
    }

    @Override  // j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream0) {
        return DesugarInputStream.transferTo(this, outputStream0);
    }
}

