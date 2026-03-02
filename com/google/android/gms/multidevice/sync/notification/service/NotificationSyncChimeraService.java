package com.google.android.gms.multidevice.sync.notification.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.service.notification.NotificationListenerService.RankingMap;
import android.service.notification.StatusBarNotification;
import bboh;
import com.google.android.gms.chimera.modules.multidevice.sync.AppContextProvider;
import ctnb;
import ctnn;
import ctvm;
import ctws;
import ctwu;
import ctwv;
import ctww;
import ctwx;
import ctwy;
import ctxa;
import ctxc;
import ctxg;
import ctxh;
import ctye;
import hvns;
import ibom;
import ibrl;
import ibrt;
import ibuk;
import ibuq;
import icbb;
import icck;
import iccl;
import java.util.List;
import ykm;

public final class NotificationSyncChimeraService extends ctxg implements ctws {
    public ibrt a;
    public ibrt b;
    public ctnn c;
    public ykm d;
    public icck e;
    public final Context f;
    public final bboh g;
    public boolean h;
    public ctxc i;
    public ctvm j;
    public ctye k;
    private icck l;

    public NotificationSyncChimeraService() {
        Context context0 = AppContextProvider.b();
        ibuq.e(context0, "getApplicationContext(...)");
        this.f = context0;
        this.g = ctnb.a("SetupService", new ibuk(this.getClass()));
    }

    @Override  // ctws
    public final Object a(List list0, ibrl ibrl0) {
        icck icck0 = this.e;
        if(icck0 == null) {
            ibuq.j("hostCoroutineScope");
            icck0 = null;
        }
        icbb.b(icck0, null, null, new ctwv(this, list0, null), 3);
        return ibom.a;
    }

    @Override  // ctws
    public final Object b(ibrl ibrl0) {
        icck icck0 = this.e;
        if(icck0 == null) {
            ibuq.j("hostCoroutineScope");
            icck0 = null;
        }
        icbb.b(icck0, null, null, new ctww(this, null), 3);
        return ibom.a;
    }

    @Override  // ctws
    public final Object c(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        icck icck0 = this.e;
        if(icck0 == null) {
            ibuq.j("hostCoroutineScope");
            icck0 = null;
        }
        icbb.b(icck0, null, null, new ctwx(this, statusBarNotification0, notificationListenerService$RankingMap0, null), 3);
        return ibom.a;
    }

    @Override  // ctws
    public final Object d(StatusBarNotification statusBarNotification0, NotificationListenerService.RankingMap notificationListenerService$RankingMap0, ibrl ibrl0) {
        icck icck0 = this.e;
        if(icck0 == null) {
            ibuq.j("hostCoroutineScope");
            icck0 = null;
        }
        icbb.b(icck0, null, null, new ctwy(this, statusBarNotification0, notificationListenerService$RankingMap0, null), 3);
        return ibom.a;
    }

    public final ykm f() {
        ykm ykm0 = this.d;
        if(ykm0 != null) {
            return ykm0;
        }
        ibuq.j("rpcServiceManager");
        return null;
    }

    public final ctnn i() {
        ctnn ctnn0 = this.c;
        if(ctnn0 != null) {
            return ctnn0;
        }
        ibuq.j("tidepoolFeatureStatusProvider");
        return null;
    }

    public final void j() {
        icck icck1;
        synchronized(this) {
            if(!this.h) {
                return;
            }
            ctvm ctvm0 = this.k();
            synchronized(ctvm0) {
                icck icck0 = ctvm0.c;
                icck1 = null;
                if(icck0 != null) {
                    iccl.i(icck0);
                    ctvm0.c = null;
                }
            }
            if(ctxh.c(this.f)) {
                this.f().c(this.n());
            }
            this.l().a = null;
            icck icck2 = this.e;
            if(icck2 == null) {
                ibuq.j("hostCoroutineScope");
            }
            else {
                icck1 = icck2;
            }
            iccl.i(icck1);
            this.h = false;
        }
    }

    public final ctvm k() {
        ctvm ctvm0 = this.j;
        if(ctvm0 != null) {
            return ctvm0;
        }
        ibuq.j("clientHost");
        return null;
    }

    public final ctxc l() {
        ctxc ctxc0 = this.i;
        if(ctxc0 != null) {
            return ctxc0;
        }
        ibuq.j("notificationSyncServiceClient");
        return null;
    }

    public final void m(NotificationListenerChimeraService notificationListenerChimeraService0) {
        icck icck0 = this.e;
        if(icck0 == null) {
            ibuq.j("hostCoroutineScope");
            icck0 = null;
        }
        icbb.b(icck0, null, null, new ctxa(this, notificationListenerChimeraService0, null), 3);
    }

    public final ctye n() {
        ctye ctye0 = this.k;
        if(ctye0 != null) {
            return ctye0;
        }
        ibuq.j("serverHost");
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        return null;
    }

    @Override  // ctxg
    public final void onCreate() {
        super.onCreate();
        ibrt ibrt0 = this.a;
        if(ibrt0 == null) {
            ibuq.j("tidepoolCoroutineContext");
            ibrt0 = null;
        }
        this.l = iccl.b(ibrt0);
        if(hvns.c()) {
            icck icck0 = this.l;
            if(icck0 == null) {
                ibuq.j("tidepoolCoroutineScope");
                icck0 = null;
            }
            icbb.b(icck0, null, null, new ctwu(this, null), 3);
        }
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        this.j();
        icck icck0 = this.l;
        if(icck0 == null) {
            ibuq.j("tidepoolCoroutineScope");
            icck0 = null;
        }
        iccl.i(icck0);
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        if(!hvns.c()) {
            this.stopSelf();
            return 2;
        }
        return 1;
    }
}

