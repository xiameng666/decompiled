package com.google.android.gms.semanticlocationhistory.deidentifieddata.golden;

import android.accounts.Account;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import cllr;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import elyz;
import elzk;
import embq;
import embw;
import emvm;
import endm;
import endn;
import endo;
import endp;
import endq;
import eneq;
import eoeo;
import glzd;
import gmap;
import gmbt;
import gmbu;
import gmcd;
import hxxq;
import j..time.Instant;
import j..util.Objects;
import java.util.ArrayList;

public class ParcelSynchronizePersonalizationJob extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.golden.ParcelSynchronizePersonalizationJob";
    public eoeo b;
    public emvm c;
    private final eneq d;
    private embq e;
    private elzk f;

    static {
        bboh.c("LocationHistory", bbcu.fg, "ParcelSynchronizePersonalizationJob");
    }

    public ParcelSynchronizePersonalizationJob() {
        this.d = new eneq();
    }

    public final elzk d() {
        if(this.f == null) {
            this.f = new elzk();
        }
        return this.f;
    }

    private final embq e() {
        if(this.e == null) {
            this.e = new embq(this.d());
        }
        return this.e;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.pp);
        if(!hxxq.d()) {
            return gmbu.i(Integer.valueOf(0));
        }
        ArrayList arrayList0 = new ArrayList();
        Account[] arr_account = elyz.d(AppContextProvider.a());
        for(int v = 0; v < arr_account.length; ++v) {
            Account account0 = arr_account[v];
            if(this.e().R(account0)) {
                this.d().k("DeidentifiedGoldenData", 18);
                gmcd gmcd0 = glzd.f(gmbt.h(embw.h(this.e(), account0, gmap.a)), new endn(this, account0), gmap.a);
                Objects.requireNonNull(this.d);
                gmcd gmcd1 = glzd.g(gmcd0, new endo(this.d), gmap.a);
                endq endq0 = new endq(this, account0);
                arrayList0.add(glzd.f(glzd.f(gmcd1, new endp(this, account0, Instant.ofEpochMilli(System.currentTimeMillis())), gmap.a), endq0, gmap.a));
            }
        }
        return glzd.f(gmbu.e(arrayList0), new endm(this), gmap.a);
    }
}

