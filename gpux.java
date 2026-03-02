import com.google.location.bluemoon.inertialanchor.DeepBlueResults;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class gpux implements ISensorFusionProcessor {
    static final long a;
    static final long b;
    static final long c;
    public final long d;
    public final float[] e;
    public final long[] f;
    public final ObserverRegistry g;
    public motionState motionState_;
    public long i;
    public int j;
    public long k;
    public float l;
    public long m;
    private final float n;

    static {
        gpux.a = TimeUnit.SECONDS.toNanos(15L);
        gpux.b = TimeUnit.SECONDS.toNanos(60L);
        gpux.c = TimeUnit.SECONDS.toNanos(10L);
    }

    public gpux(int gnssSpeedComputationArraySize, float maxGnssSpeedAccuracyMps, ObserverRegistry gpyo0, long v1) {
        this.motionState_ = motionState.IN_VEHICLE;
        this.i = 0x7FFFFFFFFFFFFFFFL;
        boolean z = false;
        this.j = 0;
        this.k = 0x7FFFFFFFFFFFFFFFL;
        this.l = 3.402823E+38f;
        this.m = 0x7FFFFFFFFFFFFFFFL;
        gftb.b(gnssSpeedComputationArraySize > 0, "gnssSpeedComputationArraySize must be greater than 0");
        if((maxGnssSpeedAccuracyMps >= 0.0f)) {
            z = true;
        }
        gftb.b(z, "maxGnssSpeedAccuracyMps must be greater than or equal to 0");
        this.g = gpyo0;
        this.n = maxGnssSpeedAccuracyMps;
        this.d = v1;
        float[] arr_f = new float[gnssSpeedComputationArraySize];
        this.e = arr_f;
        long[] arr_v = new long[gnssSpeedComputationArraySize];
        this.f = arr_v;
        Arrays.fill(arr_f, NaNf);
        Arrays.fill(arr_v, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // ISensorFusionProcessor
    public final int L(long v) {
        return 0;
    }

    @Override  // ISensorFusionProcessor
    public final void b() {
    }

    @Override  // ISensorFusionProcessor
    public final void c() {
    }

    @Override  // ISensorFusionProcessor
    public final void d(long v, gptu_Position gptu0) {
        if(gptu0.t() && gptu0.n() && (!gptu0.o() || gptu0.speedAccuracyMps <= this.n)) {
            int v1 = (this.j + 1) % this.f.length;
            this.j = v1;
            this.e[v1] = gptu0.speedMps;
            this.f[v1] = v;
        }
    }

    @Override  // ISensorFusionProcessor
    public final void e(long v, List list0) {
    }

    @Override  // ISensorFusionProcessor
    public final void f(long v, fuxg fuxg0) {
        this.motionState_ = gptx.a(fuxg0);
        this.i = v;
    }

    @Override  // ISensorFusionProcessor
    public final void g(long v, float f, float f1) {
    }

    @Override  // ISensorFusionProcessor
    public final void h(long v, gpvs gpvs0) {
    }

    @Override  // ISensorFusionProcessor
    public final void i(long v, float f) {
    }

    @Override  // ISensorFusionProcessor
    public final void j_processDeepBlueResults(long v, DeepBlueResults deepBlueResults0) {
    }

    @Override  // ISensorFusionProcessor
    public final void k(long v) {
    }

    @Override  // ISensorFusionProcessor
    public final void l(long v, cjhf cjhf0) {
        float f = 0.0f;
        for(Object object0: cjhf0.a) {
            cjha cjha0 = (cjha)object0;
            if(cjha0.j()) {
                f = Math.max(f, cjha0.b());
            }
        }
        float f1 = this.l;
        if(f1 != 3.402823E+38f) {
            f = f * 0.1f + f1 * 0.9f;
        }
        this.l = f;
        this.m = v;
    }

    @Override  // ISensorFusionProcessor
    public final void m(long v, float f) {
    }

    @Override  // ISensorFusionProcessor
    public final void n(long v, long v1) {
    }

    @Override  // ISensorFusionProcessor
    public final void o_handleStepEvent(long v) {
        this.k = v;
    }

    @Override  // ISensorFusionProcessor
    public final void p(long v, Collection collection0, long v1) {
    }

    @Override  // ISensorFusionProcessor
    public final void q(long v, fwed fwed0) {
    }

    @Override  // ISensorFusionProcessor
    public final long r() {
        throw new UnsupportedOperationException("Speed estimator doesn\'t support estimating positions and their time.");
    }

    @Override  // ISensorFusionProcessor
    public final gptu_Position s() {
        throw new UnsupportedOperationException("Speed estimator doesn\'t support estimating positions and their time.");
    }

    @Override  // ISensorFusionProcessor
    public final void t(long v, PrintWriter printWriter0) {
        if(this.i != 0x7FFFFFFFFFFFFFFFL) {
            Objects.toString(this.motionState_);
        }
        for(int v1 = 0; true; ++v1) {
            long[] arr_v = this.f;
            if(v1 >= arr_v.length) {
                break;
            }
            if(arr_v[v1] != 0x7FFFFFFFFFFFFFFFL) {
                float f = this.e[v1];
            }
        }
    }

    public final boolean u(long v) {
        for(int v1 = 0; true; ++v1) {
            long[] arr_v = this.f;
            if(v1 >= arr_v.length) {
                break;
            }
            long v2 = arr_v[v1];
            if(v2 != 0x7FFFFFFFFFFFFFFFL && v - v2 < gpux.a) {
                return true;
            }
        }
        return false;
    }

    @Override  // ISensorFusionProcessor
    public final void v() {
        this.motionState_ = motionState.IN_VEHICLE;
        this.i = 0x7FFFFFFFFFFFFFFFL;
        this.k = 0x7FFFFFFFFFFFFFFFL;
        this.l = 3.402823E+38f;
        this.m = 0x7FFFFFFFFFFFFFFFL;
        Arrays.fill(this.e, NaNf);
        Arrays.fill(this.f, 0x7FFFFFFFFFFFFFFFL);
    }

    @Override  // ISensorFusionProcessor
    public final void w() {
        this.v();
    }
}

