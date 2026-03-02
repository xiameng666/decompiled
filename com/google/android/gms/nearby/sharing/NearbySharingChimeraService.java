package com.google.android.gms.nearby.sharing;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import a;
import adv;
import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.app.backup.BackupManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.database.Cursor;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.provider.ContactsContract.Profile;
import android.provider.Settings.Global;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.ArraySet;
import android.view.accessibility.AccessibilityManager;
import aztk;
import azxs;
import bare;
import batl;
import bbln;
import bbpd;
import bbqa;
import bxd;
import cjpa;
import cjpc;
import cjpd;
import cjtn;
import clht;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.TileService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.nearby.connection.UwbSenderInfo;
import com.google.android.gms.nearby.sharing.database.QuickShareRoomDatabase;
import cumi;
import cumn;
import cumy;
import cumz;
import cunf;
import cupr;
import cuqf;
import cuqi;
import cuqn;
import cuqu;
import curp;
import curq;
import cusk;
import cutr;
import cuuc;
import cuud;
import cuuh;
import cuui;
import cuuq;
import cuur;
import czly;
import czwl;
import dagger.Lazy;
import dasx;
import dbvd;
import dbvl;
import dbvx;
import dbws;
import dbzg;
import dbzj;
import dbzk;
import dbzm;
import dbzn;
import dbzo;
import dbzp;
import dbzq;
import dbzt;
import dbzu;
import dbzv;
import dbzw;
import dbzx;
import dcaa;
import dcab;
import dcac;
import dcad;
import dcae;
import dcaf;
import dcag;
import dcah;
import dcai;
import dcaj;
import dcan;
import dcao;
import dcap;
import dcaq;
import dcar;
import dcat;
import dcau;
import dcax;
import dcay;
import dcaz;
import dcba;
import dcbb;
import dcbc;
import dcbd;
import dcbe;
import dcbh;
import dcbl;
import dcbm;
import dcbn;
import dcbo;
import dcbp;
import dcbr;
import dcbs;
import dcbt;
import dcbu;
import dccf;
import dcch;
import dccl;
import dccq;
import dccr;
import dccs;
import dccw;
import dccz;
import dchp;
import dchq;
import dchr;
import dchs;
import dcht;
import dcii;
import dcil;
import dcng;
import dcnh;
import dcnn;
import dcnp;
import dcor;
import dcou;
import dcov;
import dcow;
import dcoy;
import dcpj;
import dcpn;
import dcpt;
import dcpu;
import dcpv;
import dcqh;
import dctf;
import dcup;
import dcus;
import dcvz;
import dcwh;
import dcwt;
import dcww;
import dcxb;
import dcxc;
import dcxk;
import ddki;
import ddky;
import ddli;
import ddln;
import ddow;
import dfsk;
import dfsn;
import dfso;
import dfsp;
import dfsq;
import dftl;
import dftm;
import dfue;
import dfuf;
import dgaf;
import dgbm;
import dgcp;
import dhdg;
import dhdi;
import dhtl;
import diiu;
import dije;
import dijl;
import dijm;
import dijt;
import dikc;
import dikd;
import dikp;
import dikq;
import diks;
import dikt;
import dizf;
import dizg;
import dizh;
import dizi;
import dizj;
import dizk;
import dizq;
import dizr;
import dizs;
import dizt;
import dizv;
import dizw;
import dizx;
import dizy;
import dizz;
import djaa;
import djab;
import djad;
import djak;
import djan;
import djas;
import djat;
import djav;
import djbh;
import djbm;
import djbr;
import djbt;
import djbw;
import djbz;
import evql;
import evqp;
import evrg;
import fqaw;
import gfqz;
import gfta;
import gftb;
import gfud;
import gfug;
import gful_cronetEngineProvider;
import gfur_Suppliers;
import gfus;
import gfuv;
import ggaf;
import ggal;
import gged_interceptors;
import ggeo;
import ggfp;
import gggq;
import ggnj;
import ggqj;
import ggqk;
import glyq;
import gmap;
import gmbt;
import gmbu;
import gmcg;
import gmcu;
import gxym;
import gyqi;
import gyqj;
import gyqn;
import gyqv;
import gyrk;
import gyrv;
import gyrz;
import gysa;
import gysp;
import gyza;
import gzat;
import gzax;
import hfst;
import hfyg;
import hvod;
import hvqf;
import hvqs;
import hvqz;
import hvrb;
import hvrc;
import hvre;
import ibuq;
import icbb;
import iccm;
import icpu;
import j..time.Duration;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.TWR;
import juk;
import jvr;
import jwe;
import kau;
import lpg;
import lps;
import lrt;

public class NearbySharingChimeraService extends dcil implements lps {
    public boolean A;
    public boolean B;
    public boolean C;
    public final Map D;
    public QrCodeMetadata E;
    public ddln F;
    public boolean G;
    cumn H;
    public ScheduledExecutorService I;
    public Lazy J;
    public ddli K;
    public dcii L;
    public boolean M;
    public final Context N;
    public PowerManager O;
    public dcpn P;
    @Deprecated
    public final Map Q;
    @Deprecated
    public kau R;
    public final cumy S;
    public final cumy T;
    public final cumy U;
    public final Map V;
    public ContentObserver W;
    public Intent X;
    public final bare Y;
    public boolean Z;
    public dftm a;
    private cuur aA;
    private cuuq aB;
    private int aC;
    private boolean aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    private boolean aI;
    private boolean aJ;
    private final ScheduledExecutorService aK;
    private ScheduledExecutorService aL;
    private cumn aM;
    private cumn aN;
    private long aO;
    private BroadcastReceiver aP;
    private BroadcastReceiver aQ;
    private BroadcastReceiver aR;
    private BroadcastReceiver aS;
    private BroadcastReceiver aT;
    private DisplayManager.DisplayListener aU;
    private BroadcastReceiver aV;
    private BroadcastReceiver aW;
    private BroadcastReceiver aX;
    private BroadcastReceiver aY;
    private BroadcastReceiver aZ;
    public final dcwt aa;
    public boolean ab;
    public gful_cronetEngineProvider ac;
    public final gful_cronetEngineProvider ad;
    public final gful_cronetEngineProvider ae;
    public dbvx af;
    public Lazy ag;
    public Lazy ah;
    public Lazy ai;
    public gfuv aj;
    public Lazy ak;
    public Lazy al;
    public final Map am;
    public final gful_cronetEngineProvider an;
    public final gful_cronetEngineProvider ao;
    public static final int ap;
    private static final Charset aq;
    private int ar;
    private dgaf as;
    private int at;
    @Deprecated
    private boolean au;
    @Deprecated
    private boolean av;
    @Deprecated
    private boolean aw;
    @Deprecated
    private boolean ax;
    private boolean ay;
    private final Map az;
    public Lazy b;
    private dizw ba;
    private BroadcastReceiver bb;
    private BroadcastReceiver bc;
    private BroadcastReceiver bd;
    private BroadcastReceiver be;
    private BroadcastReceiver bf;
    private BroadcastReceiver bg;
    private ContentObserver bh;
    private ContentObserver bi;
    private czly bj;
    private final lrt bk;
    private final gful_cronetEngineProvider bl;
    public dijm c;
    public Lazy d;
    public dhtl m;
    public dcqh n;
    public dhdi o;
    public final cumy p;
    public final cumy q;
    public final Set r;
    public final Map s;
    public volatile kau t;
    public dchq u;
    public dftm v;
    public dftl w;
    dasx x;
    public boolean y;
    public boolean z;

    static {
        NearbySharingChimeraService.aq = StandardCharsets.UTF_8;
    }

    public NearbySharingChimeraService() {
        super(0xC2, "com.google.android.gms.nearby.sharing.START_SERVICE", ggnj.a, 3, 9);
        this.ar = -1;
        this.p = new cumy(((int)hvqs.Q()));
        this.q = new cumy(((int)hvqs.Q()));
        this.r = new HashSet();
        this.s = new bxd();
        this.w = null;
        this.at = -1;
        this.au = false;
        this.av = false;
        this.aw = false;
        this.ax = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.ay = false;
        this.B = false;
        this.C = false;
        this.D = new bxd();
        this.az = new bxd();
        this.aC = 0;
        this.E = null;
        this.aD = false;
        this.aE = false;
        this.aK = cuui.f();
        this.I = cuui.f();
        this.M = false;
        this.N = new adv(this, 0x7F16080A);  // style:Sharing.ShareSheet
        this.Q = new bxd();
        this.S = new cumy(((int)hvqs.Q()));
        this.T = new cumy(((int)hvqs.Q()));
        this.U = new cumy(((int)hvqs.Q()));
        this.V = new ConcurrentHashMap();
        this.bh = null;
        this.bi = null;
        this.W = null;
        this.aa = new dcwt(this);
        this.ad = gfus.a(((gful_cronetEngineProvider)new dcaf(this)));
        this.bk = new lrt(this);
        this.bl = gfus.a(((gful_cronetEngineProvider)new dcag(this)));
        this.ae = gfus.a(((gful_cronetEngineProvider)new dcah(this)));
        this.am = DesugarCollections.synchronizedMap(new bxd());
        this.an = gfus.a(((gful_cronetEngineProvider)new dcai()));
        this.ao = gfus.a(((gful_cronetEngineProvider)new dcaj()));
        this.Y = new bare(0x7FFFFFFF, hvqs.i(), hvqs.i(), TimeUnit.MILLISECONDS);
    }

    public final gged_interceptors A(Account account0) {
        try {
            dbvd dbvd0 = (dbvd)((Map)((glyq)djbh.b(this.N)).v(hvqs.ag(), TimeUnit.MILLISECONDS)).get(account0.name);
            if(dbvd0 != null && System.currentTimeMillis() - dbvd0.d <= hvqs.ak() && !dbvd0.c.isEmpty()) {
                return gged_interceptors.i(dbvd0.c);
            }
        }
        catch(ExecutionException | AssertionError | TimeoutException throwable0) {
            dcvz.a.e().f(throwable0).p("Failed to read cached reachable phone numbers.", new Object[0]);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            dcvz.a.e().f(interruptedException0).p("Failed to read cached reachable phone numbers.", new Object[0]);
        }
        List list0 = this.a.m(account0);
        if(list0 == null) {
            return null;
        }
        djbh.g(this.N, account0.name, list0, System.currentTimeMillis());
        return gged_interceptors.i(list0);
    }

    public final gzat B() {
        return this.P.h;
    }

    public final File C(boolean z) {
        return new cuud(this.N).b(z);
    }

    public final String D(int v) {
        switch(v) {
            case 1: {
                return "OFFLINE";
            }
            case 2: {
                return "ONLINE";
            }
            case 3: {
                return "WIFI_ONLY";
            }
            default: {
                return "UNKNOWN[" + this.j() + "]";
            }
        }
    }

    final String E() {
        String s;
        String s1;
        Account account0 = this.v();
        Context context0 = this.N;
        if(account0 == null) {
        label_5:
            Cursor cursor0 = cuqf.b(context0, ContactsContract.Profile.CONTENT_URI);
            if(cursor0 == null) {
                s1 = null;
            }
            else {
                try {
                    s1 = cuqf.l(cursor0, "display_name");
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
                cursor0.close();
            }
            s = TextUtils.isEmpty(s1) ? null : ((String)gggq.m(gfud.h("\\s+").l(s1), 0));
        }
        else {
            try {
                s = ((dizf)evrg.n(dizg.d(account0))).b;
                goto label_16;
            }
            catch(ExecutionException | InterruptedException unused_ex) {
            }
            goto label_5;
        }
    label_16:
        if(!TextUtils.isEmpty(s) && !gfqz.e("null", s)) {
            CharSequence charSequence0 = ((adv)context0).a().getText(0x7F152C09);  // string:sharing_device_type_phone "@com.google.android.gms:string/common_phone_lowercase"
            switch(djbm.d(context0)) {
                case 2: {
                    charSequence0 = ((adv)context0).a().getText(0x7F152C0A);  // string:sharing_device_type_tablet "tablet"
                    break;
                }
                case 3: {
                    charSequence0 = ((adv)context0).a().getText(0x7F152C08);  // string:sharing_device_type_laptop "laptop"
                    break;
                }
                case 4: {
                    charSequence0 = ((adv)context0).a().getText(0x7F152C07);  // string:sharing_device_type_car "car"
                    break;
                }
                case 6: {
                    charSequence0 = ((adv)context0).a().getText(0x7F152C0C);  // string:sharing_device_type_xr "XR headset"
                }
            }
            if(hvqz.a.b().bo()) {
                charSequence0 = djbw.d(context0);
            }
            int v = ((adv)context0).a().getInteger(0x7F0C00E9);  // integer:sharing_max_name_length_bytes
            int v1 = dizs.a(context0.getString(0x7F152C02, new Object[]{"", charSequence0}));  // string:sharing_default_device_name "%1$s\'s %2$s"
            if(v1 >= v) {
                dcvz.a.e().p("Device type string is longer than char limit.", new Object[0]);
                return TextUtils.isEmpty(null) ? djbw.c(context0) : context0.getString(0x7F152C02, new Object[]{null, charSequence0});  // string:sharing_default_device_name "%1$s\'s %2$s"
            }
            String s2 = djbt.a(s, v - v1);
            return TextUtils.isEmpty(s2) ? djbw.c(context0) : context0.getString(0x7F152C02, new Object[]{s2, charSequence0});  // string:sharing_default_device_name "%1$s\'s %2$s"
        }
        return djbw.c(context0);
    }

    public final String F() {
        if(!((dfsk)this.d.get()).X() && !djat.c(this.N) && !this.aN()) {
            return this.bh(this.E());
        }
        String s = ((dfsk)this.d.get()).h(this.v());
        if(TextUtils.isEmpty(s)) {
            s = this.bh(this.E());
            ((dfsk)this.d.get()).x(s);
        }
        return s;
    }

    // String Decryptor: 1 succeeded, 0 failed
    public static String G(int v) {
        switch(v) {
            case 0: {
                return "BACKGROUND";
            }
            case 1: {
                return "FOREGROUND";
            }
            case 2: {
                return "FOREGROUND INSTALL";
            }
            case 3: {
                return "FOREGROUND HEADLESS";
            }
            default: {
                return a.f(v, "UNKNOWN[", "]");
            }
        }
    }

    // Detected as a lambda impl.
    public static String H(Object object0) {
        return Integer.toString(Math.abs(((short)object0.hashCode())));
    }

    public final List I(Intent intent0) {
        int v = intent0.getIntExtra("nearby_share_intent_id", -1);
        if(v == -1) {
            return dizi.l(this, intent0);
        }
        if(this.t != null && ((Intent)this.t.a).getIntExtra("nearby_share_intent_id", -1) == v) {
            kau kau0 = this.t;
            batl.s(kau0);
            SecureRandom secureRandom0 = new SecureRandom();
            List list0 = new ArrayList();
            for(Object object0: ((List)kau0.b)) {
                dbvl dbvl0 = ((Attachment)object0).f();
                dbvl0.d(secureRandom0.nextLong());
                list0.add(dbvl0.b());
            }
            return list0;
        }
        List list1 = dizi.l(this, intent0);
        this.t = new kau(intent0, list1);
        return list1;
    }

    public final List J(Integer[] arr_integer) {
        List list0 = new ArrayList();
        ggfp ggfp0 = ggfp.H(arr_integer);
        for(Object object0: this.s.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(ggfp0.contains(map$Entry0.getValue())) {
                list0.add(((dbzg)map$Entry0.getKey()));
            }
        }
        return list0;
    }

    public final List K(Integer[] arr_integer) {
        List list0 = new ArrayList();
        ggfp ggfp0 = ggfp.H(arr_integer);
        for(Object object0: this.q.d()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(ggfp0.contains(Integer.valueOf(((dcht)map$Entry0.getValue()).b))) {
                list0.add(new kau(((dcnp)map$Entry0.getKey()), ((dcht)map$Entry0.getValue()).a));
            }
        }
        return list0;
    }

    public final Map L(int v) {
        Map map0 = new bxd();
        if(!((Boolean)this.ao.mr()).booleanValue()) {
            if(hvqz.z()) {
                gged_interceptors gged0 = this.z();
                int v1 = gged0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    map0.putAll(((dftm)gged0.get(v2)).n(v));
                }
                return map0;
            }
            return this.a.n(v);
        }
        switch(v) {
            case 0: {
                for(Object object0: this.U.e()) {
                    map0.put(((dikd)object0).a, ((dikd)object0).b);
                }
                return map0;
            }
            case 1: {
                for(Object object1: this.T.e()) {
                    map0.put(((dikd)object1).a, ((dikd)object1).b);
                }
                return map0;
            }
            default: {
                return map0;
            }
        }
    }

    public final void M() {
        if(!this.aE()) {
            dcvz.a.b().p("Not allowed to auto turn off device settings.", new Object[0]);
            return;
        }
        if(!this.aT() && !this.bu()) {
            for(Object object0: this.L(1).values()) {
                TransferMetadata transferMetadata0 = (TransferMetadata)object0;
                if(hvrc.a.b().V()) {
                    if(transferMetadata0.d()) {
                        dcvz.a.b().p("Don\'t turn off device settings when there are ongoing transfers", new Object[0]);
                        return;
                    }
                }
                else if(!transferMetadata0.e) {
                    dcvz.a.b().p("Don\'t turn off device settings when there are ongoing transfers", new Object[0]);
                    return;
                }
                if(transferMetadata0.a == 0x3F8) {
                    dcvz.a.b().p("Don\'t turn off device settings with group share when queue is not empty", new Object[0]);
                    return;
                }
            }
            Context context0 = this.N;
            if(!djbz.g(context0)) {
                ArraySet arraySet0 = new ArraySet();
                if(!djbw.h(context0) && cjpd.i(djab.a(context0), "auto_enable_wifi", false)) {
                    djab.d(context0, false);
                    arraySet0.add(djbz.b(context0));
                }
                if(cjpd.i(djab.a(context0), "auto_enable_bluetooth", false)) {
                    djab.c(context0, false);
                    arraySet0.add(dizr.b(context0));
                }
                cuuc.c("revertDeviceSettings", evrg.e(arraySet0), hvqs.r());
            }
            dcvz.a.b().p("Reverted device settings", new Object[0]);
            return;
        }
        dcvz.a.b().p("Don\'t turn off device settings when share target is transferring or connecting.", new Object[0]);
    }

