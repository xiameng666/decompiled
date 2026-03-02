package com.google.android.gms.auth.api.credentials.manager.yolo;

import aggi;
import agzr;
import bboh;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class CredentialsInternalChimeraService extends cjtg {
    public static final bboh a;

    static {
        CredentialsInternalChimeraService.a = aggi.a("CredentialsInternalChimeraService");
    }

    public CredentialsInternalChimeraService() {
        super(0xB3, "com.google.android.gms.auth.api.credentials.internal_service.START", ggnj.a, 0, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new agzr(this, (getServiceRequest0.i == null ? null : getServiceRequest0.i.getString("log_session_id"))));
    }
}

