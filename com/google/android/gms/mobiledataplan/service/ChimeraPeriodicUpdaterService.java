package com.google.android.gms.mobiledataplan.service;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Pair;
import aztb;
import aztk;
import bakb;
import bakc;
import bbcu;
import bbdg;
import bblp;
import bboh;
import bbqr;
import bcnm;
import ccmq;
import cljp;
import clkm;
import clkn;
import clkq;
import cllj;
import cllr;
import com.google.android.gms.chimera.modules.mobiledataplan.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import cruv;
import cruw;
import crvq;
import crvr;
import crvw;
import crvx;
import crwf;
import crwg;
import crxd;
import crxn;
import crxx;
import crxy;
import crxz;
import crya;
import cryp;
import cryq;
import crys;
import cryy;
import crzd;
import crze;
import crzj;
import csli;
import cslm;
import evqc;
import evqf;
import evql;
import evrg;
import ggtj;
import giyi;
import giyl;
import giym;
import giyo;
import giyt;
import giyu;
import giyv;
import giyw;
import giyy;
import giyz;
import gizg;
import gpnc;
import gpnd;
import hfst;
import hfwn;
import hfyf;
import hfyn;
import hfyp;
import hfys;
import hfyu;
import hhcr;
import hhct;
import hrvh;
import hrwu;
import hvje;
import hvjh;
import hvjk;
import hvjq;
import hvkk;
import hvko;
import hvks;
import hvlb;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

public class ChimeraPeriodicUpdaterService extends GmsTaskChimeraService implements evqc, evqf {
    public static final bboh a;
    private static final Set b;
    private final LinkedBlockingQueue c;
    private final crxz d;
    private final AtomicInteger e;
    private final AtomicInteger f;
    private final Object h;
    private int i;
    private crvr j;
    private Context k;
    private final Object l;
    private long m;
    private final crxy n;

