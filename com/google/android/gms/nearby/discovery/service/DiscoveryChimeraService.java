package com.google.android.gms.nearby.discovery.service;

import ByteString;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import bblp;
import bbng;
import com.google.android.chimera.Service;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.libraries.bluetooth.fastpair.BroadcastConstants.Result;
import cpvn;
import cumz;
import cupd;
import cusq;
import cusr;
import cust;
import cutr;
import cvzy;
import cwec;
import cwed;
import cwex;
import cwey;
import cwez;
import cwfa;
import cwfb;
import cwgw;
import cwgx;
import cwhr;
import cwia;
import cwoe;
import cwqd;
import cwwq;
import cxjo;
import cxjx;
import cxke;
import cxnb;
import cxqp;
import cxqw;
import cxrb;
import cxrc;
import cxrd;
import cxre;
import cxrf;
import cxri;
import cxrj;
import cxrk;
import cxrl;
import cxrm;
import cxrn;
import cxro;
import cxrp;
import cxrq;
import cxrr;
import cxrs;
import cxrt;
import cxru;
import cxrv;
import cxrw;
import cxrx;
import cxry;
import cxrz;
import cxsa;
import cxsb;
import cxsi;
import cxsj;
import cxss;
import cxti;
import cxtj;
import cxtk;
import cxtl;
import cxto;
import cxtp;
import cxtq;
import cxtr;
import cxuf;
import cxug;
import cxuh;
import cxuw;
import cxux;
import cxuy;
import cxuz;
import cxve;
import cxvg;
import cxvk;
import cxvm;
import cxvt;
import cxvu;
import cxvv;
import cxvw;
import cxwg;
import cxwj;
import cxwl;
import cxwm;
import cxws;
import cxwt;
import cxxd;
import cxxk;
import cxyy;
import cxzo;
import cyff;
import cyfo;
import cyfp;
import cyfs;
import cyfz;
import cygb;
import cysc;
import evql;
import evrg;
import fgjo;
import fgpa;
import fgtn;
import frbx;
import frfo;
import frga;
import gftb;
import gged_interceptors;
import ggna;
import ggtj;
import gmcg;
import gxuf;
import gxul;
import gxum;
import gxuo;
import gxup;
import gxva;
import gxvd;
import gxwa;
import gxxc;
import gxye;
import gxyf;
import gzfp;
import hftc;
import hifl;
import hifn;
import hifo;
import hiht;
import hvoz;
import hvpg;
import hvpp;
import j..util.Objects;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import jwe;
import jys;
import kba;
import osl;

public class DiscoveryChimeraService extends Service implements cusr {
    private cxsi A;
    private final Object B;
    private Executor C;
    private gxwa D;
    public cusq a;
    public cwex b;
    public cxss c;
    public gxuf d;
    public gxva e;
    public cxxk f;
    public cwec g;
    public cwed h;
    public cxxd i;
    public cwgw j;
    public cxti k;
    public cxnb l;
    public osl m;
    public final Executor n;
    public cxsj o;
    public cxsj p;
    private static Executor q;
    private final DiscoveryChimeraService.IntentReceiver r;
    private final DiscoveryChimeraService.GuardedIntentReceiver s;
    private cwwq t;
    private final gmcg u;
    private final gxum v;
    private final gxum w;
    private final gxum x;
    private final gxum y;
    private final gxum z;

    public DiscoveryChimeraService() {
        this.r = new DiscoveryChimeraService.IntentReceiver(this);
        this.s = new DiscoveryChimeraService.GuardedIntentReceiver(this);
        this.n = new bblp(1, 10);
        this.u = new bblp(1, 10);
        this.v = new cxrt(this);
        this.w = new cxru(this);
        this.x = new cxrv(this);
        this.y = new cxrw(this);
        this.z = new cxrx(this);
        this.B = new Object();
    }

    public static Intent a(Context context0) {
        return new Intent().setClassName(context0, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
    }

    @Override  // cusr
    public final cusq b() {
        return this.a;
    }

    public static Intent c(Context context0, byte[] arr_b) {
        return DiscoveryChimeraService.a(context0).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR").putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", arr_b);
    }

    public final void d(boolean z) {
        cwex cwex0 = this.b;
        if(cwex0.f != z) {
            cwex0.f = z;
            for(Object object0: cwex0.l()) {
                cwey cwey0 = (cwey)object0;
                if(cwey0.g() == hiht.f) {
                    cwey0.x(z);
                }
            }
        }
        this.c.a();
    }

