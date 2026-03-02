import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

public final class ksr implements evqc {
    public final kta a;
    public final kiy b;
    public final kjk c;
    public final Executor d;
    public final CancellationSignal e;

    public ksr(kta kta0, kiy kiy0, kjk kjk0, Executor executor0, CancellationSignal cancellationSignal0) {
        this.a = kta0;
        this.b = kiy0;
        this.c = kjk0;
        this.d = executor0;
        this.e = cancellationSignal0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        Log.w("CreatePassword", a.i(exception0, "Pre-u credman create flow failed ", "; retrying with gis flow"));
        new kqe(this.a.e).e(this.b, this.c, this.d, this.e);
    }
}

