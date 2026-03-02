import android.content.pm.PackageManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class iaqn extends iaqy {
    final gful_cronetEngineProvider a;
    final PackageManager b;
    final ggfp c;
    final Executor d;

    public iaqn() {
        throw null;
    }

    public iaqn(gful_cronetEngineProvider gful0, PackageManager packageManager0, ggfp ggfp0, Executor executor0) {
        this.a = gful0;
        this.b = packageManager0;
        this.c = ggfp0;
        this.d = executor0;
        super();
    }

    @Override  // iaqy
    @Deprecated
    public final iapk a(int v) {
        try {
            return (iapk)((glyq)this.b(v)).u();
        }
        catch(ExecutionException executionException0) {
            return iapk.d(executionException0);
        }
        catch(CancellationException cancellationException0) {
            return iapk.c.e(cancellationException0);
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            return iapk.c.e(interruptedException0);
        }
    }

    public final gmcd b(int v) {
        return gmbu.m(new gpjb(this.a, this.b, this.c, v), this.d);
    }
}

