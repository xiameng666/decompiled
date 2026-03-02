import com.google.location.bluemoon.inertialanchor.DeepBlueResults;
import j..util.Objects;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class gpuj implements ISensorFusionProcessor {
    public long a;
    private static final long b;
    private static final long c;
    private gptu_Position d;
    private long e;

    static {
        gpuj.b = TimeUnit.SECONDS.toNanos(12L);
        gpuj.c = TimeUnit.SECONDS.toNanos(5L);
    }

    @Override  // ISensorFusionProcessor
    public final int L(long v) {
        throw new IllegalStateException("getDataSources not implemented");
    }

    @Override  // ISensorFusionProcessor
    public final void b() {
    }

    @Override  // ISensorFusionProcessor
    public final void c() {
    }

    @Override  // ISensorFusionProcessor
    public final void d(long v, gptu_Position gptu0) {
        if(((gptt_LocationType)Objects.requireNonNull(gptu0.provider)).equals(gptt_LocationType.GPS_INJECTED)) {
            this.d = gptu0;
            this.a = v;
        }
        this.e = v;
    }

    @Override  // ISensorFusionProcessor
    public final void e(long v, List list0) {
    }

    @Override  // ISensorFusionProcessor
    public final void f(long v, fuxg fuxg0) {
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
    }

    @Override  // ISensorFusionProcessor
    public final void m(long v, float f) {
    }

    @Override  // ISensorFusionProcessor
    public final void n(long v, long v1) {
    }

    @Override  // ISensorFusionProcessor
    public final void o_handleStepEvent(long v) {
    }

    @Override  // ISensorFusionProcessor
    public final void p(long v, Collection collection0, long v1) {
    }

    @Override  // ISensorFusionProcessor
    public final void q(long v, fwed fwed0) {
    }

    @Override  // ISensorFusionProcessor
    public final long r() {
        return this.a;
    }

    @Override  // ISensorFusionProcessor
    public final gptu_Position s() {
        gftb.r(this.x(), "Injected position is stale or does not exist.");
        PositionBuilder gptr0 = ((gptu_Position)Objects.requireNonNull(this.d)).g();
        gptr0.flpSensorFusion = gpts_PositionProvider.INJECTION_FUSION;
        return new gptu_Position(gptr0);
    }

    @Override  // ISensorFusionProcessor
    public final void t(long v, PrintWriter printWriter0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("InjectionSensorFusion: time(ns): {lastAbsoluteTimeNs=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(",lastInjectedTimeNs=");
        stringBuilder0.append(this.a);
        stringBuilder0.append("}");
        printWriter0.println(stringBuilder0);
    }

    public final boolean u(long v) {
        return this.d != null && v < this.a + gpuj.c;
    }

    @Override  // ISensorFusionProcessor
    public final void v() {
        this.d = null;
        this.a = 0L;
    }

    @Override  // ISensorFusionProcessor
    public final void w() {
        this.v();
    }

    public final boolean x() {
        return this.d != null && this.e < this.a + gpuj.b;
    }
}

