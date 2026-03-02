package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import bbqa;
import clht;
import com.google.android.gms.smartdevice.wifi.ConnectToWifiNetworkRequest;
import cumi;
import cutr;
import dagger.Lazy;
import dcii;
import dcin;
import dckk;
import dckl;
import dckn;
import dcko;
import dcks;
import dcmf;
import dcnc;
import dcvk;
import dcvz;
import dcwv;
import dcww;
import ddsc;
import dfrq;
import dfrr;
import dfsb;
import dfse;
import dfsf;
import dfsg;
import djad;
import djbm;
import djbt;
import erri;
import evql;
import evrg;
import hvqs;
import hvqz;
import hvrc;
import icbb;
import icck;
import icht;
import icir;
import iciv;
import icls;
import iclv;
import j..util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import jwe;
import lpe;
import lpg;
import lpq;
import lps;
import lrt;

public class ReceiveSurfaceChimeraService extends dcin implements lps {
    public dcmf a;
    public Context b;
    public dcks c;
    public boolean d;
    public Intent e;
    final Handler f;
    public Lazy g;
    public Lazy h;
    private dcii i;
    private BroadcastReceiver j;
    private BroadcastReceiver k;
    private BroadcastReceiver l;
    private BroadcastReceiver m;
    private BroadcastReceiver n;
    private BroadcastReceiver o;
    private BroadcastReceiver p;
    private DisplayManager.DisplayListener q;
    private dcwv r;
    private final lrt s;

    public ReceiveSurfaceChimeraService() {
        this.f = new clht();
        this.s = new lrt(this);
    }

    public final void b(Context context0, WifiCredentialsAttachment wifiCredentialsAttachment0) {
        evql evql0;
        String s;
        erri erri0 = new erri(context0.getApplicationContext());
        int v = wifiCredentialsAttachment0.b;
        switch(v) {
            case 1: {
                s = "Open";
                break;
            }
            case 2: {
                s = "PSK";
                break;
            }
            case 3: {
                s = "WEP";
                break;
            }
            case 4: {
                s = "SAE";
                break;
            }
            default: {
                s = null;
            }
        }
        String s1 = wifiCredentialsAttachment0.a;
        if(s == null) {
            evql0 = evrg.c(new IllegalArgumentException(String.format(Locale.getDefault(), "connectToWifi failed to connect to ssid %s because an unknown securityType (%s) was given.", s1, v)));
        }
        else {
            String s2 = wifiCredentialsAttachment0.d;
            ConnectToWifiNetworkRequest connectToWifiNetworkRequest0 = new ConnectToWifiNetworkRequest();
            if(s2 != null) {
                connectToWifiNetworkRequest0.c = s2;
            }
            connectToWifiNetworkRequest0.a = s1;
            connectToWifiNetworkRequest0.b = s;
            connectToWifiNetworkRequest0.d = wifiCredentialsAttachment0.e;
            evql0 = erri0.b(connectToWifiNetworkRequest0);
        }
        evql0.b(new dckk(this, wifiCredentialsAttachment0));
        evql0.A(new dckl(this, wifiCredentialsAttachment0));
    }

