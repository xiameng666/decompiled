import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public final class foek {
    public Context a;
    public ExecutorService b;
    public ScheduledExecutorService c;
    public final azpm d;
    public final fgvt e;
    public fkvs f;
    private final gful_cronetEngineProvider g;

    public foek() {
        this.d = azpm.a;
        this.e = new fgvy();
        this.g = gfus.a(((gful_cronetEngineProvider)new foeh()));
    }

    public final foeg a() {
        gftb.check(this.a);
        if(this.b == null) {
            ExecutorService executorService0 = this.c;
            if(executorService0 == null) {
                executorService0 = Executors.newCachedThreadPool(((ThreadFactory)this.g.mr()));
            }
            this.b = executorService0;
        }
        if(this.c == null) {
            this.c = Executors.newSingleThreadScheduledExecutor(((ThreadFactory)this.g.mr()));
        }
        return new foev(this.b, ((gful_cronetEngineProvider)new foei(this)));
    }

    public final void b(Context context0) {
        this.a = context0.getApplicationContext();
    }
}

