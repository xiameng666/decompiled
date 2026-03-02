import java.util.Locale;

final class ighj implements Comparable {
    igcp a;
    int b;
    String c;
    Locale d;

    public final int a(ighj ighj0) {
        igcp igcp0 = ighj0.a;
        int v = ighl.a(this.a.y(), igcp0.y());
        return v == 0 ? ighl.a(this.a.w(), igcp0.w()) : v;
    }

    final long b(long v, boolean z) {
        long v1 = this.c == null ? this.a.n(v, this.b) : this.a.m(v, this.c, this.d);
        return z ? this.a.k(v1) : v1;
    }

    final void c(igcp igcp0, int v) {
        this.a = igcp0;
        this.b = v;
        this.c = null;
        this.d = null;
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((ighj)object0));
    }
}

