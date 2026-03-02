import j..util.DesugarTimeZone;
import java.util.Calendar;

public final class fvhs {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;

    public final fvht a() {
        Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar0.set(this.a, this.b - 1, this.c, this.d, this.e, this.f);
        calendar0.get(6);
        return new fvht(this);
    }

    public final void b(int v) {
        gftb.d(v > 0 && v <= 0x1F, "The input day of month is out of range [1, 31]: %s. ", v);
        this.c = v;
    }

    public final void c(int v) {
        gftb.d(v >= 0 && v <= 23, "The input hour of day is out of range [0, 23]: %s. ", v);
        this.d = v;
    }

    public final void d(int v) {
        gftb.d(v >= 0 && v <= 59, "The input minute of hour is out of range [0, 59]: %s. ", v);
        this.e = v;
    }

    public final void e(int v) {
        gftb.d(v > 0 && v <= 12, "The input month of year is out of range [1, 12]: %s. ", v);
        this.b = v;
    }

    public final void f(long v) {
        gftb.e(Long.compare(v, 0L) >= 0 && v < 1000000000000L, "The input picosecond of second is out of range [0, 1E12): %s. ", v);
        this.g = v;
    }

    public final void g(int v) {
        gftb.d(v >= 0 && v <= 59, "The input second of minute is out of range [0, 59]: %s. ", v);
        this.f = v;
    }
}

