final class fosn {
    public final iczo a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final String f;
    public final iczv g;
    public final Integer h;
    public final int i;

    public fosn(iczo iczo0, Long long0, Long long1, Long long2, Long long3, int v, String s, iczv iczv0, Integer integer0) {
        this.a = iczo0;
        this.b = long0;
        this.c = long1;
        this.d = long2;
        this.e = long3;
        this.i = v;
        this.f = s;
        this.g = iczv0;
        this.h = integer0;
    }

    @Override
    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.f);
    }
}

