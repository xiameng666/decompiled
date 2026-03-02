package com.google.android.gms.trustagent.api.state;

import bbcu;
import bboh;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ezdh;
import ggfp;
import ggnj;
import ggoh;

public class TrustAgentStateChimeraService extends cjtg {
    private static final ggfp a;

    static {
        bboh.b("TrustAgent", bbcu.aR);
        TrustAgentStateChimeraService.a = ggnj.a;
    }

    public TrustAgentStateChimeraService() {
        ggoh ggoh0 = new ggoh("com.google.android.gms.test");
        super(85, "com.google.android.gms.trustagent.StateApi.START", TrustAgentStateChimeraService.a, 0, 10, ggoh0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new ezdh(null));
    }
}

