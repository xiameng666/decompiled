package com.google.android.gms.location.fused.logging;

import bbdg;
import ccmq;
import cczf;
import cgcx;
import cjer_LocationSettings;
import cllr;
import cmdb;
import cmyi;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import gful_cronetEngineProvider;

public final class FlpSettingsLoggerService extends GmsTaskBoundService {
    public static final int a;
    private cczf b;
    private cmdb c;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.iX);
        if("SettingsLogging".equals(cllr0.a)) {
            if(cjer_LocationSettings.a(this) == 0) {
                this.c.c(26);
            }
            else {
                this.c.c(25);
            }
            this.b.d(((gful_cronetEngineProvider)new cmyi(this)));
            return 0;
        }
        return 2;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final void onCreate() {
        super.onCreate();
        this.b = cgcx.v();
        this.c = cmdb.a(this);
    }
}

