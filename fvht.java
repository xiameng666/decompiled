import j..util.DesugarTimeZone;
import j..util.Objects;
import java.util.Calendar;

public final class fvht implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final long g;

    public fvht(fvhs fvhs0) {
        this.a = fvhs0.a;
        this.b = fvhs0.b;
        this.c = fvhs0.c;
        this.d = fvhs0.d;
        this.e = fvhs0.e;
        this.f = fvhs0.f;
        this.g = fvhs0.g;
    }

    public final int a(fvht fvht0) {
        return ggbe.b.b(this.a, fvht0.a).b(this.b, fvht0.b).b(this.c, fvht0.c).b(this.d, fvht0.d).b(this.e, fvht0.e).b(this.f, fvht0.f).c(this.g, fvht0.g).a();
    }

    public static int b(fvht fvht0) {
        gged_interceptors gged0 = fvhx.h;
        int v = ((ggna)gged0).c;
        int v1 = 0;
        int v2;
        for(v2 = 0; v1 < v && ((fvht)gged0.get(v1)).a(fvht0) <= 0; ++v2) {
            ++v1;
        }
        return v2;
    }

    public final long c(fvht fvht0) {
        return (fvht.e(this) - fvht.e(fvht0)) * 1000L + (this.g - fvht0.g) / 1000000000L;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((fvht)object0));
    }

    public static fvht d(long v, long v1) {
        Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar0.setTimeInMillis(v * 1000L);
        fvhs fvhs0 = new fvhs();
        fvhs0.a = calendar0.get(1);
        fvhs0.e(calendar0.get(2) + 1);
        fvhs0.b(calendar0.get(5));
        fvhs0.c(calendar0.get(11));
        fvhs0.d(calendar0.get(12));
        fvhs0.g(calendar0.get(13));
        fvhs0.f(v1);
        return fvhs0.a();
    }

    private static long e(fvht fvht0) {
        Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar0.set(fvht0.a, fvht0.b - 1, fvht0.c, fvht0.d, fvht0.e, fvht0.f);
        return calendar0.getTimeInMillis() / 1000L;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof fvht) ? ((fvht)object0).a == this.a && ((fvht)object0).b == this.b && ((fvht)object0).c == this.c && ((fvht)object0).d == this.d && ((fvht)object0).e == this.e && ((fvht)object0).f == this.f && ((fvht)object0).g == this.g : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b), ((int)this.c), ((int)this.d), ((int)this.e), ((int)this.f), ((long)this.g)});
    }

    @Override
    public final String toString() {
        return this.a + "-" + this.b + "-" + this.c + "-" + this.d + "-" + this.e + "-" + (((double)this.f) + ((double)this.g) * 1.000000E-12);
    }
}

