package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import gfqs;
import hosu;
import java.io.Closeable;

public final class v implements Closeable {
    final long a;
    final String b;
    final Context c;
    String d;

    public v(String s, Context context0) {
        this.a = gfqs.a.a();
        this.b = s;
        this.c = context0;
        this.d = "pending";
    }

    @Override
    public final void close() {
        long v = gfqs.a.a() - this.a;
        String s = this.d;
        if(!hosu.k()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("operation", this.b);
        bundle0.putString("latency", Long.toString(v));
        if(!TextUtils.isEmpty(s)) {
            bundle0.putString("status", s);
        }
        d.a(this.c, bundle0);
    }
}

