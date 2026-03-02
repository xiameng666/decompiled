import j..util.Objects;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class gpum extends gpua {
    static final long b;
    static final long c;
    private static final Long d;
    private static final ggfp e;
    private static final long f;
    private static final long g;
    private static final long h;
    private final ISensorFusionProcessor i;
    private final ISensorFusionProcessor j;
    private boolean k;
    private long l;
    private int m;
    private long n;
    private long o;
    private float p;
    private final int q;
    private cjhf r;

    static {
        gpum.b = TimeUnit.SECONDS.toNanos(60L);
        gpum.c = TimeUnit.MINUTES.toNanos(2L);
        gpum.d = (long)0x8000000000000000L;
        gpum.e = ggfp.L(motionState.STILL, motionState.ON_FOOT, motionState.UNKNOWN);
        gpum.f = 0x8000000000000000L;
        gpum.g = 0x8000000000000000L;
        gpum.h = 0x8000000000000000L;
    }

    public gpum(ISensorFusionProcessor gpuv0, ISensorFusionProcessor gpuv1, int v) {
        this.i = gpuv0;
        this.j = gpuv1;
        this.q = v;
        this.a = new ISensorFusionProcessor[]{gpuv0, gpuv1};
        this.v();
    }

    @Override  // gpua
    public final int L(long v) {
        int v1 = this.x() ? this.u().L(v) | 38 : this.j.L(v);
        return this.y(v) ? v1 : v1 | 16;
    }

    @Override  // gpua
    public final void d(long v, gptu_Position gptu0) {
        if(gptu0.t() && gptu0.n() && (gptu0.speedMps > 5.0f)) {
            this.n = v;
        }
        super.d(v, gptu0);
    }

    @Override  // gpua
    public final void f(long v, fuxg fuxg0) {
        super.f(v, fuxg0);
        motionState gpuu0 = gptx.a(fuxg0);
        this.k = gpum.e.contains(gpuu0);
        this.l = v;
    }

    @Override  // gpua
    public final void l(long v, cjhf cjhf0) {
        ggkn ggkn0 = new ggkn(Collections.reverseOrder());
        ggkn0.b = 5;
        Set set0 = Collections.EMPTY_SET;
        ggkr ggkr0 = new ggkr(ggkn0, ggkr.a(((set0 instanceof Collection) ? Math.max(11, set0.size()) : 11), ggkn0.b));
        for(Object object0: set0) {
            ggkr0.offer(object0);
        }
        for(Object object1: cjhf0.a) {
            cjha cjha0 = (cjha)object1;
            if(cjha0.j()) {
                ggkr0.add(Float.valueOf(cjha0.b()));
            }
        }
        if(ggkr0.isEmpty()) {
            int v1 = this.m + 1;
            this.m = v1;
            if(v1 <= 3) {
                return;
            }
        }
        else {
            this.m = 0;
        }
        this.o = v;
        this.r = cjhf0;
        float f = ggkr0.c == 5 ? ((float)(((Float)Objects.requireNonNull(((Float)(ggkr0.isEmpty() ? null : ggkr0.d(ggkr0.b()))))))) : 0.0f;
        float f1 = this.p;
        if(f1 != 1.401298E-45f) {
            f = f * 0.05f + f1 * 0.95f;
        }
        this.p = f;
        super.l(v, cjhf0);
    }

    @Override  // gpua
    public final long r() {
        return this.u().r();
    }

    @Override  // gpua
    public final gptu_Position s() {
        return this.u().s();
    }

    @Override  // gpua
    public final void t(long v, PrintWriter printWriter0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("PedestrianSwitchingFusion:");
        if(this.l != gpum.f) {
            stringBuilder0.append(" activity{time(ns)=");
            stringBuilder0.append(this.l);
            stringBuilder0.append(", activity=");
            stringBuilder0.append(this.k);
            stringBuilder0.append("}");
        }
        if(this.n != gpum.g) {
            stringBuilder0.append(" lastHighSpeedTime(ns)=");
            stringBuilder0.append(this.n);
        }
        if(this.o != gpum.h) {
            String s = String.valueOf(this.r);
            stringBuilder0.append(" cn0{time(ns)=");
            stringBuilder0.append(this.o);
            stringBuilder0.append(", filteredCn0=");
            stringBuilder0.append(String.format(Locale.US, "%.1f", ((float)this.p)));
            stringBuilder0.append(", lastGnssStatus=");
            stringBuilder0.append(s);
            stringBuilder0.append("} ");
        }
        stringBuilder0.append(" pedestrianFusion:");
        stringBuilder0.append(this.x());
        printWriter0.println(stringBuilder0);
        this.u().t(v, printWriter0);
    }

    private final ISensorFusionProcessor u() {
        if(this.x()) {
            return this.i.s() == null ? this.j : this.i;
        }
        return this.j;
    }

    @Override  // gpua
    public final void v() {
        this.k = false;
        this.m = 0;
        this.l = gpum.f;
        this.n = gpum.g;
        this.o = gpum.h;
        this.p = 1.401298E-45f;
        this.r = null;
        this.i.v();
        this.j.v();
        super.v();
    }

    private final boolean x() {
        ISensorFusionProcessor gpuv0 = this.j;
        if(gpuv0.s() == null) {
            return false;
        }
        long v = gpuv0.r();
        boolean z = !this.y(v) && this.k && this.l != gpum.f;
        int v1 = Float.compare(this.p, 1.401298E-45f);
        return v1 != 0 || this.o != gpum.h ? z && (v1 != 0 && (this.o != gpum.h && this.p <= ((float)this.q) && v - this.o < gpum.b)) : z;
    }

    private final boolean y(long v) {
        return this.n != gpum.g && v <= this.n + gpum.c;
    }
}

