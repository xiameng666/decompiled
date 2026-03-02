import android.os.SystemClock;
import android.os.WorkSource;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class fwvd implements Callable {
    public final fwvf a;
    public final long b;
    public final TelephonyManager c;
    public final fwyc d;

    public fwvd(fwvf fwvf0, long v, TelephonyManager telephonyManager0, fwyc fwyc0) {
        this.a = fwvf0;
        this.b = v;
        this.c = telephonyManager0;
        this.d = fwyc0;
    }

    @Override
    public final Object call() {
        long v = SystemClock.elapsedRealtime();
        long v1 = this.a.a.f();
        this.a.a.a(new fvwx(30, v1, "%2$d,%3$d", fwzf.a.ordinal(), ((int)(v - this.b))));
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        AtomicReference atomicReference0 = new AtomicReference(fvtm.h(v));
        fwve fwve0 = new fwve(this.a, v, atomicReference0, countDownLatch0);
        fwwi fwwi0 = new fwwi(((fwwl)fwwn.h()), fwve0, v);
        fwwh fwwh0 = new fwwh(fwve0);
        gmcg gmcg0 = this.a.d.a;
        fwwk fwwk0 = new fwwk(gmcg0, fwwh0);
        fwyc fwyc0 = this.d;
        TelephonyManager telephonyManager0 = this.c;
        try {
            if((fwyc0 instanceof fyay)) {
                WorkSource workSource0 = ((fyay)fwyc0).d();
                if(workSource0 == null) {
                    telephonyManager0.requestCellInfoUpdate(fwwk0, fwwi0);
                }
                else {
                    telephonyManager0.requestCellInfoUpdate(workSource0, fwwk0, fwwi0);
                }
            }
            else {
                telephonyManager0.requestCellInfoUpdate(fwwk0, fwwi0);
            }
        }
        catch(IllegalArgumentException | IllegalStateException unused_ex) {
            gmcg0.execute(fwwh0);
        }
        gmde.e(countDownLatch0, huvd.e(), TimeUnit.MILLISECONDS);
        return new hecl(((fvtm)atomicReference0.get()));
    }
}

