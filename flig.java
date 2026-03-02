import com.google.android.libraries.messaging.lighter.model.AccountContext;
import java.util.concurrent.TimeUnit;

public final class flig implements Runnable {
    public final flit a;
    public final fmga b;
    public final boolean c;
    public final AccountContext d;
    public final gmcu e;

    public flig(flit flit0, fmga fmga0, boolean z, AccountContext accountContext0, gmcu gmcu0) {
        this.a = flit0;
        this.b = fmga0;
        this.c = z;
        this.d = accountContext0;
        this.e = gmcu0;
    }

    @Override
    public final void run() {
        fmga fmga0 = this.b;
        fmfm fmfm0 = new fmfm(fmga0);
        boolean z = this.c;
        flit flit0 = this.a;
        fmfm0.k((z ? fmft.l : fmft.f));
        TimeUnit timeUnit0 = TimeUnit.MILLISECONDS;
        flba.a();
        fmfm0.m(timeUnit0.toMicros(System.currentTimeMillis() + (z ? 0L : iacz.b())));
        fmga fmga1 = fmfm0.a();
        try {
            flit0.d(this.d).V(fmga1);
        }
        catch(Throwable throwable0) {
            if(!z) {
                flit0.z(fmga0, false);
            }
            throw throwable0;
        }
        if(!z) {
            flit0.z(fmga0, true);
        }
        this.e.q(fmga1);
    }
}

