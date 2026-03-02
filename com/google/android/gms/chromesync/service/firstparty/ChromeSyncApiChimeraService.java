package com.google.android.gms.chromesync.service.firstparty;

import android.accounts.Account;
import ayeb;
import ayfb;
import aygm;
import aygt;
import aygw;
import ayha;
import ayhe;
import ayhh;
import ayhk;
import ayhn;
import ayny;
import aynz;
import bbdg;
import ccmq;
import cjtn;
import cjvl;
import com.google.android.gms.common.internal.GetServiceRequest;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import ggdx;
import ggfp;
import ggnj;
import gmcg;
import hfuo;
import hqyi;
import ibuq;

public final class ChromeSyncApiChimeraService extends aynz {
    public ayny a;

    public ChromeSyncApiChimeraService() {
        hfuo hfuo0 = hqyi.a.d().f().b;
        ibuq.e(hfuo0, "getElementList(...)");
        ggfp ggfp0 = ggdx.d(hfuo0);
        super(303, "com.google.android.gms.chromesync.service.firstparty.START", ggnj.a, 0, 9, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        Provider provider0 = this.a.a.b;
        Provider provider1 = this.a.a.c;
        Provider provider2 = this.a.a.d;
        Provider provider3 = this.a.a.e;
        Provider provider4 = this.a.a.f;
        Provider provider5 = this.a.a.g;
        Provider provider6 = this.a.a.h;
        Provider provider7 = this.a.a.i;
        cjvl cjvl0 = this.l;
        gmcg gmcg0 = this.e;
        Account account0 = getServiceRequest0.j;
        String s = getServiceRequest0.f;
        String s1 = getServiceRequest0.p;
        cjtn0.c(new ayfb(((ayeb)this.a.a.a).a(), ((ayhe)((InstanceFactory)provider0).a), ((aygw)((InstanceFactory)provider1).a), ((ayha)((InstanceFactory)provider2).a), ((ayhn)((InstanceFactory)provider3).a), ((aygm)((InstanceFactory)provider4).a), ((aygt)((InstanceFactory)provider5).a), ((ayhk)((InstanceFactory)provider6).a), ((ayhh)((InstanceFactory)provider7).a), cjvl0, gmcg0, account0, s, s1));
    }

    @Override  // aynz
    public final void onCreate() {
        this.d();
        ccmq.a().a(bbdg.qW);
    }
}

