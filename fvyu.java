import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest.Builder;
import android.location.provider.ProviderRequest.ChangedListener;
import android.location.provider.ProviderRequest;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.util.StatsEvent.Builder;
import android.util.StatsEvent;
import android.util.StatsLog;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tensorgps.TensorGpsMetrics;
import com.google.android.location.fused.analytics.GnssMetricsTensorGpsLogger.GnssLocationListener;
import com.google.android.location.fused.analytics.GnssMetricsTensorGpsLogger.GnssStatusCallback;
import j..time.Duration;
import j..util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public final class fvyu extends cnmf implements ProviderRequest.ChangedListener, evto, evtq {
    public final Object a;
    public Context b;
    public LocationManager c;
    public evtn d;
    public Runnable e;
    public int f;
    public boolean g;
    public int h;
    public long i;
    public Location j;
    public boolean k;
    public fvyh l;
    public static final int m;
    private static final bboh n;
    private GnssMetricsTensorGpsLogger.GnssLocationListener o;
    private cmnh p;
    private cmoa q;
    private ScheduledExecutorService r;
    private GnssMetricsTensorGpsLogger.GnssStatusCallback s;
    private boolean t;
    private ScheduledFuture u;
    private int v;
    private boolean w;
    private boolean x;

    static {
        fvyu.n = bboh.a("GnssMetricsLogger");
    }

    public fvyu() {
        this.a = new Object();
        this.k = false;
        this.l = null;
        this.x = false;
    }

    @Override  // cnmf
    public final void a(Context context0) {
        evql evql0;
        Context context1 = (Context)Objects.requireNonNull(ModuleManager.createSubmoduleContext(context0, "fused_location_provider"));
        this.b = context1;
        if(this.p == null) {
            this.p = new cnjv(context1);
        }
        LocationManager locationManager0 = (LocationManager)this.b.getSystemService("location");
        gftb.check(locationManager0);
        this.c = locationManager0;
        this.o = new GnssMetricsTensorGpsLogger.GnssLocationListener(this, this.b);
        this.r = new bbll(1, 9);
        this.q = new fvyt(this);
        this.s = new GnssMetricsTensorGpsLogger.GnssStatusCallback(this, this.b);
        this.d = new evuf(this.b);
        try {
            this.c.addProviderRequestChangedListener(this.r, this);
            cmnh cmnh0 = this.p;
            cmoc cmoc0 = new cmoc(0L);
            cmoc0.k(105);
            cmnh0.k(cmoc0.a(), this.r, this.q);
            this.c.requestLocationUpdates("gps", new LocationRequest.Builder(0x7FFFFFFFFFFFFFFFL).setMinUpdateIntervalMillis(0L).build(), this.r, this.o);
            GnssMetricsTensorGpsLogger.GnssStatusCallback gnssMetricsTensorGpsLogger$GnssStatusCallback0 = this.s;
            if(gnssMetricsTensorGpsLogger$GnssStatusCallback0 != null) {
                jym.c(this.c, this.r, ((jye)Objects.requireNonNull(gnssMetricsTensorGpsLogger$GnssStatusCallback0)));
            }
            this.g(1);
            this.m(0);
            evtn evtn0 = this.d;
            if(evtn0 != null) {
                evtn0.b(this).A(new fvyo());
            }
            evtn evtn1 = this.d;
            if(evtn1 != null) {
                azyf azyf0 = ((azts)evtn1).iD(this, "TensorGpsMetricsListener");
                azyd_linstner azyd0 = azyf0.listener_;
                if(azyd0 == null) {
                    evql0 = evrg.d(null);
                }
                else {
                    int v = azyd0.hashCode();
                    evtu evtu0 = new evtu(((evuf)evtn1), v, azyf0);
                    evtv evtv0 = new evtv(((evuf)evtn1), v);
                    azyq azyq0 = new azyq();
                    azyq0.c = azyf0;
                    azyq0.d = new Feature[]{evtm.b};
                    azyq0.a = evtu0;
                    azyq0.b = evtv0;
                    azyq0.e = 0x85FF;
                    evql0 = ((azts)evtn1).iH(azyq0.a());
                }
                evql0.b(new fvyp(this));
                evql0.A(new fvyq(this));
            }
            this.t = true;
        }
        catch(SecurityException securityException0) {
            a.ae(fvyu.n.i(), "Could not instantiate GnssMetricsLogger due to missing permissions", securityException0);
            this.t = false;
        }
    }

    @Override  // cnmf
    public final void b() {
        if(this.t) {
            this.c.removeProviderRequestChangedListener(this);
            this.c.removeUpdates(this.o);
            this.p.f(this.q);
            GnssMetricsTensorGpsLogger.GnssStatusCallback gnssMetricsTensorGpsLogger$GnssStatusCallback0 = this.s;
            if(gnssMetricsTensorGpsLogger$GnssStatusCallback0 != null) {
                jym.a(this.c, ((jye)Objects.requireNonNull(gnssMetricsTensorGpsLogger$GnssStatusCallback0)));
            }
            this.g(0);
            this.m(0);
            evtn evtn0 = this.d;
            if(evtn0 != null) {
                evtn0.c(this).A(new fvyr());
            }
            evtn evtn1 = this.d;
            if(evtn1 != null) {
                ((azts)evtn1).jm(azyg.a(this, "TensorGpsMetricsListener"), 0x8600).A(new fvys());
            }
            this.t = false;
        }
    }

    @Override  // evtq
    public final void c(TensorGpsMetrics tensorGpsMetrics0) {
        synchronized(this.a) {
            if(!this.g) {
                return;
            }
            if(this.k) {
                fvyh fvyh0 = this.l;
                if(fvyh0 != null && fvyh0.m == null) {
                    fvyh0.m = tensorGpsMetrics0;
                    if(this.i()) {
                        this.f();
                    }
                }
            }
        }
    }

    public final void e(Location location0) {
        Object object0 = this.a;
        synchronized(object0) {
            Bundle bundle0 = location0.getExtras();
            if(bundle0 != null && bundle0.containsKey("indoorProbability")) {
                int v = ((double)bundle0.getFloat("indoorProbability")) > huum.b() ? 2 : 1;
                if(v != this.f) {
                    this.k();
                }
                this.m(v);
                this.l();
            }
            if(Objects.equals(location0.getProvider(), "gps")) {
                if(this.g) {
                    __monitor_enter(object0);
                    goto label_12;
                }
                goto label_39;
            }
            goto label_45;
        }
        try {
        label_12:
            if(this.k) {
                fvyh fvyh0 = this.l;
                if(fvyh0 == null) {
                    goto label_31;
                }
                else if(!hyys.c() || (location0.getElapsedRealtimeNanos() & 0xFFFFFL) != 0xEAED9L) {
                    location0.getLatitude();
                    location0.getLongitude();
                    location0.getAccuracy();
                    if(fvyh0.d == null) {
                        fvyh0.d = location0;
                        fvyh0.l(this.j());
                    }
                    if(this.i > 0L) {
                        Duration duration0 = Duration.ofNanos(location0.getElapsedRealtimeNanos() - this.i);
                        duration0.toMillis();
                        fvyh0.d(duration0);
                    }
                    if(this.i()) {
                        this.f();
                    }
                    goto label_33;
                }
                else {
                    this.x = true;
                }
            }
            else {
            label_31:
                if(!this.w) {
                    this.h(location0);
                }
            label_33:
                this.w = true;
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                __monitor_exit(object0);
                throw throwable0;
            }
        }
        __monitor_exit(object0);
        try {
        label_39:
            this.g(1);
            this.l();
        }
        catch(Throwable throwable0) {
            __monitor_exit(object0);
            throw throwable0;
        }
    label_45:
        __monitor_exit(object0);
    }

    public final void f() {
        synchronized(this.a) {
            if(this.k) {
                fvyh fvyh0 = this.l;
                if(fvyh0 != null) {
                    if(fvyh0.n == -1) {
                        Duration duration0 = fvyh0.b;
                        if(duration0 != null) {
                            Duration duration1 = fvyh0.c;
                            if(duration1 != null) {
                                fvyi fvyi0 = new fvyi(fvyh0.a, duration0, duration1, fvyh0.d, fvyh0.e, fvyh0.f, fvyh0.g, fvyh0.h, fvyh0.i, fvyh0.j, fvyh0.k, fvyh0.l, fvyh0.m);
                                TensorGpsMetrics tensorGpsMetrics0 = fvyi0.m;
                                if(tensorGpsMetrics0 == null) {
                                    return;
                                }
                                int v1 = (int)fvyi0.b.toMillis();
                                float f = fvyi0.d == null ? 0.0f : fvyi0.d.getAccuracy();
                                float f1 = fvyi0.l == null ? 0.0f : fvyi0.l.getAccuracy();
                                float f2 = fvyi0.d == null || fvyi0.l == null ? 0.0f : fvyi0.l.distanceTo(fvyi0.d);
                                float f3 = tensorGpsMetrics0.f == null ? 0.0f : tensorGpsMetrics0.f.getAccuracy();
                                float f4 = tensorGpsMetrics0.f == null || fvyi0.l == null ? 0.0f : fvyi0.l.distanceTo(tensorGpsMetrics0.f);
                                boolean z = this.x;
                                StatsEvent.Builder statsEvent$Builder0 = StatsEvent.newBuilder();
                                statsEvent$Builder0.setAtomId(202004);
                                statsEvent$Builder0.writeInt(fvyi0.a);
                                statsEvent$Builder0.writeInt(v1);
                                statsEvent$Builder0.writeFloat(f);
                                statsEvent$Builder0.writeInt((fvyi0.c.toSeconds() == 0L ? 0x7FFFFFFF : ((int)fvyi0.c.toSeconds())));
                                statsEvent$Builder0.writeInt(fvyi0.e);
                                statsEvent$Builder0.writeInt(fvyi0.f);
                                statsEvent$Builder0.writeInt(fvyi0.g);
                                statsEvent$Builder0.writeInt(fvyi0.h);
                                statsEvent$Builder0.writeInt(fvyi0.i);
                                statsEvent$Builder0.writeInt(fvyi0.j);
                                statsEvent$Builder0.writeInt(fvyi0.k);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.a);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.b);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.c);
                                statsEvent$Builder0.writeFloat(f1);
                                statsEvent$Builder0.writeFloat(f2);
                                statsEvent$Builder0.writeFloat(f3);
                                statsEvent$Builder0.writeFloat(f4);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.h);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.e);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.g);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.d / 1000);
                                statsEvent$Builder0.writeFloat(tensorGpsMetrics0.i);
                                statsEvent$Builder0.writeFloat(tensorGpsMetrics0.j);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.k);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.l);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.m);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.n);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.o);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.p);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.q);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.r);
                                statsEvent$Builder0.writeLong(tensorGpsMetrics0.s);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.t);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.u);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.v);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.w);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.x);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.y);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.z);
                                statsEvent$Builder0.writeLong(tensorGpsMetrics0.A);
                                statsEvent$Builder0.writeLong(tensorGpsMetrics0.B);
                                statsEvent$Builder0.writeLong(tensorGpsMetrics0.C);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.D);
                                statsEvent$Builder0.writeInt(tensorGpsMetrics0.E);
                                statsEvent$Builder0.writeFloat(tensorGpsMetrics0.F);
                                statsEvent$Builder0.writeFloat(tensorGpsMetrics0.G);
                                statsEvent$Builder0.writeFloat(tensorGpsMetrics0.H);
                                statsEvent$Builder0.writeBoolean(z);
                                statsEvent$Builder0.usePooledBuffer();
                                StatsLog.write(statsEvent$Builder0.build());
                                this.l = fvyi.a();
                                this.x = false;
                                return;
                            }
                        }
                    }
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if((fvyh0.n & 1) == 0) {
                        stringBuilder0.append(" networkState");
                    }
                    if(fvyh0.b == null) {
                        stringBuilder0.append(" gnssTimeToFirstFix");
                    }
                    if(fvyh0.c == null) {
                        stringBuilder0.append(" gnssTimeSinceLastFix");
                    }
                    if((fvyh0.n & 2) == 0) {
                        stringBuilder0.append(" gnssSvsUsedInFixCount");
                    }
                    if((fvyh0.n & 4) == 0) {
                        stringBuilder0.append(" meanCnoGnssSvsUsedInFix");
                    }
                    if((fvyh0.n & 8) == 0) {
                        stringBuilder0.append(" maxCnoGnssSvsUsedInFix");
                    }
                    if((fvyh0.n & 16) == 0) {
                        stringBuilder0.append(" gpsSvsUsedInFixCount");
                    }
                    if((fvyh0.n & 0x20) == 0) {
                        stringBuilder0.append(" meanCn0GpsSvsUsedInFix");
                    }
                    if((fvyh0.n & 0x40) == 0) {
                        stringBuilder0.append(" maxCn0GpsSvsUsedInFix");
                    }
                    if((fvyh0.n & 0x80) == 0) {
                        stringBuilder0.append(" maxCn0GpsSvsElevationDegrees");
                    }
                    throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
                }
            }
        }
    }

    public final void g(int v) {
        synchronized(this.a) {
            if(this.v == v) {
                return;
            }
            this.v = v;
            fwdz.a(202002, v);
        }
    }

    public final void h(Location location0) {
        synchronized(this.a) {
            if(this.h == 0) {
                this.j = location0;
                return;
            }
            this.j = null;
            int v1 = this.i <= 0L ? 0x7FFFFFFF : ((int)(((double)(location0.getElapsedRealtimeNanos() - this.i)) / 1000000000.0));
            Bundle bundle0 = location0.getExtras();
            if(bundle0 != null) {
                StatsLog.write(StatsEvent.newBuilder().setAtomId(202004).writeInt(this.j()).writeInt(this.h).writeFloat(location0.getAccuracy()).writeInt(v1).writeInt(bundle0.getInt("satellites")).writeInt(bundle0.getInt("meanCn0")).writeInt(bundle0.getInt("maxCn0")).usePooledBuffer().build());
            }
            this.h = 0;
        }
    }

    public final boolean i() {
        boolean z;
        synchronized(this.a) {
            fvyh fvyh0 = this.l;
            z = false;
            if(fvyh0 == null) {
                return false;
            }
            if(!fvyh0.b().isZero() && fvyh0.d != null && fvyh0.a() > 0 && fvyh0.m != null) {
                z = true;
            }
        }
        return z;
    }

    private final int j() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.b.getSystemService("connectivity");
        gftb.check(connectivityManager0);
        NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
        if(networkCapabilities0 == null) {
            return 0;
        }
        boolean z = networkCapabilities0.hasTransport(1);
        boolean z1 = networkCapabilities0.hasTransport(0);
        if(z && z1) {
            return 3;
        }
        if(z) {
            return 1;
        }
        return z1 ? 2 : 0;
    }

    private final void k() {
        synchronized(this.a) {
            if(this.e != null) {
                ScheduledFuture scheduledFuture0 = this.u;
                if(scheduledFuture0 != null) {
                    scheduledFuture0.cancel(false);
                    this.e = null;
                }
            }
        }
    }

    private final void l() {
        Object object0 = this.a;
        __monitor_enter(object0);
        try {
            if(!this.g || this.w || this.f != 1) {
                if(!hutn.d() || !this.g || this.w || this.f != 2) {
                    if(!this.g || this.w || this.f == 2) {
                        this.k();
                    }
                    FIN.finallyExec$NT(v);
                    return;
                }
                __monitor_enter(object0);
                goto label_9;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
        label_9:
            if(this.e == null) {
                fvyn fvyn0 = new fvyn(this);
                this.e = fvyn0;
                this.u = ((bbll)this.r).g(fvyn0, hutn.b(), TimeUnit.MILLISECONDS);
            }
        }
        catch(Throwable throwable1) {
            try {
                __monitor_exit(object0);
                throw throwable1;
            }
            catch(Throwable throwable0) {
                goto label_30;
            }
        }
        __monitor_exit(object0);
        __monitor_exit(object0);
        return;
        try {
        label_20:
            __monitor_enter(object0);
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
            if(this.e == null) {
                fvyn fvyn1 = new fvyn(this);
                this.e = fvyn1;
                this.u = ((bbll)this.r).g(fvyn1, huum.c(), TimeUnit.MILLISECONDS);
            }
            goto label_32;
        }
        catch(Throwable throwable2) {
            try {
                __monitor_exit(object0);
                throw throwable2;
            }
            catch(Throwable throwable0) {
            }
        }
    label_30:
        __monitor_exit(object0);
        throw throwable0;
    label_32:
        __monitor_exit(object0);
        FIN.finallyExec$NT(v);
    }

    private final void m(int v) {
        synchronized(this.a) {
            if(this.f == v) {
                return;
            }
            this.f = v;
            fwdz.a(202001, v);
        }
    }

    @Override  // evto
    public final void mw(Location location0) {
        synchronized(this.a) {
            if(!this.g) {
                return;
            }
            if(this.k) {
                fvyh fvyh0 = this.l;
                if(fvyh0 != null && fvyh0.l == null) {
                    fvyh0.l = location0;
                    location0.getLatitude();
                    location0.getLongitude();
                    location0.getAccuracy();
                    if(this.i()) {
                        this.f();
                    }
                }
            }
        }
    }

    public final void onProviderRequestChanged(String s, ProviderRequest providerRequest0) {
        if(!s.equals("gps")) {
            return;
        }
        synchronized(this.a) {
            if(providerRequest0.isActive() != this.g) {
                this.w = false;
            }
            this.g = providerRequest0.isActive();
            this.l();
            if(this.k && !this.g) {
                this.l = fvyi.a();
                this.x = false;
            }
        }
    }
}

