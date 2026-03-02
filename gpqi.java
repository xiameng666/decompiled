import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class gpqi implements Executor {
    public final HandlerThread a;
    public Handler b;
    public final ArrayList c;

    static {
    }

    public gpqi() {
        this.c = new ArrayList();
        gpqh gpqh0 = new gpqh(this, "gpqy");
        this.a = gpqh0;
        gpqh0.start();
    }

    public final void a(Runnable runnable0) {
        if(this.a == null) {
            runnable0.run();
            return;
        }
        this.execute(runnable0);
    }

    public final void b() {
        synchronized(this.c) {
            gpqo.a(this.b);
        }
    }

    public final void c(Runnable runnable0, long v) {
        ArrayList arrayList0 = this.c;
        synchronized(arrayList0) {
            Handler handler0 = this.b;
            if(handler0 != null) {
                handler0.postDelayed(runnable0, v);
                return;
            }
            arrayList0.add(Pair.create(runnable0, Long.valueOf(v)));
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.c(runnable0, 0L);
    }
}

