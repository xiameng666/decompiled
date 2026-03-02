import android.app.usage.UsageStatsManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.Settings.Global;
import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.gms.wearable.backup.wear.BackupRollbackPhenotypeUpdateHandler.BackupRollbackReceiver;
import com.google.android.gms.wearable.backup.wear.LockscreenSetIntentListener.LockscreenSetIntentReceiver;
import com.google.android.gms.wearable.backup.wear.WearBackupOptInNotificationService;
import com.google.android.gms.wearable.consent.ConsentService.SWAADLUpdateReceiver;
import com.google.android.gms.wearable.consent.ConsentSyncTaskService;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.service.EmulatorBroadcastReceiver;
import com.google.android.gms.wearable.service.WearableServiceBase.PackageBroadcastReceiver;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ThreadLocalRandom;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

public final class ffgm extends ContextWrapper implements ffmj {
    public Set A;
    public final Object B;
    String C;
    Set D;
    public volatile ffdy E;
    public ffek F;
    public ffei G;
    public ffew H;
    public ffej I;
    public fdch J;
    public fcmj K;
    public fcuz L;
    long M;
    public final EmulatorBroadcastReceiver N;
    public final Object O;
    boolean P;
    fdxn Q;
    public ffgl R;
    public ffgj S;
    public fffy T;
    public fffw U;
    public fffv V;
    public ffgg W;
    private final ConcurrentHashMap X;
    private final Random Y;
    private ffdo Z;
    public static final Map a;
    private fcfs aa;
    private fdox ab;
    private final ffey ac;
    public static final List b;
    public static fdpl c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final ConcurrentHashMap f;
    final Set g;
    public final Object h;
    public Set i;
    public final ConcurrentHashMap j;
    public final Lock k;
    public final Condition l;
    public boolean m;
    public bblg n;
    public Handler o;
    public volatile fffp p;
    public volatile fffq q;
    public fduo r;
    public ffgc s;
    public fcei t;
    public fdri u;
    public HandlerThread v;
    public HandlerThread w;
    public ffeg x;
    public boolean y;
    public BroadcastReceiver z;

    static {
        ffgm.a = new TreeMap();
        ffgm.b = new ArrayList();
    }

    public ffgm(Context context0, ffey ffey0) {
        super(context0);
        this.X = new ConcurrentHashMap();
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new ConcurrentHashMap();
        this.g = new HashSet();
        this.h = new Object();
        this.i = null;
        this.j = new ConcurrentHashMap();
        ReentrantLock reentrantLock0 = new ReentrantLock();
        this.k = reentrantLock0;
        this.l = reentrantLock0.newCondition();
        this.m = false;
        this.Y = new Random();
        this.B = new Object();
        this.C = "";
        this.D = Collections.EMPTY_SET;
        this.N = new EmulatorBroadcastReceiver();
        this.O = new Object();
        this.ac = ffey0;
    }

    public final fdxn a() {
        synchronized(this.O) {
            if(!this.P) {
                for(Object object1: fdxu.l().b()) {
                    fdyo fdyo0 = (fdyo)object1;
                    if(this.y != fdyo0.f) {
                        fdxn fdxn0 = fdyo0.a;
                        if(!Objects.equals(fdxn0.a, "cloud") && this.Q == null) {
                            this.Q = fdxn0;
                        }
                        else {
                            continue;
                        }
                        break;
                    }
                }
                this.P = true;
            }
        }
        return this.Q;
    }

    public final ffft b(fdpl fdpl0) {
        ffft ffft0 = this.c(fdpl0.b);
        if(ffft0 == null) {
            return null;
        }
        if(!fdpl0.equals(ffft0.c)) {
            Log.w("WearableService", "Mismatched certificate: " + fdpl0);
            synchronized(this) {
                ++this.M;
            }
            return null;
        }
        return ffft0;
    }

