package com.google.android.gms.auth.folsom.service;

import ajqx;
import ajqy;
import ajyv;
import akdv;
import akea;
import android.content.Intent;
import baun;
import bbdg;
import bblp;
import ccmq;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import gmcg;
import hpuq;
import java.util.UUID;

public class GcmReceiverChimeraService extends TracingIntentService {
    public final ajqx a;
    public static final int b;
    private static final baun c;
    private final gmcg d;

    static {
        GcmReceiverChimeraService.c = akea.a("GcmReceiverChimeraService");
    }

    public GcmReceiverChimeraService() {
        this(new ajqx(UUID.randomUUID().toString()));
    }

    public GcmReceiverChimeraService(ajqx ajqx0) {
        super("GcmReceiverService");
        this.d = new bblp(1, 10);
        this.setIntentRedelivery(true);
        this.a = ajqx0;
    }

    @Override  // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent0) {
        ccmq.a().a(bbdg.mM);
        if(intent0 == null) {
            GcmReceiverChimeraService.c.d("Null intent. Ignore.", new Object[0]);
            return;
        }
        if(!akdv.b) {
            GcmReceiverChimeraService.c.m("Gcm ping received on device with build < P. Ignore.", new Object[0]);
            return;
        }
        if(hpuq.c()) {
            ajqy.a.c(this);
            ajyv ajyv0 = new ajyv(this);
            this.d.execute(ajyv0);
            return;
        }
        GcmReceiverChimeraService.c.m("The RecoverableKeyStoreGms module is not enabled.", new Object[0]);
    }
}

