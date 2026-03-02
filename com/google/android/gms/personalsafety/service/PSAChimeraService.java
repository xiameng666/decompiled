package com.google.android.gms.personalsafety.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import android.telephony.satellite.SatelliteManager;
import bbdg;
import bblp;
import bbpd;
import bbqm;
import bbqn;
import ccmq;
import clht;
import com.google.android.chimera.Service;
import com.google.android.gms.chimera.modules.personalsafety.AppContextProvider;
import com.google.android.gms.personalsafety.psa.ConnectivityProtectionLockingIntentOperation;
import eibw;
import eicd;
import eicw;
import eidc;
import eidt;
import eidu;
import eidv;
import eiea;
import eigx;
import eiha;
import gftb;
import ggtj;
import gmbu;
import gmcd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import jys;

public final class PSAChimeraService extends Service implements bbqm {
    public final Object a;
    public eicw b;
    public boolean c;
    private final Executor d;
    private bbqn e;
    private eiea f;
    private boolean g;
    private eidu h;
    private boolean i;
    private Context j;

    public PSAChimeraService() {
        this.d = new bblp(0x7FFFFFFF, 9);
        this.a = new Object();
        this.c = false;
        this.g = false;
        this.i = false;
    }

    @Override  // bbqm
    public final void a() {
        if(!eidc.b(this)) {
            this.stopSelf();
        }
    }

    @Override  // bbqm
    public final void b() {
    }

    public final void c() {
        eicw eicw0 = this.b;
        gftb.check(eicw0);
        if(eicw0.d) {
            eicw0.b.unregisterNetworkCallback(eicw0.c);
        }
        eicw0.d = false;
        ConnectivityProtectionLockingIntentOperation.b(eicw0.a);
        this.c = false;
    }

    private final void d() {
        eidu eidu0 = this.h;
        if(eidu0 == null) {
            return;
        }
        Context context0 = this.j;
        gftb.check(context0);
        if(eidu.d(context0)) {
            synchronized(eidu0.b) {
                if(eidu0.c && eidu.g(eidu0.d, eidu0.e)) {
                    eidu0.c = false;
                }
            }
        }
        this.i = false;
    }

    @Override  // com.google.android.chimera.Service
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append("==== START PSA Dump ====\n");
        bbpd bbpd0 = new bbpd(printWriter0, "  ");
        printWriter0.append("\n== Flags ==\n");
        bbpd0.b();
        eigx.a(bbpd0);
        bbpd0.a();
        printWriter0.append("\n== Backup dump of Snd flags ==\n");
        bbpd0.b();
        eigx.b(bbpd0);
        bbpd0.a();
    }

    private final void e() {
        eiea eiea0 = this.f;
        gftb.check(eiea0);
        if(eiea0.e) {
            eiea0.b.removeOnSubscriptionsChangedListener(eiea0.d);
            eiea0.e = false;
        }
        this.g = false;
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        ccmq.a().a(bbdg.vS);
        super.onCreate();
        this.j = this;
        bbqn bbqn0 = new bbqn(this, new clht(Looper.getMainLooper()));
        this.e = bbqn0;
        bbqn0.b(this);
        Context context0 = AppContextProvider.a();
        synchronized(this.a) {
            this.b = new eicw(context0);
            this.f = new eiea(context0);
            if(jys.d()) {
                this.h = eidu.b(context0);
            }
        }
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        super.onDestroy();
        this.e.c();
        synchronized(this.a) {
            this.c();
            this.e();
            if(jys.d()) {
                this.d();
            }
        }
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        int v3;
        SatelliteManager satelliteManager0;
        eidt eidt0;
        Object object2;
        eidu eidu0;
        Context context0 = this.j;
        gftb.check(context0);
        if(eidc.b(context0)) {
            int v2 = 1;
            Context context1 = this.j;
            gftb.check(context1);
            if(eibw.a(context1)) {
                gmcd gmcd0 = eicw.d() ? gmbu.i(Boolean.valueOf(true)) : eicw.a(this);
                gmbu.t(gmcd0, new eiha(this), this.d);
                Object object0 = this.a;
                synchronized(object0) {
                    if(!eiea.a(this)) {
                        this.e();
                    }
                    else if(!this.g) {
                        eiea eiea0 = this.f;
                        gftb.check(eiea0);
                        eidv eidv0 = new eidv(eiea0);
                        if(!eiea0.e) {
                            eidv0.run();
                            eiea0.e = true;
                        }
                        this.g = true;
                    }
                }
                __monitor_exit(object0);
                if(jys.d()) {
                    Object object1 = this.a;
                    synchronized(object1) {
                        if(!eidu.c()) {
                            this.d();
                        }
                        else if(!this.i) {
                            eidu0 = this.h;
                            if(eidu0 != null) {
                                Context context2 = this.j;
                                gftb.check(context2);
                                if(eidu.d(context2)) {
                                    object2 = eidu0.b;
                                    __monitor_enter(object2);
                                    goto label_44;
                                }
                                this.i = true;
                            }
                        }
                        goto label_76;
                    }
                    try {
                    label_44:
                        if(eidu0.c) {
                            goto label_45;
                        }
                        else {
                            goto label_47;
                        }
                        this.i = true;
                        goto label_76;
                    }
                    catch(Throwable throwable2) {
                        goto label_68;
                    }
                    try {
                    label_45:
                        __monitor_exit(object2);
                    }
                    catch(Throwable throwable1) {
                        __monitor_exit(object1);
                        throw throwable1;
                    }
                    this.i = true;
                    goto label_76;
                    try {
                    label_47:
                        eidt0 = eidu0.d;
                        eidt0.a.set(false);
                        satelliteManager0 = eidu0.e;
                        v3 = eidu.a(eidu.a, eidt0, satelliteManager0);
                    }
                    catch(Throwable throwable3) {
                        goto label_64;
                    }
                    try {
                        if(v3 == 0) {
                            eidu0.c = true;
                            goto label_70;
                        }
                        else {
                            ((ggtj)((ggtj)eicd.a.j()).ar(12890)).x("Failed to register for satellite modem state changes");
                            goto label_56;
                        }
                        this.i = true;
                        goto label_76;
                    }
                    catch(Throwable throwable3) {
                        goto label_63;
                    }
                label_56:
                    if(v3 != 0) {
                        try {
                            eidu.g(eidt0, satelliteManager0);
                        }
                        catch(Throwable throwable2) {
                            goto label_68;
                        }
                    }
                    try {
                        __monitor_exit(object2);
                    }
                    catch(Throwable throwable1) {
                        __monitor_exit(object1);
                        throw throwable1;
                    }
                    this.i = true;
                    goto label_76;
                    try {
                        eidu0.c = true;
                        goto label_70;
                    }
                    catch(Throwable throwable3) {
                    label_63:
                        v2 = v3;
                    }
                    try {
                    label_64:
                        if(v2 != 0) {
                            eidu.g(eidu0.d, eidu0.e);
                        }
                        throw throwable3;
                    }
                    catch(Throwable throwable2) {
                        try {
                        label_68:
                            __monitor_exit(object2);
                            throw throwable2;
                        label_70:
                            __monitor_exit(object2);
                            this.i = true;
                            goto label_76;
                        }
                        catch(Throwable throwable1) {
                        }
                    }
                    __monitor_exit(object1);
                    throw throwable1;
                label_76:
                    __monitor_exit(object1);
                    return 1;
                }
                return 1;
            }
        }
        this.stopSelf(v1);
        return 2;
    }
}

