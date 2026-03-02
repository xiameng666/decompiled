import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.backup.extension.backup.CustomBackupRequest;
import com.google.android.gms.backup.extension.backup.CustomBackupResult;
import com.google.android.gms.backup.extension.backup.HostInfo;
import com.google.android.gms.backup.settings.backupnow.CustomBackupRunner.2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class asgu {
    public static final baun a;
    public final String b;
    public final CustomBackupRequest c;
    public final gmcu d;
    public final asfu e;
    public volatile boolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public arsq i;
    public arst j;
    public float k;
    public int l;
    private final long m;
    private final long n;
    private final long o;
    private final Context p;
    private final Intent q;
    private final ScheduledExecutorService r;
    private final asfw s;
    private final boolean t;
    private azox u;
    private ConnectivityManager.NetworkCallback v;
    private ConnectivityManager w;
    private final aqzt x;

    static {
        asgu.a = aqql.a("CustomBackupRunner");
    }

    public asgu(Context context0, String s, Intent intent0, CustomBackupRequest customBackupRequest0, asfu asfu0, asfw asfw0, aqzt aqzt0, boolean z) {
        gmcu gmcu0 = new gmcu();
        bbll bbll0 = new bbll(1, 9);
        super();
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.p = context0;
        this.b = s;
        this.q = intent0;
        this.c = customBackupRequest0;
        this.d = gmcu0;
        this.r = bbll0;
        this.e = asfu0;
        this.t = z;
        this.s = asfw0;
        this.x = aqzt0;
        this.m = TimeUnit.SECONDS.toMillis(hqil.a.j().h());
        this.n = TimeUnit.SECONDS.toMillis(hqil.a.j().f());
        this.o = TimeUnit.SECONDS.toMillis(hqil.c());
    }

    final int a(asfv asfv0, asgb asgb0, asgc asgc0) {
        baun baun1;
        int v1;
        String s = this.b;
        baun baun0 = asgu.a;
        baun0.j("Running backups for package: %s", new Object[]{s});
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        int v = asgb0.e;
        asgb0.e = v + 1;
        asgb0.f = 0.0f;
        batl.n(v + 1 < asgb0.d, "Cannot start custom backup for package number %d sinceit exceeds the total number (%d) of allowed packages", new Object[]{((int)(v + 2)), ((int)asgb0.d)});
        this.u = new azox();
        Context context0 = this.p;
        if(!bbic.a().d(context0, this.q, this.u, 1)) {
            aqzt aqzt0 = this.x;
            if(aqzt0 != null) {
                try {
                    if(aqzt0.a.getPackageManager().getApplicationInfo(s, 0).enabled) {
                        goto label_21;
                    }
                    else {
                        v1 = 5;
                    }
                }
                catch(PackageManager.NameNotFoundException unused_ex) {
                    v1 = 6;
                }
                catch(NullPointerException unused_ex) {
                    v1 = 7;
                }
                aqzt0.a(s, v1);
                baun0.f("Connections failed for the service of package: %s", new Object[]{s});
                return 29001;
            label_21:
                v1 = 4;
                aqzt0.a(s, v1);
            }
            baun0.f("Connections failed for the service of package: %s", new Object[]{s});
            return 29001;
        }
        aqzt aqzt1 = this.x;
        if(aqzt1 != null) {
            aqzt1.a(s, 2);
        }
        arst arst0 = this.d(this.u, s);
        this.j = arst0;
        if(arst0 == null) {
            baun0.f("Failed to bind to service of package: %s", new Object[]{s});
            return 29001;
        }
        this.i = new arsp(this, asgb0, asfv0, asgc0);
        try {
            try {
                asgt asgt0 = new asgt(this);
                ((bbll)this.r).a(asgt0, this.o, this.o, TimeUnit.MILLISECONDS);
                asfu asfu0 = this.e;
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ghys.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gicb.a).v_newBuilder();
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv0 = hftp1.b_message;
                s.getClass();
                ((gicb)hftv0).b |= 1;
                ((gicb)hftv0).c = s;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                gicb gicb0 = (gicb)hftp1.b_message;
                gicb0.b |= 2;
                gicb0.d = 1;
                gicb gicb1 = (gicb)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ghys ghys0 = (ghys)hftp0.b_message;
                gicb1.getClass();
                ghys0.ac = gicb1;
                ghys0.d |= 4;
                asfu0.e(((ghys)hftp0.N_build()), ghyr.al);
                this.j.b(this.i, new HostInfo(1));
                if(this.g()) {
                    ConnectivityManager connectivityManager0 = this.s.a(context0);
                    this.w = connectivityManager0;
                    if(connectivityManager0 != null) {
                        CustomBackupRunner.2 customBackupRunner$20 = new CustomBackupRunner.2(this, atomicBoolean0);
                        this.v = customBackupRunner$20;
                        this.w.registerDefaultNetworkCallback(customBackupRunner$20);
                    }
                }
                baun0.j("Waiting for the backup service of package %s to finish", new Object[]{s});
                this.f(s);
                goto label_87;
            }
            catch(RemoteException remoteException0) {
            }
            baun1 = asgu.a;
            baun1.g("Exception while trying to do custom backup for package: %s", remoteException0, new Object[]{this.b});
        }
        catch(Throwable throwable0) {
            goto label_80;
        }
        gmcu gmcu0 = this.d;
        if(!gmcu0.isDone() && !gmcu0.isCancelled()) {
            gmcu0.cancel(true);
        }
        this.e();
        baun1.j("Unbinding from the service", new Object[0]);
        this.c();
        return 29001;
    label_80:
        gmcu gmcu1 = this.d;
        if(!gmcu1.isDone() && !gmcu1.isCancelled()) {
            gmcu1.cancel(true);
        }
        this.e();
        asgu.a.j("Unbinding from the service", new Object[0]);
        this.c();
        throw throwable0;
    label_87:
        gmcu gmcu2 = this.d;
        if(!gmcu2.isDone() && !gmcu2.isCancelled()) {
            gmcu2.cancel(true);
        }
        this.e();
        baun0.j("Unbinding from the service", new Object[0]);
        this.c();
        return atomicBoolean0.get() ? 29002 : 29000;
    }

    public final void b() {
        this.f = false;
        this.d.cancel(true);
        this.h.set(true);
        try {
            this.j.a(this.i);
        }
        catch(RemoteException remoteException0) {
            asgu.a.g("Could not cancel custom backup", remoteException0, new Object[]{this.b});
        }
        this.c();
    }

    public final void c() {
        this.g.set(true);
        this.r.shutdownNow();
        bbic.a().b(this.p, this.u);
    }

    private final arst d(azox azox0, String s) {
        try {
            IBinder iBinder0 = azox0.b(this.m, TimeUnit.MILLISECONDS);
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.extension.backup.ICustomBackupService");
            return (iInterface0 instanceof arst) ? ((arst)iInterface0) : new arsr(iBinder0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            asgu.a.g("Interrupted while binding to the service of package: %s", interruptedException0, new Object[]{s});
            return null;
        }
        catch(TimeoutException timeoutException0) {
            asgu.a.g("Timed out while binding to the service of package: %s", timeoutException0, new Object[]{s});
            return null;
        }
    }

    private final void e() {
        if(this.g()) {
            ConnectivityManager connectivityManager0 = this.w;
            if(connectivityManager0 != null) {
                ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0 = this.v;
                if(connectivityManager$NetworkCallback0 != null) {
                    connectivityManager0.unregisterNetworkCallback(connectivityManager$NetworkCallback0);
                }
            }
        }
    }

    private final void f(String s) {
        try {
            gmcu gmcu0 = this.d;
            if(!gmcu0.isCancelled()) {
                gmcu0.v(this.n, TimeUnit.MILLISECONDS);
            }
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            asgu.a.g("Waiting for backup completion was interrupted", interruptedException0, new Object[0]);
            this.b();
        }
        catch(ExecutionException executionException0) {
            asgu.a.g("Exception while waiting for backup completion", executionException0, new Object[0]);
            this.b();
        }
        catch(TimeoutException timeoutException0) {
            asgu.a.g("Custom Backup of the packages %s timed out", timeoutException0, new Object[]{s});
            if(this.g.get()) {
                CustomBackupResult customBackupResult0 = new CustomBackupResult(false, "TIMEOUT_OVERALL");
                this.e.c(s, customBackupResult0);
            }
            else {
                CustomBackupResult customBackupResult1 = new CustomBackupResult(false, "TIMEOUT_OVERALL");
                this.e.d(s, customBackupResult1);
            }
            this.b();
        }
        catch(CancellationException cancellationException0) {
            asgu.a.g("Custom Backup of the packages %s was cancelled", cancellationException0, new Object[]{s});
            this.c();
        }
    }

    private final boolean g() {
        return hqil.a.j().G() && this.t;
    }
}

