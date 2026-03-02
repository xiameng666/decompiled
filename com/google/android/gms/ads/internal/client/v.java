package com.google.android.gms.ads.internal.client;

import aazz;
import abbn;

public class v extends aazz {
    public final Object a;
    public aazz b;

    public v() {
        this.a = new Object();
    }

    @Override  // aazz
    public final void a() {
        synchronized(this.a) {
            aazz aazz0 = this.b;
            if(aazz0 != null) {
                aazz0.a();
            }
        }
    }

    @Override  // aazz
    public final void b() {
        synchronized(this.a) {
            aazz aazz0 = this.b;
            if(aazz0 != null) {
                aazz0.b();
            }
        }
    }

    @Override  // aazz
    public void c(abbn abbn0) {
        synchronized(this.a) {
            aazz aazz0 = this.b;
            if(aazz0 != null) {
                aazz0.c(abbn0);
            }
        }
    }

    @Override  // aazz
    public void d() {
        synchronized(this.a) {
            aazz aazz0 = this.b;
            if(aazz0 != null) {
                aazz0.d();
            }
        }
    }

    @Override  // aazz
    public final void e() {
        synchronized(this.a) {
            aazz aazz0 = this.b;
            if(aazz0 != null) {
                aazz0.e();
            }
        }
    }

    @Override  // aazz
    public final void f() {
        synchronized(this.a) {
        }
    }
}

