import android.telephony.NumberVerificationCallback;
import android.telephony.TelephonyManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class bcrr {
    public static final baun a;
    public static final ggeo b;
    public final TelephonyManager c;
    public final Executor d;
    public final Object e;
    public final AtomicBoolean f;
    final NumberVerificationCallback g;
    public bcrq h;
    public CountDownLatch i;
    public bcru j;

    static {
        bcrr.a = bcrh.a("flash_call_receiver");
        ggek ggek0 = new ggek();
        ggek0.i(Integer.valueOf(0), "UNSPECIFIED");
        ggek0.i(Integer.valueOf(1), "TIMED OUT");
        ggek0.i(Integer.valueOf(2), "NETWORK NOT AVAILABLE");
        ggek0.i(Integer.valueOf(3), "TOO MANY CALLS");
        ggek0.i(Integer.valueOf(4), "CONCURRENT REQUESTS");
        ggek0.i(Integer.valueOf(5), "IN ECBM");
        ggek0.i(Integer.valueOf(6), "IN EMERGENCY CALL");
        bcrr.b = ggek0.b();
    }

    public bcrr(TelephonyManager telephonyManager0) {
        this.d = new bblp(0x7FFFFFFF, 9);
        this.e = new Object();
        this.f = new AtomicBoolean();
        this.g = new bcrp(this);
        this.c = telephonyManager0;
    }

    final bcru a() {
        synchronized(this.e) {
        }
        return this.j;
    }

    public final void b(bcru bcru0) {
        synchronized(this.e) {
            if(this.j == bcru0) {
                this.j = null;
            }
        }
    }

    public final void c(bcru bcru0) {
        synchronized(this.e) {
            this.j = bcru0;
            bcrq bcrq0 = this.h;
            if(bcrq0 != null) {
                if(bcrq0.a) {
                    this.j.a(bcrq0.c);
                }
                else {
                    this.j.b(bcrq0.b, bcrq0.d);
                }
                this.h = null;
            }
        }
    }
}

