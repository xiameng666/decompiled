package com.google.android.gms.backup.settings.notifications;

import asqt;
import asqu;
import asqv;
import asqy;
import bbcu;
import bbdg;
import bboh;
import ccmq;
import cllr;
import ggtj;
import gmbu;
import gmcd;
import hqgu;
import ibnn;
import ibnx;
import ibnz;
import ibrl;
import ibrt;
import ibrx;
import ibuq;
import icck;
import iccl;
import icpu;

public final class BackupNotificationsTask extends Pommel_BackupNotificationsTask {
    public static final bboh a;
    public ibrt b;
    public asqy c;
    private final ibnn d;

    static {
        BackupNotificationsTask.a = bboh.b("BackupNotificationsTask", bbcu.dF);
    }

    public BackupNotificationsTask() {
        this.d = new ibnz(new asqt(this));
    }

    public final Object d(ibrl ibrl0) {
        asqv asqv0;
        if((ibrl0 instanceof asqv)) {
            asqv0 = (asqv)ibrl0;
            int v = asqv0.c;
            if((v & 0x80000000) == 0) {
                asqv0 = new asqv(this, ibrl0);
            }
            else {
                asqv0.c = v - 0x80000000;
            }
        }
        else {
            asqv0 = new asqv(this, ibrl0);
        }
        Object object0 = asqv0.a;
        Object object1 = ibrx.a;
        switch(asqv0.c) {
            case 0: {
                ibnx.b(object0);
                ((ggtj)BackupNotificationsTask.a.h()).x("Running backup notifications task.");
                asqy asqy0 = this.c;
                if(asqy0 == null) {
                    ibuq.j("backupNotificationsTaskRunner");
                    asqy0 = null;
                }
                asqv0.c = 1;
                return asqy0.b(asqv0) == object1 ? object1 : new Integer(0);
            }
            case 1: {
                ibnx.b(object0);
                return new Integer(0);
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    private final icck i() {
        return (icck)this.d.a();
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        ccmq.a().a(bbdg.mi);
        if(hqgu.a.c().d()) {
            return icpu.e(this.i(), new asqu(this, cllr0, null));
        }
        ((ggtj)BackupNotificationsTask.a.h()).x("Conditions for backup notifications task not met.");
        return gmbu.i(Integer.valueOf(2));
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final void onDestroy() {
        super.onDestroy();
        if(iccl.g(this.i())) {
            iccl.h(this.i(), "BackupNotificationsTask is being destroyed.");
        }
    }
}