    static {
        ChimeraPeriodicUpdaterService.b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new Integer[]{((int)27021), ((int)27001), ((int)27005), ((int)27007)})));
        ChimeraPeriodicUpdaterService.a = bboh.b("MobileDataPlan", bbcu.ck);
    }

    public ChimeraPeriodicUpdaterService() {
        this.e = new AtomicInteger();
        this.f = new AtomicInteger();
        this.h = new Object();
        this.l = new Object();
        this.n = new crxy();
        if(hvko.a.q().W()) {
            LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
            this.c = linkedBlockingQueue0;
            crxz crxz0 = new crxz(linkedBlockingQueue0);
            this.d = crxz0;
            crxz0.start();
        }
        else {
            this.c = null;
            this.d = null;
        }
        this.i = 0;
    }

    public ChimeraPeriodicUpdaterService(crvr crvr0, Context context0) {
        this.j = crvr0;
        this.k = context0;
    }

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskChimeraService
    public final int a(cllr cllr0) {
        ccmq.a().a(bbdg.pR);
        boolean z = true;
        Long long0 = null;
        switch(cllr0.a) {
            case "mobiledataplan_bg_periodic_checker": {
                bboh bboh0 = ChimeraPeriodicUpdaterService.a;
                ggtj ggtj0 = bboh0.g(cslm.h());
                Boolean boolean0 = Boolean.valueOf(hvje.l());
                ggtj0.R("%s: BgWorkflow: exec enabled: %s", "PeriodicService", new gpnd(gpnc.a, boolean0));
                synchronized(this.h) {
                    if(this.k == null) {
                        this.k = this.getApplicationContext();
                    }
                }
                if(!hvje.f() || cllr0.b == null || cllr0.b.getLong("task_interval_key") != hvje.c() || cllr0.b.getLong("task_flex_key") != hvje.b()) {
                    bboh0.g(cslm.h()).X("%s: BgWorkflow: changed interval %d flex %d", "PeriodicService", Long.valueOf(hvje.c()), Long.valueOf(hvje.b()));
                    ChimeraPeriodicUpdaterService.g(this.k);
                }
                if(hvje.l()) {
                    cryq cryq0 = cryq.a();
                    Level level0 = cslm.h();
                    cryq.a.g(level0).x("handlePeriodicTimerTrigger");
                    cryp cryp0 = new cryp(cryq0);
                    cryq0.f.execute(cryp0);
                    return 0;
                }
                bboh0.g(cslm.h()).B("%s: BgWorkflow: skip exec", "PeriodicService");
                if(hvje.g() && csli.c(this.k) == null) {
                    bboh0.g(cslm.h()).B("%s: BgWorkflow: cancel task", "PeriodicService");
                    ChimeraPeriodicUpdaterService.w("mobiledataplan_bg_periodic_checker", giyy.b, giym.a);
                    return 2;
                }
                return 0;
            }
            case "mobiledataplan_consent_fetch": {
                bboh bboh3 = ChimeraPeriodicUpdaterService.a;
                bboh3.g(cslm.h()).X("%s: ConsentFetch: exec service %b enabled %b", "PeriodicService", Boolean.valueOf(hvko.J()), Boolean.valueOf(hvjq.f()));
                synchronized(this.h) {
                    if(this.k == null) {
                        this.k = this.getApplicationContext();
                    }
                }
                if(!hvjq.f()) {
                    bboh3.g(cslm.h()).B("%s: ConsentFetch: skip exec", "PeriodicService");
                    if(hvje.g()) {
                        if(csli.c(this.k) != null) {
                            return 0;
                        }
                        bboh3.g(cslm.h()).B("%s: ConsentFetch: cancel task", "PeriodicService");
                        ChimeraPeriodicUpdaterService.w("mobiledataplan_consent_fetch", giyy.b, giym.a);
                    }
                    return 0;
                }
                Integer integer1 = cllr0.b == null || !cllr0.b.containsKey("event_flow_id") ? null : cllr0.b.getInt("event_flow_id");
                hfys hfys0 = crvw.c().j(csli.g(this.k));
                if(hfys0 != null && ((hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) == hhcr.b || (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) == hhcr.d)) {
                    bboh3.g(cslm.h()).B("%s: ConsentFetch: Skipping unnecessary background consent fetch", "PeriodicService");
                    if(ChimeraPeriodicUpdaterService.q(this.k, cllr0)) {
                        ChimeraPeriodicUpdaterService.h(this.k);
                    }
                    new crxn(this.k).L(13, hhct.bC, integer1, null);
                    return 0;
                }
                crys crys0 = new crys(this.k, csli.g(this.k), integer1);
                evql evql0 = evrg.a(new bblp(1, 10), crys0);
                try {
                    evrg.n(evql0);
                    goto label_222;
                }
                catch(ExecutionException executionException0) {
                    a.ae(ChimeraPeriodicUpdaterService.a.i(), "ExecutionException during background consent fetch", executionException0);
                }
                catch(InterruptedException interruptedException0) {
                    a.ae(ChimeraPeriodicUpdaterService.a.j(), "InterruptedException while waiting for background consent fetch", interruptedException0);
                }
                z = false;
            label_222:
                if(z) {
                    Level level2 = cslm.h();
                    ChimeraPeriodicUpdaterService.a.g(level2).B("%s: ConsentFetch: completed.", "PeriodicService");
                }
                if(ChimeraPeriodicUpdaterService.q(this.k, cllr0)) {
                    ChimeraPeriodicUpdaterService.h(this.k);
                }
                return z ? 0 : 2;
            }
            case "mobiledataplan_consent_status_conversion": {
                synchronized(this.h) {
                    if(this.k == null) {
                        this.k = this.getApplicationContext();
                    }
                }
                int v5 = cllr0.b == null || !cllr0.b.containsKey("event_flow_id") ? 0 : cllr0.b.getInt("event_flow_id");
                return crya.a(this.k, Integer.valueOf(v5)) ? 0 : 2;
            }
            case "mobiledataplan_cpid_refresher": {
                hvko.J();
                hvko.P();
                if(this.k == null) {
                    this.k = this.getApplicationContext();
                }
                if(cslm.i(this.k)) {
                    ChimeraPeriodicUpdaterService.w("mobiledataplan_cpid_refresher", giyy.k, giym.a);
                    return 0;
                }
                if(ChimeraPeriodicUpdaterService.u()) {
                    ChimeraPeriodicUpdaterService.w("mobiledataplan_cpid_refresher", giyy.j, giym.a);
                    return 0;
                }
                Bundle bundle0 = cllr0.b;
                giyy giyy0 = giyy.a;
                if(bundle0 == null) {
                    this.i = crxn.a();
                }
                else {
                    if(bundle0.containsKey("task_interval_key") && bundle0.containsKey("task_flex_key")) {
                        this.n.a = bundle0.getLong("task_interval_key");
                        this.n.b = bundle0.getLong("task_flex_key");
                    }
                    switch(bundle0.getInt("cpid_update_cause")) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            giyy0 = giyy.b;
                            break;
                        }
                        case 2: {
                            giyy0 = giyy.c;
                            break;
                        }
                        case 3: {
                            giyy0 = giyy.d;
                            break;
                        }
                        case 4: {
                            giyy0 = giyy.e;
                            break;
                        }
                        case 5: {
                            giyy0 = giyy.f;
                            break;
                        }
                        case 6: {
                            giyy0 = giyy.g;
                            break;
                        }
                        case 7: {
                            giyy0 = giyy.h;
                            break;
                        }
                        case 8: {
                            giyy0 = giyy.i;
                            break;
                        }
                        case 9: {
                            giyy0 = giyy.j;
                            break;
                        }
                        case 10: {
                            giyy0 = giyy.k;
                            break;
                        }
                        default: {
                            giyy0 = null;
                        }
                    }
                    this.i = bundle0.getInt("event_flow_id");
                    Level level1 = cslm.h();
                    ChimeraPeriodicUpdaterService.a.g(level1).X("%s: CpidFetch: called w/ cause %s, event flow id %d", "PeriodicService", giyy0, Integer.valueOf(this.i));
                }
                crxn crxn0 = new crxn(AppContextProvider.a());
                int v2 = this.i;
                gizg gizg0 = crxn0.D(2, "GTAF_Server", "MDP_PeriodicService");
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)gizg0));
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                ((giyz)hftv0).c = 2;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                giyz giyz0 = (giyz)hftp1.b_message;
                giyz0.d = giyy0.a();
                giyz giyz1 = (giyz)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizg gizg1 = (gizg)hftp0.b_message;
                giyz1.getClass();
                gizg1.r = giyz1;
                gizg1.b |= 0x100;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                giyl giyl0 = (giyl)hftp2.b_message;
                giyl0.c = hfyp.b(17);
                giyl giyl1 = (giyl)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gizg gizg2 = (gizg)hftp0.b_message;
                giyl1.getClass();
                gizg2.v = giyl1;
                gizg2.b |= 0x800;
                if(hvlb.d()) {
                    crxn0.e(((gizg)hftp0.N_build()), hhct.bb, Integer.valueOf(v2));
                }
                crxn0.e(((gizg)hftp0.N_build()), hhct.aY, Integer.valueOf(v2));
                if(hvko.J() && hvko.P()) {
                    synchronized(this.h) {
                        if(this.k == null) {
                            this.k = this.getApplicationContext();
                        }
                        if(this.j == null) {
                            this.j = new cruv(this.k, new crvq());
                        }
                    }
                    cruw cruw0 = new cruw();
                    cruw0.a("AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4");
                    cruw0.b(Integer.valueOf(this.i));
                    this.d(cruw0.a, this.j);
                    return 0;
                }
                bboh bboh2 = ChimeraPeriodicUpdaterService.a;
                bboh2.g(cslm.h()).B("%s: CpidFetch: skip exec", "PeriodicService");
                if(hvje.g() && csli.c(this.k) == null) {
                    bboh2.g(cslm.h()).B("%s: CpidFetch: cancel task", "PeriodicService");
                    ChimeraPeriodicUpdaterService.w("mobiledataplan_cpid_refresher", giyy.b, giym.a);
                    return 2;
                }
                if(!this.r(hvko.n(), hvko.l())) {
                    return 0;
                }
                ChimeraPeriodicUpdaterService.e(AppContextProvider.a(), hvko.n(), hvko.l(), giyy.b);
                return 0;
            }
            case "mobiledataplan_meteredness_update": {
                bboh bboh1 = ChimeraPeriodicUpdaterService.a;
                bboh1.g(cslm.h()).S("%s: MeterednessUpdate exec enabled: %b", "PeriodicService", hvks.i());
                synchronized(this.h) {
                    if(this.k == null) {
                        this.k = this.getApplicationContext();
                    }
                }
                if(hvks.i()) {
                    Integer integer0 = cllr0.b == null || !cllr0.b.containsKey("event_flow_id") ? null : cllr0.b.getInt("event_flow_id");
                    if(csli.A(this.k, 3).isEmpty()) {
                        bboh1.g(cslm.h()).B("%s: MeterednessUpdate: Skipping unnecessary background meteredness update", "PeriodicService");
                        if(ChimeraPeriodicUpdaterService.t(cllr0)) {
                            ChimeraPeriodicUpdaterService.j(this.k);
                        }
                        new crxn(this.k).L(24, hhct.cX, integer0, null);
                        return 0;
                    }
                    cryy cryy0 = new cryy(this.k, integer0);
                    try {
                        if(((Boolean)evrg.n(evrg.a(new bblp(1, 10), cryy0))).booleanValue()) {
                            goto label_67;
                        }
                    }
                    catch(ExecutionException | InterruptedException exception0) {
                        ((ggtj)cryy.a.g(((exception0 instanceof ExecutionException) ? Level.SEVERE : Level.WARNING)).s(exception0)).B("%s: Exception during background meteredness update", "BgTaskGetMeteredness");
                    }
                    goto label_68;
                label_67:
                    bboh1.g(cslm.h()).B("%s: MeterednessUpdate: completed.", "PeriodicService");
                label_68:
                    if(ChimeraPeriodicUpdaterService.t(cllr0)) {
                        ChimeraPeriodicUpdaterService.j(this.k);
                    }
                }
                else {
                    bboh1.g(cslm.h()).B("%s: MeterednessUpdate: skip exec", "PeriodicService");
                    if(hvje.g() && csli.c(this.k) == null) {
                        bboh1.g(cslm.h()).B("%s: MeterednessUpdate: cancel task", "PeriodicService");
                        ChimeraPeriodicUpdaterService.w("mobiledataplan_meteredness_update", giyy.b, giym.a);
                        return 0;
                    }
                }
                return 0;
            }
            case "mobiledataplan_register": {
                bboh bboh4 = ChimeraPeriodicUpdaterService.a;
                bboh4.g(cslm.h()).Y("%s: GcoreRegister: exec schedule:%b update:%b disableLegacy:%b", "PeriodicService", Boolean.valueOf(hvjk.j()), Boolean.valueOf(hvjk.h()), Boolean.valueOf(hvje.o()));
                synchronized(this.h) {
                    if(this.k == null) {
                        this.k = this.getApplicationContext();
                    }
                }
                if(!hvje.o() && hvjk.j() && hvjk.h()) {
                    String s1 = csli.g(this.k);
                    String s2 = crvw.c().s(s1);
                    if(s2 == null) {
                        s2 = "dummy_cpid_before_retrieval";
                    }
                    else {
                        long0 = crvw.c().o(s2);
                    }
                    if(long0 == null) {
                        long0 = crzj.b;
                    }
                    crzd crzd0 = new crzd();
                    crzd0.a = this.k;
                    crzd0.b = "AIzaSyDjSMHkZSQWmcCKsNnvZcjRc2ZaJbAXpR4";
                    crzd0.c = long0;
                    crzd0.d = s2;
                    crzd0.e = crvw.c().F(s1);
                    crzd0.h = 5;
                    crze crze0 = crzd0.a();
                    Bundle bundle1 = cllr0.b;
                    if(bundle1 != null && bundle1.containsKey("event_flow_id")) {
                        int v8 = bundle1.getInt("event_flow_id");
                        crzd crzd1 = new crzd(crze0);
                        crzd1.f = v8;
                        crze0 = crzd1.a();
                    }
                    boolean z1 = crze0.c();
                    if(z1) {
                        bboh4.g(cslm.h()).B("%s: GcoreRegister: completed.", "PeriodicService");
                    }
                    if(ChimeraPeriodicUpdaterService.s(cllr0)) {
                        ChimeraPeriodicUpdaterService.i(this.k);
                    }
                    return z1 ? 0 : 2;
                }
                bboh4.g(cslm.h()).B("%s: GcoreRegister: skip exec", "PeriodicService");
                if(!hvje.o() && (!hvje.g() || csli.c(this.k) != null)) {
                    if(!ChimeraPeriodicUpdaterService.s(cllr0)) {
                        return 0;
                    }
                    ChimeraPeriodicUpdaterService.i(this.k);
                    return 0;
                }
                bboh4.g(cslm.h()).B("%s: GcoreRegister: cancel task", "PeriodicService");
                ChimeraPeriodicUpdaterService.w("mobiledataplan_register", giyy.b, giym.a);
                return 2;
            }
            default: {
                String s = cllr0.a;
                gpnd gpnd0 = new gpnd(gpnc.a, s);
                ((ggtj)ChimeraPeriodicUpdaterService.a.j()).B("Unknown periodic task tag: %s", gpnd0);
                if(hvje.a.e().e()) {
                    ChimeraPeriodicUpdaterService.w(s, giyy.b, giym.a);
                }
                return 2;
            }
        }
    }

    final void d(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0, crvr crvr0) {
        boolean z1;
        int v4;
        bakc bakc0;
        boolean z;
        int v3;
        evql evql0 = crvr0.f(mdpCarrierPlanIdRequest0);
        evql0.b(this);
        evql0.A(this);
        synchronized(this.l) {
            long v1 = -1L;
            long v2 = hvko.a.q().g();
            if(((int)v2) > 0) {
                try {
                    v3 = -1;
                    z = true;
                    bakc0 = new bakc(AppContextProvider.a(), "mdp-svc-data", true, null);
                    v4 = 0;
                    z1 = bakc0.getBoolean("retry-active", false);
                }
                catch(bakb bakb0) {
                    goto label_35;
                }
                if(z1) {
                    try {
                        v3 = bakc0.getInt("retry-count", 0x7FFFFFFF);
                        if(v3 < ((int)v2)) {
                            SharedPreferences.Editor sharedPreferences$Editor1 = bakc0.edit();
                            sharedPreferences$Editor1.putInt("retry-count", v3 + 1);
                            sharedPreferences$Editor1.apply();
                            goto label_36;
                        }
                        goto label_82;
                    }
                    catch(bakb bakb0) {
                        z = z1;
                    }
                label_35:
                    a.ae(ChimeraPeriodicUpdaterService.a.j(), "SharedPreferences failed to update retry backoff status.", bakb0);
                label_36:
                    v4 = v3;
                label_37:
                    Level level0 = cslm.h();
                    ChimeraPeriodicUpdaterService.a.g(level0).z("Retry %d", v4);
                    crxn crxn0 = new crxn(AppContextProvider.a());
                    long v5 = hvko.d();
                    int v6 = this.i;
                    gizg gizg0 = crxn0.D(2, "GTAF_Server", "MDP_PeriodicService");
                    ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
                    hftp0.X(((ProtoLiteMessage)gizg0));
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyw.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((giyw)hftv0).b = (int)v2;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv1 = hftp1.b_message;
                    ((giyw)hftv1).c = z;
                    if(!hftv1.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv2 = hftp1.b_message;
                    ((giyw)hftv2).d = v4;
                    if(!hftv2.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((giyw)hftp1.b_message).e = v5;
                    giyw giyw0 = (giyw)hftp1.N_build();
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp2.b_message;
                    ((giyz)hftv3).c = 5;
                    if(!hftv3.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    giyz giyz0 = (giyz)hftp2.b_message;
                    giyw0.getClass();
                    giyz0.h = giyw0;
                    giyz0.b |= 2;
                    giyz giyz1 = (giyz)hftp2.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gizg gizg1 = (gizg)hftp0.b_message;
                    giyz1.getClass();
                    gizg1.r = giyz1;
                    gizg1.b |= 0x100;
                    crxn0.e(((gizg)hftp0.N_build()), hhct.aY, Integer.valueOf(v6));
                    v1 = hvko.d() << v4;
                }
                else {
                    try {
                        SharedPreferences.Editor sharedPreferences$Editor0 = bakc0.edit();
                        sharedPreferences$Editor0.putInt("retry-count", 1);
                        sharedPreferences$Editor0.putBoolean("retry-active", true);
                        sharedPreferences$Editor0.apply();
                        goto label_37;
                    }
                    catch(bakb bakb0) {
                        z = z1;
                        v3 = 0;
                        goto label_35;
                    }
                }
            }
        label_82:
            this.m = v1;
        }
        hvjh hvjh0 = hvjh.a;
        if(hvjh0.e().i()) {
            try {
                evrg.o(evql0, hvjh0.e().d(), TimeUnit.MILLISECONDS);
            }
            catch(ExecutionException | InterruptedException | TimeoutException exception0) {
                this.gv(exception0);
            }
        }
    }

    public static void e(Context context0, long v, long v1, giyy giyy0) {
        ChimeraPeriodicUpdaterService.f(context0, v, v1, giyy0, giym.a);
    }

    public static void f(Context context0, long v, long v1, giyy giyy0, giym giym0) {
        ProtoLiteBuilder hftp1;
        Long long1;
        if(hvko.J()) {
            if(cslm.i(context0)) {
                crxn.c().G(37, giyy0, giym0);
                return;
            }
            if(ChimeraPeriodicUpdaterService.u()) {
                crxn.c().G(21, giyy0, giym0);
                return;
            }
            if(!hvjk.a.e().m()) {
                goto label_61;
            }
            String s = csli.g(context0);
            if(giyy0 != giyy.g && giyy0 != giyy.f && giyy0 != giyy.h || "1234567890987654321".equals(s)) {
                goto label_33;
            }
            Long long0 = crvw.c().q(s);
            if(long0 == null || ((long)long0) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                goto label_33;
            }
            long v2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            if(((long)long0) - hvjq.a.c().c() < v2) {
                goto label_33;
            }
            crwg crwg0 = crvw.c().d.c(s);
            if(crwg0 == null) {
                long1 = null;
            }
            else {
                hfyu hfyu0 = crwg0.d();
                long1 = hfyu0 == null ? null : ((long)hfyu0.d);
            }
            if(long1 == null || ((long)long1) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) || ((long)long1) >= ((long)long0)) {
                goto label_33;
            }
            if(hvkk.g()) {
                ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)giym0).jf(5, null);
                hftp0.X(((ProtoLiteMessage)giym0));
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((giym)hftp0.b_message).e = true;
                giym giym1 = (giym)hftp0.N_build();
                crxn.c().G(10, giyy0, giym1);
                return;
            label_33:
                crvw crvw0 = crvw.c();
                long v3 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + v;
                Long long2 = v3;
                crvx crvx0 = crvw0.d;
                if(crvx0.c(s) != null && crvx0.c(s).d() != null) {
                    hfyu hfyu1 = crvx0.c(s).d();
                    hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyu1).jf(5, null);
                    hftp1.X(((ProtoLiteMessage)hfyu1));
                }
                else {
                    hftp1 = ((ProtoLiteMessage)hfyu.a).v_newBuilder();
                }
                crwf crwf0 = new crwf();
                crwf0.g(s);
                long2.getClass();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((hfyu)hftp1.b_message).d = v3;
                crwf0.i(((hfyu)hftp1.N_build()));
                boolean z = crvx0.i(crwf0.a());
                crxn crxn0 = crxn.c();
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                ((giyo)hftv0).b = 2;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ((giyo)hftp2.b_message).c = z;
                crxn0.j(((giyo)hftp2.N_build()), "MDP_PeriodicService", Integer.valueOf(0));
            label_61:
                if(hvkk.g()) {
                    crxn.c().G(3, giyy0, giym0);
                }
                ChimeraPeriodicUpdaterService.o(context0, v, v1, giyy0);
            }
        }
    }

    public static void g(Context context0) {
        Level level0 = cslm.h();
        ChimeraPeriodicUpdaterService.a.g(level0).Y("%s: BgWorkflow: enabled %s interval %d flex %d.", "PeriodicService", Boolean.valueOf(hvje.n()), Long.valueOf(hvje.c()), Long.valueOf(hvje.b()));
        if(!hvje.n()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        if(hvje.f()) {
            bundle0.putLong("task_interval_key", hvje.c());
            bundle0.putLong("task_flex_key", hvje.b());
        }
        crxn crxn0 = crxn.c();
        long v = hvje.c();
        long v1 = hvje.b();
        gizg gizg0 = crxn0.D(20, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyl.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl0 = (giyl)hftp1.b_message;
        giyl0.c = hfyp.b(3);
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giyi.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp2.b_message;
        ((giyi)hftv0).b = v;
        if(!hftv0.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((giyi)hftp2.b_message).c = v1;
        giyi giyi0 = (giyi)hftp2.N_build();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyl giyl1 = (giyl)hftp1.b_message;
        giyi0.getClass();
        giyl1.e = giyi0;
        giyl1.b |= 1;
        giyl giyl2 = (giyl)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyl2.getClass();
        gizg1.v = giyl2;
        gizg1.b |= 0x800;
        crxn0.d(((gizg)hftp0.N_build()), hhct.bG);
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        clkq0.t("mobiledataplan_bg_periodic_checker");
        clkq0.y(0, 0);
        clkq0.v(1);
        clkq0.u = bundle0;
        long v2 = hvje.c();
        long v3 = hvje.b();
        if(hrwu.g()) {
            clkq0.j(clkm.a(v2));
        }
        else {
            clkq0.a = v2;
            clkq0.b = v3;
        }
        cljp.a(context0).f(clkq0.a());
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        long v;
        String s;
        synchronized(this.l) {
            v = this.m;
        }
        int v1 = (exception0 instanceof aztb) ? ((aztb)exception0).b() : 13;
        new crxn(AppContextProvider.a()).E(((long)v1), v, this.i, 0L, 17);
        if((exception0 instanceof aztb)) {
            bboh bboh0 = ChimeraPeriodicUpdaterService.a;
            ggtj ggtj0 = bboh0.g(cslm.h());
            int v2 = ((aztb)exception0).b();
            int v3 = ((aztb)exception0).b();
            switch(v3) {
                case 27000: {
                    s = "MDP_INVALID_ARGUMENT";
                    break;
                }
                case 27001: {
                    s = "MDP_UNSUPPORTED_CARRIER";
                    break;
                }
                case 27002: {
                    s = "MDP_NOT_FOUND";
                    break;
                }
                case 27003: {
                    s = "MDP_BAD_RESPONSE";
                    break;
                }
                case 27004: {
                    s = "MDP_INVALID_API_KEY";
                    break;
                }
                case 27005: {
                    s = "MDP_INVALID_CARRIER_PLAN_ID";
                    break;
                }
                case 27006: {
                    s = "MDP_EMPTY_CARRIER_PLAN_ID_ENDPOINT";
                    break;
                }
                case 27007: {
                    s = "MDP_SERVER_CARRIER_FAILURE";
                    break;
                }
                case 27008: {
                    s = "MDP_SERVER_CARRIER_INVALID_RESPONSE";
                    break;
                }
                case 27010: {
                    s = "MDP_SERVER_GTAF_EMPTY_RESPONSE";
                    break;
                }
                case 27011: {
                    s = "MDP_SERVER_GTAF_FAILURE";
                    break;
                }
                case 27012: {
                    s = "MDP_SERVER_GTAF_RESOURCE_EXHAUSTED";
                    break;
                }
                case 27013: {
                    s = "MDP_NOT_ENABLED";
                    break;
                }
                case 27014: {
                    s = "MDP_EVENT_LISTENER_ALREADY_EXISTED";
                    break;
                }
                case 27015: {
                    s = "MDP_EVENT_LISTENER_NOT_EXISTED";
                    break;
                }
                case 27016: {
                    s = "MDP_INTERNAL_ERROR";
                    break;
                }
                case 27017: {
                    s = "MDP_INCONSISTENT_CARRIER";
                    break;
                }
                case 27018: {
                    s = "MDP_NO_NETWORK";
                    break;
                }
                case 27019: {
                    s = "MDP_NOT_ON_CELLULAR";
                    break;
                }
                case 27020: {
                    s = "MDP_BAD_CPID_END_POINT";
                    break;
                }
                case 27021: {
                    s = "MDP_GET_MCC_MNC_FAILURE";
                    break;
                }
                case 27022: {
                    s = "MDP_SERVER_GTAF_UNAVAILABLE";
                    break;
                }
                case 0x698F: {
                    s = "MDP_REQUIRE_CONSENT";
                    break;
                }
                case 27030: {
                    s = "MDP_INSUFFICIENT_FUNDS";
                    break;
                }
                case 27031: {
                    s = "MDP_SERVER_GTAF_CANCELLED";
                    break;
                }
                case 27032: {
                    s = "MDP_SERVER_GTAF_UNKNOWN";
                    break;
                }
                case 27033: {
                    s = "MDP_SERVER_GTAF_INVALID_ARGUMENT";
                    break;
                }
                case 27034: {
                    s = "MDP_SERVER_GTAF_DEADLINE_EXCEEDED";
                    break;
                }
                case 27036: {
                    s = "MDP_SERVER_GTAF_ALREADY_EXISTS";
                    break;
                }
                case 27037: {
                    s = "MDP_SERVER_GTAF_PERMISSION_DENIED";
                    break;
                }
                case 27038: {
                    s = "MDP_SERVER_GTAF_UNAUTHENTICATED";
                    break;
                }
                case 0x699F: {
                    s = "MDP_SERVER_GTAF_ABORTED";
                    break;
                }
                case 27040: {
                    s = "MDP_SERVER_GTAF_UNIMPLEMENTED";
                    break;
                }
                case 27041: {
                    s = "MDP_SERVER_GTAF_INTERNAL";
                    break;
                }
                case 27042: {
                    s = "MDP_SERVER_GTAF_DATA_LOSS";
                    break;
                }
                case 27043: {
                    s = "MDP_SERVER_UNHANDLED_GRPC_ERROR";
                    break;
                }
                case 27044: {
                    s = "MDP_NOT_ON_CELLULAR_PRECHECK";
                    break;
                }
                case 27045: {
                    s = "MDP_NOT_ON_CELLULAR_TIMEOUT";
                    break;
                }
                case 27046: {
                    s = "MDP_NOT_ON_CELLULAR_UNAVAILABLE";
                    break;
                }
                case 27047: {
                    s = "MDP_NOT_ON_CELLULAR_PERMISSION_DENIED";
                    break;
                }
                case 27048: {
                    s = "MDP_INCONSISTENT_CARRIER_MISSING_ID";
                    break;
                }
                case 27049: {
                    s = "MDP_SYSTEM_SERVICE_UNAVAILABLE";
                    break;
                }
                case 27050: {
                    s = "MDP_CACHE_PUT_FAILURE";
                    break;
                }
                case 27051: {
                    s = "MDP_SERVER_CARRIER_FAILURE_AFTER_CONNECTING";
                    break;
                }
                case 27052: {
                    s = "MDP_SERVER_GTAF_FAILURE_ASYNC";
                    break;
                }
                case 27053: {
                    s = "MDP_SERVER_CARRIER_INVALID_TTL";
                    break;
                }
                case 27054: {
                    s = "MDP_MCC_MNC_UNSUPPORTED";
                    break;
                }
                case 0x69AF: {
                    s = "MDP_MCC_MNC_UNSUPPORTED_BY_CLIENT";
                    break;
                }
                case 0x69B0: {
                    s = "MDP_WRITE_TO_PLATFORM_FAILED";
                    break;
                }
                case 27057: {
                    s = "MDP_SERVER_CARRIER_HTTP_FAILURE";
                    break;
                }
                case 27058: {
                    s = "MDP_EAP_TRANSIENT_ERROR";
                    break;
                }
                case 27059: {
                    s = "MDP_EAP_TOKEN_EXPIRED_ERROR";
                    break;
                }
                case 27060: {
                    s = "MDP_SERVER_SUBGRAPH_AUTH_FAILURE";
                    break;
                }
                case 27061: {
                    s = "MDP_ESIM_LPA_ERROR";
                    break;
                }
                case 27062: {
                    s = "MDP_ESIM_EUICC_MANAGER_RESOLVABLE_ERROR";
                    break;
                }
                case 27063: {
                    s = "MDP_ESIM_EUICC_MANAGER_UNRESOLVABLE_ERROR";
                    break;
                }
                case 27100: {
                    s = "MDP_NOT_IMPLEMENTED";
                    break;
                }
                case 27101: {
                    s = "MDP_MODULE_DISABLED";
                    break;
                }
                case 0x6A0E: {
                    s = "MDP_SDK_INVALID_PARAMETER";
                    break;
                }
                default: {
                    s = aztk.d(v3);
                }
            }
            ggtj0.H("Status code %d (%s)", v2, s);
            Integer integer0 = ((aztb)exception0).b();
            if(ChimeraPeriodicUpdaterService.b.contains(integer0)) {
                goto label_142;
            }
            else {
                if(v > 0L) {
                    long v4 = Math.max(TimeUnit.MILLISECONDS.toSeconds(Math.min(v, hvko.a.q().f())), hvko.p());
                    ChimeraPeriodicUpdaterService.p(this.k, v4, v4 >> 2, giyy.d, Integer.valueOf(this.i));
                    ((ggtj)bboh0.g(cslm.h()).s(exception0)).A("Recoverable error, retry scheduled in %d seconds", v4);
                    return;
                }
                ((ggtj)bboh0.g(cslm.h()).s(exception0)).x("Error, no (further) retry scheduled");
                if(this.r(hvko.n(), hvko.l())) {
                    ChimeraPeriodicUpdaterService.e(this.k, hvko.n(), hvko.l(), giyy.d);
                }
            }
        }
        else {
        label_142:
            bcnm.i(cslm.h(), "Terminal error, cancelling further retries", exception0, ChimeraPeriodicUpdaterService.a);
            this.f.incrementAndGet();
            LinkedBlockingQueue linkedBlockingQueue0 = this.c;
            if(linkedBlockingQueue0 != null) {
                linkedBlockingQueue0.offer(new Pair("failure-count", ((long)1L)));
            }
            if(this.r(hvko.n(), hvko.l())) {
                ChimeraPeriodicUpdaterService.e(this.k, hvko.n(), hvko.l(), giyy.d);
            }
        }
    }

    @Override  // evqf
    public final void gw(Object object0) {
        long v5;
        long v4;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0;
        bboh bboh0 = ChimeraPeriodicUpdaterService.a;
        ggtj ggtj0 = bboh0.g(cslm.h());
        long v = ((MdpCarrierPlanIdResponse)object0).b;
        ggtj0.Q("%s: CpidFetch: success with ttl of %d.", "PeriodicService", v);
        this.e.incrementAndGet();
        LinkedBlockingQueue linkedBlockingQueue0 = this.c;
        if(linkedBlockingQueue0 != null) {
            linkedBlockingQueue0.offer(new Pair("success-count", ((long)1L)));
        }
        long v1 = v >> 1;
        long v2 = hvko.l();
        if(v1 > hvko.n()) {
            v1 = hvko.n();
        }
        else if(v1 < hvko.p()) {
            v1 = hvko.p();
            v2 = hvko.a.q().r();
        }
        Integer integer0 = ((MdpCarrierPlanIdResponse)object0).i;
        if(integer0 != null && ((int)integer0) != 0) {
            int v3 = this.i;
            if(((int)((MdpCarrierPlanIdResponse)object0).i) != v3) {
                ((ggtj)bboh0.j()).H("Received MdpCarrierPlanIdResponse in periodic updater service w/ different cpidRefreshEventFlowId than was sent (request ID: %d, response ID: %d", v3, ((MdpCarrierPlanIdResponse)object0).i);
            }
            mdpCarrierPlanIdResponse0 = (MdpCarrierPlanIdResponse)object0;
            v4 = v1;
            v5 = v2;
        }
        else {
            v5 = v2;
            v4 = v1;
            mdpCarrierPlanIdResponse0 = new MdpCarrierPlanIdResponse(((MdpCarrierPlanIdResponse)object0).a, v, ((MdpCarrierPlanIdResponse)object0).c, ((MdpCarrierPlanIdResponse)object0).d, ((MdpCarrierPlanIdResponse)object0).e, ((MdpCarrierPlanIdResponse)object0).f, ((MdpCarrierPlanIdResponse)object0).g, ((MdpCarrierPlanIdResponse)object0).h, ((int)this.i), ((MdpCarrierPlanIdResponse)object0).j);
        }
        new crxn(AppContextProvider.a()).F(mdpCarrierPlanIdResponse0, v4, 17);
        if(this.r(v4, v5)) {
            ChimeraPeriodicUpdaterService.o(this.k, v4, v5, giyy.c);
        }
    }

    public static void h(Context context0) {
        bboh bboh0 = ChimeraPeriodicUpdaterService.a;
        bboh0.g(cslm.h()).S("%s: ConsentFetch: enabled %s", "PeriodicService", hvjq.f());
        if(!hvjq.f()) {
            return;
        }
        crxy crxy0 = ChimeraPeriodicUpdaterService.m(context0);
        bboh0.g(cslm.h()).X("%s: ConsentFetch: interval %d flex %d.", "PeriodicService", Long.valueOf(crxy0.a), Long.valueOf(crxy0.b));
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        clkq0.t("mobiledataplan_consent_fetch");
        clkq0.y(0, 1);
        clkq0.v(1);
        if(hrwu.g()) {
            clkq0.j(clkm.a(crxy0.a));
        }
        else {
            clkq0.e(crxy0.a, crxy0.b, cllj.a);
        }
        Bundle bundle0 = new Bundle();
        int v = crxn.a();
        bundle0.putInt("event_flow_id", v);
        bundle0.putLong("task_interval_key", crxy0.a);
        bundle0.putLong("task_flex_key", crxy0.b);
        clkq0.u = bundle0;
        cljp.a(context0).f(clkq0.a());
        new crxn(context0).L(12, hhct.bC, Integer.valueOf(v), null);
    }

    public static void i(Context context0) {
        Long long0;
        bboh bboh0 = ChimeraPeriodicUpdaterService.a;
        bboh0.g(cslm.h()).aa("%s: GcoreRegister: interval %d flex %d. schedule:%b update:%b disableLegacy:%b", "PeriodicService", Long.valueOf(hvjk.d()), Long.valueOf(hvjk.c()), Boolean.valueOf(hvjk.j()), Boolean.valueOf(hvjk.h()), Boolean.valueOf(hvje.o()));
        if(hvjk.j() && !hvje.o()) {
            clkq clkq0 = new clkq();
            clkq0.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            clkq0.t("mobiledataplan_register");
            clkq0.y(0, 1);
            clkq0.x(0, 1);
            clkq0.v(1);
            long v = hvjk.d();
            long v1 = hvjk.c();
            if(hrwu.g()) {
                clkq0.j(clkm.a(v));
            }
            else {
                clkq0.a = v;
                clkq0.b = v1;
            }
            Bundle bundle0 = new Bundle();
            int v2 = crxn.a();
            bundle0.putInt("event_flow_id", v2);
            bundle0.putLong("task_interval_key", v);
            bundle0.putLong("task_flex_key", v1);
            clkq0.u = bundle0;
            cljp.a(context0).f(clkq0.a());
            String s = crxd.a().c(context0);
            String s1 = csli.g(context0);
            String s2 = crvw.c().s(s1);
            if(s2 == null) {
                s2 = "dummy_cpid_before_retrieval";
                long0 = null;
            }
            else {
                long0 = crvw.c().o(s2);
                if(!crvw.c().F(s1)) {
                    s2 = "dummy_cpid_before_consent";
                }
            }
            if(long0 == null) {
                long0 = crzj.b;
            }
            crxn crxn0 = new crxn(context0);
            String s3 = hvko.u();
            int v3 = (int)hvko.f();
            long v4 = (long)long0;
            Integer integer0 = v2;
            giyt giyt0 = (giyt)((ProtoLiteMessage)giyv.a).v_newBuilder();
            String s4 = cslm.k(bbqr.c(s));
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            giyv giyv0 = (giyv)giyt0.b_message;
            s4.getClass();
            giyv0.b = s4;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).c = s3;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).d = v3;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).e = v4;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            ((giyv)giyt0.b_message).f = s2;
            if(!giyt0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)giyt0).ensureMutable();
            }
            giyv giyv1 = (giyv)giyt0.b_message;
            giyv1.g = giyu.a(5);
            giyv giyv2 = (giyv)((ProtoLiteBuilder)giyt0).N_build();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((giyz)hftv0).c = 7;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            giyz giyz0 = (giyz)hftp0.b_message;
            giyv2.getClass();
            giyz0.i = giyv2;
            giyz0.b |= 4;
            giyz giyz1 = (giyz)hftp0.N_build();
            gizg gizg0 = crxn0.D(17, "GTAF_Server", "MDP_PeriodicService");
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)gizg0));
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((gizg)hftp1.b_message).t = 0L;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gizg gizg1 = (gizg)hftp1.b_message;
            giyz1.getClass();
            gizg1.r = giyz1;
            gizg1.b |= 0x100;
            crxn0.e(((gizg)hftp1.N_build()), hhct.be, integer0);
            return;
        }
        bboh0.g(cslm.h()).B("%s: GcoreRegister: not enabled, skip scheduling.", "PeriodicService");
    }

    public static void j(Context context0) {
        bboh bboh0 = ChimeraPeriodicUpdaterService.a;
        bboh0.g(cslm.h()).S("%s: MeterednessUpdate: enabled %s", "PeriodicService", hvks.i());
        if(hvks.h() && hvks.i()) {
            crxy crxy0 = ChimeraPeriodicUpdaterService.n();
            bboh0.g(cslm.h()).X("%s: MeterednessUpdate: interval %d flex %d.", "PeriodicService", Long.valueOf(crxy0.a), Long.valueOf(crxy0.b));
            clkq clkq0 = new clkq();
            clkq0.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
            clkq0.t("mobiledataplan_meteredness_update");
            clkq0.y(0, 1);
            clkq0.v(1);
            if(hrwu.g()) {
                clkq0.j(clkm.a(crxy0.a));
            }
            else {
                clkq0.e(crxy0.a, crxy0.b, cllj.a);
            }
            Bundle bundle0 = new Bundle();
            int v = crxn.a();
            bundle0.putInt("event_flow_id", v);
            bundle0.putLong("task_interval_key", crxy0.a);
            bundle0.putLong("task_flex_key", crxy0.b);
            clkq0.u = bundle0;
            cljp.a(context0).f(clkq0.a());
            new crxn(context0).L(22, hhct.cX, Integer.valueOf(v), null);
        }
    }

    public static void k(Context context0, int v, int v1) {
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        clkn0.t("mobiledataplan_meteredness_update");
        clkn0.e(hvks.b(), hvks.c());
        clkn0.y(0, 1);
        clkn0.v(1);
        Bundle bundle0 = new Bundle();
        bundle0.putInt("event_flow_id", v1);
        clkn0.u = bundle0;
        hvks.b();
        hvks.c();
        new crxn(context0).L(v, hhct.cX, Integer.valueOf(v1), null);
        cljp.a(context0).f(clkn0.a());
    }

    private static crxy m(Context context0) {
        long v1;
        long v;
        crvw crvw0 = crvw.c();
        Long long0 = crvw0.p(csli.g(context0));
        hfwn hfwn0 = crvw0.i(long0);
        if(hfwn0 == null) {
            v = hvjq.b();
            v1 = hvjq.a.c().d();
        }
        else {
            hvjq hvjq0 = hvjq.a;
            hfst hfst0 = hfyf.n(hvjq0.c().b());
            if(hfyf.b(hfyn.e(hfwn0, hfyn.h(System.currentTimeMillis())), hfst0) <= 0 && crvw0.d(long0) != null) {
                v = hvjq0.c().g();
                v1 = hvjq0.c().f();
            }
            else {
                v = hvjq.b();
                v1 = hvjq.a.c().d();
            }
        }
        crxy crxy0 = new crxy();
        crxy0.a = v;
        crxy0.b = v1;
        return crxy0;
    }

    private static crxy n() {
        crxy crxy0 = new crxy();
        crxy0.a = hvks.a.f().e();
        crxy0.b = hvks.a.f().d();
        return crxy0;
    }

    private static void o(Context context0, long v, long v1, giyy giyy0) {
        new crxx().start();
        ChimeraPeriodicUpdaterService.p(context0, v, v1, giyy0, Integer.valueOf(crxn.a()));
    }

    private static void p(Context context0, long v, long v1, giyy giyy0, Integer integer0) {
        long v3;
        int v2 = (int)integer0;
        crxn crxn0 = new crxn(context0);
        gizg gizg0 = crxn0.D(17, "GTAF_Server", "MDP_PeriodicService");
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)gizg0).jf(5, null);
        hftp0.X(((ProtoLiteMessage)gizg0));
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((giyz)hftv0).c = 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((giyz)hftv1).f = v;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        giyz giyz0 = (giyz)hftp1.b_message;
        giyz0.d = giyy0.a();
        giyz giyz1 = (giyz)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gizg gizg1 = (gizg)hftp0.b_message;
        giyz1.getClass();
        gizg1.r = giyz1;
        gizg1.b |= 0x100;
        crxn0.e(((gizg)hftp0.N_build()), hhct.aX, integer0);
        Bundle bundle0 = new Bundle();
        bundle0.putInt("cpid_update_cause", giyy0.a());
        bundle0.putInt("event_flow_id", v2);
        bundle0.putLong("task_interval_key", v);
        bundle0.putLong("task_flex_key", v1);
        clkq clkq0 = new clkq();
        clkq0.j = "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService";
        clkq0.u = bundle0;
        clkq0.t("mobiledataplan_cpid_refresher");
        clkq0.y(0, 0);
        clkq0.v(1);
        if(hrwu.g()) {
            v3 = v;
            clkq0.e(v3, ((long)(hrvh.b() * ((double)v))), cllj.a);
        }
        else {
            v3 = v;
            clkq0.a = v3;
            clkq0.b = v1;
        }
        cljp.a(context0).f(clkq0.a());
        Level level0 = cslm.h();
        ChimeraPeriodicUpdaterService.a.g(level0).Z("%s: CpidFetch: interval %d flex %d. Service %b Update %b.", "PeriodicService", Long.valueOf(v3), Long.valueOf(v1), Boolean.valueOf(hvko.J()), Boolean.valueOf(hvko.P()));
    }

    private static boolean q(Context context0, cllr cllr0) {
        crxy crxy0 = ChimeraPeriodicUpdaterService.m(context0);
        return !ChimeraPeriodicUpdaterService.v(cllr0, "task_interval_key", crxy0.a) || !ChimeraPeriodicUpdaterService.v(cllr0, "task_flex_key", crxy0.b);
    }

    private final boolean r(long v, long v1) {
        return Long.compare(this.n.a, v) != 0 || this.n.b != v1;
    }

    private static boolean s(cllr cllr0) {
        boolean z = !ChimeraPeriodicUpdaterService.v(cllr0, "task_interval_key", hvjk.d()) || !ChimeraPeriodicUpdaterService.v(cllr0, "task_flex_key", hvjk.c());
        hvjk.d();
        hvjk.c();
        return z;
    }

    private static boolean t(cllr cllr0) {
        crxy crxy0 = ChimeraPeriodicUpdaterService.n();
        return !ChimeraPeriodicUpdaterService.v(cllr0, "task_interval_key", crxy0.a) || !ChimeraPeriodicUpdaterService.v(cllr0, "task_flex_key", crxy0.b);
    }

    private static boolean u() {
        return hvje.p() && crvw.c().v();
    }

    private static boolean v(cllr cllr0, String s, long v) {
        return cllr0.b != null && cllr0.b.containsKey(s) && cllr0.b.getLong(s) == v;
    }

    private static final void w(String s, giyy giyy0, giym giym0) {
        int v;
        cljp.a(AppContextProvider.a()).d(s, "com.google.android.gms.mobiledataplan.service.PeriodicUpdaterService");
        switch(s) {
            case "mobiledataplan_bg_periodic_checker": {
                v = 17;
                break;
            }
            case "mobiledataplan_consent_fetch": {
                v = 16;
                break;
            }
            case "mobiledataplan_cpid_refresher": {
                v = 14;
                break;
            }
            case "mobiledataplan_meteredness_update": {
                v = 25;
                break;
            }
            case "mobiledataplan_register": {
                v = 15;
                break;
            }
            default: {
                v = 18;
            }
        }
        if(hvkk.a.d().m()) {
            crxn.c().G(v, giyy0, giym0);
        }
    }
}