    public final void c(Intent intent0) {
        Context context0 = this.getApplicationContext();
        this.i.i();
        if(intent0.getStringExtra("android.intent.extra.TEXT") != null) {
            djbt.c(context0, intent0);
            return;
        }
        ArrayList arrayList0 = intent0.getStringArrayListExtra("com.google.android.gms.nearby.sharing.KEY_COPY_IMAGE_URI");
        ArrayList arrayList1 = new ArrayList();
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList1.add(Uri.parse(((String)arrayList0.get(v1))));
            }
            boolean z = intent0.getBooleanExtra("android.content.extra.IS_SENSITIVE", false);
            boolean z1 = intent0.getBooleanExtra("android.content.extra.IS_REMOTE_DEVICE", false);
            String s = intent0.getStringExtra("android.content.extra.REMOTE_DEVICE_NAME");
            djad.m(context0, arrayList1, z, intent0.getBooleanExtra("copy_paste_extra_need_toast", ((boolean)(bbqa.c() ^ 1))), z1, s);
        }
    }

    public final void d(Context context0) {
        dcwv dcwv0 = dcww.a(context0);
        if(!Objects.equals(this.r, dcwv0)) {
            this.r = dcwv0;
            this.a.M(this.c);
            if(dcww.b(this).e()) {
                dcwv dcwv1 = this.r;
                this.a = dcwv1 == null ? new ddsc(this, new dcnc(((int)hvqs.q()))) : new ddsc(this, new dcnc(dcwv1.b));
            }
            else {
                this.a = new ddsc(this, new dcnc(0));
            }
            dcks dcks0 = new dcks(context0, this.f, this.i, this.a);
            this.c = dcks0;
            this.a.J(dcks0);
        }
    }

    public final void f(boolean z) {
        this.d = z;
        if(z) {
            Intent intent0 = this.e;
            if(intent0 != null) {
                this.c(intent0);
                this.e = null;
            }
        }
    }

    @Override  // lps
    public final lpg getLifecycle() {
        return this.s.a;
    }

    public final void i(int v, int v1, String[] arr_s) {
        new clht(Looper.getMainLooper()).post(new dckn(this, v1, arr_s, v));
    }

    private final icck j() {
        return lpq.a(this.getLifecycle());
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        this.s.a();
        return null;
    }

    @Override  // dcin
    public final void onCreate() {
        dcmf dcmf0;
        this.s.b();
        super.onCreate();
        this.r = dcww.a(this);
        if(this.i == null) {
            this.i = dcii.d(this.b);
        }
        if(dcww.b(this).e() && this.a == null) {
            dcwv dcwv0 = this.r;
            dcmf0 = dcwv0 == null ? new ddsc(this, new dcnc(((int)hvqs.q()))) : new ddsc(this, new dcnc(dcwv0.b));
        }
        else {
            if(this.a == null) {
                this.a = cumi.f(this);
            }
            dcmf0 = this.a;
        }
        this.a = dcmf0;
        dcks dcks0 = new dcks(this.b, this.f, this.i, this.a);
        this.c = dcks0;
        this.a.J(dcks0);
        ReceiveSurfaceChimeraService.3 receiveSurfaceChimeraService$30 = new ReceiveSurfaceChimeraService.3(this);
        this.j = receiveSurfaceChimeraService$30;
        cutr.b(this.b, receiveSurfaceChimeraService$30, new IntentFilter("com.google.android.gms.nearby.sharing.COPY_TO_CLIPBOARD"));
        if(hvrc.a.b().al()) {
            dfsg dfsg0 = (dfsg)this.g.get();
            icck icck0 = this.j();
            IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.nearby.sharing.CONNECT_WIFI");
            icir.d(iciv.c(new iclv(iciv.c(new icht(new dfse(new icls(new dfsb(iciv.b(dcvk.a(dfsg0.a, "WifiReceiver", intentFilter0)))), null, dfsg0)), dfsg0.d), new dfsf(dfsg0, null)), dfsg0.c), icck0);
        }
        else {
            ReceiveSurfaceChimeraService.4 receiveSurfaceChimeraService$40 = new ReceiveSurfaceChimeraService.4(this);
            this.k = receiveSurfaceChimeraService$40;
            cutr.b(this.b, receiveSurfaceChimeraService$40, new IntentFilter("com.google.android.gms.nearby.sharing.CONNECT_WIFI"));
        }
        ReceiveSurfaceChimeraService.5 receiveSurfaceChimeraService$50 = new ReceiveSurfaceChimeraService.5(this);
        this.l = receiveSurfaceChimeraService$50;
        cutr.b(this.b, receiveSurfaceChimeraService$50, new IntentFilter("com.google.android.gms.nearby.sharing.INSTALL_APP"));
        ReceiveSurfaceChimeraService.7 receiveSurfaceChimeraService$70 = new ReceiveSurfaceChimeraService.7(this);
        this.m = receiveSurfaceChimeraService$70;
        cutr.b(this.b, receiveSurfaceChimeraService$70, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_RECEIVE_SURFACE_REGISTER"));
        this.n = new ReceiveSurfaceChimeraService.8(this);
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("android.intent.action.SCREEN_ON");
        intentFilter1.addAction("android.intent.action.SCREEN_OFF");
        intentFilter1.addAction("android.intent.action.USER_PRESENT");
        jwe.b(this, this.n, intentFilter1, 2);
        DisplayManager displayManager0 = (DisplayManager)this.getSystemService(DisplayManager.class);
        dcko dcko0 = new dcko(this);
        this.q = dcko0;
        displayManager0.registerDisplayListener(dcko0, new clht(Looper.getMainLooper()));
        this.f(djbm.i(this.getApplicationContext()));
        this.o = new ReceiveSurfaceChimeraService.1(this);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addDataScheme("package");
        jwe.b(this, this.o, intentFilter2, 4);
        this.p = new ReceiveSurfaceChimeraService.2(this);
        IntentFilter intentFilter3 = new IntentFilter("com.google.android.gms.nearby.sharing.STATE_CHANGED");
        jwe.b(this, this.p, intentFilter3, 4);
        if(hvqz.ad()) {
            dfrr dfrr0 = (dfrr)this.h.get();
            icbb.b(this.j(), null, null, new dfrq(dfrr0, null), 3);
        }
        dcvz.a.b().h("ReceiveSurfaceService created with vendorMetadata %s", this.r);
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        this.s.c();
        this.i.e();
        BroadcastReceiver broadcastReceiver0 = this.j;
        if(broadcastReceiver0 != null) {
            cutr.f(this.b, broadcastReceiver0);
        }
        BroadcastReceiver broadcastReceiver1 = this.k;
        if(broadcastReceiver1 != null) {
            cutr.f(this.b, broadcastReceiver1);
        }
        BroadcastReceiver broadcastReceiver2 = this.l;
        if(broadcastReceiver2 != null) {
            cutr.f(this.b, broadcastReceiver2);
        }
        BroadcastReceiver broadcastReceiver3 = this.m;
        if(broadcastReceiver3 != null) {
            cutr.f(this.b, broadcastReceiver3);
        }
        BroadcastReceiver broadcastReceiver4 = this.n;
        if(broadcastReceiver4 != null) {
            cutr.f(this.b, broadcastReceiver4);
        }
        if(this.q != null) {
            ((DisplayManager)this.getSystemService(DisplayManager.class)).unregisterDisplayListener(this.q);
            this.q = null;
        }
        BroadcastReceiver broadcastReceiver5 = this.o;
        if(broadcastReceiver5 != null) {
            cutr.f(this.b, broadcastReceiver5);
        }
        this.a.M(this.c);
        dcvz.a.b().p("ReceiveSurfaceService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        this.s.d(lpe.ON_START);
        dcvz.a.b().p("ReceiveSurfaceService started", new Object[0]);
        return 1;
    }
}

