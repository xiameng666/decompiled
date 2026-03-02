package com.google.android.gms.ads.social;

import acse;
import acso;
import adfy;
import adgg;
import adgh;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.h;
import evrg;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public final class c {
    private final Context a;

    public c(Context context0) {
        this.a = context0;
    }

    public final String a(String s, String s1) {
        return new adgg(this.a).c(this.a, s, s1);
    }

    public final void b(String s) {
        Context context0 = this.a;
        if(adgh.c(context0)) {
            adfy adfy0 = new adfy(context0.getApplicationContext());
            try {
                evrg.n(adfy0.b(s));
                return;
            }
            catch(ExecutionException executionException0) {
                if((executionException0.getCause() instanceof acse)) {
                    throw (acse)executionException0.getCause();
                }
                h.k(("Unexpected exception while clearing token: " + executionException0.toString()));
                return;
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new IOException(interruptedException0);
            }
        }
        acso.j(this.a, s);
    }
}

