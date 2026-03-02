import com.google.location.bluemoon.inertialanchor.DeepBlueResults;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

public final class gpui implements ISensorFusionProcessor {
    public final long a;
    public gptu_Position b;
    public long c;

    public gpui(long v) {
        this.b = null;
        this.c = 0L;
        this.a = v;
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
        if(gptu0.u() && gptu0.k()) {
            this.b = gptu0;
            this.c = v;
        }
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
        throw new UnsupportedOperationException("IndoorProbabilityFilter does not support estimating positions and their time.");
    }

    @Override  // ISensorFusionProcessor
    public final gptu_Position s() {
        throw new UnsupportedOperationException("IndoorProbabilityFilter does not support estimating positions and their time.");
    }

    @Override  // ISensorFusionProcessor
    public final void t(long v, PrintWriter printWriter0) {
    }

    @Override  // ISensorFusionProcessor
    public final void v() {
        this.b = null;
        this.c = 0L;
    }

    @Override  // ISensorFusionProcessor
    public final void w() {
        this.v();
    }
}

