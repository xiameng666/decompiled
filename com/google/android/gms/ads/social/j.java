package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.h;
import java.util.concurrent.Callable;

public final class j implements Callable {
    public final GmsDoritosProvider a;
    public final String b;
    public final a c;

    public j(GmsDoritosProvider gmsDoritosProvider0, String s, a a0) {
        this.a = gmsDoritosProvider0;
        this.b = s;
        this.c = a0;
    }

    @Override
    public final Object call() {
        GmsDoritosProvider gmsDoritosProvider0 = this.a;
        e e0 = gmsDoritosProvider0.c;
        e0.b();
        String s = this.b;
        if(u.a(gmsDoritosProvider0.a, s)) {
            i i0 = gmsDoritosProvider0.b;
            String s1 = i0.c(s);
            if(s1 == null) {
                Account[] arr_account = i0.b.p("com.google");
                s1 = arr_account.length <= 0 ? null : arr_account[0].name;
            }
            if(!TextUtils.isEmpty(s1)) {
                a a0 = this.c;
                b b0 = gmsDoritosProvider0.d;
                Object object0 = b0.a(s1, a0);
                if(!TextUtils.isEmpty(((CharSequence)object0))) {
                    return object0;
                }
                h.d("DSID cookie not found. Running refresh task.");
                e0.c();
                return b0.a(s1, a0);
            }
        }
        return null;
    }
}

