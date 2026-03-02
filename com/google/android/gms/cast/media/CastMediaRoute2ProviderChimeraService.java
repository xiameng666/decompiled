package com.google.android.gms.cast.media;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import atrp;
import atzn;
import autf;
import autt;
import avij;
import avjh;
import brzr;
import com.google.android.chimera.Service;
import gftb;
import hqqh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ScheduledExecutorService;
import kar;

public class CastMediaRoute2ProviderChimeraService extends Service {
    public final avjh a;
    public final Object b;
    public atrp c;
    public brzr d;
    private final autt e;
    private kar f;

    public CastMediaRoute2ProviderChimeraService() {
        this.a = new avjh("CastMR2PService");
        this.b = new Object();
        this.e = new autt();
    }

    @Override  // android.content.ContextWrapper
    public final void attachBaseContext(Context context0) {
        super.attachBaseContext(context0);
        this.e.attachBaseContext(context0);
    }

    @Override  // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        if(hqqh.a.b().j()) {
            avij avij0 = avij.e();
            if(avij0 != null) {
                printWriter0.append("=== CastFlags ===\n");
                printWriter0.append("dogfood_logging_enabled: ").println(avij0.j());
                printWriter0.append("CastLowPowerConfigs__enable_wake_on_lan_for_linux_devices: ").println(avij0.r());
            }
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        this.a.n("onBind %s", intent0);
        IBinder iBinder0 = this.e.onBind(intent0);
        gftb.check(iBinder0);
        return iBinder0;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.a.m("onCreate");
        this.e.onCreate();
        synchronized(this.b) {
            this.c = atrp.a(this.getApplicationContext(), "CastMR2PService");
        }
        this.f = new autf(this);
        this.d = new brzr(this.getApplicationContext(), this.getClass(), 14, "CastMediaRoute2ProviderChimeraService");
        ScheduledExecutorService scheduledExecutorService0 = atzn.a();
        kar kar0 = this.f;
        gftb.check(kar0);
        synchronized(this.e.d.i) {
            this.e.d.h.put(kar0, scheduledExecutorService0);
            this.e.d.d();
        }
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        this.a.m("onDestroy");
        kar kar0 = this.f;
        if(kar0 != null) {
            synchronized(this.e.d.i) {
                this.e.d.h.remove(kar0);
            }
            synchronized(this.b) {
                if(this.c != null) {
                    atrp.b("CastMR2PService");
                    this.c = null;
                }
            }
            this.d = null;
        }
        this.e.onDestroy();
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        return this.e.onStartCommand(intent0, v, v1);
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        this.a.n("onUnbind %s", intent0);
        return this.e.onUnbind(intent0);
    }
}

