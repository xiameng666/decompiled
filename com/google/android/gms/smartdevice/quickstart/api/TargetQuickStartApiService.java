package com.google.android.gms.smartdevice.quickstart.api;

import android.content.Intent;
import baun;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import eraf;
import erqc;
import ggfp;
import ggnj;
import hyja;

public class TargetQuickStartApiService extends cjtg {
    public static final baun a;
    private eraf b;

    static {
        TargetQuickStartApiService.a = new erqc(new String[]{"TargetQuickStartApiService"});
    }

    public TargetQuickStartApiService() {
        ggfp ggfp0 = ggfp.G(hyja.a.b().a().b);
        super(0xF3, "com.google.android.gms.smartdevice.quickstart.api.TargetQuickStartApiService.START", ggnj.a, 0, 9, ggfp0);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        baun baun0 = TargetQuickStartApiService.a;
        baun0.d("onGetService()", new Object[0]);
        if(this.b == null) {
            baun0.d("Creating new instance ", new Object[0]);
            this.b = new eraf(this, this.l(), getServiceRequest0.f, getServiceRequest0.p);
        }
        cjtn0.c(this.b);
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        TargetQuickStartApiService.a.d("onCreate()", new Object[0]);
    }

    @Override  // cjtg
    public final void onDestroy() {
        super.onDestroy();
        TargetQuickStartApiService.a.d("onDestroy()", new Object[0]);
        eraf eraf0 = this.b;
        if(eraf0 != null) {
            eraf0.f();
        }
        this.b = null;
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        TargetQuickStartApiService.a.d("onUnbind()", new Object[0]);
        return false;
    }
}