    final ffft c(String s) {
        ffft ffft1;
        String s2;
        String s1;
        if(ffgp.k() && (s.equals("com.google.android.wearable.app.cn") || s.equals("com.google.android.wearable.app"))) {
            s1 = "com.google.android.wearable.app.cn";
            s2 = "com.google.android.wearable.app";
        }
        else {
            s1 = s;
            s2 = s1;
        }
        ffft ffft0 = (ffft)this.f.get(s2);
        if(ffft0 != null) {
            return ffft0;
        }
        Set set0 = this.g;
        synchronized(set0) {
            if(set0.contains(s1)) {
                return null;
            }
            if(ffgp.k()) {
                PackageManager packageManager0 = this.getPackageManager();
                try {
                    ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo(s1, 0x80);
                    if(applicationInfo0.metaData != null && (applicationInfo0.metaData.getInt("com.google.android.gms.version") >= 10200000 || applicationInfo0.metaData.containsKey("com.google.android.wearable.version"))) {
                        goto label_25;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    if(Log.isLoggable("WearableService", 3)) {
                        Log.d("WearableService", "Could not resolve package: " + ffmo.a(s1));
                    }
                }
                this.g.add(s1);
                return null;
            }
        }
    label_25:
        ConcurrentHashMap concurrentHashMap0 = this.f;
        synchronized(concurrentHashMap0) {
            ffft1 = (ffft)concurrentHashMap0.get(s2);
            if(ffft1 == null) {
                try {
                    fdpl fdpl0 = fdpn.a(this, s);
                    ffft ffft2 = new ffft(this, this.p, fdpl0);
                    ffft1 = ffft2;
                    concurrentHashMap0.put(s2, ffft2);
                    ffft1 = ffft2;
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    fdny.b(fdnt.a, s);
                    if(Log.isLoggable("WearableService", 2)) {
                        Log.v("WearableService", "Didn\'t find package " + ffmo.a(s1));
                    }
                }
            }
        }
        return ffft1;
    }

    public final fflv d(ffft ffft0, fdpl fdpl0, WeakReference weakReference0) {
        TelecomManager telecomManager0;
        if(Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "Creating stub for AppKey: " + fdpl0.toString() + (weakReference0 == null ? " (no stubRef)" : " (stubRef expired)"));
        }
        try {
            telecomManager0 = (TelecomManager)this.getSystemService("telecom");
        }
        catch(NoClassDefFoundError unused_ex) {
            Log.w("WearableService", "Could not get TELECOM_SERVICE in SDK " + Build.VERSION.SDK_INT);
            telecomManager0 = null;
        }
        Context context0 = this.getApplicationContext();
        PackageManager packageManager0 = this.getPackageManager();
        fdvl fdvl0 = fdvl.m();
        fdxu fdxu0 = fdxu.l();
        fdqk fdqk0 = fdqk.m();
        ffeg ffeg0 = this.x;
        felm felm0 = ffgp.f();
        fdri fdri0 = this.u;
        fdyu fdyu0 = fdyu.c();
        feah feah0 = (feah)feah.a.get();
        fcfr fcfr0 = fcfr.a();
        fdue fdue0 = ffgp.b();
        return this.y ? new fflv(context0, packageManager0, fdvl0, fdxu0, fdqk0, fdpl0, ffeg0, felm0, fdri0, fdyu0, telecomManager0, feah0, fcfr0, feeh.b, feef.b, this, fdue0, null, azql.c(this), fdmu.a(this), ffft0.b, this.E, this.F, this.I, this.G, this.Z, this.aa, ((fcfw)fcfw.a.get()), this.J, this.ab, this.K, ffgp.g, ((felr)ffgp.j.get()), ((fenf)ffgp.k.get())) : new fflv(context0, packageManager0, fdvl0, fdxu0, fdqk0, fdpl0, ffeg0, felm0, fdri0, fdyu0, telecomManager0, feah0, fcfr0, feeh.b, feef.b, this, fdue0, cumi.c(this), azql.c(this), fdmu.a(this), ffft0.b, this.E, this.F, this.I, this.G, this.Z, this.aa, ((fcfw)fcfw.a.get()), this.J, this.ab, this.K, ffgp.g, ((felr)ffgp.j.get()), ((fenf)ffgp.k.get()));
    }

    public static void f(ffmd ffmd0) {
        ffgm.b.add(ffmd0);
    }

    public static void g(String s, ffmj ffmj0) {
        WeakReference weakReference0 = new WeakReference(ffmj0);
        ffgm.a.put(s, weakReference0);
    }

