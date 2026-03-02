import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

final class ase implements arg {
    public static final long a;
    public final aow b;
    public final ScheduledExecutorService c;
    public final boolean d;
    private final int e;
    private boolean f;
    private final Executor g;

    static {
        ase.a = TimeUnit.SECONDS.toNanos(2L);
    }

    public ase(aow aow0, int v, Executor executor0, ScheduledExecutorService scheduledExecutorService0, boolean z) {
        this.f = false;
        this.b = aow0;
        this.e = v;
        this.g = executor0;
        this.c = scheduledExecutorService0;
        this.d = z;
    }

    @Override  // arg
    public final gmcd a(TotalCaptureResult totalCaptureResult0) {
        asf.e(this.e, totalCaptureResult0);
        bcs.h("Camera2CapturePipeline");
        if(asf.e(this.e, totalCaptureResult0)) {
            if(this.b.z()) {
                bcs.h("Camera2CapturePipeline");
                return bpt.b(Boolean.valueOf(false));
            }
            bcs.h("Camera2CapturePipeline");
            this.f = true;
            return bpt.f(bpt.g(bpt.g(bpf.a(jqy.a(new asa(this))), new asb(this), this.g), new asc(this), this.g), new asd(), bol.a());
        }
        return bpt.b(Boolean.valueOf(false));
    }

    @Override  // arg
    public final void b() {
        if(this.f) {
            aow aow0 = this.b;
            aow0.d.a(null, 0);
            bcs.h("Camera2CapturePipeline");
            if(this.d) {
                aow0.c.c(false, true);
            }
        }
    }

    @Override  // arg
    public final boolean c() {
        return this.e == 0;
    }
}

