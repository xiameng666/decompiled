import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemProperties;
import android.util.Log;
import com.google.android.gms.wearable.node.DataService.1;
import com.google.android.gms.wearable.node.GcmMessageReceiver;
import com.google.android.gms.wearable.node.fastpair.FastPairManager.1;
import j..time.Duration;
import j..util.Objects;
import j..util.Optional;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import jeb.synthetic.FIN;
import jeb.synthetic.TWR;

public final class ffgp {
    public static fdpl a = null;
    public static fdpl b = null;
    public static final gmch c = null;
    static feln d = null;
    public static final Object e = null;
    public static boolean f = false;
    public static feti g = null;
    public static ffnd h = null;
    public static final AtomicReference i = null;
    public static final AtomicReference j = null;
    public static final AtomicReference k = null;
    public static final AtomicReference l = null;
    private static boolean m = false;
    private static fdzv n;
    private static felm o;
    private static final gmcg p;
    private static fdue q;
    private static boolean r;
    private static boolean s;
    private static feny t;
    private static fdsh u;
    private static final AtomicReference v;
    private static final AtomicReference w;
    private static fdye x;

    static {
        ffgp.p = gmcn.a(clhl.b.d(clhr.a));
        ffgp.c = gmcn.b(clhl.b.h(1, clhr.b));
        ffgp.e = new Object();
        ffgp.v = new AtomicReference();
        ffgp.i = new AtomicReference();
        ffgp.w = new AtomicReference();
        ffgp.j = new AtomicReference();
        ffgp.k = new AtomicReference();
        ffgp.l = new AtomicReference();
    }

    public static fdsh a() {
        synchronized(ffgp.class) {
        }
        return ffgp.u;
    }

    public static fdue b() {
        synchronized(ffgp.class) {
        }
        return ffgp.q;
    }

    public static fdxz c() {
        fdxz fdxz0 = (fdxz)ffgp.w.get();
        batl.s(fdxz0);
        return fdxz0;
    }

    public static fdzv d() {
        synchronized(ffgp.class) {
        }
        return ffgp.n;
    }

    public static fedp e() {
        return (fedp)ffgp.v.get();
    }

    public static felm f() {
        synchronized(ffgp.class) {
        }
        return ffgp.o;
    }

    public static feln g() {
        synchronized(ffgp.class) {
        }
        return ffgp.d;
    }

    public static feny h() {
        synchronized(ffgp.class) {
        }
        return ffgp.t;
    }

    public static gmcg i() {
        batl.s(ffgp.p);
        return ffgp.p;
    }

