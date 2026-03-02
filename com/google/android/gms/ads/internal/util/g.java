package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.appcontent.d;
import com.google.android.gms.ads.internal.state.a;
import com.google.android.gms.ads.internal.util.client.h;
import gmcd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

public final class g {
    public int A;
    public int B;
    public long C;
    public final Object a;
    public boolean b;
    public final List c;
    public gmcd d;
    public d e;
    public SharedPreferences f;
    public SharedPreferences.Editor g;
    public boolean h;
    public String i;
    public String j;
    public boolean k;
    public String l;
    public int m;
    public a n;
    public long o;
    public long p;
    public int q;
    public int r;
    public Set s;
    public boolean t;
    public boolean u;
    public String v;
    public String w;
    public boolean x;
    public String y;
    public String z;

    public g() {
        this.a = new Object();
        this.c = new ArrayList();
        this.e = null;
        this.h = true;
        this.k = true;
        this.l = "-1";
        this.m = -1;
        this.n = new a("", 0L);
        this.o = 0L;
        this.p = 0L;
        this.q = -1;
        this.r = 0;
        this.s = Collections.EMPTY_SET;
        new JSONObject();
        this.t = true;
        this.u = true;
        this.v = null;
        this.w = "";
        this.x = false;
        this.y = "";
        this.z = "{}";
        this.A = -1;
        this.B = -1;
        this.C = 0L;
    }

    public final void a() {
        if(this.d != null && !this.d.isDone()) {
            try {
                this.d.get(1L, TimeUnit.SECONDS);
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                h.m("Interrupted while waiting for preferences loaded.", interruptedException0);
            }
            catch(CancellationException | ExecutionException | TimeoutException exception0) {
                h.h("Fail to initialize AdSharedPreferenceManager.", exception0);
            }
        }
    }

    public final void b() {
        e e0 = new e(this);
        com.google.android.gms.ads.internal.util.future.e.a.execute(e0);
    }
}

