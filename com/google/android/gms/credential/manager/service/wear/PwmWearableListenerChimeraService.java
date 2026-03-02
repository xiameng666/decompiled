package com.google.android.gms.credential.manager.service.wear;

import android.content.Intent;
import bbcu;
import bboh;
import bgjm;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import fczm;
import ggtj;
import ibnn;
import ibnz;
import ibuq;

public final class PwmWearableListenerChimeraService extends fczm {
    public static final int a;
    private static final bboh b;
    private final ibnn c;

    static {
        PwmWearableListenerChimeraService.b = bboh.b("PwmWls", bbcu.cX);
    }

    public PwmWearableListenerChimeraService() {
        this.c = new ibnz(new bgjm());
    }

    @Override  // fczm
    public final void a(MessageEventParcelable messageEventParcelable0) {
        ibuq.f(messageEventParcelable0, "messageEvent");
        ((ggtj)PwmWearableListenerChimeraService.b.h()).B("PwmWls: received message event: %s", messageEventParcelable0);
        if(ibuq.m(messageEventParcelable0.b, "/credential/manager/open_pwm")) {
            this.startActivity(((Intent)this.c.a()));
        }
    }
}

