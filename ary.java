import android.hardware.camera2.TotalCaptureResult;
import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

final class ary implements arg {
    public static final long a;
    public final aow b;
    public final ScheduledExecutorService c;
    public final bcc d;
    public final ayt e;
    private final Executor f;

    static {
        ary.a = TimeUnit.SECONDS.toNanos(2L);
    }

    public ary(aow aow0, Executor executor0, ScheduledExecutorService scheduledExecutorService0, ayt ayt0) {
        this.b = aow0;
        this.f = executor0;
        this.c = scheduledExecutorService0;
        this.e = ayt0;
        this.d = (bcc)Objects.requireNonNull(aow0.g);
    }

    @Override  // arg
    public final gmcd a(TotalCaptureResult totalCaptureResult0) {
        bcs.h("Camera2CapturePipeline");
        AtomicReference atomicReference0 = new AtomicReference();
        gmcd gmcd0 = jqy.a(new ars(atomicReference0));
        return bpt.f(bpt.g(bpt.g(bpt.g(bpt.g(bpt.g(bpf.a(jqy.a(new art(this, atomicReference0))), new aru(this), this.f), new arv(this), this.f), new arw(this, gmcd0), this.f), new arx(this), this.f), new arl(this), this.f), new arm(), bol.a());
    }

    @Override  // arg
    public final void b() {
        bcs.h("Camera2CapturePipeline");
        if(this.e.a()) {
            this.b.n(0);
        }
        this.b.c.a(false).hB(new arn(), this.f);
        this.b.c.c(false, true);
        ScheduledExecutorService scheduledExecutorService0 = bow.a();
        Objects.requireNonNull(this.d);
        scheduledExecutorService0.execute(new aro(this.d));
    }

    @Override  // arg
    public final boolean c() {
        return false;
    }
}

