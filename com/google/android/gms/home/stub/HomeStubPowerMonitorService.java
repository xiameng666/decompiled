package com.google.android.gms.home.stub;

import android.content.Context;
import bbcu;
import bboh;
import bwif;
import bwih;
import bwix;
import bwiy;
import ggtj;
import ibuq;

public final class HomeStubPowerMonitorService extends bwix {
    public static final int a;
    private static final bboh d;
    private bwih e;

    static {
        HomeStubPowerMonitorService.d = bboh.b("HomeStubPowerMonitor", bbcu.fA);
    }

    public HomeStubPowerMonitorService() {
    }

    public HomeStubPowerMonitorService(bwih bwih0) {
        ibuq.f(bwih0, "homeStubModuleLoader");
        this();
        this.e = bwih0;
    }

    @Override  // bwix
    public final void a(String s) {
        bboh bboh0 = HomeStubPowerMonitorService.d;
        ((ggtj)bboh0.h()).B("Energy mode changed to: %s", s);
        Context context0 = this.getBaseContext();
        ibuq.e(context0, "getBaseContext(...)");
        if(!bwiy.c(context0)) {
            ((ggtj)bboh0.h()).x("System is not in high energy mode - monitoring will continue");
            return;
        }
        ((ggtj)bboh0.h()).x("Switched to high energy mode: requesting Home module");
        bwih bwih0 = this.e;
        if(bwih0 == null) {
            ibuq.j("homeStubModuleLoader");
            bwih0 = null;
        }
        bwih0.g(true);
        this.stopSelf();
    }

    @Override  // bwix
    public final void onCreate() {
        ((ggtj)bwix.b.h()).x("Power monitoring service created");
        this.c = new PowerMonitoringChimeraServiceBase.onCreate.1(this, this.getBaseContext());
        Context context0 = this.getBaseContext();
        ibuq.e(context0, "getBaseContext(...)");
        bwif bwif0 = new bwif(context0);
        bwif0.f();
        this.e = bwif0;
    }
}

