package com.google.android.gms.backup.d2d.component;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import aqee;
import aqql;
import aqrx;
import aqvv;
import aqxj;
import aqze;
import arcy;
import arcz;
import ardd;
import arde;
import areh;
import arej;
import arem;
import ares;
import arfk;
import arfr;
import arfw;
import argf;
import argm;
import argt;
import argu;
import armq;
import batl;
import bbll;
import bblp;
import com.google.android.chimera.Service;
import esaa;
import ggtj;
import gmap;
import gmbu;
import gmcg;
import hqml;
import j..util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import jwe;

public class D2dSourceChimeraService extends Service {
    public static final aqql a;
    public gmcg b;
    public argf c;
    public arfw d;
    public ares e;
    private argu f;
    private argt g;
    private BroadcastReceiver h;
    private argm i;
    private aqvv j;

    static {
        D2dSourceChimeraService.a = new aqql(new String[]{"D2dSourceChimeraService"});
    }

    public static Intent a(Context context0) {
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.backup.component.D2dSourceService");
        return intent0;
    }

    @Override  // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        this.g.b(printWriter0);
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        D2dSourceChimeraService.a.j("onBind", new Object[0]);
        return new arfr(this);
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        D2dSourceChimeraService.a.j("onCreate", new Object[0]);
        super.onCreate();
        this.b = new bblp(1, 9);
        this.e = new ares();
        arem arem0 = new arem(this);
        bblp bblp0 = new bblp(1, 10);
        Objects.requireNonNull(arem0);
        bblp0.execute(new arcy(arem0));
        this.f = new argu(new esaa(this, 1, "com.google.android.gms.backup.component.D2dSourceService.wakelock_tag"));
        this.i = new argm(this);
        this.d = arfw.a(this);
        arfk arfk0 = arfk.a(this, arem0);
        bbll bbll0 = new bbll(1, 10);
        this.j = new aqvv(this, bbll0, "com.google.android.gms.backup.component.D2dSourceService");
        this.g = new argt(this, arfk0, arem0, this.e, this.i, this.j, new aqxj(new bbll(1, 10)), bbll0);
        aqee aqee0 = new aqee(this);
        bblp bblp1 = new bblp(1, 10);
        this.c = new argf(this, this.b, bbll0, this.e, arem0, this.g, this.f, this.i, arfk0, new aqrx(this), aqee0, this.d, bblp1, new areh(this));
        this.h = new D2dSourceChimeraService.1(this);
        if(aqze.g()) {
            jwe.b(this, this.h, new IntentFilter("com.google.android.gms.backup.ACTION_LAUNCH_SOURCE_E2E_TEST"), 2);
            ((ggtj)armq.a.h()).x("source receiver registered");
        }
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        aqql aqql0 = D2dSourceChimeraService.a;
        aqql0.j("onDestroy", new Object[0]);
        if(this.f.a()) {
            aqql0.m("Wake lock should have been released before source service onDestroy.", new Object[0]);
        }
        this.b.execute(new arcz(this));
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        aqql aqql0 = D2dSourceChimeraService.a;
        aqql0.j("#onStartCommand", new Object[0]);
        if(intent0 == null) {
            aqql0.m("OnStartCommand called with null intent, not doing any work as there are no pending starts to this service.", new Object[0]);
            return 2;
        }
        if(intent0.getBooleanExtra("stop_service", false)) {
            this.g.i(11, null, 1, 1);
            this.f.a();
            this.g.g();
            return 2;
        }
        if(!hqml.e()) {
            new arde(this).start();
        }
        argu argu0 = this.f;
        batl.h("Wake lock must be acquired from the main thread.");
        esaa esaa0 = argu0.b;
        if(esaa0.l()) {
            argu.a.j("acquireWakeLockIfNotHeld(): wake lock already held so not acquiring", new Object[0]);
        }
        else {
            argu.a.j("acquireWakeLockIfNotHeld(): wake lock not held so acquiring", new Object[0]);
            esaa0.d("migrate_transfer");
        }
        argm argm0 = this.i;
        argm0.c.b = intent0.getBooleanExtra("is_wifi_d2d", false);
        this.i.a();
        gmbu.t(this.j.a(), new ardd(this), gmap.a);
        new arej().a(this);
        return 2;
    }
}

