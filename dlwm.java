import dagger.Lazy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dlwm {
    public static final int a;
    private static final bboh b;
    private final Lazy c;

    static {
        dlwm.b = bboh.b("Pay", bbcu.cZ);
    }

    public dlwm(Lazy lazy0) {
        this.c = lazy0;
    }

    final boolean a(dmba dmba0, hjrn hjrn0, long v, int v1) {
        try {
            return ((Boolean)((gmcg)this.c.get()).e(new dlwl(dmba0, hjrn0)).get(v, TimeUnit.MILLISECONDS)).booleanValue();
        }
        catch(InterruptedException | TimeoutException unused_ex) {
            gpnd gpnd0 = new gpnd(gpnc.a, hjrn0.e);
            ((ggtj)((ggtj)dlwm.b.j()).ar(9173)).X("Bulletin exceeded timeout on page: %s. Bulletin: %s Timeout: %s ms", new gpnd(gpnc.a, v1), gpnd0, new gpnd(gpnc.a, v));
            return false;
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if((throwable0 instanceof RuntimeException)) {
                throw (RuntimeException)throwable0;
            }
            if(throwable0 != null) {
                executionException0 = throwable0;
            }
            throw new evqj(executionException0);
        }
    }
}

