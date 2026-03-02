package com.google.android.gms.multidevice.sync.setup.service;

import a;
import android.content.Intent;
import android.os.IBinder;
import bboh;
import ctnb;
import ctnl;
import ctnm;
import ctnn;
import cubu;
import ggtj;
import hvnj;
import hvnm;
import hvnp;
import hvns;
import hvnv;
import ibuk;
import ibuq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Map;

public final class MultideviceSyncSetupChimeraService extends cubu {
    public ctnn a;
    private final bboh b;

    public MultideviceSyncSetupChimeraService() {
        this.b = ctnb.a("SetupService", new ibuk(this.getClass()));
    }

    public final ctnn a() {
        ctnn ctnn0 = this.a;
        if(ctnn0 != null) {
            return ctnn0;
        }
        ibuq.j("tidepoolFeatureStatusProvider");
        return null;
    }

    @Override  // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        if(printWriter0 != null) {
            printWriter0.println("==== SetupService dump");
            printWriter0.println("== Flags status");
            printWriter0.println(a.an(hvnp.c(), "enableMultideviceSyncSetup:\t"));
            printWriter0.println(a.an(hvnm.c(), "enableDeviceLink:\t\t"));
            printWriter0.println(a.an(hvns.c(), "enableNotificationSync:\t"));
            printWriter0.println(a.an(hvnv.c(), "enableQuickAccess:\t\t"));
            printWriter0.println(a.an(hvnj.d(), "enableAppCast:\t\t"));
            printWriter0.println("enableDeviceLinkDebug:\t" + hvnm.d());
            if(hvnp.c()) {
                printWriter0.println("== Feature status");
                for(Object object0: ((Map)this.a().b().b()).entrySet()) {
                    printWriter0.println(((ctnl)((Map.Entry)object0).getKey()) + ":\t" + ((ctnm)((Map.Entry)object0).getValue()));
                }
            }
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        ibuq.f(intent0, "intent");
        return null;
    }

    @Override  // cubu
    public final void onCreate() {
        super.onCreate();
        if(hvnp.c()) {
            this.a().c();
        }
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        if(hvnp.c()) {
            this.a().d();
        }
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        boolean z = hvnp.c();
        ((ggtj)this.b.h()).B("onStartCommand: enabled:%s", Boolean.valueOf(z));
        return z ? 1 : 2;
    }
}

