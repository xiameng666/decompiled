package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import bqxs;
import bqxu;
import brsp;
import brsr;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import esaa;
import fcfc;
import fcfe;
import fcfo;
import fczm;
import hszw;

public class WearableSyncMessageChimeraService extends fczm {
    private fcfc a;
    private esaa b;

    @Override  // fczm
    public final void a(MessageEventParcelable messageEventParcelable0) {
        if(hszw.a.m().J()) {
            String s = brsp.d(messageEventParcelable0)[0];
            this.b.d(s);
            try {
                this.a.a(messageEventParcelable0);
            }
            finally {
                this.b.n(s);
            }
            return;
        }
        this.a.a(messageEventParcelable0);
    }

    @Override  // fczm
    public final void onCreate() {
        super.onCreate();
        bqxu bqxu0 = bqxs.a(this);
        Context context0 = this.getApplicationContext();
        fcfe fcfe0 = fcfo.d(bqxu0.C().a);
        brsr brsr0 = bqxu0.w();
        bqxu0.a();
        this.a = new brsp(context0, bqxu0, fcfe0, brsr0);
        this.b = new esaa(this, 1, "WearableSyncMessageChimeraService", null, "com.google.android.gms");
    }
}

