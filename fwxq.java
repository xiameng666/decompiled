import android.content.Context;
import android.os.SystemClock;
import java.io.Closeable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class fwxq implements Closeable {
    public final fwzd a;
    public final gful_cronetEngineProvider b;
    private final Executor c;

    public fwxq(Context context0, fwzd fwzd0) {
        bblp bblp0 = new bblp(3, 10);
        super();
        this.a = fwzd0;
        this.b = gfus.a(((gful_cronetEngineProvider)new fwxp(context0)));
        this.c = bblp0;
    }

    public final gxmq a(gxmp gxmp0, int v, String s, hebp hebp0) {
        try {
            long v1 = SystemClock.elapsedRealtime();
            return (gxmq)((glyq)glzd.f(gmbu.n(new fwxm(this, gxmp0, v, s, hebp0), this.c), new fwxn(this, v1, s), gmap.a)).u();
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            throw new iapl(iapk.m.e(interruptedException0));
        }
        catch(ExecutionException executionException0) {
            throw new iapl(iapk.d(executionException0));
        }
    }

    @Override
    public final void close() {
    }
}

