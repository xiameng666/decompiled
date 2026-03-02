package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import azts;
import azzc;
import azzd;
import bbmn;
import cchj;
import com.google.android.gms.ads.internal.util.future.e;
import com.google.android.gms.common.Feature;
import ejfh;
import ejfk;
import ejfl;
import ejhm;
import ejhp;
import ejhv;
import fhra;
import glyi;
import glzd;
import gmbt;
import gmcd;

final class i {
    public final Context a;
    public final cchj b;
    public final ejfl c;
    private final ejfk d;

    public i(Context context0, cchj cchj0) {
        ejhp ejhp0 = new ejhp(context0);
        ejhv ejhv0 = new ejhv(context0);
        super();
        this.a = context0;
        this.b = cchj0;
        this.d = ejhp0;
        this.c = ejhv0;
    }

    static i a(Context context0) {
        return new i(context0, cchj.b(context0));
    }

    final gmcd b() {
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{ejfh.c};
        azzc0.a = new ejhm(((ejhp)this.d));
        azzc0.d = 25803;
        azzd azzd0 = azzc0.a();
        gmcd gmcd0 = glzd.f(gmbt.h(fhra.b(((azts)this.d).jn(azzd0).g(new f(this)))), new g(this), e.a);
        h h0 = new h();
        return glyi.f(gmcd0, Throwable.class, h0, e.a);
    }

    final String c(String s) {
        Account account0 = bbmn.c(this.a, s);
        return account0 == null ? null : account0.name;
    }

    final Account[] d() {
        Account[] arr_account = this.b.p("com.google");
        return arr_account == null ? new Account[0] : arr_account;
    }
}

