package com.google.android.gms.trustagent.api.bridge;

import bbcu;
import bboh;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ezdb;
import ggfp;
import ggnj;

public class TrustAgentBridgeChimeraService extends cjtg {
    private static final ggfp a;

    static {
        bboh.b("TrustAgent", bbcu.aR);
        TrustAgentBridgeChimeraService.a = ggnj.a;
    }

    public TrustAgentBridgeChimeraService() {
        super(89, "com.google.android.gms.trustagent.BridgeApi.START", TrustAgentBridgeChimeraService.a, 0, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ezdb(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

