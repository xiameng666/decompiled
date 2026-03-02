import android.os.SystemClock;
import com.google.android.location.fused.FusionEngine.3;
import j..time.Duration;

public final class fvxl implements Runnable {
    public final FusionEngine.3 a;
    public final jyf b;

    public fvxl(FusionEngine.3 fusionEngine$30, jyf jyf0) {
        this.a = fusionEngine$30;
        this.b = jyf0;
    }

    @Override
    public final void run() {
        long v = Duration.ofMillis(SystemClock.elapsedRealtime()).toNanos();
        cjhf cjhf0 = cjhe.a(this.b, v);
        this.a.a.n_deepblueHandler.l(v, cjhf0);
        this.a.a.m(v);
    }
}

