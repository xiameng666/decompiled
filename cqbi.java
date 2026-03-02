public final class cqbi implements cqgt {
    public final fiyj a;
    public final fkys b;

    public cqbi(fkys fkys0, fiyj fiyj0) {
        this.b = fkys0;
        this.a = fiyj0;
    }

    @Override  // cqgt
    public final gmcd a(cqgz cqgz0, flad flad0) {
        boolean z = true;
        if(cqgz0.b == cqgy.b && flad0 != null) {
            long v = flad0.b.d().toEpochMilli();
            if((flad0.c.b & 1) != 0 && v - flad0.c.d < 0x7FFFFFFFFFFFFFFFL && flal.f(flad0.c).isEmpty()) {
                z = false;
            }
            cqbe cqbe0 = new cqbe(this);
            return glzd.g(glyi.f(gmbu.i(Boolean.valueOf(z)), Exception.class, cqbe0, gmap.a), new cqbf(this, cqgz0), gmap.a);
        }
        return glzd.g(gmbu.i(Boolean.valueOf(true)), new cqbf(this, cqgz0), gmap.a);
    }
}

