import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationRequest.Builder;
import android.location.LocationRequest;
import android.net.ConnectivityManager.OnNetworkActiveListener;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.modules.location.base.AppContextProvider;
import com.google.android.gms.libs.identity.ImmutableWorkSource;
import com.google.android.gms.libs.platform.GmsAlarmManagerCompat.OnAlarmListener;
import com.google.android.gms.libs.punchclock.tracing.TracingLocationListener;
import com.google.android.location.bluesky.prlib.assistance.AliothAssistanceProvider.1;
import com.google.android.location.bluesky.prlib.assistance.AliothAssistanceProvider.3;
import j..time.Duration;
import j..util.Objects;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class fvev extends fvfm {
    public final AtomicReference a;
    public cjnn b;
    public long c;
    public final List d;
    public static final int e;
    private static final Duration m;
    private static fvev n;
    private static fvfi o;
    private final cnuj p;
    private final LocationManager q;
    private final ConnectivityManager r;
    private final Random s;
    private final TracingLocationListener t;
    private final ConnectivityManager.OnNetworkActiveListener u;
    private final GmsAlarmManagerCompat.OnAlarmListener v;
    private final cjnr w;
    private final fveq x;

    static {
        fvev.m = Duration.ofMinutes(10L);
    }

    public fvev(Context context0, cnuj cnuj0, Executor executor0) {
        fveq fveq0 = new fveq(context0);
        super(executor0);
        this.a = new AtomicReference();
        this.s = new Random();
        this.t = new AliothAssistanceProvider.1(this);
        this.d = new ArrayList();
        this.u = new fvet(this);
        this.v = new AliothAssistanceProvider.3(this);
        this.p = cnuj0;
        this.w = cjnm.b(context0);
        this.q = (LocationManager)context0.getSystemService(LocationManager.class);
        this.r = (ConnectivityManager)context0.getSystemService(ConnectivityManager.class);
        this.x = fveq0;
    }

    @Override  // fvfm
    protected final long a() {
        return SystemClock.elapsedRealtime();
    }

    public static fvev b() {
        synchronized(fvev.class) {
            if(fvev.n == null) {
                Context context0 = (Context)Objects.requireNonNull(ModuleManager.createSubmoduleContext(AppContextProvider.a(), "gnss_location_provider"));
                fvev.n = new fvev(context0, new cnuj(context0), new bbll(1, 9));
            }
        }
        return fvev.n;
    }

    public static fvfi c() {
        synchronized(fvev.class) {
            if(fvev.o == null) {
                fvev.o = new fvfi(fvev.b());
            }
        }
        return fvev.o;
    }

    @Override  // fvfm
    protected final ggzv d() {
        Location location0 = (Location)this.a.get();
        if(location0 == null || fvev.j(location0)) {
            location0 = this.q.getLastKnownLocation("fused");
            return location0 == null || fvev.j(location0) ? null : ggzv.i(location0.getLatitude(), location0.getLongitude());
        }
        return ggzv.i(location0.getLatitude(), location0.getLongitude());
    }

    @Override  // fvfm
    protected final void e(fvfn fvfn0) {
        if(fvfn0 == null) {
            this.i();
            this.r.removeDefaultNetworkActiveListener(this.u);
            this.q.removeUpdates(this.t);
            return;
        }
        LocationRequest locationRequest0 = new LocationRequest.Builder(0x7FFFFFFFFFFFFFFFL).setMinUpdateIntervalMillis(0L).build();
        this.q.requestLocationUpdates("gps", locationRequest0, this.f, this.t);
        this.r.addDefaultNetworkActiveListener(this.u);
    }

    public final void f() {
        this.i();
        fvfn fvfn0 = this.h;
        if(!this.j && fvfn0 != null && this.g != null) {
            long v = SystemClock.elapsedRealtime();
            ggzv ggzv0 = this.d();
            boolean z = fvfn0.a;
            if(z && ggzv0 != null) {
                this.l = v;
            }
            this.k = v;
            this.j = true;
            Integer integer0 = null;
            ggzv ggzv1 = this.x.a() ? ggzv0 : null;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxpt.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxpt.c(((gxpt)hftp0.b_message));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gxpt)hftv0).b |= 1;
            ((gxpt)hftv0).c = true;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gxpt)hftv1).b |= 8;
            ((gxpt)hftv1).e = true;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gxpt)hftv2).b |= 0x40;
            ((gxpt)hftv2).g = true;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp0.b_message;
            ((gxpt)hftv3).b |= 16;
            ((gxpt)hftv3).f = true;
            if(!hftv3.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv4 = hftp0.b_message;
            ((gxpt)hftv4).b |= 4;
            ((gxpt)hftv4).d = true;
            if(!hftv4.isImmutable()) {
                hftp0.ensureMutable();
            }
            gxpt.b(((gxpt)hftp0.b_message));
            if(z && ggzv1 != null) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gxpt gxpt0 = (gxpt)hftp0.b_message;
                gxpt0.b |= 0x80;
                gxpt0.h = true;
            }
            gxpr gxpr0 = (gxpr)((ProtoLiteMessage)gxps.a).v_newBuilder();
            gxpr0.a(EnumSet.allOf(gxrc.class));
            if(!gxpr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)gxpr0).ensureMutable();
            }
            gxps gxps0 = (gxps)gxpr0.b_message;
            gxpt gxpt1 = (gxpt)hftp0.N_build();
            gxpt1.getClass();
            gxps0.d = gxpt1;
            gxps0.b |= 1;
            if(z && ggzv1 != null) {
                long v1 = ggym.A(ggzv1).E(8).c;
                if(!gxpr0.b_message.isImmutable()) {
                    ((ProtoLiteBuilder)gxpr0).ensureMutable();
                }
                gxps gxps1 = (gxps)gxpr0.b_message;
                gxps1.b |= 2;
                gxps1.e = v1;
            }
            gxps gxps2 = (gxps)((ProtoLiteBuilder)gxpr0).N_build();
            for(Object object0: this.d) {
                cmqj cmqj0 = ((cmpj)object0).a.u;
                if(cmqj0 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gwsr.a).v_newBuilder();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gwsr gwsr0 = (gwsr)hftp1.b_message;
                    gxps2.getClass();
                    gwsr0.c = gxps2;
                    gwsr0.b = 14;
                    cmqj0.a(((gwsr)hftp1.N_build()), SystemClock.elapsedRealtime());
                }
            }
            ImmutableWorkSource immutableWorkSource0 = fvfn0.e;
            if(hulu.f() && immutableWorkSource0 != null) {
                int v2 = immutableWorkSource0.b().size();
                if(v2 != 0) {
                    integer0 = immutableWorkSource0.b().getUid(this.s.nextInt(v2));
                }
            }
            gmcd gmcd0 = integer0 == null ? this.p.a(gxps2, fvfn0.f) : this.p.b(gxps2, integer0.intValue(), fvfn0.f);
            fveu fveu0 = new fveu(this);
            Executor executor0 = this.f;
            gmbu.t(gmcd0, fveu0, executor0);
            gmbu.t(glzd.f(gmcd0, new fvep(fvfn0, ggzv0), executor0), new fvfl(this, fvfn0), this.f);
        }
    }

    @Override  // fvfm
    protected final void g(long v) {
        if(this.c == v) {
            return;
        }
        this.c = v;
        this.b = this.w.b("AliothAssistanceProvider:periodic_download", 3, v, null, this.f, this.v);
    }

    private final void i() {
        cjnn cjnn0 = this.b;
        if(cjnn0 != null) {
            this.c = 0L;
            cjnn0.a();
            this.b = null;
        }
    }

    private static boolean j(Location location0) {
        return SystemClock.elapsedRealtime() - location0.getElapsedRealtimeMillis() > fvev.m.toMillis();
    }
}