    // Detected as a lambda impl.
    public final void N() {
        for(Object object0: this.r) {
            ((dcng)object0).a();
        }
        cutr.e(this, "com.google.android.gms.nearby.sharing.STATE_CHANGED");
        cunf cunf0 = dcvz.a;
        cunf0.b().p("Broadcasting NearbySharing state change.", new Object[0]);
        if(hvqz.w()) {
            ((BackupManager)this.bl.mr()).dataChanged();
            cunf0.b().p("Notified backup manager of data change.", new Object[0]);
        }
    }

    public final void O() {
        if(hvqz.a.b().aM()) {
            Context context0 = this.N;
            if(djat.c(context0) && this.aL() && ((dfsk)this.d.get()).c() != null) {
                int v = 4;
                int v1 = this.w().f;
                if(v1 != 0 && v1 != 4) {
                    long v2 = System.currentTimeMillis();
                    long v3 = hvqs.a.aT().bs() * TimeUnit.DAYS.toMillis(1L);
                    long v4 = hvqs.a.aT().aN() * TimeUnit.DAYS.toMillis(1L);
                    long v5 = hvqs.a.aT().bT() * TimeUnit.DAYS.toMillis(1L);
                    Long long0 = djav.c(context0);
                    if(long0 == null) {
                        v = 1;
                    }
                    else if(djat.d(context0)) {
                        v = 5;
                    }
                    else if(((long)long0) == -1L) {
                        djbh.f(context0, v2);
                        dcvz.a.e().h("Timestamp cached in protoDataStore for the first time %s", new Date(v2));
                        v = 1;
                    }
                    else {
                        Boolean boolean0 = djav.b(context0);
                        if(boolean0 == null) {
                            v = 1;
                        }
                        else if(boolean0.booleanValue()) {
                            Boolean boolean1 = djav.a(context0);
                            if(boolean1 == null) {
                                v = 1;
                            }
                            else if(boolean1.booleanValue()) {
                                if(v2 - ((long)long0) > v3) {
                                    djbh.f(context0, v2);
                                }
                                else {
                                    v = 1;
                                }
                            }
                            else if(v2 - ((long)long0) > v5) {
                                djbh.f(context0, v2);
                                v = 3;
                            }
                            else {
                                v = 1;
                            }
                        }
                        else if(v2 - ((long)long0) > v4) {
                            djbh.f(context0, v2);
                            v = 2;
                        }
                        else {
                            v = 1;
                        }
                    }
                    switch(v - 1) {
                        case 1: {
                            gmbu.t(this.bz(v1), new dccw(this, v1), gmap.a);
                            return;
                        }
                        case 2: 
                        case 3: {
                            gmbu.t(this.bz(v1), new dccw(this, v1), gmap.a);
                        }
                    }
                }
            }
        }
    }

    public final void P(ShareTarget shareTarget0, Intent intent0, dizh dizh0) {
        gmcu gmcu0 = new gmcu();
        dcbo dcbo0 = new dcbo(this, intent0, gmcu0);
        this.I.execute(dcbo0);
        long v = shareTarget0 == null ? -1L : shareTarget0.a;
        bbln bbln0 = new bbln(9, new dcbp(this, dizh0, gmcu0, v));
        this.V.put(Long.valueOf(v), bbln0);
        bbln0.start();
    }

    public final void Q(dcpv dcpv0) {
        if(!ModuleInitializer.a(this)) {
            dcvz.a.b().p("Cannot force sync, because Nearby Share is not available.", new Object[0]);
            return;
        }
        if(this.v() == null) {
            dcvz.a.b().p("Cannot force sync, because account is not available.", new Object[0]);
            return;
        }
        dcvz.a.b().p("Started a force sync.", new Object[0]);
        this.a.p(dcpv0);
    }

    public final void R(String s, ShareTarget shareTarget0) {
        Uri uri0 = shareTarget0.c;
        if(uri0 != null) {
            this.aa.b(s, uri0);
        }
        for(Object object0: shareTarget0.f()) {
            Uri uri1 = ((FileAttachment)object0).d;
            if(uri1 != null) {
                this.aa.b(s, uri1);
            }
        }
    }

    public final void S(Intent intent0, ddow ddow0, dctf dctf0, int v) {
        switch(dctf0.ordinal()) {
            case 0: {
                dcvz.a.b().p("Unique QR Code successfully generated", new Object[0]);
                this.av(ddow0, this.o.a());
                return;
            }
            case 2: {
                this.o.c();
                if(v > 0) {
                    try {
                        dcvz.a.b().h("Retrying QrCodeSession with manager. Attempts left: %d", Integer.valueOf(v - 1));
                        this.au(intent0, ddow0, v - 1);
                    }
                    catch(GeneralSecurityException | IOException exception0) {
                        dcvz.a.e().f(exception0).h("Encountered an exception while retrying QrCodeSession. Error: %s", exception0.getMessage());
                        ddow0.a(8);
                    }
                    return;
                }
                ddow0.a(13);
                dcvz.a.e().p("Encountered error due to repeated collisions. Try again later.", new Object[0]);
                return;
            }
            case 3: {
                dcvz.a.e().p("Session already started", new Object[0]);
                ddow0.a(35500);
                return;
            }
            case 4: 
            case 5: 
            case 6: {
                dcvz.a.b().p("Error launching QR Code Cloud Sharing. Switching to P2P.", new Object[0]);
                this.av(ddow0, this.o.a());
            }
        }
    }

