import j..time.Instant;

public final class cqbf implements glzn {
    public final cqbi a;
    public final cqgz b;

    public cqbf(cqbi cqbi0, cqgz cqgz0) {
        this.a = cqbi0;
        this.b = cqgz0;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        if(((Boolean)object0).booleanValue()) {
            Instant instant0 = Instant.now();
            gmcd gmcd0 = glzd.f(this.a.b.a((this.b.b == cqgy.b ? fkwm.b : fkwm.a), instant0), new cqbh(), gmap.a);
            cqbg cqbg0 = new cqbg();
            return glyi.g(gmcd0, Exception.class, cqbg0, gmap.a);
        }
        return gmbu.i(fktz.e(null));
    }
}

