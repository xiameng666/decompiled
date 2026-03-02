public final class cthy implements ctho {
    public final ctmo a;
    private final String b;
    private final String c;
    private final icig d;

    public cthy(ctmo ctmo0) {
        ibuq.f(ctmo0, "binder");
        super();
        this.a = ctmo0;
        this.b = ctmo0.a().a;
        this.c = ctmo0.a().b;
        this.d = icii.b(new ichv(new cthr(this, null)), -1, 0, 2);
    }

    @Override  // ctho
    public final Object a(String s, ibrl ibrl0) {
        icbk icbk0 = new icbk(ibsc.c(ibrl0), 1);
        icbk0.z();
        ctmw ctmw0 = new ctmw(icbk0);
        this.a.c(s, ctmw0);
        Object object0 = icbk0.k();
        if(object0 == ibrx.a) {
            ibsi.b(ibrl0);
        }
        return object0;
    }

    @Override  // ctho
    public final String b() {
        return this.c;
    }

    @Override  // ctho
    public final String c() {
        return this.b;
    }

    @Override  // ctho
    public final icig d(icig icig0) {
        ibuq.f(icig0, "messages");
        return new ichv(new cthx(this, icig0, null));
    }

    @Override  // ctho
    public final icig e() {
        return this.d;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ctho) && ibuq.m(((ctho)object0).c(), this.b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}

