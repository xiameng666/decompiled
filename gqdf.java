final class gqdf extends gqdd {
    private final gqbv a;

    public gqdf(gqbv gqbv0, gqdg gqdg0) {
        super(gqdg0);
        this.a = gqbv0;
    }

    @Override  // gqdd
    public final Object c() {
        return this.a.a();
    }

    @Override  // gqdd
    public final Object e(Object object0) {
        return object0;
    }

    @Override  // gqdd
    public final void f(Object object0, gqff gqff0, gqde gqde0) {
        Object object1 = gqde0.g.a(gqff0);
        if(object1 == null && gqde0.h) {
            return;
        }
        if(gqde0.d) {
            gqdi.b(object0, gqde0.b);
            gqde0.b.set(object0, object1);
            return;
        }
        if(gqde0.i) {
            throw new gpzr("Cannot set value of \'static final\' " + gqev.e(gqde0.b, false));
        }
        gqde0.b.set(object0, object1);
    }
}

