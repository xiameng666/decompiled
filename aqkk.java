import j..time.Instant;

public final class aqkk implements ibth {
    public final aqkn a;
    public final String b;
    public final Instant c;
    public final aqfv d;

    public aqkk(aqkn aqkn0, String s, Instant instant0, aqfv aqfv0) {
        this.a = aqkn0;
        this.b = s;
        this.c = instant0;
        this.d = aqfv0;
    }

    @Override  // ibth
    public final Object a() {
        ibuq.f(this.b, "packageName");
        ibuq.f(this.c, "startTime");
        ibuq.f(this.d, "backupType");
        aqkc aqkc0 = new aqkc(new aqkb(this.b, this.c, this.d));
        return this.a.c.b(aqkc0, this.a.b);
    }
}

