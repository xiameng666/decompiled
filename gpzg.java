import j..util.Objects;

final class gpzg extends gqad {
    public gpzg(gpzl gpzl0) {
        Objects.requireNonNull(gpzl0);
        super();
    }

    @Override  // gqad
    public final Object a(gqff gqff0) {
        if(gqff0.u() == 9) {
            gqff0.p();
            return null;
        }
        return gqff0.a();
    }

    @Override  // gqad
    public final void b(gqfh gqfh0, Object object0) {
        if(((Number)object0) == null) {
            gqfh0.j();
            return;
        }
        double f = ((Number)object0).doubleValue();
        gpzl.j(f);
        gqfh0.d();
        if(gqfh0.b != gqaa.a && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new IllegalArgumentException(a.E(f, "Numeric values must be finite, but was "));
        }
        gqfh0.a();
        gqfh0.a.append(Double.toString(f));
    }
}

