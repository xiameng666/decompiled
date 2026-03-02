package com.google.android.gms.usagereporting.service;

import android.content.Context;
import android.provider.Settings.Global;
import bbcu;
import bboh;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import fajd;
import fajw;
import fakg;
import fhcd;
import ggtj;
import hzfu;
import java.util.Collections;

public class UsageReportingChimeraService extends cjtg {
    public static final bboh a;

    static {
        UsageReportingChimeraService.a = bboh.b("UsageReportingService", bbcu.ab);
    }

    public UsageReportingChimeraService() {
        super(41, "com.google.android.gms.usagereporting.service.START", Collections.EMPTY_SET, 3, (hzfu.d() ? 9 : 10));
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        cjtn0.c(new fajd(getServiceRequest0.f, this, this.l(), getServiceRequest0.p));
    }

    public static void c(Context context0) {
        if(fhcd.h(context0) && Settings.Global.getInt(context0.getContentResolver(), "multi_cb", -1) == -1) {
            ((ggtj)UsageReportingChimeraService.a.h()).x("Device wide opt in was reset, re-populating");
            fajw.c(context0);
        }
    }

    public static boolean d(int v) {
        return fakg.b.contains(Integer.valueOf(v));
    }

    @Override  // com.google.android.chimera.BoundService
    public final void onCreate() {
        if(fajw.h()) {
            UsageReportingChimeraService.c(this);
            UsageReportingChimeraService.CheckboxRestoringTaskBoundService.d(this);
        }
    }
}