    public static void j(Context context0) {
        fdyy fdyy1;
        fdxu fdxu2;
        fdvl fdvl10;
        fdug fdug0;
        fdqk fdqk2;
        feft feft0;
        fepj fepj3;
        feqm feqm1;
        gmcd gmcd2;
        fdqk fdqk1;
        fepj fepj1;
        feoa feoa0;
        fert fert0;
        fdwc fdwc1;
        fedw fedw0;
        fdvv fdvv1;
        fdso fdso1;
        fdyc fdyc2;
        fdvl fdvl9;
        Context context2;
        fdvl fdvl7;
        fdvl fdvl6;
        fdxu fdxu1;
        fdyq fdyq5;
        Context context1;
        fdyu fdyu2;
        ConnectivityManager connectivityManager2;
        fdyq fdyq4;
        ffmv ffmv2;
        fdvl fdvl5;
        ConnectivityManager connectivityManager1;
        fdyq fdyq3;
        ffmv ffmv1;
        int v2;
        fdvl fdvl4;
        fdul fdul0;
        Class class0 = ffgp.class;
        __monitor_enter(class0);
        int v = FIN.finallyOpen$NT();
        if(ffgp.m) {
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        Log.i("Wear_Statics", "Start initializing static objects.");
        Object object0 = ffgp.e;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        if(Objects.equals("com.google.android.gms", "com.google.android.wearable.app.cn")) {
            Log.d("Wear_Statics", "Running on Companion.");
            ffgp.s = true;
            ffem.a = context0;
        }
        ffgp.m = true;
        ffgp.f = true;
        FIN.finallyCodeBegin$NT(v1);
        __monitor_exit(object0);
        FIN.finallyCodeEnd$NT(v1);
        ffgp.r = ffgp.n(context0);
        Object object1 = null;
        if(ffgp.k()) {
            ffgp.a = fdpl.a("com.google.android.gms", "38918a453d07199354f8b19af05ec6562ced5788");
            try {
                ffgp.b = fdpn.a(context0, "com.google.android.wearable.app.cn");
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                throw new IllegalStateException("Failed to create LE Companion Key.", packageManager$NameNotFoundException0);
            }
        }
        else {
            try {
                ffgp.a = fdpn.a(context0, "com.google.android.gms");
                ffgp.b = null;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
                throw new IllegalStateException("unable to determine the wear package name", packageManager$NameNotFoundException1);
            }
        }
        fdob fdob0 = new fdob(context0, !bbmq.P() && !bbnp.d(context0) && !ffgp.k());
        fdob0.d = new fdoe();
        fdob.a.set(fdob0);
        if(ffgp.l()) {
            ffgp.h = new ffnd(context0);
        }
        fdye fdye0 = new fdye(context0);
        ffgp.x = fdye0;
        new Thread(new fdyd(fdye0)).start();
        fdyq fdyq0 = new fdyq(ffgp.x, ffgp.r);
        fdyc fdyc0 = new fdyc(context0);
        fdxm fdxm0 = new fdxm(context0, ffgp.x, fdyc0, ffgp.r);
        fdrt fdrt0 = new fdrt(context0.getApplicationContext());
        fdru fdru0 = new fdru(context0.getApplicationContext());
        fdxz fdxz0 = new fdxz(context0, ffem.a(), ((gful_cronetEngineProvider)fdru0), ((gful_cronetEngineProvider)fdrt0), ffgp.x, ffgp.r);
        if(!ffgp.k() && !bbnp.d(context0)) {
            String s = ffgp.x.a().a;
            ffem.a();
            fdul0 = new fdum(s);
        }
        else {
            fdul0 = new fdul();
        }
        fdpy fdpy0 = new fdpy(fdul0);
        ffew ffew0 = new ffew(context0, ffgp.x, ffgp.a);
        if(!ffgp.r) {
            fcfw.d(context0);
        }
        ffgp.t = new feny(ffgp.a);
        fdyq fdyq1 = fdyq0;
        fdxz fdxz1 = fdxz0;
        fdvl fdvl0 = new fdvl(context0, ffgp.r, ffgp.x, fdxm0, context0.getSharedPreferences("wearable.data_service.settings", 0), fdyc0, fdpy0, ffew0, fdul0, ffgp.t);
        fdvl fdvl1 = fdvl0;
        fdvl fdvl2 = fdvl0;
        fdyc fdyc1 = fdyc0;
        fdpy fdpy1 = fdpy0;
        ffew ffew1 = ffew0;
        AtomicReference atomicReference0 = fdvl.a;
        while(true) {
            if(atomicReference0.compareAndSet(object1, fdvl1)) {
                fdvl1.p = new DataService.1(fdvl1);
                BroadcastReceiver broadcastReceiver0 = fdvl1.p;
                IntentFilter intentFilter0 = new IntentFilter("action_database_maintenance");
                jwe.b(fdvl1.b, broadcastReceiver0, intentFilter0, 4);
                fdvl1.T();
                ffew1.g.set(fdvl1);
                ffmn.e("TrustedPeersService", "TrustedPeersService initializing...", new Object[0]);
                CountDownLatch countDownLatch0 = new CountDownLatch(1);
                new bbln(9, new ffev(ffew1, countDownLatch0)).start();
                try {
                    countDownLatch0.await();
                }
                catch(InterruptedException interruptedException0) {
                    ffmn.c("TrustedPeersService", interruptedException0, "Service interrupted waiting for initialization thread to start.", new Object[0]);
                }
                ffew.b.set(ffew1);
                fdvl1.D(ffew1);
                fdxz1.d.set(fdvl1);
                ffgp.w.set(fdxz1);
                fdpy1.c.set(fdvl1);
                fcfs.a = new fcfs();
                femv femv0 = new femv(ffgp.x, fdvl1, ffgp.i(), ffgp.r);
                AtomicBoolean atomicBoolean0 = femv0.a;
                boolean z = hzzx.c();
                atomicBoolean0.set(z);
                if(z) {
                    ffmn.a("WearSuppFeatInit", "Initializing local WearableSupportedFeatures", new Object[0]);
                    gmbu.t(gmbt.h(ghmx.d(((gful_cronetEngineProvider)new femr(femv0, new femq(femv0))), ghml.d(Duration.ofSeconds(1L), 2.0, 8), new fems(), femv0.b)), new femu(femv0), femv0.b);
                }
                else {
                    ffmn.f("WearSuppFeatInit", "Flag is disabled, cleaning up local WearableSupportedFeatures", new Object[0]);
                    gmbu.t(gmbt.h(glzd.f(gmbt.h(fdur.g(femv0.c.d, femv0.c.c, "/wearable/supported/features")), new femy(), femv0.c.b)), new femt(femv0), femv0.b);
                }
                AtomicReference atomicReference1 = ffgp.k;
                Object object2 = atomicBoolean0.get() ? femv0.c : object1;
                atomicReference1.set(object2);
                if(hzwq.a.b().a()) {
                    ffml ffml0 = new ffml(((Context)fdvl2));
                    ffgp.l.set(ffml0);
                }
                fdws fdws0 = new fdws();
                ffds ffds0 = new ffds(new ffdp(((Context)fdvl2)));
                felo felo0 = new felo(ffds0);
                for(Object object3: felo0.a.h()) {
                    String s1 = ((fczq)object3).j;
                    ffaz ffaz0 = ((fczq)object3).p;
                    if(s1 == null || ffaz0 == null) {
                        continue;
                    }
                    felo0.f(s1, ffaz0);
                }
                ffew ffew2 = ffew1;
                fdvl fdvl3 = fdvl1;
                fdxz fdxz2 = fdxz1;
                ffgp.n = new fdzv(((Context)fdvl2), ((Context)fdvl2).getFilesDir().getPath(), ffgp.x, fdws0, ffds0, new ffmp(((Context)fdvl2)), ffgp.r, ffem.a(), ((ffml)ffgp.l.get()));
                ffmv ffmv0 = new ffmv();
                ((Context)fdvl2).registerComponentCallbacks(ffmv0);
                fdvx fdvx0 = new fdvx();
                fdso fdso0 = new fdso();
                ConnectivityManager connectivityManager0 = (ConnectivityManager)((Context)fdvl2).getSystemService("connectivity");
                fdyq fdyq2 = fdyq1;
                fdxu fdxu0 = new fdxu(connectivityManager0, fdyq2, ffgp.r, ((Context)fdvl2));
                AtomicReference atomicReference2 = fdxu.a;
                while(true) {
                    if(atomicReference2.compareAndSet(object1, fdxu0)) {
                        fdxu0.c.set(ffgp.x);
                        fdvl3.D(fdxu0);
                        fdvl3.E(fdxu0);
                        fdxu0.j.set(fdvl3);
                        fdxu0.l.set(ffgp.n);
                        Log.d("Wear_Statics", "NodeService is set...");
                        if(ffgp.k()) {
                            fdvl4 = fdvl3;
                        }
                        else {
                            Object object4 = ffgp.r ? object1 : cumi.c(((Context)fdvl2));
                            feml feml0 = new feml(((Context)fdvl2), fdvl3, ((cxxr)object4), ffgp.x.a().a, ffgp.a);
                            fdvl4 = fdvl3;
                            boolean z1 = ffgp.r;
                            if(z1 && !hzwk.a.b().a()) {
                                Log.w("WearFastPairManager", "Fast Pair for Wear feature is not enabled.");
                            }
                            else {
                                feml0.g = z1;
                                if(z1) {
                                    FastPairManager.1 fastPairManager$10 = new FastPairManager.1(feml0);
                                    IntentFilter intentFilter1 = new IntentFilter("android.accounts.action.ACCOUNT_REMOVED");
                                    jwe.b(feml0.c, fastPairManager$10, intentFilter1, 2);
                                }
                                else {
                                    feml0.d.D(feml0);
                                }
                                feml0.b = true;
                                Log.d("WearFastPairManager", "FastPairManager is initialized.");
                            }
                            feml.a.set(feml0);
                        }
                        feqp feqp0 = new feqp(ffmv0);
                        fepj fepj0 = new fepj(ffgp.x, fdvl4, ffgp.r, ffgp.i());
                        if(fepj0.d) {
                            hzya.i();
                            if(hzya.f()) {
                                gmcd gmcd0 = jqy.a(new feoz(fepj0));
                                fepj0.g.set(gmcd0);
                                if(ffgp.l()) {
                                    String s2 = hzya.a.b().a();
                                    if(!s2.isEmpty()) {
                                        ffmn.a("OffloadEndpointManager", "Adding additional endpoints from flag: %s", new Object[]{s2});
                                        Iterable iterable0 = gfud.e(';').l(s2);
                                        ffbd ffbd0 = (ffbd)((ProtoLiteMessage)ffbe.a).v_newBuilder();
                                        Iterator iterator1 = iterable0.iterator();
                                        while(iterator1.hasNext()) {
                                            Object object5 = iterator1.next();
                                            String s3 = (String)object5;
                                            Matcher matcher0 = fepj.b.matcher(s3);
                                            if(matcher0.matches()) {
                                                String s4 = (String)Objects.requireNonNull(matcher0.group(1));
                                                String s5 = (String)Objects.requireNonNull(matcher0.group(2));
                                                String s6 = (String)Objects.requireNonNull(matcher0.group(3));
                                                String s7 = (String)Objects.requireNonNull(matcher0.group(4));
                                                try {
                                                    v2 = Integer.parseInt(s7);
                                                }
                                                catch(NumberFormatException unused_ex) {
                                                    ffmv1 = ffmv0;
                                                    fdyq3 = fdyq2;
                                                    connectivityManager1 = connectivityManager0;
                                                    Log.e("OffloadEndpointManager", "Couldn\'t parse entry in offload_endpoint_map due to bad endpoint id: " + s7);
                                                    goto label_235;
                                                }
                                                byte[] arr_b = bboy.d(s5);
                                                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffbc.a).v_newBuilder();
                                                ffmv1 = ffmv0;
                                                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)fexh.a).v_newBuilder();
                                                fdyq3 = fdyq2;
                                                if(!hftp1.b_message.isImmutable()) {
                                                    hftp1.ensureMutable();
                                                }
                                                fexh fexh0 = (fexh)hftp1.b_message;
                                                s4.getClass();
                                                connectivityManager1 = connectivityManager0;
                                                fexh0.b |= 1;
                                                fexh0.c = s4;
                                                ByteString hfsf0 = ByteString.copyFrom(arr_b);
                                                if(!hftp1.b_message.isImmutable()) {
                                                    hftp1.ensureMutable();
                                                }
                                                fexh fexh1 = (fexh)hftp1.b_message;
                                                fexh1.b |= 2;
                                                fexh1.d = hfsf0;
                                                fexh fexh2 = (fexh)hftp1.N_build();
                                                if(!hftp0.b_message.isImmutable()) {
                                                    hftp0.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv0 = hftp0.b_message;
                                                fexh2.getClass();
                                                ((ffbc)hftv0).c = fexh2;
                                                ((ffbc)hftv0).b |= 1;
                                                if(!hftv0.isImmutable()) {
                                                    hftp0.ensureMutable();
                                                }
                                                ProtoLiteMessage hftv1 = hftp0.b_message;
                                                s6.getClass();
                                                ((ffbc)hftv1).b |= 2;
                                                ((ffbc)hftv1).d = s6;
                                                if(!hftv1.isImmutable()) {
                                                    hftp0.ensureMutable();
                                                }
                                                ffbc ffbc0 = (ffbc)hftp0.b_message;
                                                ffbc0.b |= 4;
                                                ffbc0.e = v2;
                                                ffbc ffbc1 = (ffbc)hftp0.N_build();
                                                if(!ffbd0.b_message.isImmutable()) {
                                                    ((ProtoLiteBuilder)ffbd0).ensureMutable();
                                                }
                                                ffbe ffbe0 = (ffbe)ffbd0.b_message;
                                                ffbc1.getClass();
                                                ffbe0.b();
                                                ffbe0.b.add(ffbc1);
                                            label_235:
                                                iterator1 = iterator1;
                                                fdvl4 = fdvl4;
                                                fdyq2 = fdyq3;
                                                ffmv0 = ffmv1;
                                                connectivityManager0 = connectivityManager1;
                                            }
                                            else {
                                                Log.e("OffloadEndpointManager", "Unparseable entry in offload_endpoint_map: " + s3);
                                            }
                                        }
                                        fdvl5 = fdvl4;
                                        ffmv2 = ffmv0;
                                        fdyq4 = fdyq2;
                                        connectivityManager2 = connectivityManager0;
                                        fepj0.c(((ffbe)((ProtoLiteBuilder)ffbd0).N_build()), false);
                                        goto label_266;
                                    }
                                    goto label_247;
                                }
                                else {
                                label_247:
                                    fdvl5 = fdvl4;
                                    ffmv2 = ffmv0;
                                    fdyq4 = fdyq2;
                                    connectivityManager2 = connectivityManager0;
                                }
                            }
                            else {
                                fdvl5 = fdvl4;
                                ffmv2 = ffmv0;
                                fdyq4 = fdyq2;
                                connectivityManager2 = connectivityManager0;
                                String s8 = fepj0.h.a().a;
                                fdur.g(fepj0.c, s8, "/wearable/offload/path_mapping");
                            }
                        }
                        else {
                            fdvl5 = fdvl4;
                            ffmv2 = ffmv0;
                            fdyq4 = fdyq2;
                            connectivityManager2 = connectivityManager0;
                            hzya.i();
                            if(hzya.e()) {
                                fepj0.c.D(fepj0);
                            }
                        }
                    label_266:
                        fdyu fdyu0 = new fdyu(ffgp.a, ffmv2, new fdyb(), fepj0, feqp0);
                        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("wearable.rpc_service.settings", 0);
                        fdyu0.i.set(sharedPreferences0);
                        fdyu0.g.set(fdxu0);
                        fdyu.a.set(fdyu0);
                        fdyu fdyu1 = hzya.e() ? fdyu0 : null;
                        if(!bbnp.d(context0) && !ffgp.k()) {
                            if(ffgp.r && hzwt.a.b().b()) {
                                ffgm.g("60-GcmController", new fdwd(context0));
                            }
                            fdyu2 = fdyu0;
                            context1 = context0;
                            fdyq5 = fdyq4;
                            fdxu1 = fdxu0;
                            fdvl6 = fdvl5;
                            feah feah0 = new feah(context1, ffgp.a, ffem.a(), ffgp.r, ffgp.x, ((WifiManager)(bbqa.c() ? cjmg.a(context0.getApplicationContext(), new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) : context0.getApplicationContext()).getSystemService("wifi")), fdvl6, fdyu2, connectivityManager2);
                            AtomicReference atomicReference3 = feah.a;
                            do {
                                if(atomicReference3.compareAndSet(null, feah0)) {
                                    fdvl6.D(feah0);
                                    if(iaak.a.b().b() && ffgp.r) {
                                        fdyu2.e(feah0);
                                    }
                                    Log.d("Wear_Statics", "WifiService is set...");
                                    goto label_295;
                                }
                            }
                            while(atomicReference3.get() == null);
                            throw new IllegalStateException("WifiService singleton can only be set once.");
                        }
                        else {
                            fdyu2 = fdyu0;
                            context1 = context0;
                            fdyq5 = fdyq4;
                            fdxu1 = fdxu0;
                            fdvl6 = fdvl5;
                        }
                    label_295:
                        if(ffgp.r) {
                            feuk feuk0 = new feuk(context1, fdyu2, new feur(context1, "com.google.android.gms.wearable", Executors.newSingleThreadScheduledExecutor()));
                            feuk.a.set(feuk0);
                            fdyu2.e(feuk0);
                            if(hzuq.c()) {
                                fcxf fcxf0 = new fcxf(context1, fdyu2);
                                Optional optional0 = Optional.of(fcxf0);
                                fcxf.a.set(optional0);
                                fdyu2.e(fcxf0);
                            }
                            else {
                                Log.d("Wear_Statics", "BugreportConsentFeature is disabled.");
                            }
                        }
                        fcfr.b(new fcfr());
                        fcfq.b(new fcfq());
                        ffei ffei0 = new ffei(context1, ffgp.r);
                        ffei.a.set(ffei0);
                        fdqk fdqk0 = new fdqk(context1, ffgp.a, ffgp.x, ffgp.r, ffei0, felo0);
                        fdqk0.g.set(fdvl6);
                        fdqk0.h.set(fdxu1);
                        fdqk0.F();
                        fdqk.a.set(fdqk0);
                        fdvl6.D(fdqk0);
                        fdxu1.c(fdqk0);
                        hzvv.d();
                        if(hzvv.c()) {
                            Optional optional1 = Optional.empty();
                            String s9 = ffgp.x.a().a;
                            if(s9 == null) {
                                throw new NullPointerException("Null localNodeId");
                            }
                            boolean z2 = ffgp.r;
                            fdpl fdpl0 = ffgp.a;
                            if(fdpl0 == null) {
                                throw new NullPointerException("Null gmsAppKey");
                            }
                            fdpl fdpl1 = ffei0.e;
                            if(fdpl1 != null) {
                                optional1 = Optional.of(fdpl1);
                            }
                            fdvl7 = fdvl6;
                            context2 = context0;
                            fedp fedp0 = new fedp(context2, fdvl7, fdpl0, optional1, z2, s9, ffew2);
                            ffew2 = ffew2;
                            ffgp.v.set(fedp0);
                            fedp fedp1 = ffgp.e();
                            hzvv.d();
                            if(hzvv.c()) {
                                gmbu.t(gmbu.l(new fecz(fedp1), fedp1.k), new fedn(fedp1), fedp1.k);
                            }
                            else {
                                try {
                                    ffmn.a("AppCatalogService", "deleteLocalAppCatalogDataItem - Attempting to delete DataItem.", new Object[0]);
                                    fdvl fdvl8 = fedp1.c;
                                    fdpl fdpl2 = fedp1.d;
                                    String s10 = fedp1.g;
                                    Cursor cursor0 = fdvl8.c(fdpl2, fedq.a(s10));
                                    TWR.declareResource(cursor0);
                                    TWR.useResource$NT(cursor0);
                                    if(cursor0.getCount() > 0) {
                                        TWR.useResource$NT(cursor0);
                                        fdvl8.j(fdpl2, fedq.a(s10), false);
                                    }
                                }
                                catch(Throwable throwable0) {
                                    TWR.moot$NT();
                                    throw throwable0;
                                }
                                fedp1.a("Feature is disabled. Skipping init", "init");
                            }
                        }
                        else {
                            context2 = context0;
                            fdvl7 = fdvl6;
                        }
                        AtomicReference atomicReference4 = ffgp.v;
                        fdvv fdvv0 = new fdvv(ffgp.x, fdvl7, ffew2, felo0, ((fedp)atomicReference4.get()), ffgp.a, ffgp.r);
                        fdvl7.D(fdvv0);
                        ffgp.g = new feti(ffgp.o(), fdyu2, fdvl7, ffgp.p, fdvv0, fdpy1, felo0);
                        if(hzvs.e()) {
                            fdyu2.e(ffgp.g);
                        }
                        if(hzvj.d()) {
                            if(ffgp.r) {
                                femc femc0 = new femc(context2, fdyu2, fdxu1);
                                ffgp.j.set(femc0);
                            }
                            else {
                                List list0 = ffds0.h();
                                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                                if(hzvj.d()) {
                                    for(Object object6: list0) {
                                        String s11 = ((fczq)object6).j;
                                        feym feym0 = ((fczq)object6).r;
                                        if(s11 == null || feym0 == null) {
                                            continue;
                                        }
                                        concurrentHashMap0.put(s11, feym0);
                                    }
                                }
                                felw felw0 = new felw(concurrentHashMap0);
                                fdyu2.e(felw0);
                                felw0.e.add(fdvv0);
                                ffgp.j.set(felw0);
                            }
                        }
                        fduk fduk0 = new fduk(ffgp.n, ffgp.r, ffgp.x);
                        ffgp.n.g(fduk0);
                        ffgp.n.g(fdpy1);
                        ffgp.n.g(fdvv0);
                        ffgp.n.g(fdxu1);
                        fdzv fdzv0 = ffgp.n;
                        Objects.requireNonNull(fdvl7);
                        ffgo ffgo0 = new ffgo(fdvl7);
                        fdzv0.A.add(ffgo0);
                        ConnectivityManager connectivityManager3 = (ConnectivityManager)context2.getSystemService("connectivity");
                        fdwc fdwc0 = new fdwc();
                        ffmt ffmt0 = new ffmt(new Random());
                        fdye fdye1 = ffgp.x;
                        if(Log.isLoggable("CloudNode", 3)) {
                            Log.d("CloudNode", "Creating gRPC Client...");
                        }
                        ffmt ffmt1 = ffmt0;
                        fdvx fdvx1 = fdvx0;
                        fdtx fdtx0 = new fdtx(context2, fdye1, fdxz2, fdvx1, fdwc0);
                        if(hzuz.a.h().D()) {
                            fdvl9 = fdvl7;
                            fdyc2 = fdyc1;
                            fdso1 = fdso0;
                            fdvv1 = fdvv0;
                            fedw0 = new fedw(fdyc2, fdvl9, fdso1, fdvx1, ffmt1, fdwc0, context0);
                            ffmt1 = ffmt1;
                            fdwc1 = fdwc0;
                        }
                        else {
                            fdvv1 = fdvv0;
                            fedx fedx0 = new fedx(context0.getApplicationInfo().uid, fdsh.t(context0), fdyc1, fdvl7, ffmt1, fdvx1, fdwc0, fdso0);
                            fdyc2 = fdyc1;
                            fdvl9 = fdvl7;
                            fdvx1 = fdvx1;
                            fdwc1 = fdwc0;
                            fdso1 = fdso0;
                            fedw0 = fedx0;
                        }
                        ffgp.u = new fdsh(context0, ffem.a(), ((gful_cronetEngineProvider)fdrt0), ((gful_cronetEngineProvider)fdru0), fdwc1, connectivityManager3, ffmt1, fdvl9, fdyc2, fdxz2, ffgp.r, fdvx1, fdxu1, fdtx0, fedw0, fdso1, ffgp.x, felo0);
                        fdxz2.c.set(ffgp.u);
                        fdvl9.D(fdxz2);
                        ffgp.u.l.c(ffgp.u.o);
                        fdyy fdyy0 = new fdyy(ffgp.x, bsoj.a(context0), fdyq5, fdxz2, ffew2, ((fedp)atomicReference4.get()), fdvx1, ffmv2, fdso1, ffgp.u, ffem.a());
                        fdyy0.h = fdyu2;
                        fdyu2.e.set(fdyy0);
                        ffgp.n.g(fdyy0);
                        if(ffgp.r && hzya.f() && bbqa.a() && feqm.h()) {
                            fdxu1.a();
                            clhr clhr0 = clhr.a;
                            ScheduledExecutorService scheduledExecutorService0 = clhl.b.h(1, clhr0);
                            gmcg gmcg0 = ffgp.i();
                            ffmn.d("McuManager", "offload init...", new Object[0]);
                            if(ffgp.l() && hzya.g()) {
                                fert0 = new feos(gmcn.a(clhl.b.b(clhr0)));
                                feoa0 = new feoc(((feos)fert0));
                                feoi feoi0 = new feoi(((feos)fert0), gmcn.b(scheduledExecutorService0));
                                ffmn.d("FakeMCU", "initialize...", new Object[0]);
                                feoi0.b.i("/mcu/echo_service", 7);
                                feoi0.b.i("/android/testapp_service", 102);
                                feoe feoe0 = new feoe(feoi0);
                                feoi0.b.f.add(feoe0);
                                feof feof0 = new feof(feoi0);
                                feoi0.b.g.add(feof0);
                                feog feog0 = new feog(feoi0);
                                feoi0.b.l.add(feog0);
                            }
                            else {
                                fert0 = new fert(new ferq(context0));
                                feoa0 = new feoa();
                            }
                            Objects.requireNonNull(feqm.a);
                            feqm feqm0 = new feqm(new fepn(feqm.a), fert0, feoa0, fepj0, scheduledExecutorService0, gmcg0);
                            fepj1 = fepj0;
                            feqm0.b();
                            fdqk1 = fdqk0;
                            feov feov0 = new feov(fdqk1, fepj1, ffgp.r);
                            gmcg gmcg1 = ffgp.i();
                            if(!feov0.c) {
                                ffmn.f("OffloadCapabilityMgr", "OffloadCapability initialization not supported on phones", new Object[0]);
                            }
                            else if(hzya.f()) {
                                fepj fepj2 = feov0.b;
                                gmcd gmcd1 = (gmcd)fepj2.g.get();
                                if(fepj2.f.get() != null && gmcd1 != null) {
                                    ffmn.a("OffloadEndpointManager", "getOffloadedAppKeys: scheduling after endpoints updated", new Object[0]);
                                    gmcd2 = glzd.f(gmcd1, new fepa(), gmap.a);
                                }
                                else {
                                    ffmn.a("OffloadEndpointManager", "getOffloadedAppKeys: complete immediately", new Object[0]);
                                    gmcd2 = gmbu.i(fepj2.b(fepj2.h.a().a).a());
                                }
                                gmbu.t(gmcd2, new feou(feov0), gmcg1);
                            }
                            else {
                                ffmn.f("OffloadCapabilityMgr", "OffloadCapability initialization not enabled on watches", new Object[0]);
                            }
                            feqm1 = feqm0;
                        }
                        else {
                            fepj1 = fepj0;
                            fdqk1 = fdqk0;
                            if(!ffgp.r && hzya.e()) {
                                fepk fepk0 = new fepk(fdyu2);
                                if(hzya.e() && ffgp.l() && !ffgp.m()) {
                                    fepk0.a.e(fepk0);
                                }
                            }
                            feqm1 = null;
                        }
                        BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
                        if(bluetoothAdapter0 == null) {
                            fepj3 = fepj1;
                            feft0 = null;
                        }
                        else {
                            fepj3 = fepj1;
                            feft0 = new feft(new feic(bluetoothAdapter0));
                        }
                        SharedPreferences sharedPreferences1 = ffem.a();
                        AtomicReference atomicReference5 = ffgp.j;
                        ffgp.o = new felm(context0, sharedPreferences1, ffds0, ffgp.n, ffgp.u, fdxu1, fdvl9, feft0, felo0, ((felr)atomicReference5.get()), ffgp.r, new fekm(fcfo.c(context0)), fdyu1, feqp0, feqm1, new feew(fdvl9, ffgp.a, ffgp.x));
                        ffgp.d = new feln(context0);
                        fdvl9.D(ffgp.u);
                        ffgp.n.u.set(ffgp.u);
                        ffgp.n.v.set(ffgp.o);
                        fdyu2.f.set(ffgp.o);
                        if(hzya.e()) {
                            fehi fehi0 = ffgp.o.B;
                            if(fehi0 == null) {
                                fdqk2 = fdqk1;
                            }
                            else {
                                fdqk2 = fdqk1;
                                fehi0.a(fdqk2);
                            }
                        }
                        else {
                            fdqk2 = fdqk1;
                        }
                        fduk0.a(ffgp.u);
                        fduc fduc0 = new fduc();
                        fduc0.a = context0;
                        frie frie0 = frif.a();
                        frce frce0 = new frce(context0);
                        frce0.d("wearable");
                        frce0.e("cloudsync_key_management.pb");
                        frie0.f(frce0.a());
                        frie0.e(((MessageLite)fesu.a));
                        frif frif0 = frie0.a();
                        frli frli0 = cjtb.a.a(frif0);
                        if(frli0 != null) {
                            fduc0.i = frli0;
                            fdpl fdpl3 = ffgp.a;
                            if(fdpl3 != null) {
                                fduc0.b = fdpl3;
                                fduc0.c = fdvl9;
                                fduc0.d = fdxu1;
                                fduc0.e = fdyu2;
                                fduc0.f = fdso1;
                                fduc0.g = ffgp.r;
                                fduc0.h = 1;
                                fdud fdud0 = fduc0.a();
                                ffgp.i.set(fdud0);
                                if(!bbnp.d(context0) && !ffgp.k()) {
                                    bsoj bsoj0 = bsoj.a(context0);
                                    if(ffgp.r) {
                                        fdsh fdsh0 = ffgp.u;
                                        WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
                                        ConnectivityManager connectivityManager4 = (ConnectivityManager)context0.getApplicationContext().getSystemService("connectivity");
                                        fdug0 = new fdug(context0, fdsh0, fdyy0, fdyq5, fdvl9, fdxu1, bsoj0, felo0);
                                        fdvl10 = fdvl9;
                                        fdxu2 = fdxu1;
                                        fdyy1 = fdyy0;
                                    }
                                    else {
                                        fdyy1 = fdyy0;
                                        fdug0 = new fduf(context0, ffgp.u, fdyy1, fdyq5, fdvl9, fdxu1, bsoj0);
                                        fdvl10 = fdvl9;
                                        fdxu2 = fdxu1;
                                    }
                                    fdsh fdsh1 = ffgp.u;
                                    IntentFilter intentFilter2 = new IntentFilter("com.google.android.c2dm.intent.RECEIVE");
                                    intentFilter2.addCategory("com.google.android.gms.wearable");
                                    jwe.c(context0, new GcmMessageReceiver(fdyy1, fdsh1), intentFilter2, "com.google.android.c2dm.permission.SEND", null, 2);
                                    fdvl10.D(fdug0);
                                    ffgm.g("70-CloudSyncManager", fdug0);
                                    ffgm.g("07-CloudNodeAdapter", fdug0.e);
                                    ffgp.q = fdug0;
                                }
                                else {
                                    fdvl10 = fdvl9;
                                    fdxu2 = fdxu1;
                                    ffgp.q = new fdxv();
                                }
                                fdch fdch0 = new fdch(context0, fdvl10, ffgp.x, ffgp.a, new fdab(), fcix.a(context0), ffgp.o, fcfo.a(context0), fdqk2);
                                fdch.a = fdch0;
                                fdvl10.D(fdch0);
                                fdob0.f(fdch0);
                                ffgp.u.G.set(ffgp.q);
                                fdxu2.k.set(ffgp.q);
                                ffgp.q.h(fdud0);
                                if(Log.isLoggable("pairingservice", 2)) {
                                    Log.v("pairingservice", "PairingService starting...");
                                }
                                new bbln(9, new fdxx(fdxz2)).start();
                                ffgm.g("00-WearableTransport", ffgp.n);
                                ffgm.g("01-ConnectionServiceManager", ffgp.o);
                                ffgm.g("02-ConnectionStatusHelper", ffgp.d);
                                ffgm.g("03-DataTransport", fdvv1);
                                ffgm.g("04-AssetTransport", fdpy1);
                                ffgm.g("05-NodeService", fdxu2);
                                ffgm.g("06-DataSync", fdvl10.n);
                                ffgm.g("10-TrustedPeersService", ffew2);
                                if(atomicReference5.get() != null) {
                                    ffgm.g("11-ConnectionDelayConfigManager", ((ffmj)atomicReference5.get()));
                                }
                                AtomicReference atomicReference6 = ffgp.k;
                                if(atomicReference6.get() != null && hzzx.d()) {
                                    ffgm.g("12-WearableSupportedFeaturesManager", ((ffmj)atomicReference6.get()));
                                }
                                ffgm.g("50-OffloadEndpointManager", fepj3);
                                if(feqm1 != null && hzya.a.b().e()) {
                                    ffgm.g("51-OffloadManager", feqm1);
                                }
                                ffgm.g("71-RpcTracker", ffmv2);
                                ffgm.g("97-CapabilityService", fdqk2);
                                ffgm.g("98-AssetStorage", fdyc2);
                                ffgm.g("99-DataService", fdvl10);
                                if(hzvs.e()) {
                                    ffgm.g("100-DataSyncTracking", ffgp.g);
                                }
                                hzvv.d();
                                if(hzvv.c() && atomicReference4.get() != null) {
                                    ffgm.g("101-AppCatalogService", ((ffmj)atomicReference4.get()));
                                }
                                ffgm.f(fdvl10);
                                ffgm.f(fdyu2);
                                ffgm.f(ffgp.x);
                                ffgm.f(ffgp.o);
                                boolean z3 = ffgp.r;
                                fdvl fdvl11 = fdvl.m();
                                felm felm0 = ffgp.o;
                                if(hzxr.d() && !Build.TYPE.equals("user") && bbqa.c() && z3) {
                                    fczq[] arr_fczq = felm0.v(null);
                                    int v3 = 0;
                                    while(v3 < arr_fczq.length) {
                                        if(arr_fczq[v3].j != null) {
                                            goto label_614;
                                        }
                                        ++v3;
                                    }
                                    try {
                                        if(SystemProperties.get("persist.sys.enable_debug_companion", "false").equals("true")) {
                                            goto label_605;
                                        }
                                        else {
                                            goto label_611;
                                        }
                                        goto label_616;
                                    }
                                    catch(IllegalArgumentException unused_ex) {
                                        goto label_611;
                                    }
                                label_605:
                                    fdpl fdpl4 = ffei.a();
                                    fdpl fdpl5 = ffei.c(context0);
                                    if(fdpl4 != null) {
                                        Log.d("DebugCompanionSwitcher", "Migrating existing data items and capabilities to debug companion app key");
                                        fdvl11.S(ffgp.a, fdvl11.u(), fdpl5, fdpl4);
                                        goto label_616;
                                    label_611:
                                        if(Log.isLoggable("DebugCompanionSwitcher", 2)) {
                                            Log.v("DebugCompanionSwitcher", "maybeMigrateDataToNewAppKey: Pairing with debug companion is not enabled");
                                        }
                                    }
                                }
                                else {
                                label_614:
                                    if(Log.isLoggable("DebugCompanionSwitcher", 2)) {
                                        Log.v("DebugCompanionSwitcher", "maybeMigrateDataToNewAppKey: Switching debug companion is not supported");
                                    }
                                }
                            label_616:
                                Log.i("Wear_Statics", "Finished initializing static objects.");
                                FIN.finallyExec$NT(v);
                                return;
                            }
                            throw new NullPointerException("Null appKey");
                        }
                        throw new NullPointerException("Null protoStore");
                    }
                    if(atomicReference2.get() != null) {
                        break;
                    }
                    ffew2 = ffew2;
                    fdxu0 = fdxu0;
                    object1 = object1;
                    fdpy1 = fdpy1;
                    fdyq2 = fdyq2;
                    fdob0 = fdob0;
                    fdso0 = fdso0;
                    fdxz2 = fdxz2;
                    felo0 = felo0;
                    fdvx0 = fdvx0;
                    fdvl2 = context0;
                    fdyc1 = fdyc1;
                    connectivityManager0 = connectivityManager0;
                    fdvl3 = fdvl3;
                }
                throw new IllegalStateException("NodeService singleton can only be set once.");
            }
            if(atomicReference0.get() != null) {
                break;
            }
            fdob0 = fdob0;
            fdvl1 = fdvl1;
            ffew1 = ffew1;
            fdxz1 = fdxz1;
            object1 = object1;
            fdyq1 = fdyq1;
            fdvl2 = context0;
            fdpy1 = fdpy1;
            fdyc1 = fdyc1;
        }
        throw new IllegalStateException("DataItemService singleton can only be set once.");
    }

    public static boolean k() {
        synchronized(ffgp.e) {
            batl.c(ffgp.f, "Local Edition mode must be initialized");
        }
        return ffgp.s;
    }

    public static boolean l() {
        return Objects.equals(Build.TYPE, "userdebug");
    }

    public static boolean m() {
        synchronized(ffgp.class) {
            batl.c(ffgp.m, "WearableServiceStatics must be initialized");
        }
        return ffgp.r;
    }

    static boolean n(Context context0) {
        return (context0.getResources().getConfiguration().uiMode & 15) == 6;
    }

    public static fdye o() {
        synchronized(ffgp.class) {
        }
        return ffgp.x;
    }
}

