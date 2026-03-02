package com.google.android.gms.auth.api.credentials.authorization;

import ahrf;
import batl;
import bxoc;
import bxod;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;

public class AuthorizationChimeraService extends cjtg {
    public AuthorizationChimeraService() {
        super(0xDB, "com.google.android.gms.auth.api.identity.service.authorization.START", ggnj.a, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjts cjts0 = this.l();
        bxod bxod0 = bxoc.a(this, null);
        String s = getServiceRequest0.f;
        String s1 = getServiceRequest0.i.getString("session_id");
        if(s1 != null) {
            batl.q(s1);
        }
        cjtn0.c(new ahrf(cjts0, bxod0, s, getServiceRequest0.p));
    }
}

