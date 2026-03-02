import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

public final class kud implements evqc {
    public final kka a;
    public final kuf b;
    public final kjk c;
    public final Executor d;
    public final CancellationSignal e;

    public kud(kka kka0, kuf kuf0, kjk kjk0, Executor executor0, CancellationSignal cancellationSignal0) {
        this.a = kka0;
        this.b = kuf0;
        this.c = kjk0;
        this.d = executor0;
        this.e = cancellationSignal0;
    }

    @Override  // evqc
    public final void gv(Exception exception0) {
        kka kka0 = this.a;
        kjk kjk0 = this.c;
        Executor executor0 = this.d;
        CancellationSignal cancellationSignal0 = this.e;
        kuf kuf0 = this.b;
        if(knm.b(kka0)) {
            Log.w("GetCredentialController", "Pre-u credman get flow failed for get sign in intent; retrying with gis flow");
            new kru(kuf0.e).g(kka0, kjk0, executor0, cancellationSignal0);
            return;
        }
        Log.w("GetCredentialController", "Pre-u credman get flow failed; retrying with gis flow");
        new kpq(kuf0.e).g(kka0, kjk0, executor0, cancellationSignal0);
    }
}

