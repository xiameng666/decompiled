package com.google.android.gms.wearable.consent;

import android.content.Context;
import android.util.Log;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import faih;
import faik;
import fdch;
import ffco;
import ffgp;
import hzvd;

public class ConsentSyncTaskService extends GmsTaskBoundService {
    public static final int a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        if(Log.isLoggable("wearable.ConsentsSync", 3)) {
            Log.d("wearable.ConsentsSync", "onRunTask");
        }
        ffgp.j(this.getApplicationContext());
        if(hzvd.e() && ffgp.m()) {
            fdch fdch0 = fdch.a;
            if(fdch0 == null) {
                Log.e("wearable.ConsentsSync", "onRunTask: ConsentService is null");
                return 2;
            }
            ffco ffco0 = fdch0.i();
            if(ffco0 == null) {
                Log.e("wearable.ConsentsSync", "onRunTask: wearableOptinConsent is null");
                return 2;
            }
            ConsentSyncTaskService.d(this.getApplicationContext(), ffco0);
        }
        return 0;
    }

    public static void d(Context context0, ffco ffco0) {
        faik faik0 = faih.a(context0);
        int v = ffco0.c ? 1 : 2;
        if(Log.isLoggable("wearable.ConsentsSync", 3)) {
            Log.d("wearable.ConsentsSync", "Update optin consent in usage reporting with code: " + v);
        }
        faik0.cs(new UsageReportingOptInOptions(v));
    }
}

