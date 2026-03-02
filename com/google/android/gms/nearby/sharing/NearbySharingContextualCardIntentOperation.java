package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import bbdi;
import ccrn;
import ccrp;
import ccrr;
import dchv;
import dchw;
import ddlw;
import ddlz;
import ddmh;
import gfsx;
import glzd;
import gmap;
import gmcd;
import hvpy;

public final class NearbySharingContextualCardIntentOperation extends ccrr {
    public NearbySharingContextualCardIntentOperation() {
        super(bbdi.U);
    }

    @Override  // ccrr
    public final ccrn a(ccrp ccrp0) {
        Account account0 = ccrp0.a;
        if(account0 != null) {
            ddmh ddmh0 = ddlz.a(this, gfsx.m(account0));
            dchw dchw0 = new dchw(this);
            gmcd gmcd0 = ddmh0.a(ddmh0.b.j());
            dchv dchv0 = new dchv();
            return new ddlw(this, dchw0, gmcd0, glzd.f(ddmh0.a, dchv0, gmap.a));
        }
        return ccrn.e;
    }

    @Override  // ccql
    protected final boolean b() {
        return hvpy.a.b().c();
    }
}