    public final void T() {
        boolean z;
        dftl dftl0;
        if(!this.aF && !this.bt()) {
            this.ax();
            dcvz.a.b().p("Stopping advertising because the screen is locked.", new Object[0]);
            return;
        }
        if(this.G) {
            if(!bbqa.c() && !this.aH) {
                this.ax();
                dcvz.a.b().p("Stopping advertising because Location is disabled.", new Object[0]);
                return;
            }
            if(!this.aL()) {
                this.ax();
                dcvz.a.b().p("Stopping advertising because Nearby Sharing is disabled.", new Object[0]);
                return;
            }
            if(this.bv()) {
                this.ax();
                dcvz.a.b().p("Stopping advertising because we\'re scanning for other devices.", new Object[0]);
                return;
            }
            if(this.aT() && !hvqz.z()) {
                this.ax();
                dcvz.a.b().p("Stopping advertising because we\'re currently in the midst of a transfer.", new Object[0]);
                return;
            }
            if(this.y && !hvqz.z()) {
                this.ax();
                dcvz.a.b().p("Stopping advertising because we recently sent/received a file. Allowing the attached surfaces a chance to unregister.", new Object[0]);
                return;
            }
            if(this.bq()) {
                if(hvqz.z() && (this.aT() || this.y)) {
                    dftl0 = dftl.e;
                }
                else if(!this.aF) {
                    dftl0 = dftl.d;
                }
                else if(this.aG() || this.aF()) {
                    dftl0 = dftl.c;
                }
                else if(this.z && (!hvqz.a.b().I() || !this.aG)) {
                    dftl0 = dftl.b;
                }
                else {
                    dftl0 = dftl.a;
                }
                if(!hvqz.z() && (dftl0 == dftl.a || dftl0 == dftl.d) && !this.bt()) {
                    this.ax();
                    dcvz.a.b().p("Stopping advertising since there\'s no scanning phone nearby and no receive surface in foreground.", new Object[0]);
                    return;
                }
                int v = this.d(dftl0);
                if(v == 0) {
                    if(this.bf() != null) {
                        v = 0;
                        goto label_51;
                    }
                    this.ax();
                    dcvz.a.b().p("Stopping advertising because no high power receive surface is registered and device is visible to HIDDEN.", new Object[0]);
                    return;
                }
            label_51:
                if(this.bo() && dftl0 != dftl.c) {
                    this.ax();
                    dcvz.a.b().p("Stopping advertising to avoid interference with 2.4GHz Wi-Fi connections.", new Object[0]);
                    return;
                }
                this.a.v(v);
                switch(dftl0.ordinal()) {
                    case 1: {
                        if(hvqz.a.b().P()) {
                            z = true;
                        }
                        else if(this.B && v == 3) {
                            v = 3;
                            z = true;
                        }
                        else {
                            z = false;
                        }
                        break;
                    }
                    case 2: {
                        z = true;
                        break;
                    }
                    default: {
                        z = false;
                    }
                }
                this.C = z;
                switch(dftl0.ordinal()) {
                    case 0: {
                        if(hvqz.a.b().X()) {
                            dcvz.a.b().p("Starting a sync for background advertising", new Object[0]);
                            dcpu dcpu0 = new dcpu();
                            dcpu0.b = 3;
                            dcpu0.a = 11;
                            this.Q(new dcpv(dcpu0));
                        }
                        break;
                    }
                    case 1: {
                        hvqz hvqz0 = hvqz.a;
                        if(hvqz0.b().Z()) {
                            dcvz.a.b().p("Starting a sync for midground advertising", new Object[0]);
                            if(hvqz0.b().S()) {
                                this.ak(new dcbd(this), hvqs.a.aT().bg());
                            }
                        }
                        break;
                    }
                    case 2: {
                        if(hvqz.a.b().Y()) {
                            dcvz.a.b().p("Starting a sync for foreground advertising", new Object[0]);
                            dcpu dcpu1 = new dcpu();
                            dcpu1.b = 3;
                            dcpu1.a = 11;
                            this.Q(new dcpv(dcpu1));
                        }
                        break;
                    }
                    case 3: {
                        if(hvqz.a.b().aa()) {
                            dcvz.a.b().p("Starting a sync for screen-off advertising", new Object[0]);
                            dcpu dcpu2 = new dcpu();
                            dcpu2.b = 3;
                            dcpu2.a = 11;
                            this.Q(new dcpv(dcpu2));
                        }
                    }
                }
                if(!this.aL()) {
                    dcvz.a.b().p("Failed to advertise because we\'re not enabled.", new Object[0]);
                }
                else if(this.bv()) {
                    dcvz.a.b().p("Failed to advertise because we\'re currently scanning for other devices in the foreground.", new Object[0]);
                }
                else if(!this.bq()) {
                    dcvz.a.b().p("Failed to advertise because there\'s no receive surface registered.", new Object[0]);
                }
                else if(!this.aF && !this.bt()) {
                    dcvz.a.b().p("Failed to advertise because the user\'s screen is locked.", new Object[0]);
                }
                else if(this.G) {
                    int v1 = 0;
                    int v2 = this.j();
                    for(Object object0: this.p.e()) {
                        int v3 = ((dchs)object0).b;
                        if(v3 != 0) {
                            v1 = v3;
                            break;
                        }
                    }
                    QrCodeMetadata qrCodeMetadata0 = this.bf();
                    if(this.aJ() && dftl0.equals(this.w) && v2 == this.at && this.az.equals(this.D) && this.ay == this.C && this.ar == v && this.aC == v1 && Objects.equals(qrCodeMetadata0, this.E)) {
                        dcvz.a.b().l("Failed to advertise because we\'re already advertising with mode %s, certificate visibility %s data usage preference %s, and bt advertising %s with vendorId %s", this.w, djbr.t(v), this.D(this.at), Boolean.valueOf(this.ay), Integer.valueOf(v1));
                    }
                    else {
                        this.ar = v;
                        String s = v == 3 || qrCodeMetadata0 != null ? this.F() : null;
                        cunf cunf0 = dcvz.a.b();
                        String s1 = djbr.t(v);
                        String s2 = this.D(v2);
                        cunf cunf1 = dcvz.a;
                        cunf0.l("Start advertising with mode %s certificate visibility %s data usage preference %s, and bt advertising %s with vendorId %d", dftl0, s1, s2, Boolean.valueOf(this.C), Integer.valueOf(v1));
                        dbzw dbzw0 = new dbzw(this);
                        dfsn dfsn0 = new dfsn();
                        dfsn0.a = dftl0;
                        dfsn0.g = v2;
                        dfsn0.b = djbm.d(this.N);
                        dfsn0.c = this.C;
                        dftl dftl1 = dftl.c;
                        dfsn0.f = dftl0 == dftl1;
                        dfsn0.d = v == 3;
                        dfsn0.k = v == 3;
                        if(this.aU()) {
                            Map map0 = this.D;
                            for(Iterator iterator1 = map0.keySet().iterator(); iterator1.hasNext(); iterator1 = iterator1) {
                                Object object1 = iterator1.next();
                                cuur cuur0 = (cuur)map0.get(((cuuq)object1));
                                byte[] arr_b = ((cuuq)object1).e();
                                List list0 = dfsn0.i;
                                UwbSenderInfo uwbSenderInfo0 = new UwbSenderInfo();
                                uwbSenderInfo0.b = cuur0.c;
                                uwbSenderInfo0.c = cuur0.d;
                                uwbSenderInfo0.a = arr_b;
                                list0.add(uwbSenderInfo0);
                                map0 = map0;
                            }
                        }
                        if(this.bt()) {
                            boolean z1 = !hvqz.a.b().ab() || dftl0 != dftl.b ? v == 3 || dftl0 == dftl1 : true;
                            hvqs.bm();
                            dfsn0.e = z1;
                        }
                        dfsn0.j = v1;
                        dfso dfso0 = dfsn0.a();
                        gged_interceptors gged0 = this.z();
                        int v4 = gged0.size();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            dftm dftm0 = (dftm)gged0.get(v5);
                            if(this.aJ()) {
                                cunf1.b().h("Updating advertising options: %s", dfso0);
                                dftm0.F(s, dfso0, qrCodeMetadata0);
                            }
                            else {
                                dftm0.y(s, dbzw0, dfso0, qrCodeMetadata0);
                            }
                        }
                        this.aC = v1;
                        this.O();
                        this.w = dftl0;
                        this.at = v2;
                        this.ay = this.C;
                        this.E = qrCodeMetadata0;
                        cumn cumn0 = this.aM;
                        if(cumn0 != null) {
                            cumn0.b();
                        }
                        int v6 = ((int)hvqs.aq()) + new Random().nextInt(((int)(hvqs.a.aT().bM() - hvqs.aq())));
                        this.aM = cumn.d(cunf1, new dcaa(this), ((long)v6), this.aL);
                        Map map1 = this.az;
                        map1.clear();
                        map1.putAll(this.D);
                        if(!map1.isEmpty() && this.aU()) {
                            cunf1.b().h("Advertising has started with remote remote UWB information %s", map1);
                        }
                        cunf1.b().i("Advertising has started with mode %s, Bt enabled : %s", dftl0, Boolean.valueOf(this.ay));
                    }
                }
                else {
                    dcvz.a.b().p("Failed to advertise because Bluetooth is off.", new Object[0]);
                }
                if(this.aG()) {
                    this.L.g();
                    dcvz.a.b().p("Cancelling the Fast Init HUN because we\'re now advertising with a foreground receive surface", new Object[0]);
                }
                return;
            }
            this.ax();
            dcvz.a.b().p("Stopping advertising because no receive surface is registered.", new Object[0]);
            return;
        }
        this.ax();
        dcvz.a.b().p("Stopping advertising because Bluetooth is disabled.", new Object[0]);
    }

    public final void U() {
        boolean z = false;
        if(!this.A) {
            if(this.L.q()) {
                dcpn dcpn0 = this.P;
                ProtoLiteBuilder hftp0 = dcpt.L(51);
                gyqj gyqj0 = gyqj.a;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gysp gysp0 = (gysp)hftp0.b_message;
                gyqj0.getClass();
                gysp0.X = gyqj0;
                gysp0.c |= 0x400000;
                dcpn0.i(new dcou(((gysp)hftp0.N_build())));
            }
            dcvz.a.b().p("Dismissing HUN as there\'s no device nearby.", new Object[0]);
            this.L.g();
            return;
        }
        if(!cumz.j(this)) {
            dcvz.a.b().p("Ignoring FastInit signal, as it was detected on a non-primary profile.", new Object[0]);
            this.L.g();
            return;
        }
        if(!this.aM()) {
            dcvz.a.b().p("Ignoring FastInit signal because HUN is disabled by the user.", new Object[0]);
            this.L.g();
            return;
        }
        boolean z1 = dizr.g(this.N);
        if(!z1 && this.ab) {
            if(!this.L.q()) {
                dcii dcii0 = this.L;
                this.F();
                hvqz hvqz0 = hvqz.a;
                if(hvqz0.b().aB()) {
                    Context context0 = dcii0.a;
                    if(!dcww.b(context0).d()) {
                        if(dcii0.c.b()) {
                            dcvz.a.b().p("Not showing heads up notification: notifications are currently blacklisted by the user.", new Object[0]);
                        }
                        else {
                            dcvz.a.b().p("Displaying in use notification", new Object[0]);
                            if(!dcww.b(context0).d()) {
                                CharSequence charSequence0 = context0.getText(0x7F152C78);  // string:sharing_notification_onboarding_description_turn_on_bt "Tap to turn on Bluetooth 
                                                                                            // so the device can find and share with you."
                                String s = hvod.c() ? "com.google.android.gms.nearby.sharing.main.MainActivity" : "com.google.android.gms.nearby.sharing.quicksettings.QuickSettingsActivity";
                                Intent intent0 = new Intent().setClassName(context0, s).addFlags(0x10000000).addFlags(0x8000);
                                intent0.putExtra("is_from_fast_init", true);
                                PendingIntent pendingIntent0 = fqaw.a(context0, 1001, intent0, 0xC000000);
                                gftb.check(pendingIntent0);
                                cuqi cuqi0 = new cuqi(context0, "nearby_sharing_alert");
                                cuqi0.al();
                                cuqi0.m = 2;
                                cuqi0.ak();
                                Intent intent1 = new Intent("com.google.android.gms.nearby.sharing.ACTION_DISMISS").setPackage("com.google.android.gms").putExtra("channel_id", "nearby_sharing_alert");
                                PendingIntent pendingIntent1 = IntentOperation.getPendingIntent(context0, NotificationChimeraBroadcastReceiver.class, intent1, 1006, 0xC000000, false);
                                gftb.check(pendingIntent1);
                                cuqi0.aa(pendingIntent1);
                                cuqi0.ad(true);
                                cuqi0.ao();
                                cuqi0.an();
                                cuqi0.af(0x7F080EEC);  // drawable:sharing_ic_v3_foreground
                                cuqi0.aj("Quick Share");
                                cuqi0.ag(new juk());
                                cuqi0.Z("Device nearby is sharing");
                                cuqi0.Y(charSequence0);
                                cuqi0.h = pendingIntent0;
                                cuqi0.n = false;
                                cuqi0.X(false);
                                cuqi0.D = djbm.a(context0);
                                if(hvqz0.b().aI()) {
                                    AccessibilityManager accessibilityManager0 = (AccessibilityManager)context0.getSystemService("accessibility");
                                    if(accessibilityManager0 == null || !accessibilityManager0.isTouchExplorationEnabled()) {
                                        jvr jvr0 = (jvr)dcii0.b.b.mr();
                                        if(Build.VERSION.SDK_INT >= 34) {
                                            if(jvr0.e.canUseFullScreenIntent()) {
                                            label_72:
                                                PendingIntent pendingIntent2 = fqaw.f(context0, 1009, new Intent().setClassName(context0, "com.google.android.gms.nearby.sharing.NearbySharingService"), 0x44000000);
                                                gftb.check(pendingIntent2);
                                                cuqi0.am(pendingIntent2);
                                            }
                                        }
                                        else if(jvr0.d.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0) {
                                            goto label_72;
                                        }
                                    }
                                }
                                dizk.h(context0);
                                dcii.w(cuqi0);
                                dcii0.u(3, cuqi0.a());
                            }
                        }
                    }
                }
                long v = SystemClock.elapsedRealtime() - this.aO;
                cuqn cuqn0 = new cuqn(this);
                NotificationChannelGroup notificationChannelGroup0 = cuqn0.b("NEARBY_SHARING_CHANNEL_GROUP_ID");
                NotificationChannel notificationChannel0 = cuqn0.a("nearby_sharing_alert");
                boolean z2 = cuqn0.a.f() && (notificationChannelGroup0 == null || !notificationChannelGroup0.isBlocked()) && notificationChannel0.getImportance() > 0;
                if(cuqn0.c().a() != 1 && !notificationChannel0.canBypassDnd()) {
                    z = true;
                }
                dcvz.a.b().i("Displaying FastInit HUN, notificationsEnabled: %s, notificationsFiltered: %s", Boolean.valueOf(z2), Boolean.valueOf(z));
                dcpn dcpn1 = this.P;
                ProtoLiteBuilder hftp1 = dcpt.L(11);
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gyrk.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp2.b_message;
                ((gyrk)hftv0).b |= 1;
                ((gyrk)hftv0).c = v;
                if(!hftv0.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                ((gyrk)hftv1).b |= 2;
                ((gyrk)hftv1).d = z2;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gyrk gyrk0 = (gyrk)hftp2.b_message;
                gyrk0.b |= 4;
                gyrk0.e = z;
                gyrk gyrk1 = (gyrk)hftp2.N_build();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gysp gysp1 = (gysp)hftp1.b_message;
                gyrk1.getClass();
                gysp1.n = gyrk1;
                gysp1.b |= 0x800;
                dcpn1.i(new dcou(((gysp)hftp1.N_build())));
            }
            return;
        }
        dcvz.a.b().i("Ignoring FastInit signal because Bluetooth is enabled or the receiver is not visible to any sender, bluetoothEnabled=%s, isVisibleToSomeSender=%s", Boolean.valueOf(z1), Boolean.valueOf(this.ab));
    }

    public final void V() {
        if(!this.aF) {
            dcvz.a.b().p("Stopping FastInitiation scanning because the screen is locked.", new Object[0]);
            this.ay();
            return;
        }
        if(!this.aL() && !this.aM()) {
            dcvz.a.b().p("Stopping FastInitiation scanning because it is disabled.", new Object[0]);
            this.ay();
            return;
        }
        if(!hvqz.x() && !this.G && !this.K.j()) {
            this.ay();
            dcvz.a.b().p("Stopping FastInitiation scanning because Bluetooth is disabled.", new Object[0]);
            return;
        }
        if(this.aG && hvqz.u()) {
            dcvz.a.b().p("Stopping FastInitiation scanning because battery is low.", new Object[0]);
            this.ay();
            return;
        }
        if(hvqz.x()) {
            Context context0 = this.N;
            cupr cupr0 = dizr.a(context0);
            if(cupr0 != null) {
                switch(cupr0.c()) {
                    case 11: 
                    case 13: {
                        break;
                    }
                    default: {
                        switch(cupr0.a()) {
                            case 14: 
                            case 16: {
                                break;
                            }
                            default: {
                                goto label_25;
                            }
                        }
                    }
                }
                dcvz.a.b().p("Failed to start FastInitiation scanning because Bluetooth is in transitioning.", new Object[0]);
                return;
            }
        label_25:
            if(!this.G && !dizr.e(context0)) {
                this.ay();
                dcvz.a.b().p("Stopping FastInitiation scanning because Bluetooth is disabled.", new Object[0]);
                if(dizr.f(context0) && !this.M) {
                    this.M = true;
                    Context context1 = context0.getApplicationContext();
                    gmcg gmcg0 = cuui.d();
                    evqp evqp0 = new evqp();
                    gmcg0.execute(new dizq(context1, evqp0));
                    dbzu dbzu0 = new dbzu();
                    evqp0.a.b(dbzu0);
                    dbzv dbzv0 = new dbzv(this);
                    evqp0.a.A(dbzv0);
                }
                return;
            }
        }
        if(this.bv()) {
            this.ay();
            dcvz.a.b().p("Stopping FastInitiation scanning because we\'re scanning for other devices.", new Object[0]);
            return;
        }
        if(this.aT()) {
            this.ay();
            dcvz.a.b().p("Stopping FastInitiation scanning because we\'re currently in the midst of a transfer.", new Object[0]);
            return;
        }
        if(this.bo()) {
            this.ay();
            dcvz.a.b().p("Stopping FastInitiation scanning to avoid interference with 2.4GHz Wi-Fi connections.", new Object[0]);
            return;
        }
        if(this.o() != 0) {
            if(!ModuleInitializer.a(this)) {
                if(this.aQ()) {
                    this.ay();
                }
                dcvz.a.a().p("Cannot scan for Fast Init, because Nearby Share is not available.", new Object[0]);
                return;
            }
            if(!this.aF) {
                dcvz.a.b().p("Failed to scan for fast initiation because the user\'s screen is locked.", new Object[0]);
                return;
            }
            if(!this.aL() && !this.aM()) {
                dcvz.a.b().p("Failed to scan for fast initiation because Nearby Share and Fast Init Notification are disabled.", new Object[0]);
                return;
            }
            if(this.aG && hvqz.u()) {
                dcvz.a.b().p("Failed to scan for fast initiation because power save mode is enabled.", new Object[0]);
                return;
            }
            boolean z = this.aL();
            if(this.aQ()) {
                if(z == this.aD) {
                    dcvz.a.d().h("Failed to scan for fast initiation because we\'re already scanning with isHighPowerAllowed=%s.", Boolean.valueOf(this.aD));
                    return;
                }
                dcvz.a.b().h("Restarting scanning for fast initiation with isHighPowerAllowed=%s", Boolean.valueOf(z));
                this.ay();
            }
            czwl czwl0 = czwl.b();
            PendingIntent pendingIntent0 = fqaw.a(this, 0, new Intent().setClassName(this, (hvod.c() ? "com.google.android.gms.nearby.sharing.main.MainActivity" : "com.google.android.gms.nearby.sharing.receive.ReceiveActivity")).addFlags(0x10000000).addFlags(0x8000), 0x44000000);
            gftb.check(pendingIntent0);
            czwl0.i(pendingIntent0);
            if(this.K.q(z, new dcbn(this))) {
                this.aD = z;
                dcvz.a.b().p("Fast Initiation Scanning has started", new Object[0]);
                return;
            }
            this.aD = false;
            return;
        }
        dcvz.a.b().p("Stopping FastInitiation scanning because visibility is hidden.", new Object[0]);
        this.ay();
    }

    public final void W() {
        this.T();
        this.V();
        this.U();
    }

    public final void X() {
        dftl dftl0;
        this.aa();
        int v = 1;
        if(!this.aF) {
            dcvz.a.b().p("Stopping scanning because the screen is locked.", new Object[0]);
            this.aX();
        }
        else if(!hvqz.g()) {
            if(this.G) {
            label_15:
                if(!this.aL()) {
                    dcvz.a.b().p("Stopping scanning because Nearby Sharing is disabled.", new Object[0]);
                    this.aX();
                }
                else if(this.aG() && (!this.bp() || !hvod.d())) {
                    dcvz.a.b().p("Stopping scanning because we are advertising in the foreground.", new Object[0]);
                    this.ba(false);
                }
                else if(!this.aH() && !this.bp() && (!this.bs(new Integer[]{((int)0)}) || !this.bn())) {
                    dcvz.a.b().p("Stopping foreground scanning because no scanning surface has been registered.", new Object[0]);
                    this.aX();
                }
                else {
                    if(this.aH()) {
                        this.ax();
                    }
                    if(!this.aL()) {
                        dcvz.a.b().p("Failed to scan because we\'re not enabled.", new Object[0]);
                    }
                    else if(!this.aF) {
                        dcvz.a.b().p("Failed to scan because the user\'s screen is locked.", new Object[0]);
                    }
                    else if(!hvqz.g()) {
                        if(this.G) {
                        label_42:
                            if(this.z().isEmpty()) {
                                dcvz.a.e().p("Failed to scan since no provider has been registered", new Object[0]);
                            }
                            else {
                                if(this.aH()) {
                                    dftl0 = dftl.c;
                                }
                                else {
                                    dftl0 = this.bp() ? dftl.b : dftl.a;
                                }
                                if(!hvqz.z()) {
                                    dftl dftl1 = dftl.a;
                                    if(dftl0 == dftl1 && (this.u != null && this.u.b == dftl1)) {
                                        dcvz.a.d().p("Don\'t start scanning because we are already scanning in the background", new Object[0]);
                                    }
                                    else if(!this.bn() && dftl0 == dftl1) {
                                        dcvz.a.b().p("Failed to scan as background scanning is not enabled and we don\'t have a scanning send surface.", new Object[0]);
                                    }
                                    else if(dftl0 != dftl.c && dftl0 != dftl.b || !this.aP() || (this.u == null || this.u.b != dftl0)) {
                                    label_69:
                                        int v1 = this.at == -1 ? this.j() : this.at;
                                        dfsp dfsp0 = new dfsp();
                                        dfsp0.a = v1;
                                        dcoy dcoy0 = new dcoy();
                                        dcoy0.b(this.k(), (this.aH() ? SystemClock.elapsedRealtime() : -1L));
                                        dfsp0.b = dcoy0.a();
                                        dfsp0.f = dftl0;
                                        if(this.aH()) {
                                            int v2 = 0;
                                            for(Object object0: this.q.e()) {
                                                dcht dcht0 = (dcht)object0;
                                                if(dcht0.b == 1) {
                                                    v2 = dcht0.c;
                                                    break;
                                                }
                                            }
                                            dfsp0.i = v2;
                                        }
                                        cuur cuur0 = this.aA;
                                        cuuq cuuq0 = this.aB;
                                        if(cuur0 != null && cuuq0 != null && this.aU()) {
                                            byte[] arr_b = cuuq0.e();
                                            dfsp0.c = cuur0.c;
                                            dfsp0.d = cuur0.d;
                                            dfsp0.g = arr_b;
                                        }
                                        dfsp0.h = this.aH();
                                        dfsq dfsq0 = dfsp0.a();
                                        this.a.v(this.o());
                                        ddln ddln0 = this.F;
                                        dccr dccr0 = new dccr(this);
                                        dbzq dbzq0 = new dbzq();
                                        int v3 = (int)hvqs.a.aT().bA();
                                        ddln0.h = dccr0;
                                        ddln0.g = dbzq0;
                                        ddln0.e = v3;
                                        ddln0.f = (int)Math.max(hvqs.aj(), v3 + v3);
                                        dccq dccq0 = new dccq(this);
                                        if(this.v == null) {
                                            gged_interceptors gged0 = this.z();
                                            int v4 = gged0.size();
                                            for(int v5 = 0; v5 < v4; ++v5) {
                                                dftm dftm0 = (dftm)gged0.get(v5);
                                                if(this.aP()) {
                                                    dftm0.G(dfsq0);
                                                }
                                                else {
                                                    dftm0.z(dccq0, dfsq0);
                                                }
                                            }
                                        }
                                        else {
                                            dfsp dfsp1 = dfsq0.a();
                                            dfsp1.f = dftl.e;
                                            dfsq dfsq1 = dfsp1.a();
                                            gged_interceptors gged1 = this.z();
                                            int v6 = gged1.size();
                                            for(int v7 = 0; v7 < v6; ++v7) {
                                                dftm dftm1 = (dftm)gged1.get(v7);
                                                if(dftm1 == this.v) {
                                                    if(this.aP()) {
                                                        dftm1.G(dfsq0);
                                                    }
                                                    else {
                                                        dftm1.z(dccq0, dfsq0);
                                                    }
                                                }
                                                else if(this.aP()) {
                                                    dftm1.G(dfsq1);
                                                }
                                                else {
                                                    dftm1.z(dccq0, dfsq1);
                                                }
                                            }
                                        }
                                        this.u = new dchq(dfsq0, dftl0, this.v);
                                        cunf cunf0 = dcvz.a.b();
                                        dchq dchq0 = this.u;
                                        batl.s(dchq0);
                                        cunf0.h("Scanning has started in the %s", dchq0.b);
                                        this.X();
                                        if(hvqz.z()) {
                                            this.W();
                                        }
                                        this.O();
                                    }
                                    else if(this.k() == (this.aP() ? this.u.a.b.a : -1)) {
                                        dcvz.a.d().p("Failed to scan because we\'re currently scanning.", new Object[0]);
                                    }
                                    else {
                                        dcvz.a.b().h("The scan mode is changing. Invalidating the receive surface as advertising behavior may change depending on the new scan mode %s.", dftl0);
                                        this.W();
                                        goto label_69;
                                    }
                                }
                                else if(this.u != null && this.u.b == dftl0 && this.u.c == this.v) {
                                    dcvz.a.d().p("Don\'t start scanning because we are already scanning in the correct mode.", new Object[0]);
                                }
                                else if(!this.bn() && dftl0 == dftl.a) {
                                    dcvz.a.b().p("Failed to scan as background scanning is not enabled and we don\'t have a scanning send surface.", new Object[0]);
                                }
                                else {
                                    goto label_69;
                                }
                            }
                        }
                        else {
                            dcvz.a.b().p("Failed to scan because Bluetooth is off.", new Object[0]);
                        }
                    }
                    else if(!this.G && !this.K.j()) {
                        dcvz.a.b().p("Failed to scan because Bluetooth is off.", new Object[0]);
                    }
                    else {
                        goto label_42;
                    }
                }
            }
            else {
                dcvz.a.b().p("Stopping scanning because Bluetooth is disabled.", new Object[0]);
                this.aX();
            }
        }
        else if(!this.G && !this.K.j()) {
            dcvz.a.b().p("Stopping scanning because Bluetooth is disabled.", new Object[0]);
            this.aX();
        }
        else {
            goto label_15;
        }
        if(this.K == null) {
            dcvz.a.b().p("Failed to invalidate Fast Init advertisement since fastInitiation is null.", new Object[0]);
            return;
        }
        if(!ModuleInitializer.a(this)) {
            if(this.K.i()) {
                this.K.g();
            }
            dcvz.a.a().p("Cannot advertise for Fast Init, because Nearby Share is not available.", new Object[0]);
            return;
        }
        if(!this.G) {
            this.K.g();
            dcvz.a.b().p("Stopping Fast Init advertisement because Bluetooth is off.", new Object[0]);
            return;
        }
        if(!this.bu() && !this.bv()) {
            this.K.g();
            dcvz.a.b().p("Stopping Fast Init advertisement because we\'re not scanning in the foreground.", new Object[0]);
            return;
        }
        ddli ddli0 = this.K;
        if(!hvqz.a.b().aJ() && this.bs(new Integer[]{((int)1), ((int)5)})) {
            v = 0;
        }
        if(ddli0.l(v, this.aA, this.aB)) {
            dcpn dcpn0 = this.P;
            Intent intent0 = this.X;
            long v8 = this.P.c();
            gyqv gyqv0 = dcpt.w(this.N, this.B(), intent0, v8, 0L, this.aC);
            ProtoLiteBuilder hftp0 = dcpt.L(10);
            gyrv gyrv0 = gyrv.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gysp gysp0 = (gysp)hftp0.b_message;
            gyrv0.getClass();
            gysp0.m = gyrv0;
            gysp0.b |= 0x400;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gysp gysp1 = (gysp)hftp0.b_message;
            gyqv0.getClass();
            gysp1.Y = gyqv0;
            gysp1.c |= 0x800000;
            dcpn0.i(new dcov(((gysp)hftp0.N_build())));
        }
        dcvz.a.b().p("Starting Fast Init advertisement because we\'re currently scanning/connecting.", new Object[0]);
    }

    public final void Y() {
        if(this.aL()) {
            this.bm();
            SharingSyncChimeraService.d(this.N);
            long v = hvqs.a.aT().bL();
            SharingSyncChimeraService.e(this.N, v);
            return;
        }
        if(this.by()) {
            this.bm();
            SharingSyncChimeraService.d(this.N);
            long v1 = hvqs.a.aT().cj();
            SharingSyncChimeraService.e(this.N, v1);
        }
    }

    // Detected as a lambda impl.
    public final void Z() {
        this.X();
        this.W();
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        if(ModuleInitializer.a(this)) {
            Bundle bundle0 = getServiceRequest0.i;
            int v = bundle0.getInt("vendor_id", 0);
            int v1 = bundle0.getInt("vendor_flags", 0);
            if(v != 0) {
                this.aj(new dcac(this, v));
            }
            String s = getServiceRequest0.f;
            switch(dizt.a(this, s) - 1) {
                case 1: {
                    cjtn0.c(new dchp(this, s, v, v1, getServiceRequest0.p));
                    dcvz.a.b().i("A new client has bound to the NearbySharingService ClientBridge for calling package %s and PID %s", s, Integer.valueOf(Binder.getCallingPid()));
                    return;
                }
                case 2: {
                    cjtn0.c(new dchp(this, s, v, v1, getServiceRequest0.p));
                    dcvz.a.b().h("A new client has bound to the NearbySharingService ClientBridge for calling package %s", s);
                    return;
                }
                case 3: {
                    cjtn0.c(new dchr(this, s, v, v1, getServiceRequest0.p));
                    dcvz.a.b().h("A new client has bound to the NearbySharingService ExternalClientBridge for calling package %s", s);
                    return;
                }
                default: {
                    cjtn0.a(0x8AB9, null);
                    dcvz.a.b().h("A new client failed to bind to the NearbySharingService for calling package %s", s);
                    return;
                }
            }
        }
        dcvz.a.b().p("Nearby sharing service is disabled.  Get service returning error.", new Object[0]);
        cjtn0.a(13, null);
    }

    public final void aA() {
        if(!this.aE()) {
            dcvz.a.b().p("Not allowed to auto turn on device settings.", new Object[0]);
            return;
        }
        if(!this.aG() && !this.aH() && !this.aF()) {
            dcvz.a.b().p("Don\'t turn on the device settings without foreground surface.", new Object[0]);
            return;
        }
        Context context0 = this.N;
        if(djbz.g(context0)) {
            return;
        }
        ArraySet arraySet0 = new ArraySet();
        if(!djbw.h(context0) && !djbz.h(context0)) {
            evql evql0 = djbz.c(context0);
            evql0.b(new dizx(context0));
            evql0.A(new dizy());
            arraySet0.add(evql0);
        }
        if(!dizr.g(context0)) {
            evql evql1 = dizr.c(context0);
            evql1.b(new dizz(context0));
            evql1.A(new djaa());
            arraySet0.add(evql1);
        }
        cuuc.c("turnOnDeviceSettings", evrg.e(arraySet0), hvqs.r());
    }

    public final void aB(boolean z) {
        synchronized(this) {
            if(this.aI != z) {
                if(z) {
                    this.aJ = false;
                    dcbh dcbh0 = () -> synchronized(this) {
                        if(!this.aI) {
                            return;
                        }
                        dcvz.a.b().p("2.4GHz Wi-Fi connection warming up ended", new Object[0]);
                        this.aJ = true;
                        this.Z();
                    };
                    long v = hvqs.a.aT().cG();
                    this.H = cumn.d(dcvz.a, dcbh0, v, this.aK);
                }
                else {
                    cumn cumn0 = this.H;
                    if(cumn0 != null) {
                        cumn0.b();
                    }
                }
                this.aI = z;
                dcvz.a.b().i("%s 2.4GHz Wi-Fi connection and %s warming up period", (z ? "Has" : "Without"), (this.aJ ? "out of" : "in"));
                this.Z();
            }
        }
    }

    public final void aC() {
        if(cumz.j(this) && djbw.i(this)) {
            try {
                TileService.requestListeningState(this.getApplicationContext(), new ComponentName("com.google.android.gms", "com.google.android.gms.nearby.sharing.SharingTileService"));
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                dcvz.a.e().f(illegalArgumentException0).p("Failed to update quick setting tile.", new Object[0]);
            }
            catch(SecurityException securityException0) {
                dcvz.a.e().f(securityException0).p("Failed to update quick setting tile.", new Object[0]);
            }
            this.aj(() -> {
                for(Object object0: this.r) {
                    ((dcng)object0).a();
                }
                cutr.e(this, "com.google.android.gms.nearby.sharing.STATE_CHANGED");
                cunf cunf0 = dcvz.a;
                cunf0.b().p("Broadcasting NearbySharing state change.", new Object[0]);
                if(hvqz.w()) {
                    ((BackupManager)this.bl.mr()).dataChanged();
                    cunf0.b().p("Notified backup manager of data change.", new Object[0]);
                }
            });
        }
    }

    public final void aD() {
        dcpn dcpn0 = this.P;
        Intent intent0 = this.X;
        long v = this.P.c();
        Context context0 = this.N;
        gyqv gyqv0 = dcpt.w(context0, this.B(), intent0, v, 0L, this.aC);
        if(!hvqz.ab()) {
            return;
        }
        dcpn0.k(new dcpj(context0, gyqv0));
    }

    public final boolean aE() {
        return ((dfsk)this.d.get()).P(this.v());
    }

    public final boolean aF() {
        return this.br(new Integer[]{((int)3)});
    }

    public final boolean aG() {
        return this.br(new Integer[]{((int)1)});
    }

    public final boolean aH() {
        return this.bs(new Integer[]{((int)1), ((int)3), ((int)5), ((int)6)});
    }

    public final boolean aI() {
        return !this.q.l();
    }

    public final boolean aJ() {
        return this.w != null;
    }

    public final boolean aK(Account account0, int v) {
        return hvqs.bg() ? ((dfsk)this.d.get()).V(account0, v) : false;
    }

    public final boolean aL() {
        if(hvqz.r()) {
            return true;
        }
        if(!hvqs.bg()) {
            dcvz.a.a().p("Nearby Share is disabled, because Nearby Share is not enabled.", new Object[0]);
            return false;
        }
        if(!ModuleInitializer.a(this)) {
            dcvz.a.a().p("Nearby Share is disabled, because Nearby Share is not available.", new Object[0]);
            return false;
        }
        return cjpd.i(((cjpc)this.al.get()), "enabled", false);
    }

    public final boolean aM() {
        return ((dfsk)this.d.get()).Y();
    }

    public final boolean aN() {
        return ((dfsk)this.d.get()).Z();
    }

    public final boolean aO() {
        return ((Boolean)this.ao.mr()).booleanValue() ? gggq.d(this.U.e(), new dcbm()).iterator().hasNext() : this.av;
    }

    public final boolean aP() {
        return this.u != null;
    }

    public final boolean aQ() {
        return this.K.k();
    }

    public final boolean aR() {
        return ((Boolean)this.ao.mr()).booleanValue() ? gggq.d(this.T.e(), new dcat()).iterator().hasNext() : this.aw;
    }

    public final boolean aS(ShareTarget shareTarget0) {
        return shareTarget0.f ? this.U.k(Long.valueOf(shareTarget0.a)) : this.T.k(Long.valueOf(shareTarget0.a));
    }

    public final boolean aT() {
        return ((Boolean)this.ao.mr()).booleanValue() ? this.aR() || this.aO() : this.au;
    }

    public final boolean aU() {
        if(!hvqz.a.b().at()) {
            dcvz.a.b().p("Uwb feature is off.", new Object[0]);
            return false;
        }
        if(djbz.g(this)) {
            dcvz.a.b().p("Uwb is unavailable in airplane mode", new Object[0]);
            return false;
        }
        if(!this.aF) {
            dcvz.a.b().p("Disabling Uwb when the screen is locked to save on battery power", new Object[0]);
            return false;
        }
        return this.be().j();
    }

    public final void aV() {
        if(!ModuleInitializer.a(this)) {
            dcvz.a.a().p("Cannot invalidate default opt in state, because Nearby Share is not available.", new Object[0]);
            return;
        }
        if(!djat.c(this.N)) {
            if(!dizg.n(this)) {
                dcvz.a.b().p("Not qualified for default opt-in. Multiple accounts are found.", new Object[0]);
                goto label_21;
            }
            else if(!cumz.j(this)) {
                dcvz.a.b().p("Not qualified for default opt-in. Not running in the primary profile.", new Object[0]);
                goto label_21;
            }
            else if(((dfsk)this.d.get()).b() <= 1) {
                int v = this.a.e(this.v());
                ((dfsk)this.d.get()).F(v);
                if(v <= 1) {
                    dcvz.a.b().p("Not qualified for default opt-in. This account does not have multiple devices.", new Object[0]);
                    goto label_21;
                }
                goto label_16;
            }
            else {
            label_16:
                if(djat.c(this)) {
                    dcvz.a.b().p("Not qualified for default opt-in. Already explicitly opted in.", new Object[0]);
                    goto label_21;
                }
                else if(this.bw()) {
                    cunf cunf0 = dcvz.a;
                    cunf0.b().p("Eligible for default opt-in.", new Object[0]);
                    int v1 = 4;
                    if(hvqz.r()) {
                        if(cjpd.i(((cjpc)this.al.get()), "enabled", false)) {
                            dcpu dcpu0 = new dcpu();
                            dcpu0.b = 1;
                            dcpu0.a = 5;
                            this.Q(new dcpv(dcpu0));
                            cunf0.b().p("NearbySharing was default opted in", new Object[0]);
                            return;
                        }
                        cunf0.b().p("Enabling Nearby Share, because it\'s qualified for default opted in.", new Object[0]);
                        dfsk dfsk0 = (dfsk)this.d.get();
                        if(hvqz.ai()) {
                            v1 = 1;
                        }
                        dfsk0.z(v1, 0L);
                        this.t(true);
                        this.P.i(dcpt.r());
                        return;
                    }
                    if(!this.aL() && !((dfsk)this.d.get()).R()) {
                        cunf0.b().p("Enabling Nearby Share, because it\'s qualified for default opted in.", new Object[0]);
                        dfsk dfsk1 = (dfsk)this.d.get();
                        if(hvqz.ai()) {
                            v1 = 1;
                        }
                        dfsk1.z(v1, 0L);
                        this.t(true);
                        this.P.i(dcpt.r());
                        return;
                    }
                    if(this.aL()) {
                        dcpu dcpu1 = new dcpu();
                        dcpu1.b = 1;
                        dcpu1.a = 5;
                        this.Q(new dcpv(dcpu1));
                        cunf0.b().p("NearbySharing was default opted in", new Object[0]);
                    }
                }
                else {
                    dcvz.a.b().p("Not qualified for default opt-in. Device is still in setup wizard.", new Object[0]);
                label_21:
                    if(this.aL()) {
                        dcvz.a.b().p("Disabling Nearby Share because it\'s not qualified for default opted in and the user has not manually opted in.", new Object[0]);
                        this.t(false);
                        ((dfsk)this.d.get()).t();
                        ((dfsk)this.d.get()).z(0, 0L);
                    }
                }
            }
        }
    }

    public static final boolean aW(int v, int v1) {
        switch(v) {
            case 1: {
                switch(v1) {
                    case 9: {
                        return true;
                    }
                    case 12: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 3: {
                return v1 == 9;
            }
            default: {
                return false;
            }
        }
    }

    public final void aX() {
        this.ba(true);
    }

    public final void aY(dcnp dcnp0) {
        gful_cronetEngineProvider gful0 = this.ao;
        dchs dchs0 = null;
        if(!((Boolean)gful0.mr()).booleanValue() && this.aG() && (this.R != null && ((TransferMetadata)this.R.b).e)) {
            this.R = null;
        }
        this.br(new Integer[]{((int)2)});
        cumy cumy0 = this.p;
        if(cumy0.k(dcnp0)) {
            dchs0 = (dchs)cumy0.b(dcnp0);
        }
        if(dchs0 != null && dchs0.a == 1 && !this.aG()) {
            this.as(this.o());
            if(((Boolean)gful0.mr()).booleanValue()) {
                gged_interceptors gged0 = gged_interceptors.i(this.U.e());
                int v = gged0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    dikd dikd0 = (dikd)gged0.get(v1);
                    for(Object object0: this.bi(new Integer[]{((int)0)})) {
                        dcvz.a.b().h("Reporting in progress share target %s when unregistering receive surface", dikd0.a.b);
                        dcnn dcnn0 = dikd0.b.a();
                        dcnn0.d();
                        TransferMetadata transferMetadata0 = dcnn0.a();
                        ((dcnp)object0).e(dikd0.a, transferMetadata0);
                    }
                }
            }
            else {
                kau kau0 = this.R;
                if(kau0 != null) {
                    ShareTarget shareTarget0 = (ShareTarget)kau0.a;
                    TransferMetadata transferMetadata1 = (TransferMetadata)kau0.b;
                    for(Object object1: this.bi(new Integer[]{((int)0)})) {
                        ((dcnp)object1).e(shareTarget0, transferMetadata1);
                    }
                }
            }
        }
        this.M();
        if(dchs0 != null && dchs0.a == 2) {
            this.br(new Integer[]{((int)2)});
        }
        dcvz.a.b().h("A ReceiveSurface(%s) has been unregistered", NearbySharingChimeraService.G((dchs0 == null ? -1 : dchs0.a)));
        this.ak(() -> {
            this.X();
            this.W();
        }, hvqs.ax());
        this.N();
    }

    public static int aZ(Context context0, Account account0) {
        dbvd dbvd0;
        if(hvqz.i()) {
            try {
                Map map0 = (Map)((glyq)djbh.b(context0)).v(hvqs.ag(), TimeUnit.MILLISECONDS);
                if(map0.isEmpty()) {
                    return 2;
                }
                if(account0 == null) {
                    return 3;
                }
                dbvd0 = (dbvd)map0.get(account0.name);
            }
            catch(ExecutionException | AssertionError | TimeoutException throwable0) {
                dcvz.a.e().f(throwable0).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
                return 1;
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                dcvz.a.e().f(interruptedException0).p("getIdentityVerification: failed to read cached reachable phone numbers.", new Object[0]);
                return 1;
            }
            if(dbvd0 != null) {
                return dbvd0.c.isEmpty() ? 3 : 4;
            }
            return 3;
        }
        return 1;
    }

    public final void aa() {
        Integer integer0 = null;
        if(!this.aF) {
            this.aA = null;
            this.aB = null;
            return;
        }
        if(this.aU() && this.aB == null) {
            this.aB = cuuq.c();
            dcvz.a.b().h("Acquired UWB ranging address: %s", this.aB);
            this.aA = this.be().b();
            cunf cunf0 = dcvz.a.b();
            Integer integer1 = this.aA == null ? null : ((int)this.aA.c);
            cuur cuur0 = this.aA;
            if(cuur0 != null) {
                integer0 = (int)cuur0.d;
            }
            cunf0.i("Acquired best-available UWB complex channel: (%s, %s)", integer1, integer0);
        }
    }

    public final void ab(ShareTarget shareTarget0) {
        if(shareTarget0.f) {
            cumy cumy0 = this.U;
            Long long0 = (long)shareTarget0.a;
            if(cumy0.k(long0)) {
                dikd dikd0 = (dikd)cumy0.a(long0);
                if(dikd0 != null) {
                    TransferMetadata transferMetadata0 = dikd0.b;
                    if(transferMetadata0.e) {
                        cumy0.b(long0);
                        return;
                    }
                    cumy0.j(long0, new dikd(dikd0.a, transferMetadata0, false));
                }
            }
        }
        else {
            cumy cumy1 = this.T;
            Long long1 = (long)shareTarget0.a;
            if(cumy1.k(long1)) {
                dikd dikd1 = (dikd)cumy1.a(long1);
                if(dikd1 != null) {
                    TransferMetadata transferMetadata1 = dikd1.b;
                    if(transferMetadata1.e) {
                        cumy1.b(long1);
                        return;
                    }
                    cumy1.j(long1, new dikd(dikd1.a, transferMetadata1, false));
                }
            }
        }
    }

    public static void ac(String s, String s1, azxs azxs0, Callable callable0) {
        String s2;
        int v = 13;
        if(hvqs.bg()) {
            try {
                v = (int)(((Integer)callable0.call()));
            }
            catch(Exception exception0) {
                dcvz.a.e().f(exception0).i("Exception while executing NearbySharingService call %s for calling package %s.", s1, s);
            }
        }
        Status status0 = new Status(v);
        if(!status0.e()) {
            cunf cunf0 = dcvz.a.e();
            switch(v) {
                case 35500: {
                    s2 = "STATUS_ALREADY_IN_DESIRED_STATE";
                    break;
                }
                case 35501: {
                    s2 = "STATUS_DISABLED";
                    break;
                }
                case 35502: {
                    s2 = "STATUS_ALREADY_STOPPED";
                    break;
                }
                case 0x8AAF: {
                    s2 = "STATUS_RESET";
                    break;
                }
                case 0x8AB0: {
                    s2 = "STATUS_AT_MOST_ONE_FOREGROUND_RECEIVE_SURFACE_ALLOWED";
                    break;
                }
                case 35505: {
                    s2 = "STATUS_ACCOUNT_NOT_LOGGED_IN";
                    break;
                }
                case 35506: {
                    s2 = "STATUS_DISK_IO_ERROR";
                    break;
                }
                case 35507: {
                    s2 = "STATUS_CONTACT_ALREADY_EXISTS";
                    break;
                }
                case 35508: {
                    s2 = "STATUS_CONTACT_DOES_NOT_EXIST";
                    break;
                }
                case 35509: {
                    s2 = "STATUS_ACTIVITY_NOT_FOUND";
                    break;
                }
                case 35510: {
                    s2 = "STATUS_NETWORK_IO_ERROR";
                    break;
                }
                case 0x8AB7: {
                    s2 = "STATUS_OUT_OF_ORDER_API_CALL";
                    break;
                }
                case 0x8AB8: {
                    s2 = "STATUS_AT_MOST_ONE_FOREGROUND_SEND_SURFACE_ALLOWED";
                    break;
                }
                case 0x8AB9: {
                    s2 = "STATUS_ACCESS_DENIED";
                    break;
                }
                case 0x8ABA: {
                    s2 = "STATUS_MEDIA_UNAVAILABLE";
                    break;
                }
                case 0x8ABB: {
                    s2 = "STATUS_TRANSFER_ALREADY_IN_PROGRESS";
                    break;
                }
                case 0x8ABC: {
                    s2 = "STATUS_API_NOT_SUPPORTED";
                    break;
                }
                case 0x8ABD: {
                    s2 = "STATUS_INTENT_IS_NULL";
                    break;
                }
                case 0x8ABE: {
                    s2 = "STATUS_QR_CODE_RECEIVE_NOT_ALLOWED";
                    break;
                }
                default: {
                    s2 = aztk.d(v);
                }
            }
            cunf0.j("NearbySharingService call %s returned nonzero status code for calling package %s: %s", s1, s, s2);
        }
        try {
            azxs0.a(status0);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed to invoke IStatusCallback.", new Object[0]);
        }
    }

    public final void ad(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        if(hvqz.z()) {
            Map map0 = this.am;
            cumn cumn0 = (cumn)map0.get(shareTarget0);
            if(cumn0 != null) {
                cumn0.b();
            }
            map0.put(shareTarget0, this.bd(shareTarget0));
        }
        NearbySharingChimeraService.bB(shareTarget0, transferMetadata0);
        if(((Boolean)this.ao.mr()).booleanValue()) {
            if(transferMetadata0.m) {
                dikd dikd0 = new dikd(shareTarget0, transferMetadata0);
                curq curq0 = new curq();
                this.U.i(Long.valueOf(shareTarget0.a), dikd0, curq0);
                if(!shareTarget0.k) {
                    this.c.k(shareTarget0, "INTERNAL_PROVIDER_ID");
                }
                this.bl(true);
            }
            else if(transferMetadata0.e) {
                cumy cumy0 = this.U;
                Long long0 = (long)shareTarget0.a;
                cumy0.j(long0, new dikd(shareTarget0, transferMetadata0, this.bx(shareTarget0)));
                if(!this.bx(shareTarget0) || this.aG()) {
                    cumy0.c(long0, new curq());
                }
                this.bk();
                if(hvqz.z()) {
                    cumn cumn1 = (cumn)this.am.remove(shareTarget0);
                    if(cumn1 != null) {
                        cumn1.b();
                    }
                }
            }
            else {
                dikd dikd1 = new dikd(shareTarget0, transferMetadata0, this.bx(shareTarget0));
                this.U.j(Long.valueOf(shareTarget0.a), dikd1);
            }
            List list0 = this.bi(new Integer[]{((int)1)});
            if(list0.isEmpty()) {
                list0 = this.bi(new Integer[]{((int)0)});
            }
            for(Object object0: list0) {
                if(this.aG()) {
                    this.L.f(shareTarget0);
                }
                ((dcnp)object0).e(shareTarget0, transferMetadata0);
            }
            if(hvqz.ad()) {
                for(Object object1: this.bi(new Integer[]{((int)3)})) {
                    ((dcnp)object1).e(shareTarget0, transferMetadata0);
                }
            }
        }
        else {
            int v = transferMetadata0.a;
            if(v == 0x3F0 || v == 1009) {
                this.R = null;
            }
            else if(bbqa.c() && transferMetadata0.j == 1) {
                this.R = null;
            }
            else {
                dcnn dcnn0 = transferMetadata0.a();
                dcnn0.d();
                this.R = new kau(shareTarget0, dcnn0.a());
            }
            if(transferMetadata0.e || v == 0x3FD) {
                if(hvqz.z()) {
                    cumn cumn2 = (cumn)this.am.remove(shareTarget0);
                    if(cumn2 != null) {
                        cumn2.b();
                    }
                }
                this.bk();
            }
            else if(v == 1002 || (shareTarget0.n || shareTarget0.q) && v == 1003) {
                if(!shareTarget0.k) {
                    this.c.k(shareTarget0, "INTERNAL_PROVIDER_ID");
                }
                this.bl(true);
            }
            List list1 = this.bi(new Integer[]{((int)1)});
            if(list1.isEmpty()) {
                list1 = this.bi(new Integer[]{((int)0)});
            }
            for(Object object2: list1) {
                if(this.aG()) {
                    this.L.f(shareTarget0);
                }
                ((dcnp)object2).e(shareTarget0, transferMetadata0);
            }
        }
    }

    public final void ae(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        if(hvqz.z()) {
            Map map0 = this.am;
            cumn cumn0 = (cumn)map0.get(shareTarget0);
            if(cumn0 != null) {
                cumn0.b();
            }
            map0.put(shareTarget0, this.bd(shareTarget0));
        }
        if(((Boolean)this.ao.mr()).booleanValue()) {
            NearbySharingChimeraService.bB(shareTarget0, transferMetadata0);
            if(transferMetadata0.m) {
                dikd dikd0 = new dikd(shareTarget0, transferMetadata0);
                curq curq0 = new curq();
                this.T.i(Long.valueOf(shareTarget0.a), dikd0, curq0);
            }
            else if(transferMetadata0.e) {
                cumy cumy0 = this.T;
                Long long0 = (long)shareTarget0.a;
                cumy0.j(long0, new dikd(shareTarget0, transferMetadata0, this.bx(shareTarget0)));
                if(!this.bx(shareTarget0) || this.aH()) {
                    cumy0.c(long0, new curq());
                }
                if(!this.S.k(long0)) {
                    for(Object object0: this.q.e()) {
                        ((dcht)object0).a.c(shareTarget0);
                    }
                }
            }
            else {
                dikd dikd1 = new dikd(shareTarget0, transferMetadata0, this.bx(shareTarget0));
                this.T.j(Long.valueOf(shareTarget0.a), dikd1);
            }
            if(transferMetadata0.e) {
                this.ax = false;
                if(hvqz.z()) {
                    cumn cumn1 = (cumn)this.am.remove(shareTarget0);
                    if(cumn1 != null) {
                        cumn1.b();
                    }
                }
                if(((Boolean)this.an.mr()).booleanValue()) {
                    ((dikq)this.ae.mr()).c(shareTarget0);
                }
                this.bk();
            }
            else if(transferMetadata0.a == 1002) {
                this.ax = false;
                this.bl(false);
            }
            List list0 = this.K(new Integer[]{((int)1), ((int)3), ((int)5), ((int)6)});
            if(list0.isEmpty()) {
                list0 = this.K(new Integer[]{((int)0)});
            }
            else {
                this.L.h(((int)shareTarget0.a));
            }
            for(Object object1: list0) {
                ((dcnp)((kau)object1).a).e(shareTarget0, transferMetadata0);
            }
            return;
        }
        Map map1 = this.Q;
        if(map1 != null && !map1.containsKey(shareTarget0) && transferMetadata0.a == 1009) {
            dcvz.a.b().p("Skip the update due to not finding this shareTarget.", new Object[0]);
            return;
        }
        NearbySharingChimeraService.bB(shareTarget0, transferMetadata0);
        boolean z = transferMetadata0.e;
        if(z) {
            this.ax = false;
            if(hvqz.z()) {
                cumn cumn2 = (cumn)this.am.remove(shareTarget0);
                if(cumn2 != null) {
                    cumn2.b();
                }
            }
            if(((Boolean)this.an.mr()).booleanValue()) {
                ((dikq)this.ae.mr()).c(shareTarget0);
            }
            this.bk();
        }
        else if(transferMetadata0.a == 1002) {
            this.ax = false;
            this.bl(false);
        }
        List list1 = this.K(new Integer[]{((int)1), ((int)3), ((int)5), ((int)6)});
        if(list1.isEmpty()) {
            list1 = this.K(new Integer[]{((int)0)});
        }
        for(Object object2: list1) {
            ((dcnp)((kau)object2).a).e(shareTarget0, transferMetadata0);
        }
        if(this.aH() && z) {
            map1.remove(shareTarget0);
            return;
        }
        if(transferMetadata0.a != 0x3F8) {
            dcnn dcnn0 = transferMetadata0.a();
            dcnn0.d();
            map1.put(shareTarget0, dcnn0.a());
        }
    }

    public final void af(ShareTarget shareTarget0) {
        Iterator iterator0;
        this.c.o(shareTarget0);
        if(!((Boolean)this.ao.mr()).booleanValue()) {
            iterator0 = this.q.e().iterator();
        label_15:
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ((dcht)object0).a.c(shareTarget0);
            }
        }
        else if(this.aP()) {
            Long long0 = (long)shareTarget0.a;
            curq curq0 = new curq();
            this.S.c(long0, curq0);
            cumy cumy0 = this.T;
            if(cumy0.k(long0)) {
                dikd dikd0 = (dikd)cumy0.a(long0);
                if(dikd0 == null || dikd0.b.e) {
                    iterator0 = this.q.e().iterator();
                    goto label_15;
                }
            }
            else {
                iterator0 = this.q.e().iterator();
                goto label_15;
            }
        }
    }

    public final void ag() {
        if(this.aJ()) {
            dcvz.a.b().p("Visibility has changed. Refreshing receive surface state.", new Object[0]);
            this.ax();
        }
        if(this.aQ() && this.aL()) {
            this.ay();
        }
        this.W();
        this.aC();
        if(this.x == null) {
            this.x = cumi.e(this.N);
        }
        this.x.g("com.google.gms.nearby.sharing");
    }

    public final void ah(ShareTarget shareTarget0, int v, RangingData rangingData0) {
        for(Object object0: this.q.e()) {
            ((dcht)object0).a.b(shareTarget0, v, rangingData0);
        }
    }

    public final void ai() {
        this.t(false);
        this.aq(false);
        this.bj();
        dcii.v();
        this.a.s();
        ((dfsk)this.d.get()).r();
        cjpa cjpa0 = ((cjpc)this.al.get()).c();
        cjpa0.d();
        cjpd.g(cjpa0);
        AtomicBoolean atomicBoolean0 = djbw.a;
        boolean z = atomicBoolean0.compareAndSet(false, true);
        Context context0 = this.N;
        if(z) {
            dcvz.a.d().p("DeleteCachedImages start.", new Object[0]);
            djad.r(djbw.a(context0));
            atomicBoolean0.set(false);
            dcvz.a.d().p("DeleteCachedImages end.", new Object[0]);
        }
        else {
            dcvz.a.d().p("DeleteCachedImages failed.", new Object[0]);
        }
        djbh.j(context0);
        if(hvqz.ab()) {
            dizj.d(context0).b();
        }
        djas.e(context0, this.C(false));
        dcvz.a.b().p("Deleted all Nearby partial payloads.", new Object[0]);
        djat.a(context0, false);
        djbh.i(context0);
        this.an();
        this.aV();
        this.aq(true);
        if(hvrc.a.b().m()) {
            dcxk dcxk0 = (dcxk)this.ag.get();
            gftb.check(dcxk0);
            dcxc dcxc0 = new dcxc(new dcxb());
            ((glyq)dcxk0.a.b(dcxc0, gmap.a)).v(hvqs.ag(), TimeUnit.MILLISECONDS);
        }
        this.aj(() -> {
            for(Object object0: this.r) {
                ((dcng)object0).a();
            }
            cutr.e(this, "com.google.android.gms.nearby.sharing.STATE_CHANGED");
            cunf cunf0 = dcvz.a;
            cunf0.b().p("Broadcasting NearbySharing state change.", new Object[0]);
            if(hvqz.w()) {
                ((BackupManager)this.bl.mr()).dataChanged();
                cunf0.b().p("Notified backup manager of data change.", new Object[0]);
            }
        });
    }

    public final void aj(Runnable runnable0) {
        ScheduledExecutorService scheduledExecutorService0 = this.aL;
        if(scheduledExecutorService0 == null) {
            dcvz.a.e().p("Unable to execute task. No executor found.", new Object[0]);
            return;
        }
        scheduledExecutorService0.execute(runnable0);
    }

    public final void ak(Runnable runnable0, long v) {
        ((cuuh)this.aL).g(runnable0, v, TimeUnit.MILLISECONDS);
    }

    public final void al(dikc dikc0) {
        Intent intent0 = dikc0.b;
        if(intent0.hasExtra("referrer_package_name")) {
            dcpn dcpn0 = this.P;
            dcpn0.g = intent0.getStringExtra("referrer_package_name");
        }
        ShareTarget shareTarget0 = dikc0.a;
        shareTarget0.p();
        boolean z = true;
        if(hvrc.m()) {
            dcnn dcnn0 = new dcnn(1001);
            dcnn0.h = hvqz.z() ^ 1;
            this.ae(shareTarget0, dcnn0.a());
        }
        else if(hvqz.z()) {
            cumn cumn0 = this.bd(shareTarget0);
            this.am.put(shareTarget0, cumn0);
        }
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(hvqz.z());
        Duration duration0 = null;
        gfug gfug0 = hvqz.a.b().q() ? gfug.c(this.aj) : null;
        if(shareTarget0.e().isEmpty()) {
            gmcu gmcu0 = new gmcu();
            this.P(shareTarget0, intent0, new dccs(this, atomicBoolean0, shareTarget0, gmcu0, dikc0));
            if(cuuc.a("downloadAttachments", gmcu0) != 0) {
                dcvz.a.e().p("Failed to send file to remote ShareTarget. No attachment found.", new Object[0]);
                this.ae(shareTarget0, new dcnn(0x3F3).a());
                return;
            }
        }
        if(gfug0 != null) {
            gfug0.g();
            duration0 = gfug0.d();
        }
        dcpn dcpn1 = this.P;
        List list0 = shareTarget0.e();
        Intent intent1 = this.X;
        long v = this.P.c();
        gyqv gyqv0 = dcpt.w(this.N, this.B(), intent1, v, 0L, this.aC);
        ProtoLiteBuilder hftp0 = dcpt.L(5);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyqn.a).v_newBuilder();
        gyqi gyqi0 = dcpt.v(list0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyqn gyqn0 = (gyqn)hftp1.b_message;
        gyqi0.getClass();
        gyqn0.c = gyqi0;
        gyqn0.b |= 1;
        if(duration0 != null) {
            hfst hfst0 = hfyg.a(duration0);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gyqn gyqn1 = (gyqn)hftp1.b_message;
            hfst0.getClass();
            gyqn1.d = hfst0;
            gyqn1.b |= 2;
        }
        gyqn gyqn2 = (gyqn)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyqn2.getClass();
        gysp0.h = gyqn2;
        gysp0.b |= 0x20;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp1 = (gysp)hftp0.b_message;
        gyqv0.getClass();
        gysp1.Y = gyqv0;
        gysp1.c |= 0x800000;
        dcpn1.i(new dcov(((gysp)hftp0.N_build())));
        if(hvrc.h()) {
            gged_interceptors gged0 = (gged_interceptors)Collection.-EL.stream(shareTarget0.h()).map(new dbzm()).collect(ggaf.a);
            if(!Collection.-EL.stream(shareTarget0.e()).allMatch(new dbzn(gged0))) {
                this.ae(shareTarget0, new dcnn(0x3F6).a());
                return;
            }
        }
        if(intent0.hasExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE")) {
            String s = intent0.getStringExtra("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE");
            shareTarget0.e.putString("com.google.android.gms.nearby.sharing.EXTRA_REQUIRED_PACKAGE", s);
        }
        this.bl(false);
        this.ax = true;
        this.X();
        String s1 = this.c.i(shareTarget0);
        PendingIntent pendingIntent0 = shareTarget0.j;
        if(pendingIntent0 != null || hvrc.k() && shareTarget0.k) {
            if(TextUtils.isEmpty(s1)) {
                this.ae(shareTarget0, new dcnn(1007).a());
                dcvz.a.b().h("Unable to send to %s due to missing package name", shareTarget0);
                return;
            }
            for(Object object0: shareTarget0.f()) {
                Uri uri0 = ((FileAttachment)object0).d;
                if(uri0 != null) {
                    this.aa.b(s1, uri0);
                }
            }
            if(!hvrc.k() && pendingIntent0 != null) {
                try {
                    pendingIntent0.send(this, 0, intent0);
                    dcvz.a.b().j("Sent to %s by action %s for package %s", shareTarget0, pendingIntent0, s1);
                }
                catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                    dcvz.a.e().f(pendingIntent$CanceledException0).j("Failed to send to %s by action %s for package %s", shareTarget0, pendingIntent0, s1);
                    if(hvqz.ah()) {
                        return;
                    }
                }
                dcnn dcnn1 = new dcnn(0x3F7);
                if(atomicBoolean0.get() || hvrc.m()) {
                    z = false;
                }
                dcnn1.h = z;
                this.ae(shareTarget0, dcnn1.a());
                return;
            }
        }
        this.x(shareTarget0).H(this.F(), shareTarget0, new dbzo(this, atomicBoolean0), dikc0.c);
    }

    public final void am(boolean z) {
        this.G = z;
        dcvz.a.b().h("Bluetooth is %s", (z ? "enabled" : "disabled"));
        this.Z();
        this.aC();
    }

    public final void an() {
        ArrayList arrayList0 = (ArrayList)cuuc.e("getSupportedAccounts", dizg.e(this));
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            String s = cjpd.c(((cjpc)this.al.get()), "account", "");
            if(s.isEmpty()) {
                dcvz.a.e().p("Account name is empty.", new Object[0]);
            }
            int v = arrayList0.size();
            int v1 = 0;
            while(v1 < v) {
                Account account0 = (Account)arrayList0.get(v1);
                ++v1;
                if(s.equals(account0.name)) {
                    this.q(account0);
                    return;
                }
            }
            this.q(((Account)arrayList0.get(0)));
            return;
        }
        dcvz.a.e().p("No supported accounts found.", new Object[0]);
        this.q(null);
    }

    public final void ao(boolean z) {
        this.aH = z;
        dcvz.a.b().h("Location is %s", (z ? "enabled" : "disabled"));
        this.Z();
        this.aC();
    }

    public final void ap(boolean z) {
        String s = "disabled";
        if(z == this.aG) {
            cunf cunf0 = dcvz.a.d();
            if(z) {
                s = "enabled";
            }
            cunf0.h("Power Save is already %s, skipping invalidate", s);
            return;
        }
        this.aG = z;
        cunf cunf1 = dcvz.a.b();
        if(z) {
            s = "enabled";
        }
        cunf1.h("Power Save is %s", s);
        this.Z();
    }

    public final void aq(boolean z) {
        String s = "locked";
        if(z == this.aF) {
            cunf cunf0 = dcvz.a.d();
            if(z) {
                s = "unlocked";
            }
            cunf0.h("Screen is already %s, skipping invalidate", s);
            return;
        }
        this.aF = z;
        cunf cunf1 = dcvz.a.b();
        if(z) {
            s = "unlocked";
        }
        cunf1.h("Screen is %s", s);
        if(z) {
            this.aO = SystemClock.elapsedRealtime();
        }
        dizw dizw0 = this.ba;
        dcab dcab0 = new dcab(this);
        if(dizw0.a == 0L) {
            dcab0.run();
            return;
        }
        if(dizw0.b(dcab0)) {
            return;
        }
        if(dizw0.c != null && !dizw0.c.isDone()) {
            dizw0.c.cancel(false);
        }
        dizv dizv0 = new dizv(dizw0, dcab0);
        long v = dizw0.a();
        dizw0.c = ((cuuh)dizw0.b).g(dizv0, v, TimeUnit.MILLISECONDS);
    }

    public final void ar() {
        this.aQ = new NearbySharingChimeraService.19(this);
        this.aR = new NearbySharingChimeraService.20(this);
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.gms.nearby.sharing.CERTIFICATES_REGENERATION");
        cutr.b(this, this.aQ, intentFilter0);
        IntentFilter intentFilter1 = new IntentFilter();
        intentFilter1.addAction("com.google.android.gms.nearby.sharing.ACCEPT_CONSTELLATION");
        cutr.b(this, this.aR, intentFilter1);
        if(dizg.o(this, this.v())) {
            dcpu dcpu0 = new dcpu();
            dcpu0.a = 7;
            dcpu0.b = 1;
            this.az(new dcpv(dcpu0));
        }
        this.a.r();
    }

    public final void as(int v) {
        Integer integer0 = this.bg();
        if((integer0 == null || ((int)integer0) != 3) && v != 3 && ((dfsk)this.d.get()).Q(this.v())) {
            this.L.j(v);
            ((dfsk)this.d.get()).G(this.v(), false);
        }
    }

    public final void at() {
        this.a.w();
        dcvz.a.b().p("Shut down SharingProvider", new Object[0]);
    }

    public final void au(Intent intent0, ddow ddow0, int v) {
        QrCodeMetadata qrCodeMetadata0;
        if(hvqz.G()) {
            if(this.o.d()) {
                NearbySharingChimeraService.bC(ddow0, this.o.a());
                return;
            }
            this.o.b();
            qrCodeMetadata0 = this.o.a();
        }
        else {
            qrCodeMetadata0 = this.a.j();
        }
        Account account0 = this.v();
        if(hvqz.E() && account0 != null && intent0 != null) {
            dcus dcus0 = (dcus)this.b.get();
            List list0 = this.I(intent0);
            String s = this.F();
            ibuq.f(qrCodeMetadata0.a, "sharedKey");
            ibuq.f(list0, "attachments");
            ibuq.f(s, "deviceName");
            dcup dcup0 = new dcup(dcus0, list0, qrCodeMetadata0.a, account0, s, null);
            gmbu.t(icpu.e(dcus0.d, dcup0), new dccl(this, intent0, ddow0, v, qrCodeMetadata0), gmap.a);
            return;
        }
        dcvz.a.b().p("Cloud Sharing not enabled. Display QR code for P2P transfer only.", new Object[0]);
        this.av(ddow0, qrCodeMetadata0);
    }

    public final void av(ddow ddow0, QrCodeMetadata qrCodeMetadata0) {
        if(hvqz.G()) {
            try {
                QrCodeMetadata qrCodeMetadata1 = this.a.j();
                if(!qrCodeMetadata1.equals(qrCodeMetadata0)) {
                    dcvz.a.e().p("QrCodeManager refreshed. Display QR code for P2P transfer only.", new Object[0]);
                }
                NearbySharingChimeraService.bC(ddow0, qrCodeMetadata1);
            }
            catch(GeneralSecurityException | IOException exception0) {
                dcvz.a.e().f(exception0).p("Failed to invoke sharingProvider.startQrCodeSession.", new Object[0]);
            }
            return;
        }
        NearbySharingChimeraService.bC(ddow0, qrCodeMetadata0);
    }

    // Detected as a lambda impl.
    public final void aw() {
        synchronized(this) {
            if(!this.aI) {
                return;
            }
            dcvz.a.b().p("2.4GHz Wi-Fi connection warming up ended", new Object[0]);
            this.aJ = true;
            this.Z();
        }
    }

    public final void ax() {
        if(this.aJ()) {
            cumn cumn0 = this.aM;
            if(cumn0 != null) {
                cumn0.b();
                this.aM = null;
            }
            gged_interceptors gged0 = this.z();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((dftm)gged0.get(v1)).C();
            }
            this.at = -1;
            this.w = null;
            this.az.clear();
            dcvz.a.b().p("Advertising has stopped", new Object[0]);
            return;
        }
        dcvz.a.a().p("Failed to stop advertising because we weren\'t advertising.", new Object[0]);
    }

    public final void ay() {
        if(hvqz.x() && this.M) {
            this.M = false;
            boolean z = dizr.d(this.N);
            dcvz.a.b().h("BLE has %s", (z ? "successfully turned off" : "failed turned off"));
        }
        this.K.h();
        this.z = false;
        this.A = false;
        this.D.clear();
        this.aD = false;
        this.B = false;
        this.L.g();
        czwl.b().i(null);
        dcvz.a.b().p("Fast Initiation Scanning has stopped", new Object[0]);
    }

    public final void az(dcpv dcpv0) {
        if(!ModuleInitializer.a(this)) {
            dcvz.a.a().p("Cannot sync, because Nearby Share is not available.", new Object[0]);
            return;
        }
        this.a.E(dcpv0);
        Account account0 = this.v();
        long v = System.currentTimeMillis();
        if(account0 != null) {
            dbws dbws0 = dizg.b(this, account0);
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dbws0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)dbws0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            dbws dbws1 = (dbws)hftp0.b_message;
            dbws1.b |= 0x80;
            dbws1.k = v;
            dizg.p(this, account0, ((dbws)hftp0.N_build()));
        }
        Context context0 = this.N;
        if(djat.c(context0)) {
            Account account1 = ((dfsk)this.d.get()).c();
            if(account1 == null) {
                this.u(0);
            }
            else {
                ddki.a(context0).d(account1).b(new dcbc(this));
            }
        }
        this.P.o(12);
        this.P.o(23);
    }

    private static final int bA(int v) {
        int v1 = 2;
        if(v != 0) {
            switch(v) {
                case 1: {
                    return 3;
                }
                case 2: {
                    break;
                }
                default: {
                    v1 = 4;
                    switch(v) {
                        case 3: {
                            break;
                        }
                        case 4: {
                            return 1;
                        }
                        default: {
                            return -1;
                        }
                    }
                }
            }
            return v1;
        }
        return 0;
    }

    private static final void bB(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        if(hvqz.L() && !shareTarget0.g().isEmpty() && transferMetadata0.a != 0x3FB) {
            dcnh dcnh0 = ((StreamAttachment)shareTarget0.g().get(0)).n();
            dcnh0.d = null;
            dcnh0.b = null;
            dcnh0.c = null;
            StreamAttachment streamAttachment0 = dcnh0.a();
            shareTarget0.p();
            shareTarget0.m(streamAttachment0);
        }
    }

    private static final void bC(ddow ddow0, QrCodeMetadata qrCodeMetadata0) {
        try {
            ddow0.b(qrCodeMetadata0);
        }
        catch(RemoteException remoteException0) {
            dcvz.a.e().f(remoteException0).p("Failed on reporting QR code metadata.", new Object[0]);
        }
    }

    private static final int bD(int v, int v1) {
        return NearbySharingChimeraService.bA(v) <= NearbySharingChimeraService.bA(v1) ? v : v1;
    }

    public final void ba(boolean z) {
        if(!this.aP()) {
            dcvz.a.d().p("Failed to stop scanning because we\'re not scanning.", new Object[0]);
            return;
        }
        gged_interceptors gged0 = this.z();
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((dftm)gged0.get(v1)).D();
        }
        if(hvrc.m()) {
            if(((Boolean)this.ao.mr()).booleanValue()) {
                cumy cumy0 = this.S;
                for(Object object0: cumy0.e()) {
                    ShareTarget shareTarget0 = (ShareTarget)object0;
                    cumy cumy1 = this.T;
                    Long long0 = (long)shareTarget0.a;
                    if(cumy1.k(long0)) {
                        dikd dikd0 = (dikd)cumy1.a(long0);
                        if(dikd0 == null || dikd0.b.e) {
                            goto label_22;
                        }
                    }
                    else {
                    label_22:
                        for(Object object1: this.q.e()) {
                            ((dcht)object1).a.c(shareTarget0);
                        }
                        this.c.o(shareTarget0);
                    }
                }
                cumy0.f();
            }
            else {
                gged_interceptors gged1 = this.c.g();
                int v2 = gged1.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    ShareTarget shareTarget1 = (ShareTarget)gged1.get(v3);
                    if(!shareTarget1.f) {
                        for(Object object2: this.q.e()) {
                            ((dcht)object2).a.c(shareTarget1);
                        }
                    }
                }
            }
        }
        ddln ddln0 = this.F;
        ddln0.h = null;
        ddln0.g = null;
        ddln0.e = 100;
        ddln0.f = (int)hvqs.aj();
        ddln0.c.clear();
        gged_interceptors gged2 = gged_interceptors.i(ddln0.d.keySet());
        int v4 = gged2.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            ddln0.b(((ShareTarget)gged2.get(v5)));
        }
        this.u = null;
        gged_interceptors gged3 = this.c.g();
        int v6 = gged3.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            ShareTarget shareTarget2 = (ShareTarget)gged3.get(v7);
            if(!shareTarget2.f) {
                if(((Boolean)this.ao.mr()).booleanValue()) {
                    cumy cumy2 = this.T;
                    Long long1 = (long)shareTarget2.a;
                    if(cumy2.k(long1)) {
                        dikd dikd1 = (dikd)cumy2.a(long1);
                        if(dikd1 == null || !dikd1.b.d()) {
                            this.c.o(shareTarget2);
                        }
                    }
                    else {
                        this.c.o(shareTarget2);
                    }
                }
                else {
                    Map map0 = this.Q;
                    if(map0.containsKey(shareTarget2)) {
                        TransferMetadata transferMetadata0 = (TransferMetadata)map0.get(shareTarget2);
                        if(transferMetadata0 == null || !transferMetadata0.d()) {
                            this.c.o(shareTarget2);
                        }
                    }
                    else {
                        this.c.o(shareTarget2);
                    }
                }
            }
        }
        dcvz.a.b().p("Scanning has stopped.", new Object[0]);
        this.ak(() -> {
            this.X();
            this.W();
        }, (z ? ((long)(((int)hvqs.ax()))) : 0L));
    }

    private final cumn bd(ShareTarget shareTarget0) {
        dcad dcad0 = new dcad(this, shareTarget0);
        long v = hvqs.a.aT().co();
        return cumn.d(dcvz.a, dcad0, v, this.aK);
    }

    private final czly be() {
        if(this.bj == null) {
            this.bj = new czly(this.N);
        }
        return this.bj;
    }

    private final QrCodeMetadata bf() {
        for(Object object0: this.p.e()) {
            QrCodeMetadata qrCodeMetadata0 = ((dchs)object0).d;
            if(qrCodeMetadata0 != null) {
                return qrCodeMetadata0;
            }
        }
        return null;
    }

    private final Integer bg() {
        Integer integer0 = null;
        for(Object object0: this.p.e()) {
            Integer integer1 = ((dchs)object0).c;
            if(integer1 == null) {
            }
            else if(integer0 == null) {
                integer0 = integer1;
            }
            else {
                int v = (int)integer0;
                int v1 = (int)integer1;
                if(NearbySharingChimeraService.bA(v) <= NearbySharingChimeraService.bA(v1)) {
                    v = v1;
                }
                integer0 = v;
            }
        }
        return integer0;
    }

    private final String bh(String s) {
        CharSequence charSequence0 = new gxym(this.getResources().getInteger(0x7F0C00E9)).filter(s, 0, s.length(), new SpannedString(""), 0, 0);  // integer:sharing_max_name_length_bytes
        return charSequence0 == null ? s : charSequence0.toString();
    }

    private final List bi(Integer[] arr_integer) {
        List list0 = new ArrayList();
        ggfp ggfp0 = ggfp.H(arr_integer);
        for(Object object0: this.p.d()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(ggfp0.contains(Integer.valueOf(((dchs)map$Entry0.getValue()).a))) {
                list0.add(((dcnp)map$Entry0.getKey()));
            }
        }
        return list0;
    }

    private final void bj() {
        int v = 0;
        if(((Boolean)this.ao.mr()).booleanValue()) {
            gged_interceptors gged0 = gged_interceptors.i(this.U.e());
            int v1 = gged0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                this.c(((dikd)gged0.get(v2)).a);
            }
            gged_interceptors gged1 = gged_interceptors.i(this.T.e());
            int v3 = gged1.size();
            while(v < v3) {
                ShareTarget shareTarget0 = ((dikd)gged1.get(v)).a;
                this.c(shareTarget0);
                if(((Boolean)this.an.mr()).booleanValue()) {
                    ((dikq)this.ae.mr()).a(shareTarget0);
                    ((dikq)this.ae.mr()).c(shareTarget0);
                }
                ++v;
            }
            return;
        }
        kau kau0 = this.R;
        if(kau0 != null) {
            this.c(((ShareTarget)kau0.a));
            this.bk();
            this.R = null;
        }
        Map map0 = this.Q;
        gged_interceptors gged2 = gged_interceptors.i(map0.keySet());
        if(!gged2.isEmpty()) {
            int v4 = gged2.size();
            while(v < v4) {
                ShareTarget shareTarget1 = (ShareTarget)gged2.get(v);
                this.c(shareTarget1);
                if(((Boolean)this.an.mr()).booleanValue()) {
                    ((dikq)this.ae.mr()).a(shareTarget1);
                    ((dikq)this.ae.mr()).c(shareTarget1);
                }
                ++v;
            }
            this.bk();
            map0.clear();
        }
    }

    private final void bk() {
        this.au = false;
        this.aw = false;
        this.av = false;
        if(!this.aT()) {
            ddli ddli0 = this.K;
            if(ddli0.d != null) {
                Map map0 = ddli0.e;
                hvqs hvqs0 = hvqs.a;
                if(((long)map0.size()) <= hvqs0.aT().aD() && ddli0.a() <= 1) {
                    String s = ddli0.d;
                    if(s != null) {
                        ScheduledFuture scheduledFuture0 = (ScheduledFuture)map0.get(s);
                        if(scheduledFuture0 != null) {
                            scheduledFuture0.cancel(true);
                        }
                        ddky ddky0 = new ddky(ddli0, s);
                        long v = hvqs0.aT().aE();
                        map0.put(s, ((cuuh)ddli0.a).g(ddky0, v, TimeUnit.MILLISECONDS));
                    }
                }
            }
            this.M();
            this.y = true;
            this.ak(new dcax(this), hvqs.ax());
        }
        cutr.e(this, "com.google.android.gms.nearby.sharing.TRANSFER_FINISHED");
        dcvz.a.b().p("Broadcasting NearbySharing state change transfer finished", new Object[0]);
    }

    private final void bl(boolean z) {
        this.au = true;
        if(z) {
            this.av = true;
        }
        else {
            this.aw = true;
        }
        this.Z();
    }

    private final void bm() {
        if(!this.aE && this.aP != null) {
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("com.google.android.gms.nearby.sharing.SYNC_SERVER");
            if(this.aL() || this.by()) {
                cutr.b(this, this.aP, intentFilter0);
                this.aE = true;
            }
        }
    }

    private final boolean bn() {
        return this.aG ? false : hvqz.C();
    }

    private final boolean bo() {
        return this.aI && !this.aJ;
    }

    private final boolean bp() {
        return this.bs(new Integer[]{((int)2)});
    }

    private final boolean bq() {
        return !this.p.l();
    }

    private final boolean br(Integer[] arr_integer) {
        ggfp ggfp0 = ggfp.H(arr_integer);
        for(Object object0: this.p.e()) {
            if(ggfp0.contains(Integer.valueOf(((dchs)object0).a))) {
                return true;
            }
        }
        return false;
    }

    private final boolean bs(Integer[] arr_integer) {
        return !Collections.disjoint(new ggal(this.q.e(), new dbzp()), ggfp.H(arr_integer));
    }

    private final boolean bt() {
        hvqs.bm();
        hvqz hvqz0 = hvqz.a;
        if(hvqz0.b().G() && this.aG) {
            return false;
        }
        return !hvqz0.b().F() || cumz.j(this) ? hvqz.I() && this.v() != null : false;
    }

    private final boolean bu() {
        return ((Boolean)this.ao.mr()).booleanValue() ? gggq.d(this.T.e(), new dcbe()).iterator().hasNext() : this.ax;
    }

    private final boolean bv() {
        if(this.bn()) {
            return this.u == null ? false : this.u.b == dftl.c;
        }
        return this.aP();
    }

    private final boolean bw() {
        return Settings.Global.getInt(this.getContentResolver(), "device_provisioned", 0) == 1;
    }

    private final boolean bx(ShareTarget shareTarget0) {
        if(shareTarget0.f) {
            cumy cumy0 = this.U;
            Long long0 = (long)shareTarget0.a;
            if(cumy0.k(long0)) {
                dikd dikd0 = (dikd)cumy0.a(long0);
                return dikd0 != null && dikd0.c;
            }
        }
        else {
            cumy cumy1 = this.T;
            Long long1 = (long)shareTarget0.a;
            if(cumy1.k(long1)) {
                dikd dikd1 = (dikd)cumy1.a(long1);
                return dikd1 != null && dikd1.c;
            }
        }
        return false;
    }

    private final boolean by() {
        return dizg.n(this.N) && cumz.j(this.N) && !this.aL() && !djat.c(this.N) && ((dfsk)this.d.get()).b() < 2;
    }

    private final gmbt bz(int v) {
        return hvrc.a.b().ag() ? gmbt.h(((gmcg)Objects.requireNonNull(((gmcg)this.J.get()))).e(() -> {
            Boolean boolean0 = Boolean.valueOf(true);
            switch(v) {
                case 1: {
                    ContactFilter contactFilter0 = new ContactFilter();
                    contactFilter0.b = boolean0;
                    return this.f(contactFilter0);
                }
                case 2: {
                    ContactFilter contactFilter1 = new ContactFilter();
                    contactFilter1.a = boolean0;
                    return this.f(contactFilter1);
                }
                default: {
                    return 0;
                }
            }
        })) : gmbt.h(gmbu.i(Integer.valueOf(this.i(v))));
    }

    public final int c(ShareTarget shareTarget0) {
        if(((Boolean)this.ao.mr()).booleanValue()) {
            if(!this.aS(shareTarget0)) {
                return 0x8AB7;
            }
            this.ab(shareTarget0);
        }
        bbln bbln0 = (bbln)this.V.get(Long.valueOf(shareTarget0.a));
        if(bbln0 != null) {
            bbln0.interrupt();
            this.ae(shareTarget0, new dcnn(1009).a());
            dcvz.a.b().p("Set to CANCELLED due to client cancelling during download.", new Object[0]);
            return 0;
        }
        if(((Boolean)this.an.mr()).booleanValue()) {
            try {
                if(((Boolean)((dikq)this.ae.mr()).a(shareTarget0).get()).booleanValue()) {
                    this.ae(shareTarget0, new dcnn(1009).a());
                    return 0;
                }
            }
            catch(ExecutionException | InterruptedException exception0) {
                dcvz.a.e().f(exception0).p("Failed to cancel transfer in transfer queue.", new Object[0]);
            }
        }
        int v = this.x(shareTarget0).b(shareTarget0);
        this.R = null;
        dcvz.a.b().i("Client cancelled file with %s, result: %s", shareTarget0, Integer.valueOf(v));
        return v;
    }

    public final int d(dftl dftl0) {
        Integer integer0 = this.bg();
        if(integer0 != null) {
            return (int)integer0;
        }
        int v = this.o();
        switch(dftl0.ordinal()) {
            case 0: {
                if(v == 0) {
                    return 0;
                }
                return hvqz.z() ? v : NearbySharingChimeraService.bD(v, ((int)hvqs.a.aT().m()));
            }
            case 1: 
            case 2: {
                return v;
            }
            case 3: {
                return NearbySharingChimeraService.bD(v, ((int)hvqs.a.aT().bR()));
            }
            case 4: {
                return NearbySharingChimeraService.bD(v, ((int)hvqs.a.aT().ch()));
            }
            default: {
                throw new AssertionError("Invalid mode " + dftl0);
            }
        }
    }

    @Override  // cjtg
    public final void dump(FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        String s;
        super.dump(fileDescriptor0, printWriter0, arr_s);
        try {
            printWriter0.write("                           .@@@@@@@@@@@@@@@@@@@@@@@.\n                      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.\n                   .@@@@@@@@@                     @@@@@@@@@.\n                 @@@@@@@@                             @@@@@@@@\n               @@@@@@@                                   @@@@@@@\n             @@@@@@@                                       @@@@@@.\n            @@@@@@             @@@@@                         @@@@@@\n           @@@@@@               @@@@@@                        @@@@@@\n          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                      @@@@@@\n          .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                       @@@@@\n                               @@@@@@@                          @@@@@\n                              @@@@@        @@@@@\n          @@@@@                          @@@@@@\n          @@@@@                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.\n          @@@@@@                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n           @@@@@@                        @@@@@@               @@@@@@\n            @@@@@@                         @@@@@             @@@@@@\n             @@@@@@@                                       @@@@@@.\n               @@@@@@@                                   @@@@@@@\n                 @@@@@@@@                             @@@@@@@@\n                   .@@@@@@@@@                     @@@@@@@@@.\n                       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n                           .@@@@@@@@@@@@@@@@@@@@@@@.\n");
            printWriter0.write("\n");
            printWriter0.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.NearbySharingService"));
            printWriter0.flush();
            printWriter0.write("  Device Settings: \n");
            printWriter0.write(String.format("    Version: %s\n", hvqz.e()));
            Context context0 = this.N;
            switch(djbm.m(context0)) {
                case 1: {
                    s = "UNKNOWN_DEVICE_TYPE";
                    break;
                }
                case 2: {
                    s = "PHONE";
                    break;
                }
                case 3: {
                    s = "TABLET";
                    break;
                }
                case 4: {
                    s = "LAPTOP";
                    break;
                }
                case 5: {
                    s = "CAR";
                    break;
                }
                case 6: {
                    s = "FOLDABLE";
                    break;
                }
                default: {
                    s = "XR";
                }
            }
            printWriter0.write(String.format("    Device Type: %s\n", s));
            printWriter0.write(String.format("    Account Type: %s\n", hvqs.aU()));
            printWriter0.flush();
            printWriter0.write("  User Settings: \n");
            printWriter0.write(String.format("    Device name: %s\n", ((dfsk)this.d.get()).h(this.v())));
            printWriter0.write(String.format("    Opted In: %s\n", Boolean.valueOf(djat.c(context0))));
            printWriter0.write(String.format("    Enabled: %s\n", Boolean.valueOf(this.aL())));
            printWriter0.write(String.format("    Visibility: %s\n", djbr.t(this.o())));
            printWriter0.write(String.format("    Data Usage Preference: %s\n", this.D(this.j())));
            printWriter0.write(String.format("    Show HUN Enabled: %s\n", Boolean.valueOf(this.aM())));
            printWriter0.flush();
            printWriter0.write("  System State: \n");
            printWriter0.write(String.format("    Screen Unlocked: %s\n", Boolean.valueOf(this.aF)));
            printWriter0.write(String.format("    Airplane Mode Enabled: %s\n", Boolean.valueOf(djbz.g(this))));
            printWriter0.write(String.format("    Bluetooth Enabled: %s\n", Boolean.valueOf(this.G)));
            printWriter0.write(String.format("    BLE Enabled: %s\n", Boolean.valueOf(dizr.e(context0))));
            printWriter0.write(String.format("    WiFi Enabled: %s\n", Boolean.valueOf(djbz.h(this))));
            printWriter0.write(String.format("    Location Enabled: %s\n", Boolean.valueOf(this.aH)));
            printWriter0.write(String.format("    Battery Saver Enabled: %s\n", Boolean.valueOf(this.aG)));
            if(bbqa.c()) {
                printWriter0.write(String.format("    Low Power Standby Enabled: %s\n", Boolean.valueOf(this.O.isLowPowerStandbyEnabled())));
            }
            printWriter0.write(String.format("    Do-Not-Disturb Enabled: %s\n", Boolean.valueOf(Settings.Global.getInt(this.L.a.getContentResolver(), "zen_mode", 0) != 0)));
            printWriter0.write(String.format("    Primary Profile: %s\n", Boolean.valueOf(cumz.j(this))));
            printWriter0.write(String.format("    Setup Wizard In Progress: %s\n", Boolean.valueOf(((boolean)(this.bw() ^ 1)))));
            printWriter0.flush();
            printWriter0.write("  Internal State: \n");
            printWriter0.write(String.format("    Advertising: %s\n", Boolean.valueOf(this.aJ())));
            printWriter0.write(String.format("    Scanning: %s\n", Boolean.valueOf(this.aP())));
            printWriter0.write(String.format("    Transferring Files: %s\n", Boolean.valueOf(this.aT())));
            printWriter0.write("    Registered Receive Surfaces:\n");
            dcae dcae0 = (Object object0) -> Integer.toString(Math.abs(((short)object0.hashCode())));
            dcap dcap0 = new dcap();
            this.p.g(printWriter0, dcae0, dcap0);
            printWriter0.write("    Registered Send Surfaces:\n");
            dcba dcba0 = (Object object0) -> Integer.toString(Math.abs(((short)object0.hashCode())));
            dcbl dcbl0 = new dcbl();
            this.q.g(printWriter0, dcba0, dcbl0);
            printWriter0.write(String.format("    Fast Init Advertising: %s\n", Boolean.valueOf(this.K.i())));
            printWriter0.write(String.format("    Fast Init Scanning: %s\n", Boolean.valueOf(this.K.k())));
            printWriter0.write(String.format("    Fast Init HUN Suppressed: %s\n", Boolean.valueOf(this.L.c.b())));
            printWriter0.write(String.format("    Number of Owned Devices: %s\n", ((dfsk)this.d.get()).b()));
            kau kau0 = this.t;
            if(kau0 != null) {
                printWriter0.write(String.format("    Cached Attachments: %s\n", kau0.b));
            }
            printWriter0.flush();
            if(((Boolean)this.ao.mr()).booleanValue()) {
                printWriter0.write("  Discovered ShareTargets:\n");
                dcbr dcbr0 = new dcbr();
                dcbs dcbs0 = new dcbs();
                this.S.g(printWriter0, dcbr0, dcbs0);
                printWriter0.write("  Outgoing Transfers:\n");
                dcbt dcbt0 = new dcbt();
                dcbu dcbu0 = new dcbu();
                this.T.g(printWriter0, dcbt0, dcbu0);
                printWriter0.write("  Incoming Transfers:\n");
                dbzj dbzj0 = new dbzj();
                dbzk dbzk0 = new dbzk();
                this.U.g(printWriter0, dbzj0, dbzk0);
            }
            else {
                this.c.j(printWriter0);
            }
            if(hvqz.z()) {
                printWriter0.write("  Registered providers:\n");
                ggqk ggqk0 = this.c.e().E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    printWriter0.write(String.format("    %s | %s\n", ((dijl)object0).a, ((dijl)object0).b));
                }
            }
            if(hvqz.a.b().W()) {
                cusk.b(new bbpd(printWriter0, "  "), new Class[]{hvrb.class, hvre.class});
            }
            ddli ddli0 = this.K;
            printWriter0.write(String.format("%s\n", "com.google.android.gms.nearby.sharing.discovery.FastInitiation"));
            printWriter0.write(String.format("  Scan Mode: %s\n", ddli.c(ddli0.b)));
            printWriter0.write(String.format("  Current Advertising Fast Init Type: %s\n", ddli.b(ddli0.g)));
            printWriter0.write(String.format("  Reported BLE Metadata: %s\n", ddli0.f));
            printWriter0.write(String.format("  %s\n", "Sighted BLE Peripherals"));
            ggqj ggqj0 = ggeo.k(ddli0.c).v().om();
            while(ggqj0.hasNext()) {
                Object object1 = ggqj0.next();
                printWriter0.write(String.format("    %s -> %s\n", ((Map.Entry)object1).getKey(), ((Map.Entry)object1).getValue()));
            }
            printWriter0.flush();
            ((dfsk)this.d.get()).n(printWriter0);
            dftm dftm0 = this.a;
            if(dftm0 != null) {
                dftm0.o(printWriter0);
            }
            dcpn dcpn0 = this.P;
            if(dcpn0 != null) {
                dcwh dcwh0 = dcpn0.f.a;
                if(!dcwh0.isEmpty()) {
                    printWriter0.write("\n[Analytics Logger Dump]\n");
                    for(Object object2: dcwh0) {
                        printWriter0.write(((String)object2) + "\n");
                    }
                }
            }
            printWriter0.flush();
        }
        catch(RuntimeException runtimeException0) {
            printWriter0.write("  Dump was interrupted by a runtime error: " + runtimeException0.getMessage());
            printWriter0.flush();
        }
    }

    public final int f(ContactFilter contactFilter0) {
        return this.a.d(contactFilter0);
    }

    @Override  // lps
    public final lpg getLifecycle() {
        return this.bk.a;
    }

    // Detected as a lambda impl.
    public final int i(int v) {
        Boolean boolean0 = Boolean.valueOf(true);
        switch(v) {
            case 1: {
                ContactFilter contactFilter0 = new ContactFilter();
                contactFilter0.b = boolean0;
                return this.f(contactFilter0);
            }
            case 2: {
                ContactFilter contactFilter1 = new ContactFilter();
                contactFilter1.a = boolean0;
                return this.f(contactFilter1);
            }
            default: {
                return 0;
            }
        }
    }

    public final int j() {
        return ((dfsk)this.d.get()).a();
    }

    final int k() {
        for(int v = 0; v < 5; ++v) {
            int v1 = new int[]{1, 3, 2, 5, 6}[v];
            if(this.bs(new Integer[]{v1})) {
                return v1;
            }
        }
        return 0;
    }

    public final int o() {
        return this.w().f;
    }

    @Override  // cjtg
    public final IBinder onBind(Intent intent0) {
        this.bk.a();
        return super.onBind(intent0);
    }

    @Override  // dcil
    public final void onCreate() {
        this.bk.b();
        this.bc();
        if(!ModuleInitializer.a(this)) {
            dcvz.a.b().p("Nearby sharing service is disabled.  Do not instantiate Nearby Share", new Object[0]);
            return;
        }
        dcvz.a.b().p("NearbySharingService onCreate", new Object[0]);
        Context context0 = this.N;
        this.P = dcpn.f(context0);
        this.O = (PowerManager)this.getApplicationContext().getSystemService(PowerManager.class);
        if(!hvrc.t()) {
            this.ac = new gfur_Suppliers(QuickShareRoomDatabase.m.a(context0));
        }
        if(hvqz.z()) {
            dcor dcor0 = (dcor)this.ak.get();
            batl.s(dcor0);
            diiu diiu0 = new diiu(dcor0);
            dije dije0 = new dije(dcor0, null);
            dijt dijt0 = new dijt(dcor0.e, diiu0, dije0);
            dcor0.c.b(dijt0);
        }
        if(this.aL == null) {
            this.aL = cuui.g(new curp(hvqf.b(), hvrc.F()));
        }
        this.aj(new dcay(this));
        dcii dcii0 = dcii.d(context0);
        this.L = dcii0;
        dcii0.e();
        this.ba = new dizw(this.aL, hvqs.a.aT().bS(), TimeUnit.MILLISECONDS);
        if(ModuleInitializer.a(this)) {
            this.aT = new NearbySharingChimeraService.2(this);
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            jwe.b(this, this.aT, intentFilter0, 2);
            this.aj(new dcan(this));
            this.aS = new NearbySharingChimeraService.3(this);
            IntentFilter intentFilter1 = new IntentFilter();
            intentFilter1.addAction("android.intent.action.SCREEN_ON");
            intentFilter1.addAction("android.intent.action.SCREEN_OFF");
            intentFilter1.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter1.addAction("android.intent.action.USER_PRESENT");
            jwe.b(this, this.aS, intentFilter1, 2);
            DisplayManager displayManager0 = (DisplayManager)this.getSystemService(DisplayManager.class);
            dccz dccz0 = new dccz(this);
            this.aU = dccz0;
            displayManager0.registerDisplayListener(dccz0, new clht(Looper.getMainLooper()));
            this.aj(new dcar(this));
            NearbySharingChimeraService.5 nearbySharingChimeraService$50 = new NearbySharingChimeraService.5(this);
            this.aW = nearbySharingChimeraService$50;
            jwe.b(this, nearbySharingChimeraService$50, new IntentFilter("android.location.MODE_CHANGED"), 2);
            this.aj(new dbzt(this));
            NearbySharingChimeraService.6 nearbySharingChimeraService$60 = new NearbySharingChimeraService.6(this);
            this.aX = nearbySharingChimeraService$60;
            jwe.b(this, nearbySharingChimeraService$60, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
            this.aj(new dcao(this));
            if(hvqz.x()) {
                NearbySharingChimeraService.7 nearbySharingChimeraService$70 = new NearbySharingChimeraService.7(this);
                this.aY = nearbySharingChimeraService$70;
                jwe.b(this, nearbySharingChimeraService$70, new IntentFilter("android.bluetooth.adapter.action.BLE_STATE_CHANGED"), 2);
            }
            this.aV = new NearbySharingChimeraService.1(this);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
            intentFilter2.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
            intentFilter2.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
            jwe.c(this, this.aV, intentFilter2, "com.google.android.gms.auth.permission.GOOGLE_ACCOUNT_CHANGE", null, 2);
            NearbySharingChimeraService.10 nearbySharingChimeraService$100 = new NearbySharingChimeraService.10(this);
            this.bb = nearbySharingChimeraService$100;
            cutr.b(this, nearbySharingChimeraService$100, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_AUTO_DISMISS"));
            NearbySharingChimeraService.11 nearbySharingChimeraService$110 = new NearbySharingChimeraService.11(this);
            this.bc = nearbySharingChimeraService$110;
            jwe.b(this, nearbySharingChimeraService$110, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW"), 2);
            if(hvqz.a.b().R()) {
                NearbySharingChimeraService.12 nearbySharingChimeraService$120 = new NearbySharingChimeraService.12(this);
                this.bg = nearbySharingChimeraService$120;
                jwe.c(this, nearbySharingChimeraService$120, new IntentFilter("com.google.android.gms.nearby.CONNECTION_STATE_CHANGED"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, (hvqf.u() ? 4 : 2));
            }
            ContentResolver contentResolver0 = context0.getContentResolver();
            this.bh = new dccf(this);
            try {
                contentResolver0.registerContentObserver(Settings.Global.getUriFor("ble_scan_always_enabled"), false, this.bh);
            }
            catch(SecurityException securityException0) {
                dcvz.a.e().f(securityException0).h("Failed to register content observer for %s", Settings.Global.getUriFor("ble_scan_always_enabled"));
            }
            ContentResolver contentResolver1 = this.N.getContentResolver();
            this.bi = new dcch(this);
            try {
                contentResolver1.registerContentObserver(Settings.Global.getUriFor("device_provisioned"), false, this.bi);
            }
            catch(SecurityException securityException1) {
                dcvz.a.e().f(securityException1).h("Failed to register content observer for %s", Settings.Global.getUriFor("device_provisioned"));
            }
            this.bd = new NearbySharingChimeraService.13(this);
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("android.intent.action.AIRPLANE_MODE");
            this.registerReceiver(this.bd, intentFilter3);
            this.be = new NearbySharingChimeraService.14(this);
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            this.registerReceiver(this.be, intentFilter4);
            this.bf = new NearbySharingChimeraService.15(this);
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("android.intent.action.LOCALE_CHANGED");
            this.registerReceiver(this.bf, intentFilter5);
            this.aP = new NearbySharingChimeraService.16(this);
            if(((Boolean)this.an.mr()).booleanValue()) {
                dikq dikq0 = (dikq)this.ae.mr();
                cunf cunf0 = dcvz.a;
                cunf0.b().p("Starting TransferQueue", new Object[0]);
                if(dikq0.g != null && dikq0.g.y()) {
                    cunf0.e().p("TransferQueue actor is already running.", new Object[0]);
                }
                else {
                    dikp dikp0 = new dikp(dikq0, null);
                    dikq0.g = icbb.b(dikq0.a, null, iccm.d, dikp0, 1);
                }
            }
        }
        this.aZ = new NearbySharingChimeraService.8(this);
        IntentFilter intentFilter6 = new IntentFilter();
        intentFilter6.addAction("android.intent.action.USER_SWITCHED");
        jwe.b(this, this.aZ, intentFilter6, 2);
        this.aj(new dcau(this));
        if(hvqz.E()) {
            this.c.l(((dftm)this.b.get()), new dijl("CLOUD_SHARING_PROVIDER_ID", "com.google.android.gms"));
            dcus dcus0 = (dcus)this.b.get();
            dcus0.f = new dcaz(this);
        }
        dikt dikt0 = (dikt)this.ai.get();
        diks diks0 = new diks(dikt0, new dcbb(this), null);
        icbb.b(dikt0.a, null, null, diks0, 3);
        dcvz.a.b().p("NearbySharingService created", new Object[0]);
    }

    @Override  // cjtg
    public final void onDestroy() {
        this.bk.c();
        this.aj(new dbzx(this));
        cumn cumn0 = this.H;
        if(cumn0 != null) {
            cumn0.b();
            this.H = null;
        }
        if(hvqz.z()) {
            for(Object object0: this.am.values()) {
                ((cumn)object0).b();
            }
        }
        cuui.h(this.aL, "NearbySharingServiceExecutor");
        cuui.h(this.aK, "NearbySharingServiceExecutor.alarmExecutor");
        cuui.h(this.I, "NearbySharingServiceExecutor.downloadAttachmentsExecutor");
        Context context0 = this.N;
        cutr.g(context0, new BroadcastReceiver[]{this.aT, this.aS});
        if(this.aU != null) {
            ((DisplayManager)this.getSystemService(DisplayManager.class)).unregisterDisplayListener(this.aU);
            this.aU = null;
        }
        cutr.g(context0, new BroadcastReceiver[]{this.aW, this.aX, this.bb, this.bc, this.bg, this.aV, this.aY, this.bd, this.be, this.bf, this.aZ});
        if(this.bh != null) {
            context0.getContentResolver().unregisterContentObserver(this.bh);
        }
        if(this.bi != null) {
            context0.getContentResolver().unregisterContentObserver(this.bi);
        }
        if(this.W != null) {
            context0.getContentResolver().unregisterContentObserver(this.W);
        }
        if(this.aP != null) {
            SharingSyncChimeraService.d(context0);
            cutr.f(context0, this.aP);
            this.aE = false;
        }
        dcvz.a.b().p("NearbySharingService destroyed", new Object[0]);
        super.onDestroy();
    }

    @Override  // com.google.android.chimera.BoundService
    public final boolean onUnbind(Intent intent0) {
        return true;
    }

    public final int p(ShareTarget shareTarget0) {
        if(((Boolean)this.ao.mr()).booleanValue()) {
            this.ab(shareTarget0);
        }
        if(hvrc.a.b().U()) {
            int v = this.af.a(shareTarget0);
            dcvz.a.b().i("Client opened shareTarget %s [%d]", shareTarget0, Integer.valueOf(v));
            return v;
        }
        int v1 = this.x(shareTarget0).g(shareTarget0);
        this.R = null;
        dcvz.a.b().h("Client opened incoming file from %s", shareTarget0);
        return v1;
    }

    public final int q(Account account0) {
        if(!hvqz.a.b().k() && (this.aT() || this.bu())) {
            dcvz.a.b().p("Skipped setting account since a transfer is ongoing", new Object[0]);
            return 13;
        }
        if(Objects.equals(account0, this.v())) {
            return 35500;
        }
        if(!((dfsk)this.d.get()).aa(account0)) {
            return 13;
        }
        if(account0 == null) {
            cjpa cjpa0 = ((cjpc)this.al.get()).c();
            cjpa0.j("account");
            cjpd.g(cjpa0);
        }
        else {
            cjpa cjpa1 = ((cjpc)this.al.get()).c();
            cjpa1.h("account", account0.name);
            cjpd.g(cjpa1);
        }
        if(hvqz.E()) {
            ((dfsk)this.d.get()).s();
        }
        if(TextUtils.isEmpty(((dfsk)this.d.get()).h(account0))) {
            ((dfsk)this.d.get()).x(this.F());
        }
        this.aC();
        if(dizg.o(this, account0)) {
            dcpu dcpu0 = new dcpu();
            dcpu0.a = 16;
            dcpu0.b = 1;
            this.az(new dcpv(dcpu0));
        }
        if(this.aJ()) {
            this.ax();
            dcvz.a.b().p("Account has changed. Refreshing receive surface state.", new Object[0]);
            this.W();
        }
        if(hvrc.m()) {
            cumy cumy0 = this.S;
            for(Object object0: cumy0.e()) {
                ShareTarget shareTarget0 = (ShareTarget)object0;
                cumy cumy1 = this.T;
                Long long0 = (long)shareTarget0.a;
                if(cumy1.k(long0)) {
                    dikd dikd0 = (dikd)cumy1.a(long0);
                    if(dikd0 == null || dikd0.b.e) {
                        goto label_44;
                    }
                }
                else {
                label_44:
                    for(Object object1: this.q.e()) {
                        ((dcht)object1).a.c(shareTarget0);
                    }
                    this.c.o(shareTarget0);
                }
            }
            cumy0.f();
            gged_interceptors gged0 = this.z();
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((dftm)gged0.get(v1)).A();
                this.P.n();
                this.aD();
            }
        }
        else if(this.aP()) {
            this.aX();
            dcvz.a.b().p("Account has changed. Refreshing send surface state.", new Object[0]);
        }
        if(this.aI()) {
            dcvz.a.b().p("Account has changed. Refreshing send surface state.", new Object[0]);
            this.X();
        }
        this.P.h(this.N.getApplicationContext(), ((dfsk)this.d.get()).c());
        return 0;
    }

    public final int r(String s) {
        String s1 = s.trim();
        if(TextUtils.isEmpty(s1)) {
            dcvz.a.e().p("deviceName cannot be empty", new Object[0]);
            return 13;
        }
        int v = this.getResources().getInteger(0x7F0C00E9);  // integer:sharing_max_name_length_bytes
        Charset charset0 = NearbySharingChimeraService.aq;
        if(s1.getBytes(charset0).length > v) {
            dcvz.a.e().i("deviceName is too large. Expected at most %d bytes. Got %d bytes.", Integer.valueOf(v), Integer.valueOf(s1.getBytes(charset0).length));
            return 13;
        }
        if(hvqs.a.aT().ds() && s1.equals("code:reset")) {
            this.ai();
            dcvz.a.b().p("Reset all local Nearby Sharing state", new Object[0]);
            return 0x8AAF;
        }
        if(this.F().equals(s1)) {
            return 35500;
        }
        ((dfsk)this.d.get()).y(s1);
        Context context0 = this.N;
        if(dcww.b(context0).i() && !s1.equals(djbt.a(gfta.b(cuqu.a(context0.getContentResolver(), "device_name")), v))) {
            Settings.Global.putString(context0.getContentResolver(), "device_name", s1);
        }
        if(this.aJ()) {
            this.ax();
            dcvz.a.b().p("Device name has changed. Refreshing receive surface state.", new Object[0]);
            this.W();
        }
        this.N();
        dcvz.a.b().h("Device name set to %s", s1);
        int v1 = TextUtils.isEmpty(s1) ? 0 : s1.length();
        dcpn dcpn0 = this.P;
        ProtoLiteBuilder hftp0 = dcpt.L(46);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gyrz.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gyrz gyrz0 = (gyrz)hftp1.b_message;
        gyrz0.b |= 1;
        gyrz0.c = v1;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gyrz gyrz1 = (gyrz)hftp1.N_build();
        gyrz1.getClass();
        gysp0.R = gyrz1;
        gysp0.c |= 0x10000;
        dcpn0.i(new dcow(((gysp)hftp0.N_build())));
        return 0;
    }

    public final int s(int v, long v1, String s) {
        long v2 = v1;
        if(v != 0 && v != 1 && v != 3 && v != 4) {
            dcvz.a.e().p("Cannot set invalid device visibility.", new Object[0]);
            return 13;
        }
        int v3 = ((dfsk)this.d.get()).d(this.v()).f;
        if(v != 3 && v3 == v) {
            dcvz.a.e().p("Cannot set device visibility, since already in the desired visibility.", new Object[0]);
            return 35500;
        }
        cumn cumn0 = this.aN;
        if(cumn0 != null) {
            cumn0.b();
            this.aN = null;
        }
        ((dfsk)this.d.get()).z(v, v2);
        this.a.v(v);
        if(v2 == 0L) {
            ((dfsk)this.d.get()).H();
            v2 = 0L;
        }
        DeviceVisibility deviceVisibility0 = this.w();
        switch(deviceVisibility0.f) {
            case 1: 
            case 2: {
            label_21:
                Context context0 = this.N;
                if(!djat.d(context0)) {
                    djbh.i(context0);
                }
                break;
            }
            case 3: {
                if(deviceVisibility0.j) {
                    goto label_21;
                }
            }
        }
        cunf cunf0 = dcvz.a;
        cunf0.b().h("Visibility mode changed to %s", djbr.t(v));
        dcpn dcpn0 = this.P;
        ProtoLiteBuilder hftp0 = dcpt.L(4);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gysa.a).v_newBuilder();
        gzax gzax0 = djan.a(v3);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gysa)hftv0).d = gzax0.g;
        ((gysa)hftv0).b |= 2;
        gzax gzax1 = djan.a(v);
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gysa)hftv1).c = gzax1.g;
        ((gysa)hftv1).b |= 1;
        gyza gyza0 = dcpt.x(gfta.b(s));
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        ((gysa)hftv2).e = gyza0.n;
        ((gysa)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gysa gysa0 = (gysa)hftp1.b_message;
        gysa0.b |= 8;
        gysa0.f = v2;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gysp gysp0 = (gysp)hftp0.b_message;
        gysa gysa1 = (gysa)hftp1.N_build();
        gysa1.getClass();
        gysp0.g = gysa1;
        gysp0.b |= 16;
        dcpn0.i(new dcow(((gysp)hftp0.N_build())));
        if(v == 3 && v2 > 0L) {
            cunf0.b().h("Setting revert visibility alarm for %s millis", Long.valueOf(v2));
            dcaq dcaq0 = new dcaq(this, this.w().g, v2);
            if(!hvrc.n()) {
                v2 += -200L;
            }
            this.aN = cumn.d(cunf0, dcaq0, Math.max(0L, v2), this.aL);
        }
        this.ag();
        return 0;
    }

    public final int t(boolean z) {
        String s = "enabled";
        if(!ModuleInitializer.a(this)) {
            dcvz.a.a().p("Cannot set enable, because Nearby Share is not available.", new Object[0]);
            return 35501;
        }
        if((hvqz.r() ? cjpd.i(((cjpc)this.al.get()), "enabled", false) : this.aL()) == z) {
            return 35500;
        }
        cjpa cjpa0 = ((cjpc)this.al.get()).c();
        cjpa0.e("enabled", z);
        cjpd.g(cjpa0);
        if(!z) {
            this.bj();
            dcii.v();
            dcvz.a.b().p("Stopping scanning because nearby share is disabled.", new Object[0]);
            this.aX();
            this.ax();
            dcvz.a.b().p("Stopping advertising because nearby share is disabled.", new Object[0]);
            this.ay();
            this.at();
            cutr.f(this.N, this.aP);
            cutr.f(this.N, this.aQ);
            cutr.f(this.N, this.aR);
            SharingSyncChimeraService.d(this.N);
            this.aE = false;
            File file0 = this.C(false);
            djas.e(this.N, file0);
            ((dfsk)this.d.get()).O();
        }
        dftm dftm0 = this.y();
        this.a = dftm0;
        dftm0.v(this.o());
        djab.b(this.N);
        if(z) {
            dcii.v();
            this.ar();
            this.Y();
            dcpu dcpu0 = new dcpu();
            dcpu0.b = 1;
            dcpu0.a = 7;
            this.Q(new dcpv(dcpu0));
        }
        this.Z();
        this.aC();
        cunf cunf0 = dcvz.a.b();
        if(!z) {
            s = "disabled";
        }
        cunf0.h("NearbySharing was %s", s);
        return 0;
    }

    public final int u(int v) {
        return this.s(v, 0L, "");
    }

    public final Account v() {
        return ((dfsk)this.d.get()).c();
    }

    public final DeviceVisibility w() {
        DeviceVisibility deviceVisibility0 = ((dfsk)this.d.get()).d(this.v());
        int v = 1;
        if(djak.a(this)) {
            if(deviceVisibility0.f == 1 || deviceVisibility0.f == 2) {
                ((dfsk)this.d.get()).z(0, 0L);
                deviceVisibility0 = ((dfsk)this.d.get()).d(this.v());
            }
            if(deviceVisibility0.g == 1 || deviceVisibility0.g == 2) {
                ((dfsk)this.d.get()).z(0, 0L);
                deviceVisibility0 = ((dfsk)this.d.get()).d(this.v());
            }
        }
        if(hvqz.Y() && deviceVisibility0.f == 3 && deviceVisibility0.j) {
            dfsk dfsk0 = (dfsk)this.d.get();
            if(this.v() == null) {
                v = 0;
            }
            dfsk0.z(v, 0L);
            deviceVisibility0 = ((dfsk)this.d.get()).d(this.v());
        }
        int v1 = deviceVisibility0.f;
        if(v1 == 4) {
            if(this.v() == null) {
                ((dfsk)this.d.get()).z((deviceVisibility0.g == 4 ? ((int)hvqs.s()) : deviceVisibility0.g), 0L);
                DeviceVisibility deviceVisibility1 = ((dfsk)this.d.get()).d(this.v());
                int v2 = deviceVisibility1.f;
                if(v2 == 4) {
                    dcvz.a.e().p("missing fallback visibility for self-share with no account", new Object[0]);
                }
                else {
                    dcvz.a.b().h("Self-share visibility mode fallback to %s", djbr.t(v2));
                    this.aC();
                }
                if(hvqz.R()) {
                    ((dikt)this.ai.get()).a(v2);
                }
                return deviceVisibility1;
            }
        }
        else if(hvqz.R()) {
            ((dikt)this.ai.get()).a(v1);
        }
        return deviceVisibility0;
    }

    public final dftm x(ShareTarget shareTarget0) {
        dftm dftm0 = this.c.b(shareTarget0);
        if(dftm0 == null) {
            dcvz.a.e().h("Failed to fetch provider for %s", shareTarget0);
            return new dfue();
        }
        return dftm0;
    }

    public final dftm y() {
        dgcp dgcp0;
        NearbySharingChimeraService nearbySharingChimeraService0;
        dftm dftm1;
        cunf cunf0 = dcvz.a;
        cunf0.d().p("Initializing the SharingProvider.", new Object[0]);
        if(this.c.c("INTERNAL_PROVIDER_ID") != null) {
            if(this.aP()) {
                this.aX();
            }
            if(this.aJ()) {
                this.ax();
            }
        }
        this.c.m("INTERNAL_PROVIDER_ID");
        if(this.m == null || this.aL() && (this.m.n() || this.m.o())) {
            dfsk dfsk0 = (dfsk)this.d.get();
            this.m = new dhtl(this.N, dfsk0, this.P);
            dfsk dfsk1 = (dfsk)this.d.get();
            this.as = new dgaf(this.N, dfsk1, this.m);
            this.K = new ddli(this, this.as);
        }
        dftm dftm0 = this.c.c("INTERNAL_PROVIDER_ID");
        Context context0 = this.getApplicationContext();
        if(dftm0 == null) {
            if(hvqs.a.aT().dJ()) {
                dftm1 = new dhdg(context0);
                nearbySharingChimeraService0 = this;
            }
            else if(this.aL()) {
                if(hvrc.t()) {
                    nearbySharingChimeraService0 = this;
                    dgcp0 = new dgcp(context0, ((dfsk)this.d.get()), this.n, this.as, this.m, this.P, this.ad, nearbySharingChimeraService0, this.ah, this.o);
                }
                else {
                    nearbySharingChimeraService0 = this;
                    dgcp0 = new dgcp(context0, ((dfsk)nearbySharingChimeraService0.d.get()), nearbySharingChimeraService0.n, nearbySharingChimeraService0.as, nearbySharingChimeraService0.m, nearbySharingChimeraService0.P, nearbySharingChimeraService0.ac, nearbySharingChimeraService0, nearbySharingChimeraService0.ah, nearbySharingChimeraService0.o);
                }
                dftm1 = dgcp0;
            }
            else {
                nearbySharingChimeraService0 = this;
                cunf0.a().p("Initiated DisabledNearbySharingProvider, because Nearby Share is disabled.", new Object[0]);
                dftm1 = hvrc.a.b().q() ? new dgbm(nearbySharingChimeraService0.m) : new dfuf(context0, ((dfsk)nearbySharingChimeraService0.d.get()), nearbySharingChimeraService0.n, nearbySharingChimeraService0.as, nearbySharingChimeraService0.m, nearbySharingChimeraService0.P, nearbySharingChimeraService0.ac);
            }
            nearbySharingChimeraService0.c.l(dftm1, new dijl("INTERNAL_PROVIDER_ID", "com.google.android.gms"));
            return dftm1;
        }
        return dftm0;
    }

    public final gged_interceptors z() {
        return this.c.f();
    }
}

