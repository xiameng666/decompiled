package com.google.android.gms.location.network;

import android.os.Binder;
import bbdg;
import ccmp;
import cjtg;
import cjtn;
import cnim;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.identity.ClientIdentity;
import ggnj;

public class NlpService extends cjtg {
    public NlpService() {
        super(385, "com.google.android.gms.location.network.service.START", ggnj.a, 0, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        new ccmp().a(bbdg.iZ);
        int v = Binder.getCallingUid();
        int v1 = Binder.getCallingPid();
        ClientIdentity clientIdentity0 = ClientIdentity.e(cjtn0.b, getServiceRequest0, v, v1);
        if(cjtn0.g()) {
            cjtn0.c(new cnim(this, this.l(), clientIdentity0));
            return;
        }
        cjtn0.a(10, null);
    }
}

