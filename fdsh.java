import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.wearable.node.CloudNodeAdapter.2;
import com.google.android.gms.wearable.node.CloudNodeAdapter.3;
import com.google.android.gms.wearable.node.CloudNodeAdapter.GcmRegistrationReceiver;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class fdsh implements fduo, ffmj {
    public final esaa A;
    long B;
    public String C;
    public final Object D;
    public long E;
    final BroadcastReceiver F;
    public final AtomicReference G;
    public final fdtx H;
    public static final int I;
    private static final IntentFilter J;
    private final fdvx K;
    private final ffmp L;
    private final SharedPreferences.OnSharedPreferenceChangeListener M;
    private final IntentFilter N;
    private final WorkSource O;
    private final ConnectivityManager P;
    private final BroadcastReceiver Q;
    private final fdye R;
    private static bwjd S;
    public final Context a;
    public final boolean b;
    public final fdxz c;
    public final SharedPreferences d;
    public final gful_cronetEngineProvider e;
    public final gful_cronetEngineProvider f;
    public final fdvl g;
    public final fedv h;
    public final fdsc i;
    public final fdse j;
    public final fdwc k;
    public final fdxu l;
    public final fdso m;
    public final felo n;
    public final fdry o;
    public final fdrx p;
    final fdrv q;
    long r;
    volatile boolean s;
    volatile Map t;
    public volatile boolean u;
    public final ffmt v;
    final fdsg w;
    public volatile String x;
    public final AtomicBoolean y;
    public final esaa z;

    static {
        fdsh.J = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public fdsh(Context context0, SharedPreferences sharedPreferences0, gful_cronetEngineProvider gful0, gful_cronetEngineProvider gful1, fdwc fdwc0, ConnectivityManager connectivityManager0, ffmt ffmt0, fdvl fdvl0, fdyc fdyc0, fdxz fdxz0, boolean z, fdvx fdvx0, fdxu fdxu0, fdtx fdtx0, fedv fedv0, fdso fdso0, fdye fdye0, felo felo0) {
        this.r = -1L;
        this.s = false;
        this.u = false;
        this.w = new fdsg(this);
        fdrs fdrs0 = new fdrs(this);
        this.M = fdrs0;
        this.y = new AtomicBoolean();
        this.B = 0L;
        this.D = new Object();
        this.E = 0L;
        CloudNodeAdapter.2 cloudNodeAdapter$20 = new CloudNodeAdapter.2(this);
        this.F = cloudNodeAdapter$20;
        CloudNodeAdapter.3 cloudNodeAdapter$30 = new CloudNodeAdapter.3(this);
        this.Q = cloudNodeAdapter$30;
        this.G = new AtomicReference();
        this.d = sharedPreferences0;
        this.e = gful0;
        this.f = gful1;
        this.g = fdvl0;
        this.a = context0;
        this.b = z;
        this.R = fdye0;
        this.K = fdvx0;
        this.l = fdxu0;
        this.P = connectivityManager0;
        this.n = felo0;
        HandlerThread handlerThread0 = new HandlerThread("CloudNodeAdapterHandler", 9);
        handlerThread0.start();
        this.i = new fdsc(this, handlerThread0.getLooper());
        HandlerThread handlerThread1 = new HandlerThread("CloudSyncRpcHandler", 9);
        handlerThread1.start();
        this.j = new fdse(this, handlerThread1.getLooper());
        this.p = new fdrx(this, fdyc0);
        this.q = new fdrv(this);
        this.c = fdxz0;
        this.v = ffmt0;
        this.L = new ffmp(context0);
        this.k = fdwc0;
        this.H = fdtx0;
        this.h = fedv0;
        this.m = fdso0;
        hzzi hzzi0 = hzzi.a;
        if(hzzi0.i().ae()) {
            fdsh.t(context0).b.setIntParameter("http.connection.timeout", ((int)hzzi0.i().s())).setIntParameter("http.socket.timeout", ((int)hzzi0.i().t()));
        }
        this.o = new fdry(this);
        esaa esaa0 = new esaa(context0, 1, "CloudNodeSyncWakeLock", null, "com.google.android.wearable.app");
        this.z = esaa0;
        this.A = new esaa(context0, 1, "CloudNodeRpcWakeLock", null, "com.google.android.wearable.app");
        esaa0.j(false);
        WorkSource workSource0 = new WorkSource();
        this.O = workSource0;
        esaa0.k(workSource0);
        jwe.b(context0, cloudNodeAdapter$20, fdsh.J, 2);
        IntentFilter intentFilter0 = new IntentFilter();
        this.N = intentFilter0;
        intentFilter0.addAction("cloud_node_sync");
        intentFilter0.addAction("rpc_alarm_wakeup");
        jwe.b(context0, cloudNodeAdapter$30, intentFilter0, 2);
        IntentFilter intentFilter1 = new IntentFilter("com.google.android.gms.gcm.REGISTERED");
        intentFilter1.addCategory("com.google.android.gms");
        jwe.b(context0, new CloudNodeAdapter.GcmRegistrationReceiver(this), intentFilter1, 2);
        ffem.e(sharedPreferences0, fdrs0);
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "SharedPreferences change listener registered");
        }
    }

    public final PendingIntent a(String s) {
        Intent intent0 = new Intent(s).setPackage("com.google.android.gms");
        return PendingIntent.getBroadcast(this.a, 0, intent0, 0xC000000);
    }

    public final String b() {
        return this.c.a();
    }

    public final void c() {
        this.z.k(this.O);
    }

    public final void d(String s) {
        synchronized(this.D) {
            SharedPreferences sharedPreferences0 = this.d;
            HashSet hashSet0 = new HashSet(sharedPreferences0.getStringSet("nodesToRevoke", ggnj.a));
            if(hashSet0.contains(s)) {
                Log.i("CloudNode", a.a(s, "Asked to un-revoke node ", " in revocation queue: cancelling revocation."));
                hashSet0.remove(s);
                SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
                sharedPreferences$Editor0.putStringSet("nodesToRevoke", hashSet0);
                sharedPreferences$Editor0.remove("networkOfNodesToRevoke:" + s);
                sharedPreferences$Editor0.commit();
            }
        }
        SharedPreferences sharedPreferences1 = this.d;
        if(sharedPreferences1.getInt("node_is_enrolled:" + s, 1) == 3) {
            Log.i("CloudNode", a.a(s, "Asked to un-revoke previously revoked node ", ": clearing revocation status and syncing."));
            sharedPreferences1.edit().putInt("node_is_enrolled:" + s, 1).commit();
            this.i.f(2);
        }
    }

    public final void f(fdsp fdsp0, String s) {
        int v = fdsp0.a;
        Log.e("CloudNode", "aborted sync loop in " + s + ": type" + v + ", " + fdsp0.getMessage());
        if(fdsp0.getCause() != null) {
            Log.e("CloudNode", "Cause: " + fdsp0.getCause());
            if(fdsp0.getCause().getCause() != null) {
                Log.e("CloudNode", "Cause\'s cause: " + fdsp0.getCause().getCause());
            }
        }
        switch(v) {
            case 2: {
                this.o.b(fdsp0.getMessage());
                return;
            }
            case 4: {
                this.o.b(fdsp0.getMessage());
                this.h();
                return;
            }
            case 5: {
                this.o.g = true;
            }
        }
    }

    public final void g(fdsj fdsj0) {
        if(Log.isLoggable("CloudNode", 3)) {
            Log.d("CloudNode", "handleSyncResponse: seqId " + fdsj0.a + ", syncTable=" + fdsj0.b);
        }
        if(fdsj0.a > 0L) {
            if(Log.isLoggable("CloudNode", 3)) {
                Log.d("CloudNode", "setting mLastSentSeqId to " + fdsj0.a);
            }
            this.r = fdsj0.a;
        }
        Map map0 = fdsj0.b;
        if(map0 != null) {
            this.t = map0;
        }
        this.E = SystemClock.elapsedRealtime();
    }

    public final void h() {
        if(!this.b) {
            return;
        }
        Intent intent0 = new Intent().setFlags(0x10000000);
        Context context0 = this.a;
        String s = jwe.a(context0, "com.google.android.clockwork.settings.SHOW_FACTORY_RESET_CONFIRMATION") == 0 ? "com.google.android.clockwork.settings.FACTORY_RESET" : "android.settings.PRIVACY_SETTINGS";
        intent0.setAction(s);
        if(intent0.resolveActivityInfo(context0.getPackageManager(), 0x100000) == null) {
            Log.w("CloudNode", a.a(s, "Not sending out Intent to launch system menu / factory reset dialog because activity to be launched not found in system image [action = ", "]"));
            return;
        }
        PendingIntent pendingIntent0 = cjok.a(context0, 0, intent0, 0xC000000);
        if(hzzi.p()) {
            juh juh0 = new juh(0, context0.getResources().getText(0x7F153630), pendingIntent0);  // string:wearable_disconnect_and_reset_action_title "Disconnect & reset"
            this.L.a(juh0, 0x7F153642, 0x7F153641, gfqx.a, "CloudNode", true);  // string:wearable_no_longer_in_network_notification_title "Reset your watch"
            return;
        }
        this.L.b(pendingIntent0, 0x7F153642, 0x7F153641, gfqx.a, "CloudNode", true);  // string:wearable_no_longer_in_network_notification_title "Reset your watch"
    }

    public static void i(esaa esaa0) {
        long v = hzzi.c();
        if(v > 0L) {
            esaa0.c(v * 1000L);
            return;
        }
        esaa0.b();
    }

    public final void j(String s) {
        boolean z;
        synchronized(this.D) {
            SharedPreferences sharedPreferences0 = this.d;
            HashSet hashSet0 = new HashSet(sharedPreferences0.getStringSet("nodesToRevoke", ggnj.a));
            if(hashSet0.contains(s)) {
                z = false;
            }
            else {
                hashSet0.add(s);
                sharedPreferences0.edit().putStringSet("nodesToRevoke", hashSet0).commit();
                z = true;
            }
        }
        if(z) {
            this.i.f(2);
        }
    }

    public final void k(Set set0, String s) {
        for(Object object0: set0) {
            String s1 = (String)object0;
            try {
                fdsh.i(this.z);
                long v = SystemClock.elapsedRealtime();
                int v1 = 3;
                try {
                    fdtx fdtx0 = this.H;
                    fdtx0.b.a(":revokeNode");
                    try {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlbc.a).v_newBuilder();
                        long v3 = Long.parseLong(s);
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((hlbc)hftp0.b_message).d = v3;
                        String s2 = fdtx0.f();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp0.b_message;
                        s2.getClass();
                        ((hlbc)hftv0).e = s2;
                        if(!hftv0.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hlbc hlbc0 = (hlbc)hftp0.b_message;
                        s1.getClass();
                        hlbc0.f = s1;
                        hlbc hlbc1 = (hlbc)hftp0.N_build();
                        fdsr fdsr0 = new fdsr();
                        fdtc fdtc0 = new fdtc();
                        hlan hlan0 = fdtx0.e(clao.b);
                        Objects.requireNonNull(hlan0);
                        fdtx0.c("RevokeNode", ((MessageLite)hlbc1), fdsr0, fdtc0, new fdtm(hlan0));
                    }
                    finally {
                        fdtx0.b.b(":revokeNode");
                    }
                    fdsh.v(7, v, 1);
                }
                catch(fdsp fdsp1) {
                    fdsh.w(7, v, fdsp1);
                    int v4 = fdsp1.a;
                    if(v4 != 3 && v4 != 4) {
                        throw fdsp1;
                    }
                    if(Log.isLoggable("CloudNode", 4)) {
                        Log.i("CloudNode", String.format("Failure ignored during revoking node from network %s with error type %d. Proceed to stop future requests.", s, v4));
                    }
                }
                catch(IOException iOException0) {
                    fdsh.w(7, v, iOException0);
                    throw iOException0;
                }
                if(Log.isLoggable("CloudNode", 4)) {
                    Log.i("CloudNode", String.format("revoked node %s from network %s", s1, s));
                }
                Object object1 = this.D;
                synchronized(object1) {
                    if(Objects.equals(s1, "cloud")) {
                        Set set1 = this.d.getAll().keySet();
                        SharedPreferences.Editor sharedPreferences$Editor0 = this.d.edit();
                        sharedPreferences$Editor0.remove("nodesToRevoke");
                        sharedPreferences$Editor0.remove("cloudSyncId");
                        for(Object object2: set1) {
                            String s3 = (String)object2;
                            if(s3.startsWith("node_is_enrolled:") || s3.startsWith("networkOfNodesToRevoke:")) {
                                sharedPreferences$Editor0.remove(s3);
                            }
                        }
                        sharedPreferences$Editor0.remove("network_server_assigned").remove("network_id").remove("network_secret");
                        sharedPreferences$Editor0.commit();
                        if(Log.isLoggable("CloudNode", 3)) {
                            Log.d("CloudNode", "cleared all clockwork network state");
                        }
                        return;
                    }
                    SharedPreferences sharedPreferences0 = this.d;
                    HashSet hashSet0 = new HashSet(sharedPreferences0.getStringSet("nodesToRevoke", ggnj.a));
                    if(hashSet0.remove(s1)) {
                        SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences0.edit();
                        sharedPreferences$Editor1.putStringSet("nodesToRevoke", hashSet0);
                        if(!hzuz.p()) {
                            v1 = 2;
                        }
                        sharedPreferences$Editor1.putInt("node_is_enrolled:" + s1, v1);
                        sharedPreferences$Editor1.remove("networkOfNodesToRevoke:" + s1);
                        sharedPreferences$Editor1.commit();
                    }
                    if(this.b) {
                        fdxz fdxz0 = this.c;
                        String s4 = fdxz0.a();
                        if(bata.b(s1, this.R.a().a) && bata.b(s4, s)) {
                            fdxz0.g(null);
                        }
                    }
                }
            }
            catch(fdsp fdsp0) {
                Log.e("CloudNode", "failure while trying to revoke node " + s1 + ", " + fdsp0.getMessage() + ", will try again later");
            }
        }
    }

    public final void l(long v, String s) {
        new bbib(this.a).d("CloudNode", 2, v, this.a(s), "com.google.android.gms");
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", a.u(v, "scheduleWakeup: "));
        }
    }

    public final void m(boolean z) {
        long v1;
        String s = this.b();
        fdtx fdtx0 = this.H;
        fdtx0.b.a(":heartbeat");
        try {
            v1 = 0L;
            v1 = Long.parseLong(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        finally {
            fdtx0.b.b(":heartbeat");
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hlax.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlax)hftp0.b_message).d = v1;
        String s1 = fdtx0.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s1.getClass();
        ((hlax)hftv0).e = s1;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hlax)hftp0.b_message).f = z;
        hlax hlax0 = (hlax)hftp0.N_build();
        fdts fdts0 = new fdts();
        fdtt fdtt0 = new fdtt();
        Objects.requireNonNull(fdtx0.a);
        fdtx0.c("Heartbeat", ((MessageLite)hlax0), fdts0, fdtt0, new fdss(fdtx0.a));
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        long v = SystemClock.elapsedRealtime();
        bbpd0.println("is paired to cloud: " + this.c.a());
        bbpd0.println("cloud network id: " + this.c.a());
        bbpd0.println("gcm registration id: " + ((fdrt)this.e).b());
        bbpd0.println("last sent sync seqId: " + this.r);
        bbpd0.println("cloud sync table: " + this.t);
        bbpd0.println(a.an(hzzi.m(), "disabled via gservices: "));
        bbpd0.println("wakelock timeout: " + hzzi.c());
        bbpd0.println("cloud sync e2ee is hardcoded on.");
        fdso fdso0 = this.m;
        if(fdso0 == null) {
            bbpd0.println("  cloudNodeCrypto is not instantiated");
        }
        else {
            bbpd0.println("  has keys: " + fdso0.m());
            bbpd0.println("  is ready: " + fdso0.o());
        }
        bbpd0.println("local clock skew: " + this.H.c + "ms");
        bbpd0.println("active API client: gRPC");
        bbpd0.println("active asset client: " + this.h.b());
        bbpd0.println(a.an(hzuz.p(), "node unrevocation enabled: "));
        bbpd0.println("request smearing enabled: " + hzuz.q() + " (delay: " + hzuz.d() + "ms, window: " + hzuz.e() + "ms)");
        long v1 = this.v.a();
        long v2 = this.v.b();
        if(Long.compare(v1, 0L) > 0) {
            bbpd0.println(a.u(v1, "current backoff: "));
            if(v2 > v) {
                bbpd0.println(a.u(v2, "  next run time: "));
            }
            else {
                bbpd0.println("  ready to run");
            }
        }
        else {
            bbpd0.println("backoff not in effect");
        }
        bbpd0.println();
        bbpd0.println("api rpcs:");
        bbpd0.b();
        boolean z2 = hzuz.r();
        bbpd0.println("available: true; enabled: " + z2 + "; in use: " + z2);
        bbpd0.println("pending: " + this.w.a());
        fdsd fdsd0 = (fdsd)this.w.a.peek();
        bbpd0.println(a.D((fdsd0 == null ? 0L : SystemClock.elapsedRealtime() - fdsd0.b), "front of queue waiting for: ", "ms"));
        bbpd0.println("sends successful: " + this.w.b.get() + ", retried: " + this.w.d.get() + ", abandoned: " + this.w.c.get());
        bbpd0.a();
        bbpd0.println("mDataChangedLocally: " + this.s);
        bbpd0.println("mTickleReceived: " + this.u);
        bbpd0.println("mUpdateGcmRegistration: " + this.y.get());
        bbpd0.println("network processing wakelock held: " + this.z.l());
        long v3 = this.B;
        if(v3 > 0L) {
            bbpd0.println("  NETWORK REQUEST IN PROGRESS: stage: " + this.C);
            bbpd0.println("  has been syncing for " + (v - v3) / 1000L + " seconds");
        }
        bbpd0.println();
        bbpd0.println("Connection State");
        bbpd0.b();
        fdry fdry0 = this.o;
        if(!fdry0.c()) {
            bbpd0.println("cloud connection enabled");
        }
        else if(fdry0.g && !fdry0.h.p()) {
            bbpd0.println("cloud connection suspended due to missing required encryption");
        }
        else {
            bbpd0.println("cloud connection disabled due to fatal error at time: " + ffmi.a(fdry0.a));
            bbpd0.println(fdry0.b);
        }
        bbpd0.println("time since last active connection: " + fdry0.f);
        bbpd0.println("time since last upload: " + fdry0.e);
        bbpd0.println("upload interval: " + fdry0.c);
        bbpd0.a();
        bbpd0.println();
        bbpd0.println("Event Queue");
        bbpd0.b();
        this.i.dump(bbpd0, "CloudNodeAdapter");
        bbpd0.a();
        bbpd0.println("Prefs:");
        bbpd0.b();
        SharedPreferences sharedPreferences0 = this.d;
        for(Object object0: sharedPreferences0.getAll().keySet()) {
            String s = (String)object0;
            if(s.startsWith("node_is_enrolled:")) {
                bbpd0.println(s + ": " + sharedPreferences0.getInt(s, -1));
            }
            else {
                if(!s.startsWith("networkOfNodesToRevoke:")) {
                    continue;
                }
                bbpd0.println(s + ": " + sharedPreferences0.getString(s, "null"));
            }
        }
        bbpd0.println("nodesToRevoke: " + sharedPreferences0.getStringSet("nodesToRevoke", ggnj.a));
        bbpd0.a();
        bbpd0.println();
        this.K.md(bbpd0, z, z1);
        bbpd0.println("\nCloud Sync Events");
        this.k.md(bbpd0, z, z1);
    }

    public final boolean n() {
        return hzuz.a.h().w() && this.b;
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        int v2 = 1;
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            if(!fduq0.e.equals("cloud")) {
                if(hzuz.q() && fduq0.b.b.equals("/peers")) {
                    if(Log.isLoggable("CloudNode", 2)) {
                        Log.v("CloudNode", "Received update for peers dataitem; marking as network event.");
                    }
                    v2 = 2;
                }
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "Received dataitemchanged event: " + fduq0.b.c);
                }
                z = true;
            }
        }
        if(z) {
            this.s = true;
            this.i.f(v2);
        }
    }

    public final boolean p() {
        return this.m != null && this.m.o();
    }

    public final boolean q() {
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "readDataConnectionState");
        }
        NetworkInfo networkInfo0 = this.P.getActiveNetworkInfo();
        if(networkInfo0 == null) {
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "no active networks");
            }
            return false;
        }
        if(!networkInfo0.isConnected()) {
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "active network isn\'t connected");
            }
            return false;
        }
        String s = networkInfo0.getTypeName();
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "active network is: " + s);
        }
        if(!Objects.equals(s, "PROXY") && !Objects.equals(s, "COMPANION_PROXY")) {
            if(Log.isLoggable("CloudNode", 2)) {
                Log.v("CloudNode", "there is an active non-PROXY network");
            }
            return true;
        }
        if(Log.isLoggable("CloudNode", 2)) {
            Log.v("CloudNode", "active network is proxy");
        }
        return false;
    }

    public final boolean r() {
        return !this.P.isActiveNetworkMetered();
    }

    final boolean s() {
        fdue fdue0 = (fdue)this.G.get();
        int v = 1;
        boolean z = fdue0 != null && fdue0.F();
        int v1 = !this.o.e() || !z ? 0 : 1;
        String s = this.x;
        if(Log.isLoggable("CloudNode", 2) && s != null) {
            Log.v("CloudNode", String.format("skip sync to cloud due to active migration of node: %s", s));
        }
        if(s != null) {
            v = 0;
        }
        return v1 & v;
    }

    public static bwjd t(Context context0) {
        if(fdsh.S == null) {
            StringBuilder stringBuilder0 = new StringBuilder("Android/");
            try {
                PackageInfo packageInfo0 = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                stringBuilder0.append(packageInfo0.packageName);
                stringBuilder0.append("/");
                stringBuilder0.append(packageInfo0.versionCode);
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                Log.wtf("CloudNode", packageManager$NameNotFoundException0.getMessage(), packageManager$NameNotFoundException0);
            }
            fdsh.S = new bwjd(context0, stringBuilder0.toString(), true, true);
        }
        return fdsh.S;
    }

    public static final void u(String s, Exception exception0) {
        Log.w("CloudNode", "doEnsureOtherNodesEnrolled, enrollNode with enrollmentId" + s + "error: " + exception0.getMessage());
    }

    public static final void v(int v, long v1, int v2) {
        fdob.j(v, v1, 1, v2);
    }

    public static final void w(int v, long v1, Exception exception0) {
        fdob.j(v, v1, ((exception0 instanceof IOException) ? 2 : 3), 0);
    }
}

