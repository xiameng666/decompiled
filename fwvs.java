import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class fwvs implements Callable {
    public final fwvx a;
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final fwyc f;

    public fwvs(fwvx fwvx0, long v, long v1, boolean z, boolean z1, fwyc fwyc0) {
        this.a = fwvx0;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = z1;
        this.f = fwyc0;
    }

    @Override
    public final Object call() {
        long v = SystemClock.elapsedRealtime();
        long v1 = this.b;
        fwvx fwvx0 = this.a;
        fvwz fvwz0 = fwvx0.b;
        fvwz0.a(new fvwx(49, fvwz0.f(), "%2$d,%3$d", fwzf.a.ordinal(), ((int)(v - v1))));
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        AtomicReference atomicReference0 = new AtomicReference(new hecl(3, SystemClock.elapsedRealtime()));
        fwvw fwvw0 = new fwvw(fwvx0, countDownLatch0, atomicReference0, this.c, this.d);
        fwvx0.d.e(fwvx0.a, fwvw0, this.e, this.f, fvwz0, fwvx0.f.a);
        gmde.e(countDownLatch0, huvd.e(), TimeUnit.MILLISECONDS);
        Object object0 = (hecl)atomicReference0.get();
        if(object0.c == 3) {
            fwso.k(fvwz0, SystemClock.elapsedRealtime() - v1, 0, 0x20000000);
        }
        fvvj[] arr_fvvj = (fvvj[])object0.a.toArray(new fvvj[0]);
        fwvx0.h.m(arr_fvvj, true);
        return object0;
    }
}

