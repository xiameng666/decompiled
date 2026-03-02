package com.google.android.gms.libs.gmscorelogger;

import cczg;
import cczh;
import cdbx;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import gful_cronetEngineProvider;
import gfus;
import ggnj;
import hros;

public class GmsCoreLoggerBackendChimeraService extends cjtg {
    private final gful_cronetEngineProvider a;
    private final gful_cronetEngineProvider b;

    public GmsCoreLoggerBackendChimeraService() {
        int v = (int)hros.a.aa().o();
        super(new int[]{299}, new String[]{"com.google.android.gms.libs.gmscorelogger.service.START"}, ggnj.a, 1, 10, v, null);
        this.a = gfus.a(((gful_cronetEngineProvider)new cczg(this)));
        this.b = gfus.a(((gful_cronetEngineProvider)new cczh(this)));
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new cdbx(((cjts)this.a.mr()), this.b));
    }
}