    public final void h() {
        fesc fesc0;
        gmcd gmcd0;
        Context context0 = this.getApplicationContext();
        Context context1 = (Context)ffms.a.b.getAndSet(context0);
        if(context1 != null && context1 != context0) {
            Log.e("WearableService", "PackageRecordCache: appContext was already set " + context1.toString() + " -> " + context0);
        }
        fffb.f();
        if(!fffb.e(this)) {
            Log.i("WearableService", "onCreate: Wearable Services not starting. Wear is not available on this device.");
            ffff.a(this.getApplicationContext(), false);
            this.m();
            return;
        }
        if(hzwe.a.b().a()) {
            Context context2 = this.getApplicationContext();
            this.N.b = context2;
            this.N.a = new ffea(this.N);
            context2.getContentResolver().registerContentObserver(Settings.Global.getUriFor("development_settings_enabled"), false, this.N.a);
            this.N.b();
        }
        Log.i("WearableService", "onCreate: Wearable Services starting.");
        ffgp.j(this.getApplicationContext());
        this.d.set(true);
        this.F = new ffek(ffgp.b, ffgp.a);
        this.I = new ffej(this.getApplicationContext());
        try {
            ffgm.c = fdpn.a(this, "com.google.android.wearable.app");
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.w("WearableService", "Failed to create home appkey: " + packageManager$NameNotFoundException0.getMessage());
        }
        boolean z = ffgp.m();
        this.y = z;
        if(!z) {
            this.Z = new ffdo(this.getApplicationContext());
        }
        this.G = ffei.d();
        ffms ffms0 = ffms.a;
        String s = this.G.f();
        if(s != null) {
            ffms0.c.put(s, Boolean.valueOf(false));
        }
        this.E = new ffdy(((UsageStatsManager)this.getSystemService("usagestats")));
        esaa esaa0 = iaah.a.c().d() ? new esaa(this, 1, "WearableService", null, "com.google.android.wearable.app") : null;
        HandlerThread handlerThread0 = new HandlerThread("WearableServiceEventHandler", -2);
        handlerThread0.start();
        this.p = new fffp(this, handlerThread0.getLooper(), esaa0);
        HandlerThread handlerThread1 = new HandlerThread("WearableServiceLiveListener", -2);
        handlerThread1.start();
        this.q = new fffq(handlerThread1.getLooper(), esaa0);
        this.x = new ffeg();
        this.r = new ffgh(this);
        fdvl.m().D(this.r);
        this.R = new ffgl(this);
        fdyu fdyu0 = fdyu.c();
        __monitor_enter(fdyu0.h);
        fdyu0.k = this.R;
        __monitor_exit(fdyu0.h);
        this.s = new ffgc(this);
        fdxu.l().c(this.s);
        this.S = new ffgj(this);
        fdvl.m().m.add(this.S);
        this.T = new fffy(this);
        fdqk.m().j.add(this.T);
        this.U = new fffw(this);
        fcfr fcfr0 = fcfr.a();
        fcfr0.a = this.U;
        this.V = new fffv(this);
        fcfq fcfq0 = fcfq.a();
        fcfq0.a = this.V;
        fdch fdch0 = fdch.a;
        this.J = fdch0;
        if(fdch0 != null) {
            fffh fffh0 = new fffh(this);
            bblp bblp0 = new bblp(0x7FFFFFFF, 9);
            fdch0.d = bblp0;
            fdch0.o = fffh0;
            bblp0.execute(new fdbn(fdch0));
            if(hzvd.e() && ffgp.m()) {
                Log.i("wearable.ConsentsSync", "Scheduling task for consent sync");
                cljp cljp0 = cljp.a(fdch0.i);
                clkq clkq0 = new clkq();
                clkq0.t("wear_consent_opt_in_sync_tag");
                clkq0.p = true;
                clkq0.v(2);
                clkq0.w(ConsentSyncTaskService.class.getName());
                clkq0.j(clkm.h);
                cljp0.f(clkq0.a());
            }
            if(!ffgp.m() && hzyz.c()) {
                fdbo fdbo0 = new fdbo(fdch0);
                fdch0.g = fdbo0;
                if(fdch0.h == null) {
                    fdch0.h = cchj.b(fdch0.i);
                }
                fdch0.h.g(fdbo0, fdch0.c, false);
                if(Log.isLoggable("wearable.Consents", 4)) {
                    Log.i("wearable.Consents", "Registering receiver");
                }
                fdch0.j = new ConsentService.SWAADLUpdateReceiver(fdch0);
                IntentFilter intentFilter0 = new IntentFilter();
                intentFilter0.addAction("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT");
                jwe.b(fdch0.i, fdch0.j, intentFilter0, 2);
            }
        }
        this.ab = fdox.a(this.getApplicationContext());
        this.aa = fcfs.a;
        this.t = new ffge(this);
        fczt.a().a.add(this.t);
        if(!this.y) {
            Context context5 = this.getApplicationContext();
            this.K = new fcmj(fcfo.a(context5), fcly.b(context5), new fcmi(context5));
            ffgg ffgg0 = new ffgg(this);
            this.W = ffgg0;
            this.K.b.add(ffgg0);
        }
        else if(bbqa.c() && this.getPackageManager().hasSystemFeature("android.software.backup")) {
            Context context3 = this.getApplicationContext();
            fcsf fcsf0 = new fcsf(context3, fcfo.a(context3));
            fcuz fcuz0 = new fcuz(context3, fcsf0, new fcns(context3.getApplicationContext(), fcsf0, new bblp(3, 9)), new fcpw(context3, fcnm.f(context3)));
            this.L = fcuz0;
            fcuz0.b.a();
            Context context4 = fcuz0.a;
            WearBackupOptInNotificationService.a.d("scheduleTaskOnDeviceProvisioned", new Object[0]);
            fcts fcts0 = new fcts(context4);
            fcon.a.d("DeviceProvisionedObserver#runOnceDeviceProvisioned", new Object[0]);
            if(fcon.b(context4)) {
                fcts0.run();
            }
            else {
                context4.getContentResolver().registerContentObserver(Settings.Global.getUriFor("device_provisioned"), false, new fcon(context4, fcts0));
            }
            fcns.a.h("Registering receiver", new Object[0]);
            fcuz0.c.f = new BackupRollbackPhenotypeUpdateHandler.BackupRollbackReceiver(fcuz0.c);
            IntentFilter intentFilter1 = new IntentFilter();
            intentFilter1.addAction("com.google.android.gms.phenotype.COMMITTED");
            jwe.b(fcuz0.c.c, fcuz0.c.f, intentFilter1, 2);
            fcuz0.c.a();
            fcuz0.d.c = new LockscreenSetIntentListener.LockscreenSetIntentReceiver(fcuz0.d);
            LockscreenSetIntentListener.LockscreenSetIntentReceiver lockscreenSetIntentListener$LockscreenSetIntentReceiver0 = fcuz0.d.c;
            IntentFilter intentFilter2 = new IntentFilter("com.google.android.clockwork.systemui.KEYGUARD_PASSWORD_SET");
            jwe.c(fcuz0.d.a, lockscreenSetIntentListener$LockscreenSetIntentReceiver0, intentFilter2, "com.google.android.clockwork.systemui.KEYGUARD_PASSWORD_SET", null, 4);
        }
        HandlerThread handlerThread2 = new HandlerThread("ChannelManager", -2);
        this.v = handlerThread2;
        handlerThread2.start();
        fffl fffl0 = new fffl(this, new esaa(this, 1, "wearChannelApiRetransmissionQueue", null, "com.google.android.wearable.app"));
        HandlerThread handlerThread3 = new HandlerThread("ChannelRetransmissionQueue", -2);
        this.w = handlerThread3;
        handlerThread3.start();
        fdwi fdwi0 = new fdwi(new fdwe(new clht(this.w.getLooper())), new feaj(fdyu.c()), fffl0);
        ffep ffep0 = new ffep(new fffi(this));
        fffm fffm0 = new fffm(this);
        this.H = ffew.c();
        fdxu fdxu0 = fdxu.l();
        ffew ffew0 = this.H;
        clht clht0 = new clht(this.v.getLooper());
        SecureRandom secureRandom0 = new SecureRandom();
        fdri fdri0 = new fdri(fdxu0, ffew0, clht0, new ffdm(), secureRandom0, fdwi0, fffm0);
        this.u = fdri0;
        fdri0.c(feyi.a, ffep0);
        fdri fdri1 = this.u;
        if(fdri1.g.getAndSet(true)) {
            throw new IllegalStateException("Called start() twice");
        }
        fdri1.f.c(fdri1.i);
        fdyu fdyu1 = fdyu.c();
        fdyu1.l = this.u;
        this.p.postDelayed(new fffj(this), TimeUnit.MINUTES.toMillis(15L));
        ffgm.g("WearableChimeraService", this);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter3.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter3.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter3.addDataScheme("package");
        WearableServiceBase.PackageBroadcastReceiver wearableServiceBase$PackageBroadcastReceiver0 = new WearableServiceBase.PackageBroadcastReceiver(this);
        this.z = wearableServiceBase$PackageBroadcastReceiver0;
        jwe.b(this, wearableServiceBase$PackageBroadcastReceiver0, intentFilter3, 2);
        felm felm0 = ffgp.f();
        felm.a = hzuh.c();
        if(felm0.y) {
            Context context6 = felm0.b;
            int v = Settings.Global.getInt(context6.getApplicationContext().getContentResolver(), "device_supports_ble_mode_key", -1) == 1 ? 1 : 0;
            felm0.E = v;
            int v1 = v & felm.a;
            felm.a = v1;
            if(v1 == 0) {
                Settings.Global.putInt(context6.getContentResolver(), "wear_connectivity_runtime_type", 0);
            }
        }
        if(felm.a && Build.VERSION.SDK_INT >= 35) {
            felm0.q = new fekd(((BluetoothManager)felm0.b.getSystemService("bluetooth")).getAdapter(), felm0.v);
        }
        feew feew0 = felm0.l;
        boolean z1 = felm.a;
        ffmn.a("BleSupportService", "updateLocalBleSupport: %b", new Object[]{Boolean.valueOf(z1)});
        if(!z1 && !hzuh.a.b().a()) {
            ffmn.a("BleSupportService", "Not updating BLE support data item", new Object[0]);
            gmcd0 = gmbx.a;
        }
        else {
            fdun fdun0 = new fdun(feew0.e.a().a, "/ble_support");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)fexw.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            fexw fexw0 = (fexw)hftp0.b_message;
            fexw0.b |= 1;
            fexw0.c = z1;
            fdun0.e = ((fexw)hftp0.N_build()).toBytesArray();
            gmcd0 = feew0.b.o(feew0.c, fdun0);
        }
        ghma.d(gmcd0, Level.WARNING, "Failed to update local BLE server capability");
        if(felm.a) {
            feew0.d = felm0;
            feew0.b.D(feew0);
            try(Cursor cursor0 = feew0.b.c(feew0.c, feew.a)) {
                cursor0.moveToFirst();
                while(true) {
                    if(cursor0.isAfterLast()) {
                        break;
                    }
                    feew0.a(fdur.f(cursor0));
                }
            }
        }
        if(hzya.e()) {
            if(!felm0.y) {
                AtomicReference atomicReference1 = felm0.r;
                gmcg gmcg0 = ffgp.i();
                ferz ferz0 = new ferz(felm0, felm0.g, felm0.f, gmcg0);
                felm0.f.D(ferz0);
                gged_interceptors gged0 = ferz0.b();
                int v2 = ((ggna)gged0).c;
                for(int v3 = 0; v3 < v2; ++v3) {
                    fduq fduq0 = (fduq)gged0.get(v3);
                    try {
                        byte[] arr_b = fduq0.b.c();
                        hftc hftc0 = hftc.a();
                        ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)ffbf.a), arr_b, 0, arr_b.length, hftc0);
                        ProtoLiteMessage.P_makeImmutable(hftv0);
                        ffbf ffbf0 = (ffbf)hftv0;
                        if(ffbf0.b == 1) {
                            ffba ffba0 = (ffba)ffbf0.c;
                            if(hzya.a.b().b()) {
                                String s2 = fduq0.e;
                                gmbu.t(ferz0.c(ffba0, fduq0.a, s2), new fery(ferz0, s2), ferz0.a);
                            }
                            else {
                                ferz0.d(fduq0.e, ffba0);
                            }
                            continue;
                        }
                        else {
                            ffmn.f("OffloadSetupClientMgr", "The proto does not have a setup request message. Data item was %s", new Object[]{fduq0});
                        }
                        break;
                    }
                    catch(hfur unused_ex) {
                        ffmn.f("OffloadSetupClientMgr", "Could not parse existing offload setup request from the data item", new Object[0]);
                    }
                }
                atomicReference1.set(ferz0);
            }
            else if(hzya.f() && bbqa.a()) {
                String s1 = felm0.g.a().a;
                AtomicReference atomicReference0 = felm0.s;
                fdvl fdvl0 = felm0.f;
                feqm feqm0 = felm0.A;
                hzya.i();
                hzya.i();
                if(hzya.e()) {
                    double f = ThreadLocalRandom.current().nextDouble();
                    ffmn.a("OffloadSetupServerMgr", "Generated challenge=%f", new Object[]{f});
                    fesc0 = new fesc(s1, ByteBuffer.allocate(8).putDouble(f).array(), fdvl0, feqm0);
                    fesc0.a();
                    fesc0.b("OffloadSetupServerManager initialized");
                }
                else {
                    ffmn.a("OffloadSetupServerMgr", "Offload is disabled", new Object[0]);
                    fesc0 = null;
                }
                atomicReference0.set(fesc0);
            }
        }
        Handler handler0 = felm0.h;
        handler0.post(new fekn(felm0));
        ffds ffds0 = felm0.c;
        if(ffds0.h().isEmpty()) {
            fczp fczp0 = fczq.a();
            fczp0.a = felm0.d.getString("paired_bt_name", null);
            fczp0.b = felm0.d.getString("paired_bt_address", null);
            fczp0.n(felm0.d.getInt("connection_type", 0));
            fczp0.k(felm0.d.getInt("side", 0));
            fczp0.c(felm0.d.getBoolean("connection_desired", false));
            fczq fczq0 = fczp0.a();
            if(fczq0.d != 0) {
                ffds0.i(fczq0);
            }
        }
        if(felm.a) {
            ffds0.b = felm0;
        }
        synchronized(felm0.i) {
            handler0.post(new felb(felm0));
            for(Object object1: ffds0.h()) {
                felm0.f(((fczq)object1));
            }
        }
        Context context7 = felm0.b;
        IntentFilter intentFilter4 = new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED");
        jwe.b(context7, felm0.F, intentFilter4, 2);
        if(jys.d() && felm0.r()) {
            IntentFilter intentFilter5 = new IntentFilter("android.bluetooth.device.action.KEY_MISSING");
            int v5 = felm.a();
            if(v5 != 0) {
                intentFilter5.setPriority(v5);
            }
            ffmn.a("Wear_ConnectionMgr", "Registering KEY_MISSING receiver with priority %s", new Object[]{v5});
            IntentFilter intentFilter6 = new IntentFilter("android.bluetooth.device.action.KEY_MISSING");
            jwe.b(context7, felm0.G, intentFilter6, 2);
        }
        felm0.H.a("Successfully initialized");
        this.e.set(true);
        Log.i("WearableService", "onCreate: Wearable Services started.");
        ffff.a(this.getApplicationContext(), true);
    }

    public final void i(AncsNotificationParcelable ancsNotificationParcelable0, String s, fdpl fdpl0) {
        this.j(fdpl0, new fffo(this, new Intent("com.google.android.gms.wearable.ANCS_NOTIFICATION", fdzj.a).setPackage(s), ancsNotificationParcelable0));
    }

    public final void j(fdpl fdpl0, ffgn ffgn0) {
        this.k(fdpl0, ffgn0, false);
    }

    public final void k(fdpl fdpl0, ffgn ffgn0, boolean z) {
        ggfp ggfp0;
        if(Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", "queueEventAndNotify: " + fdpl0 + (z ? " liveListenersOnly " : " ") + ffgn0.toString());
        }
        ffei ffei0 = this.G;
        int v = 0;
        if(!ffei0.b || !ffgn0.c() && bbqa.c()) {
        label_54:
            if(!z) {
                v = this.r(fdpl0, ffgn0);
            }
            if((this.q(fdpl0, ffgn0) | v) == 0) {
                Log.w("WearableService", a.ad(fdpl0, ffgn0, "Failed to deliver message to ", "; "));
            }
        }
        else if(ffgn0.c() && (ffei0.e != null && fdpl0.b.equals("com.google.android.wearable.app") && !ffei0.e.b.equals("com.google.android.wearable.app"))) {
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", "Dropping companion event " + ffgn0.toString());
            }
        }
        else if(this.G.k(fdpl0)) {
            ffei ffei1 = this.G;
            Uri uri0 = ffgn0.h.getData();
            if(ffei1.k(fdpl0)) {
                ffei1.i.incrementAndGet();
                ggfn ggfn0 = new ggfn();
                if(uri0 != null && !uri0.equals(fdzj.a) && !uri0.getPathSegments().isEmpty()) {
                    if(ffei1.l()) {
                        ggfn0.k(ffei1.h);
                        Object object0 = uri0.getPathSegments().get(0);
                        Set set0 = (Set)ffei1.f.get(object0);
                        if(set0 != null) {
                            ggfn0.k(set0);
                        }
                    }
                    else {
                        ggfn0.k(ffei1.c);
                    }
                    Object object1 = uri0.getPathSegments().get(0);
                    Set set1 = (Set)ffei1.g.get(object1);
                    if(set1 != null) {
                        ggfn0.k(set1);
                    }
                    ggfp ggfp1 = ggfn0.h();
                    if(ggfp1.isEmpty()) {
                        ffei1.k.incrementAndGet();
                        ffei.g(("No home app found as receiver of the message, URI=" + uri0.toString()));
                    }
                    ffei1.j.addAndGet(ggfp1.size());
                    ggfp0 = ggfp1;
                }
                else {
                    ggfn0.k(ffei1.c);
                    ggfn0.k(ffei1.d);
                    ggfp ggfp2 = ggfn0.h();
                    ffei1.j.addAndGet(ggfp2.size());
                    ggfp0 = ggfp2;
                }
            }
            else {
                ggfp0 = ggnj.a;
            }
            ggqj ggqj0 = ggfp0.om();
            while(ggqj0.hasNext()) {
                Object object2 = ggqj0.next();
                ffft ffft0 = this.c(((String)object2));
                if(ffft0 != null) {
                    if(!z) {
                        v |= this.r(ffft0.c, ffgn0);
                    }
                    v |= this.q(ffft0.c, ffgn0);
                }
            }
            if(v == 0) {
                Log.w("WearableService", a.ad(fdpl0, ffgn0, "Failed to deliver message to ", "; "));
            }
        }
        else {
            goto label_54;
        }
    }

    public final void l() {
        this.k.lock();
        try {
            this.m = true;
            this.l.signalAll();
        }
        finally {
            this.k.unlock();
        }
    }

    public final void m() {
        this.ac.a.stopSelf();
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.b();
        bbpd0.println(a.an(hzzu.c(), "Wearable service async onCreate enabled: "));
        bbpd0.println("Wearable service is running: " + this.e.get());
        this.x.md(bbpd0, z, z1);
        bbpd0.a();
        bbpd0.println("EventHandler:");
        bbpd0.b();
        this.p.dump(bbpd0, "");
        bbpd0.a();
        bbpd0.println("LiveListenerEventHandler:");
        bbpd0.b();
        this.q.dump(bbpd0, "");
        bbpd0.a();
        bbpd0.println("OemCompanionVerifier:");
        bbpd0.b();
        ffej ffej0 = this.I;
        bbpd0.println(a.an(hzzm.d(), "OemCompanionVerifier enabled= "));
        bbpd0.println("AllowListed Companions: ");
        bbpd0.b();
        for(Object object0: ffej0.a.w()) {
            bbpd0.println("package digest: " + ((String)((Map.Entry)object0).getKey()));
            bbpd0.println("signature digest: " + ((String)((Map.Entry)object0).getValue()));
        }
        bbpd0.a();
        bbpd0.println("Installed Oem Companions: " + ffej0.c.values());
        bbpd0.a();
        bbpd0.println("MessageReroutingManager:");
        bbpd0.b();
        this.G.md(bbpd0, z, z1);
        bbpd0.a();
        bbpd0.println("Stubs:");
        bbpd0.b();
        for(Object object1: this.j.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            fflv fflv0 = (fflv)((WeakReference)map$Entry0.getValue()).get();
            if(fflv0 != null) {
                bbpd0.println(map$Entry0.getKey());
                bbpd0.b();
                fflv0.md(bbpd0, z, z1);
                bbpd0.a();
            }
        }
        bbpd0.a();
        bbpd0.println("PackageRecords:");
        bbpd0.b();
        for(Object object2: this.f.values()) {
            bbpd0.println(((ffft)object2).c);
            bbpd0.b();
            Map map0 = ((ffft)object2).a;
            synchronized(map0) {
                for(Object object3: map0.values()) {
                    bbpd0.println(((fffu)object3).toString());
                }
            }
            bbpd0.a();
        }
        bbpd0.a();
    }

    public static boolean n(Context context0, String s, boolean z) {
        boolean z1;
        try {
            Resources resources0 = context0.getPackageManager().getResourcesForApplication(s);
            int v = resources0.getIdentifier("android_wear_is_multi_node_aware", "bool", ffmq.a(resources0, s));
            z1 = true;
            if(v != 0) {
                z1 = resources0.getBoolean(v);
            }
        }
        catch(PackageManager.NameNotFoundException | Resources.NotFoundException | NullPointerException unused_ex) {
        }
        int v1 = bbna.b(context0, s);
        if(v1 <= 0 && Log.isLoggable("WearableService", 3)) {
            Log.d("WearableService", "package or google-play-services version not found: " + ffmr.b(s, z));
        }
        boolean z2 = v1 >= 7200000 && z1;
        if(Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", "package is " + (z2 ? "" : "not ") + "multi-node aware: " + ffmr.b(s, z));
        }
        return z2;
    }

    public final boolean o(String s) {
        return this.D.contains(s);
    }

    public final Set p(int v) {
        Set set0 = new HashSet();
        synchronized(this.h) {
            if(this.i == null) {
                this.i = new HashSet();
                List list0 = this.getPackageManager().queryIntentServices(new Intent("com.google.android.gms.wearable.BIND_LISTENER"), 0);
                if(list0 != null) {
                    for(Object object1: list0) {
                        this.i.add(((ResolveInfo)object1).serviceInfo.packageName);
                    }
                }
                for(int v2 = 0; v2 < 3; ++v2) {
                    String s = new String[]{"com.google.android.gms.wearable.NODE_CHANGED", "com.google.android.gms.wearable.ANCS_NOTIFICATION", "com.google.android.gms.wearable.AMS_UPDATE"}[v2];
                    List list1 = this.getPackageManager().queryIntentServices(new Intent(s, fdzj.a), 0);
                    if(list1 != null) {
                        for(Object object2: list1) {
                            this.i.add(((ResolveInfo)object2).serviceInfo.packageName);
                        }
                    }
                }
            }
        }
        for(Object object3: this.i) {
            ffft ffft0 = this.c(((String)object3));
            if(ffft0 != null) {
                fdpl fdpl0 = ffft0.c;
                if(!ffft0.f) {
                    if(!this.s(v, ffft0)) {
                        continue;
                    }
                    set0.add(fdpl0);
                }
                else if(Log.isLoggable("WearableService", 2)) {
                    Log.v("WearableService", "ignoring stopped listener: " + ffmr.a(fdpl0.b));
                }
            }
        }
        for(Object object4: this.j.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object4;
            fflv fflv0 = (fflv)((WeakReference)map$Entry0.getValue()).get();
            ffft ffft1 = this.c(((fdpl)map$Entry0.getKey()).b);
            if(fflv0 != null && ffft1 != null && this.s(v, ffft1)) {
                set0.add(((fdpl)map$Entry0.getKey()));
            }
        }
        if(Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", "getListeningPackages: count=" + set0.size());
        }
        return set0;
    }

    private final boolean q(fdpl fdpl0, ffgn ffgn0) {
        WeakReference weakReference0 = (WeakReference)this.j.get(fdpl0);
        fflv fflv0 = weakReference0 == null ? null : ((fflv)weakReference0.get());
        fffq fffq0 = this.q;
        if(fflv0 != null && fffq0 != null) {
            fflv0.c.add(ffgn0);
            Message message0 = fffq0.obtainMessage(1);
            message0.obj = fflv0;
            message0.sendToTarget();
            return true;
        }
        return false;
    }

    private final boolean r(fdpl fdpl0, ffgn ffgn0) {
        ffft ffft0 = this.b(fdpl0);
        fffp fffp0 = this.p;
        boolean z = false;
        if(ffft0 != null && fffp0 != null) {
            int v = (int)hzzi.a.i().R();
            if(this.G.b) {
                ffgn0.h.setPackage(fdpl0.b);
            }
            Intent intent0 = ffgn0.h;
            for(Object object0: ffft0.a(intent0)) {
                synchronized(((fffu)object0).f) {
                    ((fffu)object0).f.add(ffgn0);
                }
                Message message0 = fffp0.obtainMessage(1);
                message0.obj = (fffu)object0;
                if(intent0.getPackage() != null && !Objects.equals(intent0.getAction(), "com.google.android.gms.wearable.CAPABILITY_CHANGED")) {
                    message0.sendToTarget();
                }
                else if(!fffp0.hasMessages(message0.what, message0.obj)) {
                    fffp0.sendMessageDelayed(message0, ((long)this.Y.nextInt(v)));
                }
                z = true;
            }
        }
        return z;
    }

    private final boolean s(int v, ffft ffft0) {
        switch(v - 1) {
            case 0: {
                return true;
            }
            case 1: {
                fdpl fdpl0 = ffft0.c;
                ConcurrentHashMap concurrentHashMap0 = this.X;
                String s = fdpl0.b;
                Boolean boolean0 = (Boolean)concurrentHashMap0.get(s);
                if(boolean0 == null) {
                    synchronized(fdpl0) {
                        boolean0 = (Boolean)concurrentHashMap0.get(s);
                        if(boolean0 == null) {
                            Boolean boolean1 = Boolean.valueOf(azql.c(this).g(s));
                            concurrentHashMap0.put(s, boolean1);
                            boolean0 = boolean1;
                        }
                    }
                    return boolean0.booleanValue();
                }
                return boolean0.booleanValue();
            }
            default: {
                return v - 1 == 2 ? !ffft0.b : ffft0.b;
            }
        }
    }
}

