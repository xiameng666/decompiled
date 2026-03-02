import android.telephony.TelephonyManager.CellInfoCallback;
import android.telephony.TelephonyManager;
import j..util.Objects;
import java.util.concurrent.Executor;

final class fvld extends fvnr {
    public final TelephonyManager a;
    public final long b;
    public final Executor c;
    public final TelephonyManager.CellInfoCallback d;
    public Runnable e;

    public fvld(TelephonyManager telephonyManager0, long v, fvls fvls0, fvlt fvlt0, fybc fybc0) {
        super(fvls0, fvlt0, fybc0);
        gftb.check(telephonyManager0);
        this.a = telephonyManager0;
        this.b = v;
        Objects.requireNonNull(fvls0);
        this.c = new fvkz(fvls0);
        this.e = new fvla();
        this.d = new fvlc(this);
    }

    @Override  // fvnr
    protected final void b() {
        this.e = new fvlb(this);
        this.m.postDelayed(this.e, this.b);
    }

    @Override  // fvnr
    protected final void c() {
        this.m.removeCallbacks(this.e);
    }
}

