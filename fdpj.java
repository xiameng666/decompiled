import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.chimera.modules.wearable.AppContextProvider;
import com.google.android.gms.wearable.backgroundschedulertasks.CloudSyncHeartbeatBackgroundTask;
import com.google.android.gms.wearable.node.AbstractCloudSyncManager.CloudRouteDebouncer;
import com.google.android.gms.wearable.node.AbstractCloudSyncManager.GcmConnectionReceiver;
import com.google.android.gms.wearable.node.AbstractCloudSyncManager.HeartbeatNotificationReceiver;
import com.google.android.gms.wearable.node.AbstractCloudSyncManager.HeartbeatScheduledJobBroadcastReceiver;
import j..util.Objects;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class fdpj implements fdue, fduj, fduo, fdxo, ffmj, fhan {
    public boolean a;
    public final gmcg b;
    protected boolean c;
    protected boolean d;
    public final fdsh e;
    public final Object f;
    public final fdxu g;
    protected final Context h;
    public final Boolean i;
    final bsoj j;
    public volatile boolean k;
    public final bbib l;
    public final AtomicBoolean m;
    public boolean n;
    public boolean o;
    public final fdpk p;
    private final AbstractCloudSyncManager.GcmConnectionReceiver q;
    private final fdyy r;
    private final fdyq s;
    private final fdvl t;
    private final AtomicInteger u;
    private final AbstractCloudSyncManager.CloudRouteDebouncer v;
    private boolean w;
    private long x;

    public fdpj(Context context0, fdsh fdsh0, fdyy fdyy0, fdyq fdyq0, fdvl fdvl0, fdxu fdxu0, boolean z, bsoj bsoj0) {
        this.a = false;
        this.b = new bblp(1, 9);
        this.f = new Object();
        this.p = new fdpk();
        this.u = new AtomicInteger(0);
        this.m = new AtomicBoolean(false);
        this.x = 0L;
        this.e = fdsh0;
        this.h = context0;
        this.t = fdvl0;
        this.g = fdxu0;
        this.i = Boolean.valueOf(z);
        this.j = bsoj0;
        this.r = fdyy0;
        this.s = fdyq0;
        this.l = new bbib(context0);
        this.v = new AbstractCloudSyncManager.CloudRouteDebouncer(this, context0);
        this.q = new AbstractCloudSyncManager.GcmConnectionReceiver(this);
    }

    @Override  // fdue
    public final boolean A() {
        return this.L("/cloud_sync_opt_in") != null;
    }

    @Override  // fdue
    public final boolean B() {
        if(this.C()) {
            fcez fcez0 = this.L("/cloud_sync_setting_by_node");
            if(fcez0 == null || fcez0.w(this.g.a().a, true)) {
                fcez fcez1 = this.L("/cloud_sync_setting");
                return fcez1 == null ? false : fcez1.w("cloud_sync_setting_enabled", false);
            }
        }
        return false;
    }

    protected abstract boolean C();

    @Override  // fdue
    public final boolean D() {
        fdyq fdyq0 = this.s;
        synchronized(fdyq0.b) {
            fdyq0.d();
            for(Object object1: fdyq0.a.keySet()) {
                fdxn fdxn0 = fdyq0.a(((String)object1));
                if(fdxn0 != null && Objects.equals(fdxn0.a, "cloud") && !((String)object1).equals("cloud")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // fdue
    public final boolean E() {
        Set set0 = this.g.b();
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "isConnectedToCloud(), Reachable Nodes: " + set0.toString());
        }
        for(Object object0: set0) {
            fdyo fdyo0 = (fdyo)object0;
            if(fdyo0.a.a.equals("cloud") && fdyo0.b == 1) {
                return true;
            }
        }
        return false;
    }

    @Override  // fdue
    public boolean F() {
        boolean z = false;
        synchronized(this.f) {
            if(this.d && this.c) {
                z = true;
            }
        }
        return z;
    }

    @Override  // fdue
    public final boolean G() {
        return this.m.get();
    }

    public static final void H(fdno fdno0, long v) {
        if(v != 0L && hzuz.m()) {
            ayvb ayvb0 = fdob.b().f.f(fdno0.f);
            long v1 = SystemClock.elapsedRealtime() - v;
            int v2 = 0;
            gged_interceptors gged0 = gged_interceptors.B(Integer.valueOf(0), Integer.valueOf(5), Integer.valueOf(10), Integer.valueOf(15), Integer.valueOf(20), Integer.valueOf(25), Integer.valueOf(30), Integer.valueOf(35), Integer.valueOf(40), Integer.valueOf(45), Integer.valueOf(50), Integer.valueOf(55), new Integer[]{((int)60), ((int)75), ((int)90), ((int)105), ((int)120), ((int)150), ((int)180)});
            if(v1 / 60000L < 0L) {
                ayvb0.a(ayvb0.g.a(-1L), 1L, ayvf.b);
                return;
            }
            if(v1 / 60000L > 180L) {
                ayvb0.a(ayvb0.g.a(0xB5L), 1L, ayvf.b);
                return;
            }
            int v3 = ((ggna)gged0).c;
            while(v2 < v3) {
                Integer integer0 = (Integer)gged0.get(v2);
                ++v2;
                if(v1 / 60000L <= ((long)(((int)integer0)))) {
                    ayvb0.a(ayvb0.g.a(((long)(((int)integer0)))), 1L, ayvf.b);
                    return;
                }
            }
        }
    }

    @Override  // fdue
    public final void I(String s, boolean z) {
        if(this.i.booleanValue()) {
            return;
        }
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "setCloudSyncSetting - watchNodeId: " + s + ", enabled: " + z);
        }
        fcez fcez0 = this.L("/cloud_sync_setting_by_node");
        if(fcez0 == null) {
            fcez0 = new fcez();
        }
        fcez0.j(s, z);
        fdur.j(this.t, "cloud", "/cloud_sync_setting_by_node", fcez0);
    }

    @Override  // fdue
    public final void J() {
        synchronized(this.f) {
            if(!this.c) {
                this.l("not opted in");
            }
            else if(!this.d) {
                this.l("disabled in setting");
            }
            else if(hzzi.m()) {
                this.l("disabled via gservices");
            }
        }
    }

    private final PendingIntent K(int v) {
        Intent intent0 = new Intent("com.google.android.gms.wearable.node.CLOUD_SYNC_HEARTBEAT_NOTIFICATION");
        Context context0 = this.h;
        Intent intent1 = intent0.setPackage("com.google.android.gms").putExtra("initial_heartbeat_num", v);
        if(hzuz.m()) {
            intent1.putExtra("heartbeat_scheduled_time", SystemClock.elapsedRealtime());
        }
        return PendingIntent.getBroadcast(context0, 0, intent1, 0xA000000);
    }

    private final fcez L(String s) {
        return fdur.c(this.t, "cloud", s);
    }

    private final void M() {
        synchronized(this.f) {
            for(Object object1: this.g.b()) {
                if(fdxu.v(((fdyo)object1).a, ((fdyo)object1).b)) {
                    this.o = true;
                    if(this.w) {
                        Log.d("CloudSync", "BT phone connected, disabling cloud route.");
                        this.w();
                    }
                    return;
                }
            }
            this.o = false;
            if(!this.w && this.n && this.m.get() && this.F()) {
                Log.d("CloudSync", "BT phone disconnected, enabling cloud route.");
                this.f();
            }
        }
    }

    private final void N(int v) {
        long v1 = SystemClock.elapsedRealtime();
        PendingIntent pendingIntent0 = this.K(v);
        this.l.o("CloudSync", v1 + 1020000L, v1 + 1620000L, pendingIntent0, "com.google.android.gms");
    }

    private final void O(String s) {
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Sending cloud sync notification message type " + s);
        }
        this.p.a("Sending cloud sync notification message type " + s);
        Bundle bundle0 = new Bundle();
        bundle0.putString("type", s);
        try {
            String s1 = a.w(hzzi.l(), "@google.com");
            this.j.c(s1, "management", 0L, bundle0);
        }
        catch(IOException iOException0) {
            Log.w("CloudSync", "Failed to send cloud sync message type " + s, iOException0);
        }
    }

    private final void P() {
        if(hzuz.t()) {
            if(this.e.b() == null) {
                Log.w("CloudSync", "Asked to send heartbeat, but getNetworkId() returned null; ignoring.");
                this.p.a("asked to send heartbeat, but no network id");
                return;
            }
            fdpf fdpf0 = new fdpf(this);
            this.b.execute(fdpf0);
            return;
        }
        this.O("heartbeat");
    }

    private final boolean Q() {
        synchronized(this.f) {
            fcez fcez0 = this.L("/cloud_sync_opt_in");
            if(fcez0 != null) {
                if(Log.isLoggable("CloudSync", 3)) {
                    Log.d("CloudSync", "CloudSyncOptedIn: " + fcez0.v("cloud_sync_opted_in"));
                }
                return fcez0.v("cloud_sync_opted_in");
            }
            if(Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "CloudSyncOptedIn not set, default to be false.");
            }
        }
        return false;
    }

    @Override  // fdue
    public final fceh a() {
        return new fceh(this.A(), this.Q());
    }

    protected final void b() {
        try {
            bsoj bsoj0 = this.j;
            clht clht0 = new clht(Looper.getMainLooper(), new fdph(this));
            Map map0 = bsoj0.d;
            if(map0.size() > 20) {
                throw new IOException("ERROR_MAX_CONCURRENT_RPC_EXCEEDED");
            }
            String s = "google.rpc" + bsoj.b.getAndIncrement();
            map0.put(s, clht0);
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("google.messenger", bsoj0.f);
            bsoj bsoj1 = bsoj.a;
            batl.s(bsoj1);
            bsoj1.c("https://gcm.googleapis.com/local/status", s, 0L, bundle0);
        }
        catch(IOException iOException0) {
            Log.w("CloudSync", "Failed to check GCM connection state: " + iOException0.getMessage());
        }
    }

    public final void c() {
        synchronized(this.f) {
            this.m.set(true);
            this.p.a("Cloud sync key manager init completed");
            this.j("cloud sync key manager init completed");
        }
        if(!this.n && hzuz.n()) {
            this.b();
        }
    }

    public final void d() {
        if(this.w) {
            this.p.a("Disabling cloud route");
        }
        this.w = false;
        this.g.i("cloud");
        this.r.i("cloud");
        boolean z = this.k;
        this.k = false;
        if(hzuz.l()) {
            PendingIntent pendingIntent0 = this.K(this.u.get());
            this.l.a(pendingIntent0);
            if(z) {
                Log.d("CloudSync", "CloudSync connection notifications disabled, sending disconnect");
                if(hzuz.t()) {
                    if(this.e.b() == null) {
                        Log.w("CloudSync", "Asked to send disconnect, but getNetworkId() returned null; ignoring.");
                        this.p.a("asked to send disconnect, but no network id");
                        return;
                    }
                    fdpe fdpe0 = new fdpe(this);
                    this.b.execute(fdpe0);
                    return;
                }
                this.O("disconnect");
            }
        }
    }

    public final void f() {
        if(!this.w) {
            this.p.a("Enabling cloud route");
        }
        this.w = true;
        if(hzuz.j()) {
            this.v.b();
        }
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "enableCloudRoute: transitioning to connectedToCloud");
        }
        fdww fdww0 = fdww.b();
        this.g.h(fdsl.b, fdww0);
        fdww fdww1 = fdww.b();
        this.r.h(fdsl.b, fdww1);
        this.g();
    }

    @Override  // fdue
    public final void g() {
        this.k = true;
        if(hzuz.o()) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("to", "https://gcm.googleapis.com/gcm/gcmevents");
            bundle0.putString("notify", hzzi.l() + "@google.com");
            bundle0.putString("type", "7");
            try {
                this.j.c("https://gcm.googleapis.com/gcm/gcm.event_tracker", "enableConnectionNotifications", 0L, bundle0);
                if(Log.isLoggable("CloudSync", 3)) {
                    Log.d("CloudSync", "enableConnectionNotifications: sent request to enable GCM events");
                }
            }
            catch(IOException iOException0) {
                Log.w("CloudSync", "enableConnectionNotifications: IOException while attempting to enable GCM events: " + iOException0.getMessage());
            }
        }
        if(hzuz.l()) {
            Log.d("CloudSync", "CloudSync connection notifications enabled, sending initial heartbeat");
            AtomicInteger atomicInteger0 = this.u;
            PendingIntent pendingIntent0 = this.K(atomicInteger0.get());
            this.l.a(pendingIntent0);
            if(this.a) {
                this.y(atomicInteger0.incrementAndGet());
                return;
            }
            this.x(atomicInteger0.incrementAndGet());
        }
    }

    @Override  // fdue
    public final void h(fdud fdud0) {
        if(hzuz.a.h().m()) {
            gmbu.t(fdud0.b(), new fdpg(this), gmap.a);
        }
        else {
            try {
                fdud0.e();
            }
            catch(GeneralSecurityException | IOException exception0) {
                Log.e("CloudSync", "Failed to initialize CloudSync E2EE", exception0);
            }
            this.m.set(true);
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.gcm.CONNECTED");
        intentFilter0.addAction("com.google.android.gcm.DISCONNECTED");
        if(bbqa.d()) {
            jwe.b(this.h, this.q, intentFilter0, 2);
            return;
        }
        jwe.b(this.h, this.q, intentFilter0, 4);
    }

    protected final void i() {
        this.a = hzuz.a.h().B();
        synchronized(this.f) {
            this.c = this.Q();
            this.d = this.B();
        }
        AbstractCloudSyncManager.HeartbeatNotificationReceiver abstractCloudSyncManager$HeartbeatNotificationReceiver0 = new AbstractCloudSyncManager.HeartbeatNotificationReceiver(this);
        Context context0 = this.h;
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("com.google.android.gms.wearable.node.CLOUD_SYNC_HEARTBEAT_NOTIFICATION");
        jwe.b(context0, abstractCloudSyncManager$HeartbeatNotificationReceiver0, intentFilter0, 4);
        if(this.a) {
            AbstractCloudSyncManager.HeartbeatScheduledJobBroadcastReceiver abstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver0 = new AbstractCloudSyncManager.HeartbeatScheduledJobBroadcastReceiver(this);
            jwe.b(context0, abstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver0, abstractCloudSyncManager$HeartbeatScheduledJobBroadcastReceiver0.a, 4);
        }
        this.t.E(this);
        fhag.a(fhao.a(), this);
        if(hzuz.l() && this.i.booleanValue()) {
            this.g.c(this);
        }
    }

    public final void j(String s) {
        if(this.n && this.m.get() && this.F() && (!this.i.booleanValue() || !this.o)) {
            if(!this.w) {
                Log.d("CloudSync", "Enabling cloud route after " + s);
                this.f();
                return;
            }
            if(Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "Cloud route already enabled, not re-enabling after " + s);
            }
            if(hzuz.j()) {
                this.v.b();
            }
        }
        else if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "Not enabling cloud route, dependencies not met after " + s);
        }
    }

    @Override  // fhaq
    public final boolean k() {
        synchronized(this.f) {
        }
        return this.c;
    }

    protected void l(String s) {
        synchronized(this.f) {
            Log.i("CloudSync", "Disabling cloud sync.");
            this.d();
            this.p.a("Cloud sync is disabled: " + s);
        }
    }

    @Override  // fhan
    public final int m() {
        return 14;
    }

    @Override  // ffmj
    public void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("Cloud Sync opted in: " + this.c);
        bbpd0.println("Cloud Sync global setting: " + this.d);
        fcez fcez0 = this.L("/cloud_sync_setting_by_node");
        bbpd0.println("Cloud Sync setting by node for all nodes: " + (fcez0 == null ? "[No CloudSyncByNode DataItem]" : fcez0.toString()));
        bbpd0.println("Cloud Sync key init complete: " + this.m.get());
        bbpd0.println("Cloud route enabled: " + this.w);
        bbpd0.println("GCM connected: " + this.n);
        bbpd0.println("Connected to cloud: " + this.E());
        bbpd0.println("Connection notifications: " + this.k);
        bbpd0.println("EnableTaskSchedulerForHeartbeats Flag: " + this.a);
        bbpd0.println("Cloud route disbouncing: " + hzuz.j() + ", delay(ms): " + hzuz.b());
        bbpd0.println("Legacy Connection notifications flag: " + hzuz.o());
        bbpd0.println("CloudSync Connection notifications flag: " + hzuz.l());
        bbpd0.println("Heartbeats over Cloud Sync enabled: " + hzuz.t());
        bbpd0.println("Heartbeat rescheduling enabled: " + hzuz.i());
        bbpd0.println("Cloud Sync Activity History: ");
        bbpd0.b();
        bbpd0.println(this.p.toString());
        bbpd0.a();
    }

    public final void n(boolean z) {
        synchronized(this.f) {
            if(Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "Initial Cloud sync. opted in: " + this.c + ", Setting: " + this.d);
            }
            if(this.F() && !z) {
                if(Log.isLoggable("CloudSync", 4)) {
                    Log.i("CloudSync", "Init cloud sync.");
                }
                this.p.a("Cloud sync is now enabled (previously disabled)");
                this.g.b();
                this.J();
                if(!hzuz.n()) {
                    this.b();
                }
                else if(hzuz.a.h().F()) {
                    this.j("cloud sync is now enabled");
                }
                fdsh fdsh0 = this.e;
                if(Log.isLoggable("CloudNode", 2)) {
                    Log.v("CloudNode", "received request to start syncing to cloud, scheduling.");
                }
                fdsh0.u = true;
                fdsh0.s = true;
                fdsh0.v.d();
                fdsh0.i.f(1);
            }
            else if(!this.F() && z) {
                this.l((this.c ? "disabled in setting" : "not opted in"));
            }
        }
    }

    @Override  // fduo
    public final void o(ArrayList arrayList0) {
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            fduq fduq0 = (fduq)arrayList0.get(v1);
            if(ffgp.a.equals(fduq0.a) && Objects.equals(fduq0.b.a, "cloud")) {
                String s = fduq0.b.b;
                if(Objects.equals(s, "/cloud_sync_opt_in") || Objects.equals(s, "/cloud_sync_setting") || Objects.equals(s, "/cloud_sync_setting_by_node")) {
                    synchronized(this.f) {
                        boolean z = this.F();
                        fcez fcez0 = fcez.b(fduq0.b.e);
                        if(Objects.equals(s, "/cloud_sync_opt_in")) {
                            this.c = fcez0.v("cloud_sync_opted_in");
                            if(Log.isLoggable("CloudSync", 3)) {
                                Log.d("CloudSync", "CloudSyncOptedIn is set to: " + this.c);
                            }
                        }
                        else if(Objects.equals(s, "/cloud_sync_setting")) {
                            this.d = fcez0.v("cloud_sync_setting_enabled") && this.C();
                            if(Log.isLoggable("CloudSync", 3)) {
                                Log.d("CloudSync", "CloudSyncSetting is set to: " + this.d);
                            }
                        }
                        else if(Objects.equals(s, "/cloud_sync_setting_by_node")) {
                            String s1 = this.g.a().a;
                            if(fcez0.u(s1) && this.i.booleanValue()) {
                                boolean z1 = fcez0.v(s1);
                                if(Log.isLoggable("CloudSync", 3)) {
                                    Log.d("CloudSync", "CloudSyncSetting set via SettingByNode to: " + z1 + ", current setting: " + this.d);
                                }
                                this.z(z1);
                                goto label_34;
                            }
                            return;
                        }
                    label_34:
                        this.n(z);
                    }
                }
            }
            ++v1;
        }
    }

    @Override  // fduj
    public final void p(Collection collection0) {
        this.M();
    }

    @Override  // fdxo
    public final void q(String s) {
        fcez fcez0 = this.L("/cloud_sync_setting_by_node");
        if(fcez0 != null && fcez0.a.remove(s) != null) {
            fdur.j(this.t, "cloud", "/cloud_sync_setting_by_node", fcez0);
        }
    }

    @Override  // fduj
    public final void r(fdxn fdxn0, int v, boolean z) {
        this.M();
    }

    @Override  // fduj
    public final void s(fdxn fdxn0) {
        this.M();
    }

    @Override  // fdue
    public final void t(boolean z) {
        boolean z1 = this.Q();
        if(z1 && !z) {
            this.e.j("cloud");
        }
        fcez fcez0 = new fcez();
        fcez0.j("cloud_sync_opted_in", z);
        fdur.j(this.t, "cloud", "/cloud_sync_opt_in", fcez0);
        if(!hzuz.a.h().p()) {
            this.z(z);
        }
        else if(z1 != z) {
            this.z(z);
        }
        this.p.a("optInCloudSync: opting " + (z ? "IN" : "OUT"));
    }

    @Override  // fdue
    public final void u(String s) {
        this.p.a(s);
    }

    @Override  // fdue
    public final void v() {
        long v = SystemClock.elapsedRealtime();
        if(v - this.x > hzuz.a.h().d()) {
            this.N(this.u.incrementAndGet());
            this.x = v;
        }
    }

    public final void w() {
        if(!hzuz.j()) {
            this.d();
            return;
        }
        if(!this.w) {
            Log.d("CloudSync", "scheduling disable of cloud route when already disabled");
            return;
        }
        AbstractCloudSyncManager.CloudRouteDebouncer abstractCloudSyncManager$CloudRouteDebouncer0 = this.v;
        if(abstractCloudSyncManager$CloudRouteDebouncer0.b) {
            Log.d("CloudSync", "Not scheduling cloud route disable, pending disable already in progress");
            return;
        }
        Log.d("CloudSync", "Scheduling cloud route disable after debounce delay");
        abstractCloudSyncManager$CloudRouteDebouncer0.b = true;
        long v = SystemClock.elapsedRealtime();
        long v1 = hzuz.b() + v;
        abstractCloudSyncManager$CloudRouteDebouncer0.c.l.d("CloudSync", 2, v1, abstractCloudSyncManager$CloudRouteDebouncer0.a, "com.google.android.gms");
    }

    public final void x(int v) {
        if(this.k && v == this.u.get() && !this.a) {
            this.P();
            this.N(v);
        }
    }

    public final void y(int v) {
        this.P();
        Bundle bundle0 = new Bundle();
        bundle0.putInt("initial_heartbeat_num", v);
        if(hzuz.m()) {
            bundle0.putLong("heartbeat_scheduled_time", SystemClock.elapsedRealtime());
        }
        clkn clkn0 = new clkn();
        clkn0.t("CloudSyncHeartbeatTask");
        clkn0.w("com.google.android.gms.wearable.backgroundschedulertasks.CloudSyncHeartbeatBackgroundTask");
        clkn0.e(1020L, 1620L);
        clkn0.g(2);
        clkn0.u = bundle0;
        clkn0.v(1);
        clko clko0 = clkn0.a();
        cljp.a(AppContextProvider.a()).f(clko0);
        CloudSyncHeartbeatBackgroundTask.d("%s is scheduled, heartBeatNum: %s", new Object[]{"CloudSyncHeartbeatTask", v});
    }

    @Override  // fdue
    public void z(boolean z) {
        if(Log.isLoggable("CloudSync", 3)) {
            Log.d("CloudSync", "setCloudSyncSetting - enabled: " + z);
        }
        fcez fcez0 = new fcez();
        fcez0.j("cloud_sync_setting_enabled", z);
        fdur.j(this.t, "cloud", "/cloud_sync_setting", fcez0);
    }
}

