import java.util.logging.Level;

final class ghmq implements ghmw {
    @Override  // ghmw
    public final void a() {
    }

    @Override  // ghmw
    public final void b() {
    }

    @Override  // ghmw
    public final void c(Exception exception0) {
        ghmx.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", exception0);
    }

    @Override  // ghmw
    public final void d(Exception exception0) {
        ghmx.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", exception0);
    }
}

