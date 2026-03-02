import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class algz extends alii {
    public final List a;
    protected final Runnable b;
    public ScheduledFuture c;
    private final ScheduledExecutorService d;

    protected algz(ScheduledExecutorService scheduledExecutorService0, Runnable runnable0) {
        this.a = new ArrayList();
        this.d = scheduledExecutorService0;
        this.b = runnable0;
    }

    @Override  // alij
    public final void a(String s, int v, int v1, int v2) {
        algw algw0 = new algw(s, v, v1, v2);
        this.a.add(algw0);
    }

    @Override  // alij
    public final void c(String s, String s1, byte[] arr_b) {
        algy algy0 = new algy(s, s1, arr_b);
        this.a.add(algy0);
    }

    public final void d() {
        ScheduledFuture scheduledFuture0 = this.c;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(true);
        }
        this.c = ((bbll)this.d).g(this.b, 10L, TimeUnit.SECONDS);
    }
}

