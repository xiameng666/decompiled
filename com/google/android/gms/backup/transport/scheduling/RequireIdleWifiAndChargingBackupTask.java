package com.google.android.gms.backup.transport.scheduling;

import android.net.ConnectivityManager;
import aqdy;
import aqgz;
import aqql;
import atff;
import atfj;
import atmx;
import baun;
import bbdg;
import ccmq;
import cllr;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import hqgx;
import hqii;

public class RequireIdleWifiAndChargingBackupTask extends GmsTaskBoundService {
    public static final baun a;

    static {
        RequireIdleWifiAndChargingBackupTask.a = aqql.a("RequireIdleWifiAndChargingBackupTask");
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.mi);
        if(hqgx.d()) {
            new atfj(this).b(3);
        }
        if(!atmx.a()) {
            RequireIdleWifiAndChargingBackupTask.a.j("Won\'t run, disabled", new Object[0]);
            this.d(2);
            return 2;
        }
        boolean z = atff.c(this);
        if(((ConnectivityManager)this.getSystemService(ConnectivityManager.class)).isActiveNetworkMetered() && z) {
            RequireIdleWifiAndChargingBackupTask.a.m("Task unexpectedly started on metered network.", new Object[0]);
            this.d(4);
            return 2;
        }
        RequireIdleWifiAndChargingBackupTask.a.h("Requesting backup", new Object[0]);
        aqdy aqdy0 = new aqdy();
        aqdy0.a = z;
        aqdy0.b = true;
        aqdy0.c = true;
        aqdy0.d = hqii.f();
        aqdy0.e = hqii.g();
        aqdy0.g = true;
        aqdy0.h = true;
        aqdy0.i = false;
        BackUpNowConfig backUpNowConfig0 = new BackUpNowConfig(aqdy0);
        new aqgz(this).b(backUpNowConfig0);
        return 0;
    }

    private final void d(int v) {
        new atfj(this).a(3, v);
    }
}

