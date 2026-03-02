package com.google.android.gms.semanticlocationhistory.isolation;

import android.content.Context;
import bbcu;
import bboh;
import bboj;
import envc;
import envd;
import gftb;
import ggtj;
import hrrt;

public final class OdlhJniLoader {
    public static final OdlhJniLoader a;
    private static final bboh b;
    private String c;
    private boolean d;
    private Exception e;

    static {
        OdlhJniLoader.b = bboh.c("LocationHistory", bbcu.fg, "OdlhJniLoader");
        OdlhJniLoader.a = new OdlhJniLoader();
    }

    public OdlhJniLoader() {
        this.c = null;
        this.e = null;
    }

    public final Object a(envd envd0) {
        try {
            return envd0.a();
        }
        catch(OdlhJniLoader.NullNativeProxyReferenceError odlhJniLoader$NullNativeProxyReferenceError0) {
            Exception exception0 = this.e;
            if(exception0 != null) {
                odlhJniLoader$NullNativeProxyReferenceError0.addSuppressed(exception0);
            }
            Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = Thread.getDefaultUncaughtExceptionHandler();
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(Thread.currentThread(), odlhJniLoader$NullNativeProxyReferenceError0);
            }
            throw odlhJniLoader$NullNativeProxyReferenceError0;
        }
    }

    public final void b() {
        synchronized(this) {
            this.e = new Exception();
            gftb.q(this.c != null);
            if(!this.d) {
                return;
            }
        }
        OdlhJniLoader.nativeDisconnect();
    }

    public final boolean c() {
        synchronized(this) {
            this.e = null;
            gftb.q(this.c != null);
            if(!this.d) {
                return true;
            }
        }
        return OdlhJniLoader.nativeConnect();
    }

    public final boolean d(Context context0) {
        synchronized(this) {
            String s = this.c;
            if(s != null) {
                ((ggtj)OdlhJniLoader.b.h()).B("%s already loaded", s);
                return true;
            }
            if(hrrt.a.b().d()) {
                if(bboj.g(context0, "odlh_proxy_jni")) {
                    this.c = "odlh_proxy_jni";
                    this.d = true;
                    envc.d(context0);
                    ((ggtj)OdlhJniLoader.b.h()).B("Loaded remote proxy library %s", "odlh_proxy_jni");
                    return true;
                }
            }
            else if(bboj.g(context0, "odlh_jni_wasm")) {
                this.c = "odlh_jni_wasm";
                this.d = false;
                ((ggtj)OdlhJniLoader.b.h()).B("Loaded %s library", "odlh_jni_wasm");
                return true;
            }
        }
        return false;
    }

    private static native boolean nativeConnect() {
    }

    private static native void nativeDisconnect() {
    }
}

