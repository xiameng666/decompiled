import com.google.location.bluemoon.inertialanchor.DeepBlueResults;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;

public class gpua implements ISensorFusionProcessor {
    public ISensorFusionProcessor[] a;
    private static final ISensorFusionProcessor[] b;

    static {
        gpua.b = new ISensorFusionProcessor[0];
    }

    public gpua() {
        this.a = gpua.b;
    }

    @Override  // ISensorFusionProcessor
    public int L(long v) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            v2 |= arr_gpuv[v1].L(v);
        }
        return v2;
    }

    @Override  // ISensorFusionProcessor
    public void b() {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v = 0; v < arr_gpuv.length; ++v) {
            arr_gpuv[v].b();
        }
    }

    @Override  // ISensorFusionProcessor
    public void c() {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v = 0; v < arr_gpuv.length; ++v) {
            arr_gpuv[v].c();
        }
    }

    @Override  // ISensorFusionProcessor
    public void d(long v, gptu_Position gptu0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].d(v, gptu0);
        }
    }

    @Override  // ISensorFusionProcessor
    public void e(long v, List list0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].e(v, list0);
        }
    }

    @Override  // ISensorFusionProcessor
    public void f(long v, fuxg fuxg0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].f(v, fuxg0);
        }
    }

    @Override  // ISensorFusionProcessor
    public void g(long v, float f, float f1) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].g(v, f, f1);
        }
    }

    @Override  // ISensorFusionProcessor
    public void h(long v, gpvs gpvs0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].h(v, gpvs0);
        }
    }

    @Override  // ISensorFusionProcessor
    public void i(long v, float f) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].i(v, f);
        }
    }

    @Override  // ISensorFusionProcessor
    public void j_processDeepBlueResults(long v, DeepBlueResults deepBlueResults0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].j_processDeepBlueResults(v, deepBlueResults0);
        }
    }

    @Override  // ISensorFusionProcessor
    public void k(long v) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].k(v);
        }
    }

    @Override  // ISensorFusionProcessor
    public void l(long v, cjhf cjhf0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].l(v, cjhf0);
        }
    }

    @Override  // ISensorFusionProcessor
    public void m(long v, float f) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].m(v, f);
        }
    }

    @Override  // ISensorFusionProcessor
    public final void n(long v, long v1) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v2 = 0; v2 < arr_gpuv.length; ++v2) {
            arr_gpuv[v2].n(v, v1);
        }
    }

    @Override  // ISensorFusionProcessor
    public void o_handleStepEvent(long v) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].o_handleStepEvent(v);
        }
    }

    @Override  // ISensorFusionProcessor
    public void p(long v, Collection collection0, long v1) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v2 = 0; v2 < arr_gpuv.length; ++v2) {
            arr_gpuv[v2].p(v, collection0, v1);
        }
    }

    @Override  // ISensorFusionProcessor
    public void q(long v, fwed fwed0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].q(v, fwed0);
        }
    }

    @Override  // ISensorFusionProcessor
    public long r() {
        throw new IllegalStateException("getTimeNs not implemented");
    }

    @Override  // ISensorFusionProcessor
    public gptu_Position s() {
        throw new IllegalStateException("getPosition not implemented");
    }

    @Override  // ISensorFusionProcessor
    public void t(long v, PrintWriter printWriter0) {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v1 = 0; v1 < arr_gpuv.length; ++v1) {
            arr_gpuv[v1].t(v, printWriter0);
        }
    }

    @Override  // ISensorFusionProcessor
    public void v() {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v = 0; v < arr_gpuv.length; ++v) {
            arr_gpuv[v].v();
        }
    }

    @Override  // ISensorFusionProcessor
    public void w() {
        ISensorFusionProcessor[] arr_gpuv = this.a;
        for(int v = 0; v < arr_gpuv.length; ++v) {
            arr_gpuv[v].w();
        }
    }
}

