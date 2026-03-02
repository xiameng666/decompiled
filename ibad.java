import j..util.Objects;
import java.util.logging.Level;

final class ibad implements Thread.UncaughtExceptionHandler {
    final ibbd a;

    public ibad(ibbd ibbd0) {
        Objects.requireNonNull(ibbd0);
        this.a = ibbd0;
        super();
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        ibbd ibbd0 = this.a;
        ibbd.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + ibbd0.i + "] Uncaught exception in the SynchronizationContext. Panic!", throwable0);
        try {
            if(ibbd0.w) {
                return;
            }
            ibbd0.w = true;
            try {
                ibbd0.m(true);
                ibbd0.s(false);
            }
            finally {
                ibbd0.t(new iamw(iamz.a(iapk.p.f("Panic! This is a bug!").e(throwable0))));
                ibbd0.K.d(null);
                ibbd0.I.a(4, "PANIC! Entering TRANSIENT_FAILURE");
                ibbd0.q.a(iall.c);
            }
        }
        catch(Throwable throwable1) {
            ibbd.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + this.a.i + "] Uncaught exception while panicking", throwable1);
        }
    }
}

