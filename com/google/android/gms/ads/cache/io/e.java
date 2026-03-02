package com.google.android.gms.ads.cache.io;

import bbpb;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Set;

public class e implements Closeable {
    public final Object a;
    public final File b;
    public OutputStream c;
    public RandomAccessFile d;
    public final Set e;
    public long f;

    public e(File file0) {
        this.a = new Object();
        this.b = file0;
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(file0, "rw");
        this.d = randomAccessFile0;
        this.f = randomAccessFile0.length();
        this.e = new HashSet();
    }

    public final long a() {
        synchronized(this.a) {
            this.d();
        }
        return this.f;
    }

    public final InputStream b() {
        InputStream inputStream0;
        synchronized(this.a) {
            this.d();
            inputStream0 = new c(this);
            this.e.add(inputStream0);
        }
        return inputStream0;
    }

    public final OutputStream c() {
        OutputStream outputStream1;
        synchronized(this.a) {
            this.d();
            OutputStream outputStream0 = this.c;
            if(outputStream0 != null) {
                bbpb.b(outputStream0);
            }
            this.f();
            this.d.setLength(0L);
            this.f = 0L;
            outputStream1 = new d(this);
            this.c = outputStream1;
        }
        return outputStream1;
    }

    @Override
    public void close() {
        synchronized(this.a) {
            this.d();
            this.f();
            this.d.close();
            this.d = null;
        }
    }

    public final void d() {
        if(this.d != null) {
            return;
        }
        throw new IOException("StreamingFile is closed; no further operations are valid");
    }

    public void e() {
        throw null;
    }

    public final void f() {
        Set set0 = this.e;
        for(Object object0: set0) {
            bbpb.b(((InputStream)object0));
        }
        set0.clear();
    }

    public final boolean g() {
        boolean z;
        synchronized(this.a) {
            this.d();
            z = this.c != null;
        }
        return z;
    }
}