    @Override  // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        try {
            this.d.d(new cxrs(this, printWriter0));
        }
        catch(InterruptedException interruptedException0) {
            printWriter0.format("Failed to dump: %s\n", new Object[]{interruptedException0});
        }
        cygb cygb0 = (cygb)cusq.c(this, cygb.class);
        HashMap hashMap0 = cygb0.a;
        for(Object object0: hashMap0.keySet()) {
            Class class0 = (Class)object0;
            cyfz cyfz0 = (cyfz)hashMap0.get(class0);
            if(cyfz0 != null && !((Boolean)cyfz0.a.a()).booleanValue()) {
                printWriter0.println();
                kba kba0 = cyfz0.d;
                if(kba0 == null) {
                    printWriter0.println(class0.getSimpleName() + ": Module disable");
                }
                else {
                    printWriter0.println(class0.getSimpleName() + ": " + ((String)kba0.a()));
                }
            }
            else {
                cygb0.i(class0, new cyfs(printWriter0));
            }
        }
    }

    public final void e() {
        evql evql0 = ((cpvn)this.a.b(cpvn.class)).f("nearby-fast-pair-offline-cache");
        try {
            evrg.o(evql0, hvpg.a.aY().ax(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException | InterruptedException exception0) {
            ((ggtj)cwfa.a.g().s(exception0)).x("FastPairOffline: mdd task does not finish");
            return;
        }
        FileGroupResponse fileGroupResponse0 = (FileGroupResponse)evql0.j();
        if(fileGroupResponse0 != null) {
            List list0 = fileGroupResponse0.c;
            if(list0 != null && !list0.isEmpty()) {
                frbx frbx0 = new frbx(Collections.singletonList(((frga)this.a.b(frga.class))));
                Uri uri0 = Uri.parse(((MddFile)list0.get(0)).b);
                try {
                    byte[] arr_b = (byte[])frbx0.d(uri0, new frfo());
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)cxjo.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    cust cust0 = cwfa.a;
                    cust0.f().z("FastPairOffline: Number of the response that will be cached: %s", ((cxjo)hftv0).b.size());
                    cwoe cwoe0 = (cwoe)this.a.b(cwoe.class);
                    for(Object object0: ((cxjo)hftv0).b) {
                        cwoe0.h(((gzfp)object0), false);
                    }
                    cust0.d().z("FastPair: finished offline cache populate device number in cache: %s", cwoe0.c.e().size());
                }
                catch(IOException iOException0) {
                    ((ggtj)cwfa.a.g().s(iOException0)).x("FastPairOffline: Cache does not populate correctly");
                }
                return;
            }
        }
        cwfa.a.g().x("FastPairOffline: MDD response is empty");
    }

    // Detected as a lambda impl.
    public final void f(boolean z) {
        if(gxvd.e(this, cumz.f(this), cumz.e(this, "DiscoveryChimeraService")) && z) {
            this.d.f(this.x);
            this.g();
            return;
        }
        cyfp.j(this);
        this.d.f(this.w);
        this.g();
    }

    public final void g() {
        this.d.h(this.v);
        long v = hvoz.a.f().r();
        cwfa.a.f().A("Shutdown (stopSelf) service in %d ms", v);
        this.d.g(this.v, v);
    }

    public final void h() {
        synchronized(this) {
            gxuf gxuf0 = this.d;
            gftb.check(gxuf0);
            if(gxuf0.i(this.v)) {
                cwfa.a.f().x("DiscoveryService stopSelf is already scheduled. Ignoring this stop.");
                return;
            }
            cxxd cxxd0 = this.i;
            gftb.check(cxxd0);
            cyfp.j(cxxd0.d);
            if(cxxd0.j.j()) {
                cwfa.a.d().x("FastPair: isDestroyable: Scanner is alive.");
                cwfa.a.d().x("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
                return;
            }
            if(cxxd0.h.l()) {
                cwfa.a.d().x("FastPair: isDestroyable: Event stream is still connected.");
                cwfa.a.d().x("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
                return;
            }
            int v1 = cxxd0.u.get();
            if(v1 > 0) {
                cwfa.a.d().z("FastPair: isDestroyable: Sdp request (num=%s) is still pending.", v1);
                cwfa.a.d().x("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
                return;
            }
            cwqd cwqd0 = (cwqd)((cygb)cusq.c(this, cygb.class)).a(cwqd.class);
            if(cwqd0 != null && cwqd0.h.b()) {
                ((ggtj)cwfa.a.d().ar(7444)).x("FastPair: ConnectionSwitchManager is not destroyable due to recent manual connect events");
                cwfa.a.d().x("DiscoveryService: Skip stopSelf(), connection switch manager is not destroyable.");
                return;
            }
            cysc cysc0 = (cysc)((cygb)cusq.c(this, cygb.class)).a(cysc.class);
            cwfa.a.f().x("DiscoveryService shutdown (stopSelf).");
            this.stopSelf();
        }
    }

    private static Executor i() {
        if(DiscoveryChimeraService.q == null) {
            DiscoveryChimeraService.q = new bblp(1, 10);
        }
        return DiscoveryChimeraService.q;
    }

    private final void j() {
        this.d.h(this.v);
        cyfp.j(this);
        this.g();
    }

    private final void k() {
        cxrf cxrf0 = new cxrf(this);
        this.u.execute(cxrf0);
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        cwfa.a.f().x("DiscoveryService bound.");
        if("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent0.getAction())) {
            if(this.o == null) {
                this.o = new cxsj(this, this.d);
            }
            return this.o;
        }
        if("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent0.getAction())) {
            if(this.p == null) {
                this.p = new cxsj(this, this.d);
            }
            return this.p;
        }
        if("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE".equals(intent0.getAction())) {
            if(this.A != null) {
                return this.A;
            }
            this.A = new cxsi(this);
            return this.A;
        }
        if("com.google.android.gms.nearby.discovery:ACTION_DEVICES_FMD_SERVICE".equals(intent0.getAction())) {
            if(this.D == null) {
                this.D = new gxwa(this);
            }
            return this.D;
        }
        if("com.google.android.gms.nearby.discovery:ACTION_ACCOUNT_SETTING".equals(intent0.getAction())) {
            if(this.A != null) {
                return this.A;
            }
            this.A = new cxsi(this);
            return this.A;
        }
        if("com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_TRIANGLE_SWITCH".equals(intent0.getAction())) {
            if(this.A == null) {
                this.A = new cxsi(this);
            }
            return this.A;
        }
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        cust cust0 = cwfa.a;
        cust0.d().x("DiscoveryService created");
        cusq cusq0 = new cusq(this);
        this.a = cusq0;
        cusq0.h(new cvzy());
        this.c = (cxss)cusq.c(this, cxss.class);
        this.i = (cxxd)cusq.c(this, cxxd.class);
        this.t = (cwwq)cusq.c(this, cwwq.class);
        this.j = new cwgw(this);
        this.k = new cxti(this);
        this.l = (cxnb)cusq.c(this, cxnb.class);
        this.b = (cwex)cusq.c(this, cwex.class);
        this.e = (gxva)cusq.c(this, gxva.class);
        this.d = (gxuf)cusq.c(this, gxuf.class);
        this.f = (cxxk)cusq.c(this, cxxk.class);
        this.g = (cwec)cusq.c(this, cwec.class);
        this.h = (cwed)cusq.c(this, cwed.class);
        this.i.J = this;
        cwex cwex0 = this.b;
        cwed cwed0 = this.h;
        cwez cwez0 = cwex0.j;
        if(cwez0 != null) {
            cwez0.e = cwed0;
        }
        cwgx cwgx0 = cwex0.b;
        if(cwgx0 != null) {
            cwgx0.e = cwed0;
        }
        gged_interceptors gged0 = cwgw.b(this).v();
        if(!gged0.isEmpty()) {
            IntentFilter intentFilter0 = new IntentFilter();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                intentFilter0.addAction(((String)gged0.get(v1)));
            }
            jwe.b(this, this.r, intentFilter0, 2);
        }
        gged_interceptors gged1 = cwgw.a(this).v();
        if(!gged1.isEmpty()) {
            IntentFilter intentFilter1 = new IntentFilter();
            for(Object object0: gged1) {
                intentFilter1.addAction(((String)object0));
            }
            cutr.b(this, this.s, intentFilter1);
        }
        ((cygb)cusq.c(this, cygb.class)).e();
        cxxd cxxd0 = this.i;
        cxxd0.A.set(false);
        Context context0 = cxxd0.d;
        if(cupd.i(context0)) {
            cyfp.j(context0);
            gxul gxul0 = new gxul("FastPairController::InitializeScanner", new cxto(cxxd0));
            cxxd0.b.f(gxul0);
        }
        gxuf gxuf0 = cxxd0.b;
        gxuf0.f(new gxul("FastPairControllerOnCreate", new cxtp(cxxd0)));
        cxxd0.k.j(cxxd0.E);
        ((gxxc)cusq.c(context0, gxxc.class)).b(cxxd0);
        if(hvpp.aE()) {
            cust0.b().x("FastPairController: GellerSyncDeviceChangeListener registers WatchTransferAccountKeyHandler");
            ((gxxc)cusq.c(context0, gxxc.class)).b(cxxd0.m);
        }
        if(hvpg.bn()) {
            if(hvpg.a.aY().hG()) {
                gxuf0.f(new gxul("FastPairController::setSassDeviceGroupManager", new cxtq(cxxd0)));
            }
            else {
                cxxd0.H();
            }
        }
        if(jys.d()) {
            cxxd0.y.f();
        }
        if(hvpp.ax()) {
            gxuf0.f(new gxul("FastPairController::removeStaleTwsCaseBonds", new cxtr(cxxd0)));
        }
        if(hvoz.e() == 0L) {
            return;
        }
        this.d.g(new cxrq(this), hvoz.e());
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        cust cust0 = cwfa.a;
        cust0.d().x("FastPairHandler: unregistering intent receivers");
        cutr.f(this, this.s);
        cutr.f(this, this.r);
        cxsi cxsi0 = this.A;
        if(cxsi0 != null) {
            cxsi0.u();
        }
        cust0.d().x("DiscoveryService destroyed");
        cxxd cxxd0 = this.i;
        cxxd0.A.set(true);
        if(hvpp.aL()) {
            cyfp.j(cxxd0.d);
            gxul gxul0 = new gxul("FastPairController::DestroyScanner", new cxuf(cxxd0));
            cxxd0.b.f(gxul0);
        }
        gxul gxul1 = new gxul("FastPairControllerOnDestroy::EventStream", new cxug(cxxd0));
        cxxd0.b.f(gxul1);
        gxul gxul2 = new gxul("FastPairControllerOnDestroy", new cxuh(cxxd0));
        cxxd0.b.f(gxul2);
        cxxd0.k.n(cxxd0.E);
        Context context0 = cxxd0.d;
        ((gxxc)cusq.c(context0, gxxc.class)).c(cxxd0);
        if(hvpp.aE()) {
            cust0.b().x("FastPairController: GellerSyncDeviceChangeListener unregisters watchTransferAccountKeyHandler");
            ((gxxc)cusq.c(context0, gxxc.class)).c(cxxd0.m);
        }
        if(jys.d()) {
            cxxd0.y.g();
        }
        cxxd0.p.shutdownNow();
        try {
            this.d.d(new cxrr(this));
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            ((ggtj)cwfa.a.e().s(interruptedException0)).x("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
            this.a.g();
        }
        this.u.shutdownNow();
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        boolean z10;
        Object object0;
        boolean z8;
        cxwm cxwm0;
        cust cust4;
        gxye gxye1;
        Bundle bundle0;
        Intent intent1;
        String s;
        synchronized(this) {
            if(hvoz.h()) {
                if(intent0 != null) {
                    s = intent0.getAction();
                    goto label_11;
                }
                cwfa.a.d().x("DiscoveryService started with null intent. Possibly restarting after a crash");
                s = "com.google.android.gms.nearby.discovery:ACTION_INIT_RUNTIME_STATE";
                intent1 = null;
                goto label_12;
            }
            if(intent0 != null) {
                s = intent0.getAction();
            label_11:
                intent1 = intent0;
            label_12:
                if(!TextUtils.isEmpty(s)) {
                    bundle0 = intent1 == null ? null : intent1.getExtras();
                    cust cust0 = cwfa.a;
                    cust0.d().B("DiscoveryService onStartCommand action: %s", s);
                    if(cwgw.c(this, s)) {
                        this.d.f(new cxry(this, intent1));
                    }
                    boolean z = false;
                    switch(s) {
                        case "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED": {
                        label_435:
                            cxxd cxxd9 = this.i;
                            cxxd9.t(intent1.getAction(), intent1.getIntExtra("android.bluetooth.profile.extra.PREVIOUS_STATE", -1), intent1.getIntExtra("android.bluetooth.profile.extra.STATE", -1), cutr.a(cxxd9.d, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "android.bluetooth.adapter.action.STATE_CHANGED": {
                            cxxd cxxd2 = this.i;
                            int v2 = intent1.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
                            cwfa.a.d().z("FastPair: onAdapterStateChange: state=%s", v2);
                            switch(v2) {
                                case 12: {
                                    v2 = 12;
                                    break;
                                }
                                case 10: 
                                case 13: {
                                    break;
                                }
                                default: {
                                    ((cygb)cusq.c(this, cygb.class)).e();
                                    goto label_498;
                                }
                            }
                            if(jys.d()) {
                                switch(v2) {
                                    case 12: {
                                        cxxd2.y.f();
                                        break;
                                    }
                                    case 13: {
                                        cxxd2.y.g();
                                    }
                                }
                            }
                            cxuy cxuy0 = new cxuy(cxxd2, v2);
                            cxxd2.b.f(cxuy0);
                            ((cygb)cusq.c(this, cygb.class)).e();
                            goto label_498;
                        }
                        case "android.bluetooth.device.action.ACL_CONNECTED": {
                            this.i.s(intent1, cyff.a);
                            if((hvpg.bB() || hvpg.bv()) && bundle0 != null && bundle0.getParcelable("android.bluetooth.device.extra.DEVICE") != null) {
                                cygb cygb0 = (cygb)cusq.c(this, cygb.class);
                                cxri cxri0 = new cxri(bundle0);
                                cygb0.i(cwqd.class, cxri0);
                            }
                            this.g();
                            goto label_498;
                        }
                        case "android.bluetooth.device.action.ACL_DISCONNECTED": {
                            goto label_459;
                        }
                        case "android.bluetooth.device.action.ALIAS_CHANGED": {
                            cxxd cxxd8 = this.i;
                            String s13 = cwfb.c.a();
                            cust cust5 = cwfa.a(cwfa.b(s13), s13);
                            if(intent1.hasExtra("android.bluetooth.device.extra.DEVICE") && intent1.hasExtra("android.bluetooth.device.extra.NAME")) {
                                BluetoothDevice bluetoothDevice0 = cutr.a(cxxd8.d, intent1);
                                gftb.check(bluetoothDevice0);
                                String s14 = intent1.getStringExtra("android.bluetooth.device.extra.NAME");
                                gftb.check(s14);
                                cust5.d().R("FastPair: Received alias name change, alias=%s, %s", s14, gxyf.b(gxye.a, bluetoothDevice0));
                                cxvk cxvk0 = new cxvk(cxxd8, bluetoothDevice0, cust5, s14, s13);
                                cxxd8.b.f(cxvk0);
                            }
                            else {
                                cust5.g().x("Got device alias change intent with no extras.");
                            }
                            this.g();
                            goto label_498;
                        }
                        case "android.bluetooth.device.action.BATTERY_LEVEL_CHANGED": {
                            cust0.f().x("FastPair: Received battery level changed, ignoring.");
                            this.g();
                            goto label_498;
                        }
                        case "android.bluetooth.device.action.BOND_STATE_CHANGED": {
                            goto label_484;
                        }
                        case "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED": {
                            if(bundle0 != null && bundle0.getInt("android.bluetooth.profile.extra.STATE", -1) == 0) {
                                ggtj ggtj1 = cust0.d();
                                Parcelable parcelable0 = bundle0.getParcelable("android.bluetooth.device.extra.DEVICE");
                                ggtj1.B("FastPair: HfpDevice disconnected, %s", gxyf.b(gxye.a, parcelable0));
                                cygb cygb2 = (cygb)cusq.c(this, cygb.class);
                                cxrl cxrl0 = new cxrl();
                                cygb2.i(cwqd.class, cxrl0);
                            }
                            goto label_435;
                        }
                        case "com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_BLOOM_FILTER_DETECTED": {
                            cxxd cxxd3 = this.i;
                            if(!intent1.hasExtra("com.google.android.gms.nearby.discovery.SERVICE_DATA_ARRAY")) {
                                cwfa.a.g().x("FastPair: No service data array extra available.");
                            }
                            else if(hvpp.H()) {
                            }
                            else {
                                cxuz cxuz0 = new cxuz(cxxd3, intent1);
                                cxxd3.b.f(cxuz0);
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.ACTION_FAST_PAIR_DEVICE_ADDED": {
                            cxxd cxxd6 = this.i;
                            String s5 = cwfb.i.a();
                            cust cust3 = cwfa.a(cwfa.b(s5), s5);
                            if(!intent1.hasExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS") || !intent1.hasExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY")) {
                                cust3.g().x("FastPairController: onDeviceAdded: Got device added intent with no extras.");
                            }
                            else if(hvpp.a.f().an()) {
                                cust3.d().x("FastPair: upload device to footprints, where the cache update is on main thread.");
                                String s6 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS");
                                if(s6 == null) {
                                    cust3.g().x("FastPairController: onDeviceAdded: Cannot find an address of a device, skipping upload");
                                }
                                else {
                                    String s7 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS");
                                    String s8 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.BONDED_ADDRESS");
                                    if(!hvpp.I()) {
                                        s8 = s7;
                                    }
                                    if(s8 != null && s7 != null) {
                                        ggtj ggtj0 = cust3.d();
                                        gxye gxye0 = gxye.a;
                                        ggtj0.X("FastPairController: onDeviceAdded: %s, cache-%s, public-%s", gxyf.b(gxye0, s6), gxyf.b(gxye0, s8), gxyf.b(gxye0, s7));
                                        if(intent1.getByteArrayExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY") == null) {
                                            cust3.g().x("FastPairController: onDeviceAdded: Cannot find an accountKey of a device, skipping upload");
                                        }
                                        else {
                                            ArrayList arrayList0 = intent1.getStringArrayListExtra("com.google.android.gms.nearby.discovery.ADDITIONAL_IDENTITY_ADDRESS_LIST");
                                            if(arrayList0 == null) {
                                                arrayList0 = new ArrayList();
                                            }
                                            cxqw cxqw0 = cxxd6.h(s6, cust3);
                                            if(cxqw0 == null) {
                                                cust3.g().B("FastPairController: onDeviceAdded: Could not find matching nearby item for %s.", gxyf.b(gxye0, s6));
                                            }
                                            else {
                                                String s9 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS");
                                                String s10 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.PUBLIC_ADDRESS");
                                                String s11 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.BONDED_ADDRESS");
                                                if(!hvpp.I()) {
                                                    s11 = s10;
                                                }
                                                ArrayList arrayList1 = intent1.getStringArrayListExtra("com.google.android.gms.nearby.discovery.ADDITIONAL_IDENTITY_ADDRESS_LIST");
                                                cust3.d().X("FastPairController: createBondedDeviceInformation: %s, cache-%s, public-%s", gxyf.b(gxye0, s9), gxyf.b(gxye0, s11), gxyf.b(gxye0, s10));
                                                if(s9 == null) {
                                                    cust3.g().x("FastPairController: createBondedDeviceInformation:: Cannot find an address of a device, return null");
                                                    cust4 = cust3;
                                                    gxye1 = gxye0;
                                                    cxwm0 = null;
                                                }
                                                else if(s11 != null && s10 != null) {
                                                    byte[] arr_b1 = intent1.getByteArrayExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY");
                                                    if(arr_b1 == null) {
                                                        cust3.g().x("FastPairController: createBondedDeviceInformation: Cannot find an accountKey of a device, return null");
                                                        cust4 = cust3;
                                                        gxye1 = gxye0;
                                                        cxwm0 = null;
                                                    }
                                                    else {
                                                        cxqw cxqw1 = cxxd6.h(s9, cust3);
                                                        if(cxqw1 == null) {
                                                            cust4 = cust3;
                                                            gxye1 = gxye0;
                                                            cxwm0 = null;
                                                        }
                                                        else {
                                                            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)cxqw1).jf(5, null);
                                                            hftp0.X(((ProtoLiteMessage)cxqw1));
                                                            if(intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.IS_EDDYSTONE_SUPPORTED", false)) {
                                                                hifo hifo0 = cxqw1.C;
                                                                if(hifo0 == null) {
                                                                    hifo0 = hifo.b;
                                                                }
                                                                if(gxup.f(hifo0) && gxup.k(cxqw1)) {
                                                                    hifo hifo1 = cxqw1.C;
                                                                    if(hifo1 == null) {
                                                                        hifo1 = hifo.b;
                                                                    }
                                                                    gxye1 = gxye0;
                                                                    ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hifo1).jf(5, null);
                                                                    hftp1.X(((ProtoLiteMessage)hifo1));
                                                                    hifn hifn0 = hifn.b;
                                                                    if(!((hifl)hftp1).b_message.isImmutable()) {
                                                                        ((ProtoLiteBuilder)(((hifl)hftp1))).ensureMutable();
                                                                    }
                                                                    ((hifo)((hifl)hftp1).b_message).k = hifn0.d;
                                                                    ((hifo)((hifl)hftp1).b_message).c |= 0x40;
                                                                    if(!((cxqp)hftp0).b_message.isImmutable()) {
                                                                        ((ProtoLiteBuilder)(((cxqp)hftp0))).ensureMutable();
                                                                    }
                                                                    cxqw cxqw2 = (cxqw)((cxqp)hftp0).b_message;
                                                                    hifo hifo2 = (hifo)((ProtoLiteBuilder)(((hifl)hftp1))).N_build();
                                                                    hifo2.getClass();
                                                                    cxqw2.C = hifo2;
                                                                    cxqw2.b |= 0x8000000;
                                                                }
                                                                else {
                                                                    gxye1 = gxye0;
                                                                }
                                                            }
                                                            else {
                                                                gxye1 = gxye0;
                                                            }
                                                            if(hvpp.bu()) {
                                                                hifo hifo3 = ((cxqw)((cxqp)hftp0).b_message).C;
                                                                if(hifo3 == null) {
                                                                    hifo3 = hifo.b;
                                                                }
                                                                ProtoLiteBuilder hftp2 = (ProtoLiteBuilder)((ProtoLiteMessage)hifo3).jf(5, null);
                                                                hftp2.X(((ProtoLiteMessage)hifo3));
                                                                boolean z6 = (intent1.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_DEVICE_FEATURES", 0) & 0x8000) != 0;
                                                                if(!((hifl)hftp2).b_message.isImmutable()) {
                                                                    ((ProtoLiteBuilder)(((hifl)hftp2))).ensureMutable();
                                                                }
                                                                hifo hifo4 = (hifo)((hifl)hftp2).b_message;
                                                                hifo4.c |= 0x100;
                                                                hifo4.m = z6;
                                                                if(!((cxqp)hftp0).b_message.isImmutable()) {
                                                                    ((ProtoLiteBuilder)(((cxqp)hftp0))).ensureMutable();
                                                                }
                                                                cxqw cxqw3 = (cxqw)((cxqp)hftp0).b_message;
                                                                hifo hifo5 = (hifo)((ProtoLiteBuilder)(((hifl)hftp2))).N_build();
                                                                hifo5.getClass();
                                                                cxqw3.C = hifo5;
                                                                cxqw3.b |= 0x8000000;
                                                            }
                                                            Context context0 = cxxd6.d;
                                                            String s12 = cwia.e(context0, s11, ((cxqw)((cxqp)hftp0).b_message).i, cust3);
                                                            if(!((cxqp)hftp0).b_message.isImmutable()) {
                                                                ((ProtoLiteBuilder)(((cxqp)hftp0))).ensureMutable();
                                                            }
                                                            cxqw cxqw4 = (cxqw)((cxqp)hftp0).b_message;
                                                            s12.getClass();
                                                            cust4 = cust3;
                                                            cxqw4.b |= 0x20;
                                                            cxqw4.i = s12;
                                                            cust4.f().B("FastPair: storedDiscoveryItem title = %s", ((cxqw)((cxqp)hftp0).b_message).i);
                                                            if((cxqw1.b & 0x40000000) == 0) {
                                                                cust4.d().x("FastPair: storedDiscoveryItem has no account key association local timestamp, setting it to current time");
                                                                long v6 = ((bbng)cusq.c(context0, bbng.class)).a();
                                                                if(!((cxqp)hftp0).b_message.isImmutable()) {
                                                                    ((ProtoLiteBuilder)(((cxqp)hftp0))).ensureMutable();
                                                                }
                                                                cxqw cxqw5 = (cxqw)((cxqp)hftp0).b_message;
                                                                cxqw5.b |= 0x40000000;
                                                                cxqw5.F = v6;
                                                            }
                                                            else {
                                                                cust4.d().x("FastPair: storedDiscoveryItem has account key association local timestamp, not setting it");
                                                            }
                                                            if(hvpp.T() && (cxqw1.c & 16) == 0) {
                                                                cxxd6.I(s11, ((cxqp)hftp0));
                                                            }
                                                            cxws cxws0 = cxxd6.j(intent1);
                                                            cxws0.d(((cxqw)((ProtoLiteBuilder)(((cxqp)hftp0))).N_build()));
                                                            cxws0.b(arr_b1);
                                                            cxwt cxwt0 = cxws0.a();
                                                            cxwl cxwl0 = cxwm.a();
                                                            cxwl0.c(s9);
                                                            cxwl0.a = s11;
                                                            cxwl0.b = s10;
                                                            gged_interceptors gged0 = arrayList1 == null ? ggna.a : gged_interceptors.i(arrayList1);
                                                            cxwl0.b(gged0);
                                                            cxwl0.c = cxwt0;
                                                            cxwm0 = cxwl0.a();
                                                        }
                                                    }
                                                }
                                                else {
                                                    cust4 = cust3;
                                                    gxye1 = gxye0;
                                                    cust4.g().x("FastPairController: createBondedDeviceInformation: insufficient address information, return null");
                                                    cxwm0 = null;
                                                }
                                                if(cxwm0 != null) {
                                                    cwex cwex1 = cxxd6.c;
                                                    boolean z7 = cwex1.d(s8) == null;
                                                    int v7 = arrayList0.size();
                                                    int v8 = 0;
                                                    while(v8 < v7) {
                                                        cxke cxke0 = cwex1.d(((String)arrayList0.get(v8)));
                                                        ++v8;
                                                        if(cxke0 != null) {
                                                            continue;
                                                        }
                                                        z8 = true;
                                                        goto label_298;
                                                    }
                                                    z8 = z7;
                                                label_298:
                                                    cwfa.a.d().X("FastPairController: cacheBondedDeviceInformation: bonded-%s, identity-%s, additional=%s", gxyf.b(gxye1, cxwm0.b), gxyf.b(gxye1, cxwm0.c), fgjo.a(cxwm0.d));
                                                    cxke cxke1 = cxxd6.g(cxwm0.b, cxwm0.c, cxwm0.e);
                                                    cxxd6.D(cxwm0.d, cxwm0.e);
                                                    cwhr.o(new cxtj(cxxd6, intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_IS_TEMP_BOND", false), cxwm0, cxqw0, intent1, cust4, s6, z8, cxke1));
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        cust3.g().x("FastPairController: onDeviceAdded: insufficient address information, skip upload");
                                    }
                                }
                            }
                            else {
                                cust3.d().x("FastPair: upload device to footprints.");
                                cwhr.o(new cxtk(cxxd6, intent1, cust3));
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_PAIR": {
                            cxxd cxxd4 = this.i;
                            String s3 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS");
                            if(s3 != null && BluetoothAdapter.checkBluetoothAddress(s3)) {
                                cust cust2 = cwfa.a;
                                cust2.f().x("FastPair: Pairing from the validator.");
                                byte[] arr_b = intent1.getByteArrayExtra("com.google.android.gms.nearby.discovery.KEY");
                                if(arr_b == null) {
                                    cust2.g().x("FastPair: Key is null, skipping pair");
                                    long v4 = SystemClock.elapsedRealtime();
                                    fgpa.b(cxxd4.d, s3, BroadcastConstants.Result.FAILURE, v4);
                                }
                                else {
                                    String s4 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.DEVICE_NAME");
                                    cxtl cxtl0 = new cxtl(cxxd4, s3);
                                    boolean z2 = intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_SKIP_CONNECTING_PROFILES", false);
                                    boolean z3 = intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_BLE_DEVICE_SPEC_SUPPORTED", false);
                                    boolean z4 = intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_LE_AUDIO_SUPPORTED", false);
                                    boolean z5 = intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_SKIP_BONDING", false);
                                    int v3 = intent1.getIntExtra("com.google.android.gms.nearby.discovery.EXTRA_DEVICE_TYPE_NUMBER", 0);
                                    Integer integer0 = intent1.getSerializableExtra("com.google.android.gms.nearby.discovery.EXTRA_MOCK_KEY_BASED_PAIRING_REQUEST_FLAGS") == null ? null : ((Integer)intent1.getSerializableExtra("com.google.android.gms.nearby.discovery.EXTRA_MOCK_KEY_BASED_PAIRING_REQUEST_FLAGS"));
                                    cxxd4.J(s3, arr_b, s4, cxtl0, true, new fgtn(z2, z3, z4, z5, intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_CREATE_SILENT_PAIR_CONNECTION_VIA_FAST_PAIR_MANAGER", false), intent1.getBooleanExtra("com.google.android.gms.nearby.discovery.EXTRA_IS_TEMP_BOND_FOR_AUDIO_SHARING", false), v3, integer0), null, null);
                                }
                            }
                            else {
                                cwfa.a.g().B("FastPair: Received invalid address, skipping pair: %s", gxyf.b(gxye.a, s3));
                                long v5 = SystemClock.elapsedRealtime();
                                fgpa.b(cxxd4.d, s3, BroadcastConstants.Result.FAILURE, v5);
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_REQUEST_TEST_SERVICE_CONNECTION": 
                        case "com.google.android.gms.nearby.fastpair.service.ACTION_TRIGGER_VALIDATOR_CONNECTION": {
                            cxxd cxxd5 = this.i;
                            cwfa.a.d().x("FastPairController: Validator: onValidatorConnectionRequested");
                            cxvm cxvm0 = new cxvm(cxxd5);
                            cxxd5.b.f(cxvm0);
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.ACTION_VALIDATOR_SEND_EVENT_MESSAGE": {
                            this.d.f(new cxrz(this, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_TRIANGLE_SWITCH_CONNECTION_END": {
                            cwfa.a.d().x("Receive triangle switch event end");
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_TRIANGLE_SWITCH_EVENT": {
                            if(bundle0 != null) {
                                String s15 = bundle0.getString("com.google.android.gms.nearby.discovery.fastpair.connectionswitch.E2E_LOG_PREFIX", "");
                                cust cust6 = s15.isEmpty() ? cwfa.a : cwfa.a(s15, "NOTSET");
                                cust6.d().B("DiscoveryChimeraService: receive triangle switch event, current device is wearable device %b", Boolean.valueOf(false));
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_RECEIVE_WATCH_AS_HFP_SEEKER": {
                            if(cyfo.d(this) && bundle0 != null) {
                                byte[] arr_b2 = bundle0.getByteArray("com.google.android.gms.nearby.discovery.fastpair.connectionswitch.RESUME_MEDIA_STATE");
                                if(arr_b2 != null && arr_b2.length > 0) {
                                    if(arr_b2[0] != 0) {
                                        z = true;
                                    }
                                    cwfa.a.d().B("Receive watch as active hfp seeker event to trigger triangle calling switch with resumeMedia = %b", Boolean.valueOf(z));
                                    cygb cygb1 = (cygb)cusq.c(this, cygb.class);
                                    cxre cxre0 = new cxre(z);
                                    cygb1.i(cwqd.class, cxre0);
                                }
                                else {
                                    cwfa.a.d().x("Receive watch as active hfp seeker event but skip to trigger triangle calling switch because data is null or empty");
                                }
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery.fastpair.service.CLEAN_CACHE": {
                            object0 = this.B;
                            __monitor_enter(object0);
                            goto label_450;
                        }
                        case "com.google.android.gms.nearby.discovery.fastpair.service.POPULATE_CACHE": {
                            goto label_477;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_CANCEL_FAST_PAIR": {
                            cxxd cxxd0 = this.i;
                            String s1 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.BLE_ADDRESS");
                            if(s1 != null) {
                                cwfa.a.d().B("FastPair: cancel pairing with %s", gxyf.b(gxye.a, s1));
                                cxwj cxwj0 = new cxwj(cxxd0, "cancelPairing=".concat(gxyf.b(gxye.a, s1)), s1);
                                cxxd0.b.f(cxwj0);
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_DEBUG_CHANGE": 
                        case "com.google.android.gms.nearby.discovery:ACTION_LOCALE_CHANGE": {
                            this.d.f(this.w);
                            this.k();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRED_NOTIFICATION_DISMISSED": {
                            cxxd cxxd1 = this.i;
                            String s2 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
                            PendingIntent pendingIntent0 = (PendingIntent)intent1.getParcelableExtra("com.google.android.gms.nearby.discovery:EXTRA_PENDING_INTENT");
                            cwfa.a.f().B("FastPair: Pairing attempt finished, post-pairing PendingIntent=%s", pendingIntent0);
                            boolean z1 = cxxd.T(pendingIntent0);
                            cxxd1.b.f(new cxve(cxxd1, "fastPairPairedNotificationDismissed=".concat(String.valueOf(s2)), z1, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_PAIRING_PROCESS_DONE": {
                            goto label_470;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR": {
                            cxxd cxxd7 = this.i;
                            if(intent1.hasExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY")) {
                                cxuw cxuw0 = new cxuw(cxxd7, intent1);
                                cxxd7.b.f(cxuw0);
                            }
                            else {
                                cwfa.a.f().x("FastPair: Unpair did not include account key.");
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_INIT_RUNTIME_STATE": 
                        case "com.google.android.gms.nearby.discovery:ACTION_PERMISSION_CHANGE": {
                            this.k();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR": {
                            goto label_479;
                        }
                        case "com.google.android.gms.nearby.discovery:ACTION_SET_DEVICE_SETTINGS": {
                            cust cust1 = cwfa.a;
                            cust1.f().x("Nearby ACTION_SET_DEVICE_SETTINGS.");
                            if(bundle0 != null && bundle0.containsKey("com.google.android.gms.nearby.discovery:EXTRA_CATEGORY_SWITCH_ENABLED") && bundle0.containsKey("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED")) {
                                this.d.f(new cxsa(this, bundle0));
                                this.d.f(this.y);
                                cxrb cxrb0 = () -> {
                                    if(gxvd.e(this, cumz.f(this), cumz.e(this, "DiscoveryChimeraService")) && bundle0.getBoolean("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ENABLED")) {
                                        this.d.f(this.x);
                                        this.g();
                                        return;
                                    }
                                    cyfp.j(this);
                                    this.d.f(this.w);
                                    this.g();
                                };
                                this.u.execute(cxrb0);
                            }
                            else {
                                cust1.e().x("Got settings Intent with no enabled extra");
                                this.j();
                            }
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.fastpair.service.ACTION_FOOTPRINTS_FORCE_SYNC": {
                            goto label_466;
                        }
                        case "com.google.android.gms.nearby.fastpair.service.ACTION_FOOTPRINTS_RECON_SYNC": {
                            cwfa.a.d().x("FastPair: executes the geller recon sync");
                            DiscoveryChimeraService.i().execute(new cxrc(this, bundle0));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.fastpair.service.ACTION_HEADSET_ACTIVE_CHANGED": {
                            if(bundle0 != null) {
                                ggtj ggtj2 = cwfa.a.d();
                                Parcelable parcelable1 = bundle0.getParcelable("android.bluetooth.device.extra.DEVICE");
                                ggtj2.B("FastPair: HfpDevice is active, %s", gxyf.b(gxye.a, parcelable1));
                                cygb cygb3 = (cygb)cusq.c(this, cygb.class);
                                cxrk cxrk0 = new cxrk(bundle0);
                                cygb3.i(cwqd.class, cxrk0);
                            }
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.fastpair.service.ACTION_REPORT_SASS_DEVICE_SETTINGS": {
                            cxzo cxzo0 = (cxzo)cusq.c(this, cxzo.class);
                            cwex cwex0 = this.b;
                            Objects.requireNonNull(cwex0);
                            cxrd cxrd0 = new cxrd(cwex0);
                            if(hvpp.ak()) {
                                cxyy cxyy0 = new cxyy(cxzo0, cxrd0);
                                cxzo0.e.post(cxyy0);
                            }
                            else {
                                cxzo0.j.f().x("SassLogger_logPeriodicReportDeviceSettings: disable logging");
                            }
                            goto label_498;
                        }
                        case "com.google.android.gms.nearby.fastpair.service.API_REQUEST": {
                            this.d.f(new cxro(this, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.libraries.bluetooth.fastpair.fmd.ACTION_ENABLE_FINDER_NETWORK": {
                            this.i.b.f(new cxvw(this.i, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.libraries.bluetooth.fastpair.fmd.ACTION_ENABLE_LAST_KNOWN_LOCATION": {
                            this.i.b.f(new cxvv(this.i, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.libraries.bluetooth.fastpair.fmd.ACTION_RETROACTIVE_PAIR_PROVISION_SPOT_DEVICE": {
                            this.i.b.f(new cxvu(this.i, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.libraries.bluetooth.fastpair.fmd.ACTION_SPOT_PROCESS_COMPLETED": {
                            this.t.d();
                            goto label_498;
                        }
                        case "com.google.android.libraries.bluetooth.fastpair.fmd.ACTION_SPOT_UPGRADE_NOTIFICATION_DISMISSED": {
                            byte[] arr_b3 = intent1.getByteArrayExtra("com.google.android.gms.nearby.discovery.EXTRA_ACCOUNT_KEY");
                            if(arr_b3 != null && arr_b3.length != 0) {
                                cxke cxke2 = this.b.e(ByteString.copyFrom(arr_b3));
                                if(cxke2 == null) {
                                    cust0.g().x("SpotPairing - No FP item in upgrade notification dismiss intent");
                                }
                                else {
                                    cust0.d().x("SpotPairing - Setting notification dismiss time");
                                    long v9 = ((bbng)cusq.c(this, bbng.class)).a();
                                    ProtoLiteBuilder hftp3 = (ProtoLiteBuilder)((ProtoLiteMessage)cxke2).jf(5, null);
                                    hftp3.X(((ProtoLiteMessage)cxke2));
                                    cxqw cxqw6 = cxke2.o;
                                    if(cxqw6 == null) {
                                        cxqw6 = cxqw.a;
                                    }
                                    ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)cxqw6).jf(5, null);
                                    hftp4.X(((ProtoLiteMessage)cxqw6));
                                    cxqw cxqw7 = cxke2.o;
                                    if(cxqw7 == null) {
                                        cxqw7 = cxqw.a;
                                    }
                                    hifo hifo6 = cxqw7.C;
                                    if(hifo6 == null) {
                                        hifo6 = hifo.b;
                                    }
                                    ProtoLiteBuilder hftp5 = (ProtoLiteBuilder)((ProtoLiteMessage)hifo6).jf(5, null);
                                    hftp5.X(((ProtoLiteMessage)hifo6));
                                    if(!((hifl)hftp5).b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)(((hifl)hftp5))).ensureMutable();
                                    }
                                    ((hifo)((hifl)hftp5).b_message).c |= 0x80;
                                    ((hifo)((hifl)hftp5).b_message).l = v9;
                                    if(!((cxqp)hftp4).b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)(((cxqp)hftp4))).ensureMutable();
                                    }
                                    cxqw cxqw8 = (cxqw)((cxqp)hftp4).b_message;
                                    hifo hifo7 = (hifo)((ProtoLiteBuilder)(((hifl)hftp5))).N_build();
                                    hifo7.getClass();
                                    cxqw8.C = hifo7;
                                    cxqw8.b |= 0x8000000;
                                    if(!((cxjx)hftp3).b_message.isImmutable()) {
                                        ((ProtoLiteBuilder)(((cxjx)hftp3))).ensureMutable();
                                    }
                                    cxke cxke3 = (cxke)((cxjx)hftp3).b_message;
                                    cxqw cxqw9 = (cxqw)((ProtoLiteBuilder)(((cxqp)hftp4))).N_build();
                                    cxqw9.getClass();
                                    cxke3.o = cxqw9;
                                    cxke3.c |= 0x400;
                                    cxke cxke4 = (cxke)((ProtoLiteBuilder)(((cxjx)hftp3))).N_build();
                                    this.b.u(cxke4);
                                }
                            }
                            else {
                                cust0.g().x("SpotPairing - Invalid accountKey in upgrade notification dismiss intent");
                            }
                            goto label_498;
                        }
                        case "com.google.android.libraries.bluetooth.fastpair.fmd.PROVISION_SPOT_DEVICE": {
                            this.i.b.f(new cxvt(this.i, intent1));
                            this.g();
                            goto label_498;
                        }
                        case "com.google.android.tvsettings.fastpair.TOGGLE_CHANGED": {
                            this.d.f(this.z);
                            goto label_498;
                        }
                        default: {
                            this.d.f(new cxrp(this, intent1));
                            this.g();
                            goto label_498;
                        }
                    }
                }
                goto label_503;
            }
            goto label_507;
        }
        try {
        label_450:
            if(this.C == null) {
                this.C = new bblp(1, 10);
            }
            goto label_456;
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            label_456:
                __monitor_exit(object0);
                this.C.execute(new cxrn(this));
                goto label_498;
            label_459:
                this.i.s(intent1, cyff.b);
                if(hvpg.bB() && bundle0 != null && bundle0.getParcelable("android.bluetooth.device.extra.DEVICE") != null) {
                    cygb cygb4 = (cygb)cusq.c(this, cygb.class);
                    cxrj cxrj0 = new cxrj(bundle0);
                    cygb4.i(cwqd.class, cxrj0);
                }
                this.g();
                goto label_498;
            label_466:
                cwfa.a.d().x("FastPair: executes the footprints force sync.");
                DiscoveryChimeraService.i().execute(new cxrm(this));
                this.g();
                goto label_498;
            label_470:
                cxxd cxxd10 = this.i;
                String s16 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
                boolean z9 = intent1.getBooleanExtra("com.google.android.gms.nearby.discovery:EXTRA_SUCCESS", true);
                cwfa.a.d().B("FastPairController: onFastPairPairingProcessDone: success=%s", Boolean.valueOf(z9));
                cxxd10.b.f(new cxvg(cxxd10, "fastPairPairingProcessDone=".concat(String.valueOf(s16)), z9, s16, intent1));
                this.g();
                goto label_498;
            label_477:
                this.d.f(new cxsb(this));
                goto label_498;
            label_479:
                cxxd cxxd11 = this.i;
                String s17 = intent1.getStringExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID");
                cxxd11.b.f(new cxwg(cxxd11, "fastPairWith=".concat(String.valueOf(s17)), intent1, s17));
                this.g();
                goto label_498;
            label_484:
                cxxd cxxd12 = this.i;
                int v10 = intent1.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 0x80000000);
                int v11 = intent1.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 0x80000000);
                Context context1 = cxxd12.d;
                BluetoothDevice bluetoothDevice1 = cutr.a(context1, intent1);
                cust cust7 = cwfa.a;
                cust7.d().Y("FastPair: onBondStateChange: prevState=%s, state=%s, %s, isFastPairing=%s", gxuo.j(v11), gxuo.j(v10), gxyf.b(gxye.a, bluetoothDevice1), Boolean.valueOf(cxxd12.t));
                if(bluetoothDevice1 != null) {
                    if(cupd.i(context1)) {
                        cxux cxux0 = new cxux(cxxd12, v10, bluetoothDevice1);
                        cxxd12.b.f(cxux0);
                    }
                    else {
                        cust7.d().x("FastPair: onBondStateChange: skips due to fast pair is disabled on this device.");
                    }
                }
                this.g();
            label_498:
                z10 = hvoz.h();
            }
            catch(Throwable throwable0) {
                __monitor_exit(this);
                throw throwable0;
            }
        }
        __monitor_exit(this);
        return z10 ? 1 : 2;
        try {
        label_503:
            cwfa.a.e().B("DiscoveryService unexpectedly started with null action: %s", intent1);
            this.j();
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        __monitor_exit(this);
        return 2;
        try {
        label_507:
            cwfa.a.e().x("DiscoveryService unexpectedly started with null intent");
            this.j();
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        __monitor_exit(this);
        return 2;
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        cwfa.a.f().x("DiscoveryService unbound.");
        if("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent0.getAction())) {
            if(this.o != null && this.o.f()) {
                this.o.e();
                return false;
            }
        }
        else if("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent0.getAction()) && (this.p != null && this.p.f())) {
            this.p.e();
        }
        return false;
    }
}

