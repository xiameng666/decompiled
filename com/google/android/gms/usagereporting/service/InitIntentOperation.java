package com.google.android.gms.usagereporting.service;

import android.content.Intent;
import android.content.pm.PackageManager;
import avzf;
import bbcu;
import bbnp;
import bboh;
import bbqa;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import evql;
import faih;
import faik;
import fajr;
import fajs;
import iaap;

public class InitIntentOperation extends avzf {
    static {
        bboh.b("UsageReporting", bbcu.ab);
    }

    @Override  // avzf
    protected final void b(Intent intent0, int v) {
        boolean z = false;
        faik faik0 = faih.a(this.getApplicationContext());
        PackageManager packageManager0 = this.getApplicationContext().getPackageManager();
        if(bbnp.c == null) {
            if(bbqa.a() && packageManager0.hasSystemFeature("android.hardware.type.glasses")) {
                z = true;
            }
            bbnp.c = Boolean.valueOf(z);
        }
        if(bbnp.c.booleanValue() && iaap.a.b().c()) {
            evql evql0 = faik0.cs(new UsageReportingOptInOptions(1));
            evql0.b(new fajr());
            evql0.A(new fajs());
        }
        this.getApplicationContext();
        if((v & 14) != 0) {
            this.startService(IntentOperation.getStartIntent(this, InitHandler.class, "com.google.android.gms.usagereporting.init"));
        }
    }
}

