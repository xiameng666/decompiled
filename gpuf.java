import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class gpuf extends gpua {
    public static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private final ISensorFusionProcessor f;
    private final ISensorFusionProcessor g;
    private final ObserverRegistry h;
    private final String i;
    private final flp18Flags_phenotype j;
    private gptu_Position k;
    private long l;
    private motionState m;
    private long n;
    private motionState o;
    private long p;
    private gpue q;
    private double r;

    static {
        gpuf.b = TimeUnit.MINUTES.toNanos(4L);
        gpuf.c = TimeUnit.SECONDS.toNanos(1L);
        gpuf.d = TimeUnit.SECONDS.toNanos(8L);
        gpuf.e = TimeUnit.MINUTES.toNanos(30L);
    }

    public gpuf(ISensorFusionProcessor gpuv0, ISensorFusionProcessor gpuv1, String s, ObserverRegistry gpyo0, PrincipalSensorFusionConfiguration gpwi0) {
        this.l = 0L;
        this.m = motionState.UNKNOWN;
        this.n = 0L;
        this.o = motionState.UNKNOWN;
        this.r = 1.797693E+308;
        this.f = gpuv0;
        this.g = gpuv1;
        this.h = gpyo0;
        this.i = s;
        this.j = gpwi0.flp18Flags_;
        this.a = new ISensorFusionProcessor[]{gpuv0, gpuv1};
    }

    private static int A(int v, double f) {
        return f < ((double)(2000000000 - v)) ? v + ((int)f) : 2000000000;
    }

    @Override  // gpua
    public int L(long v) {
        int v1 = this.f.L(v);
        return v - this.f.r() >= gpuf.d || (v1 & 7) == 0 || this.f.s() == null ? this.g.L(v) | v1 : v1;
    }

    @Override  // gpua
    public final void f(long v, fuxg fuxg0) {
        super.f(v, fuxg0);
        motionState gpuu0 = gptx.a(fuxg0);
        motionState gpuu1 = motionState.UNKNOWN;
        if(this.o == gpuu1) {
            this.n = v;
            this.o = gpuu0;
        }
        else if(gpuu0 != gpuu1) {
            long v1 = this.n;
            long v2 = this.f.r();
            if((this.u(gpuu0) >= this.u(this.o)) || v1 < v2) {
                this.n = v;
                this.o = gpuu0;
            }
        }
        this.l = v;
        this.m = gpuu0;
    }

    @Override  // gpua
    public final long r() {
        return Math.max(this.f.r(), this.g.r());
    }

    @Override  // gpua
    public final gptu_Position s() {
        gpue gpue0 = this.x();
        long v = this.r();
        if(v != this.p || !gpue0.equals(this.q)) {
            String s = this.i;
            double f = gpue0.b;
            double f1 = gpue0.e;
            double f2 = gpue0.c;
            double f3 = gpue0.d;
            boolean z = gpue0.a;
            int v1 = gpue0.f;
            for(Object object0: this.h.a) {
                ((IFilterObserver)object0).ai(v, s, f, f1, f2, f3, z, v1);
            }
            this.p = v;
            this.q = gpue0;
        }
        if(!gpue0.a) {
            return this.g.s();
        }
        ISensorFusionProcessor gpuv0 = this.f;
        gptu_Position gptu0 = gpuv0.s();
        if(gptu0 == null) {
            return null;
        }
        long v2 = gpuv0.r();
        long v3 = this.g.r();
        if(v3 <= v2) {
            return gptu0;
        }
        double f4 = this.y(v2, v3);
        int v4 = gpuf.A(gptu0.accuracyMm, f4 * 1000.0);
        if(this.k == null || this.k.latE7 != gptu0.latE7 || this.k.lngE7 != gptu0.lngE7 || this.k.accuracyMm != v4) {
            PositionBuilder gptr0 = gptu0.g();
            gptr0.i(gptu0.latE7, gptu0.lngE7, v4);
            gptr0.a();
            gptr0.b();
            gptr0.speedMps = 0.0f;
            gptr0.speedAccuracyMps = -1.0f;
            gptr0.mask &= -69;
            this.k = new gptu_Position(gptr0);
        }
        return this.k;
    }

    @Override  // gpua
    public final void t(long v, PrintWriter printWriter0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("FailoverSensorFusion:");
        if(Long.compare(this.l, 0L) != 0) {
            stringBuilder0.append("activity{time(ns)=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", activity=");
            stringBuilder0.append(this.m);
            stringBuilder0.append("}");
        }
        stringBuilder0.append(" time(ns): {primary=");
        stringBuilder0.append(this.f.r());
        stringBuilder0.append(",");
        gptu_Position gptu0 = this.f.s();
        if(gptu0 != null) {
            stringBuilder0.append("provider=");
            stringBuilder0.append(gptu0.provider);
            stringBuilder0.append(",");
        }
        stringBuilder0.append(" failover=");
        ISensorFusionProcessor gpuv0 = this.g;
        stringBuilder0.append(gpuv0.r());
        gptu_Position gptu1 = gpuv0.s();
        if(gptu1 != null) {
            stringBuilder0.append(",provider=");
            stringBuilder0.append(gptu1.provider);
        }
        stringBuilder0.append("}");
        if(this.r != 1.797693E+308) {
            stringBuilder0.append(" minPrimaryToFailoverDistanceM:");
            stringBuilder0.append(this.r);
        }
        if(this.x().a) {
            stringBuilder0.append(" primary location is used");
        }
        else {
            stringBuilder0.append(" failover location is used");
        }
        printWriter0.println(stringBuilder0);
        gpuv0.t(v, printWriter0);
    }

    final double u(motionState gpuu0) {
        switch(gpuu0.ordinal()) {
            case 1: 
            case 2: {
                return 1.5;
            }
            case 3: {
                return 6.0;
            }
            case 4: {
                return this.j.o();
            }
            default: {
                return 44.7;
            }
        }
    }

    @Override  // gpua
    public final void v() {
        super.v();
        this.k = null;
        this.l = 0L;
        this.m = motionState.UNKNOWN;
        this.r = 1.797693E+308;
        this.n = 0L;
        this.o = motionState.UNKNOWN;
    }

    final gpue x() {
        double f1;
        ISensorFusionProcessor gpuv0 = this.f;
        gptu_Position gptu0 = gpuv0.s();
        gpud gpud0 = new gpud();
        gpud0.c(-1.0);
        gpud0.d(-1.0);
        gpud0.e(-1.0);
        gpud0.b(-1.0);
        if(gptu0 == null) {
            gpud0.a = 1;
            gpud0.f(false);
            return gpud0.a();
        }
        ISensorFusionProcessor gpuv1 = this.g;
        gptu_Position gptu1 = gpuv1.s();
        if(gptu1 == null) {
            gpud0.a = 2;
            gpud0.f(true);
            return gpud0.a();
        }
        long v = gpuv0.r();
        long v1 = gpuv1.r();
        double f = gptu0.a(gptu1);
        gpud0.e(f);
        if(v >= v1) {
            f1 = 1.797693E+308;
            this.r = 1.797693E+308;
        }
        else {
            f1 = this.r;
            if((f < f1)) {
                this.r = f;
                f1 = f;
            }
        }
        gpud0.d(f1);
        double f2 = this.y(v, v1);
        gpud0.b(f2);
        int v2 = Long.compare(v1, v);
        int v3 = gpuf.A(gptu0.accuracyMm, f2 * 1000.0);
        if(v2 > 0 && v3 >= 2000000000) {
            gpud0.a = 9;
            gpud0.f(false);
            return gpud0.a();
        }
        double f3 = this.r;
        if((f3 > f2)) {
            if((f3 > 20000.0) && v2 >= 0 && gptu0.u()) {
                gpud0.a = 3;
                gpud0.f(false);
                return gpud0.a();
            }
            gpud0.a = 4;
            gpud0.f(true);
            return gpud0.a();
        }
        if(v1 - v < gpuf.d) {
            gpud0.a = 5;
            gpud0.f(true);
            return gpud0.a();
        }
        if(v3 < gptu1.accuracyMm) {
            gpud0.a = 8;
            gpud0.f(true);
            return gpud0.a();
        }
        double f4 = gpuf.z(v, v1, 44.7);
        gpud0.c(f4);
        if((f > f4)) {
            gpud0.a = 6;
            gpud0.f(true);
            return gpud0.a();
        }
        gpud0.a = 7;
        gpud0.f(false);
        return gpud0.a();
    }

    private final double y(long v, long v1) {
        double f;
        if(this.o != motionState.UNKNOWN && this.f.r() <= this.n) {
            f = this.u(this.o);
        }
        else {
            motionState gpuu0 = this.m;
            f = gpuu0 == null || v1 >= this.l + gpuf.b ? this.j.n() : this.u(gpuu0);
        }
        gptu_Position gptu0 = this.f.s();
        if(gptu0 != null && gptu0.t() && gptu0.n()) {
            double f1 = (double)gptu0.speedMps;
            return f1 > f ? gpuf.z(v, v1, f1) : gpuf.z(v, v1, f);
        }
        return gpuf.z(v, v1, f);
    }

    private static double z(long v, long v1, double f) {
        long v2 = v1 - v;
        if(v2 <= 0L) {
            return 0.0;
        }
        double f1 = (double)gpuf.c;
        if(v2 > gpuf.e) {
            f = 300.0;
        }
        return f * (((double)v2) / f1);
    }
}

