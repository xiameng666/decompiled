import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

public final class bap implements bqt {
    public static final bjr a;
    public static final bjr b;
    public static final bjr c;
    static final bjr d;
    static final bjr e;
    static final bjr f;
    static final bjr g;
    static final bjr h;
    static final bjr i;
    static final bjr j;
    public static final bjr k;
    public static final bjr l;
    public final blf m;

    static {
        bap.a = new bjr("camerax.core.appConfig.cameraFactoryProvider", bij.class, null);
        bap.b = new bjr("camerax.core.appConfig.deviceSurfaceManagerProvider", bii.class, null);
        bap.c = new bjr("camerax.core.appConfig.useCaseConfigFactoryProvider", bnf.class, null);
        bap.d = new bjr("camerax.core.appConfig.cameraExecutor", Executor.class, null);
        bap.e = new bjr("camerax.core.appConfig.schedulerHandler", Handler.class, null);
        bap.f = new bjr("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
        bap.g = new bjr("camerax.core.appConfig.availableCamerasLimiter", bab.class, null);
        bap.h = new bjr("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
        bap.i = new bjr("camerax.core.appConfig.cameraProviderInitRetryPolicy", bdj.class, null);
        bap.j = new bjr("camerax.core.appConfig.quirksSettings", blk.class, null);
        bap.k = new bjr("camerax.core.appConfig.configImplType", Integer.TYPE, null);
        bap.l = new bjr("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    }

    public bap(blf blf0) {
        this.m = blf0;
    }

    @Override  // bjt
    public final bjs g(bjr bjr0) {
        return blq.a(this, bjr0);
    }

    @Override  // blr
    public final bjt h() {
        return this.m;
    }

    @Override  // blr
    public final Object l(bjr bjr0) {
        return blq.b(this, bjr0);
    }

    @Override  // blr
    public final Object m(bjr bjr0, Object object0) {
        return blq.c(this, bjr0, object0);
    }

    @Override  // bjt
    public final Object n(bjr bjr0, bjs bjs0) {
        return blq.d(this, bjr0, bjs0);
    }

    @Override  // bqt
    public final String o() {
        throw null;
    }

    @Override  // bqt
    public final String p(String s) {
        throw null;
    }

    @Override  // bjt
    public final Set q(bjr bjr0) {
        return blq.e(this, bjr0);
    }

    @Override  // blr
    public final Set r() {
        return blq.f(this);
    }

    @Override  // blr
    public final boolean s(bjr bjr0) {
        return blq.g(this, bjr0);
    }

    @Override  // bjt
    public final void v(azg azg0) {
        blq.h(this, azg0);
    }
}

