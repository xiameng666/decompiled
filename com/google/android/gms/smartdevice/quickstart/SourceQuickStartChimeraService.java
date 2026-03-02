package com.google.android.gms.smartdevice.quickstart;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import batl;
import baun;
import bayn;
import bblp;
import cchj;
import clht;
import com.google.android.chimera.Service;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import epwt;
import eqam;
import eqgn;
import eqoc;
import eqrl;
import eqrn;
import eqsl;
import eqwi;
import eqwk;
import eqwl;
import eqyb;
import eqyc;
import eqyd;
import eqyf;
import eqyw;
import erav;
import eraw;
import erpg;
import erpi;
import erqc;
import gjkj;
import hyis;
import java.io.IOException;
import java.util.Arrays;

public final class SourceQuickStartChimeraService extends Service implements epwt {
    public static final baun a;
    public bayn b;
    public eqsl c;
    public eqam d;
    public eqyw e;
    public erav f;
    public eraw g;
    public eqyf h;
    public eqwi i;
    public String j;
    public eqwl k;
    private Handler l;
    private eqgn m;

    static {
        SourceQuickStartChimeraService.a = new erqc(new String[]{"SourceQuickStartChimeraService"});
    }

    public SourceQuickStartChimeraService() {
        this.j = null;
    }

    @Override  // epwt
    public final void a(String s) {
    }

    @Override  // epwt
    public final void b(BootstrapCompletionResult bootstrapCompletionResult0) {
        this.f.e(gjkj.P);
        this.c.b();
    }

    @Override  // epwt
    public final boolean c(BootstrapProgressResult bootstrapProgressResult0) {
        return false;
    }

    @Override  // epwt
    public final void d(int v, eqoc eqoc0) {
        this.c.b();
        this.e.s();
        if(v != 0x2A0F && v != 10769 && v != 10770) {
            this.f.g(v, eqoc0);
        }
        else if(v == 0x2A0F) {
            this.f.e(gjkj.G);
        }
        else {
            this.d.b();
            this.d.c();
            this.f(v);
            SourceQuickStartChimeraService.e(this);
        }
        if(v == 10564 && this.e.F == 7) {
            this.f(10564);
            return;
        }
        if(this.e.F == 3) {
            this.f(v);
        }
    }

    public static void e(Context context0) {
        SourceQuickStartChimeraService.a.d("Request to stop Service", new Object[0]);
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.smartdevice.quickstart.SourceQuickStartService");
        context0.stopService(intent0);
    }

    private final void f(int v) {
        try {
            eqwi eqwi0 = this.i;
            batl.s(eqwi0);
            eqwi0.e(v);
        }
        catch(RemoteException | NullPointerException exception0) {
            SourceQuickStartChimeraService.a.n("Failed to call onError", exception0, new Object[0]);
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        IBinder iBinder0 = new eqwk(this);
        this.k = iBinder0;
        ((eqwl)iBinder0).asBinder();
        return iBinder0;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        SourceQuickStartChimeraService.a.d("onCreate().", new Object[0]);
        super.onCreate();
        for(Object object0: hyis.j().b) {
            Intent intent0 = new Intent("com.google.android.gms.smartdevice.quickstart.SOURCE_FLOW_START");
            intent0.setFlags(0x10000000);
            intent0.setPackage(((String)object0));
            this.sendBroadcast(intent0);
        }
        HandlerThread handlerThread0 = new HandlerThread("SourceQuickStartBackground", 10);
        handlerThread0.start();
        this.l = new eqyc(this, handlerThread0.getLooper());
        this.f = erav.a(this);
        this.g = eraw.f();
        this.d = new eqam(eqrn.a(this, "quickStart"), this, this.l);
        this.e = new eqyw(this, this.l, this, this.d);
        this.b = bayn.f(this);
        eqrl.a(this);
        this.c = new eqsl(new bblp(1, 10), null, hyis.a.k().k(), new eqyd(this));
        if(!hyis.q()) {
            this.c.a();
        }
        this.m = eqgn.b(this);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        SourceQuickStartChimeraService.a.d("onDestroy().", new Object[0]);
        this.c.b();
        eqyw eqyw0 = this.e;
        WifiP2pManager.Channel wifiP2pManager$Channel0 = eqyw0.u;
        if(wifiP2pManager$Channel0 != null) {
            wifiP2pManager$Channel0.close();
        }
        clht clht0 = eqyw0.s;
        if(clht0 != null) {
            clht0.getLooper().quitSafely();
        }
        eqyw0.s();
        eqsl eqsl0 = eqyw0.E;
        if(eqsl0 != null) {
            eqsl0.b();
        }
        eqyb eqyb0 = eqyw0.H;
        if(eqyb0 != null) {
            erpg erpg0 = eqyb0.g;
            if(erpg0 != null) {
                erpg0.a();
                if(eqyb0.f != null && eqyb0.f.isConnected()) {
                    try {
                        eqyb0.f.close();
                    }
                    catch(IOException iOException0) {
                        eqyb.a.g("Could not close the client socket", iOException0, new Object[0]);
                    }
                }
            }
        }
        this.d.b();
        this.d.c();
        this.f.c();
        eraw.e();
        erpi.a(this.l);
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        SourceQuickStartChimeraService.a.d("onStartCommand.", new Object[0]);
        Account[] arr_account = cchj.b(this).p("com.google");
        this.m.f(Arrays.asList(arr_account));
        return super.onStartCommand(intent0, v, v1);
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        this.e.A = false;
        return false;
    }
}

