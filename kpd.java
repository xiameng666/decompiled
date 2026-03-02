public final class kpd implements ibth {
    public final kpq a;
    public final klq b;

    public kpd(kpq kpq0, klq klq0) {
        this.a = kpq0;
        this.b = klq0;
    }

    @Override  // ibth
    public final Object a() {
        this.a.f().execute(new kpm(this.a, this.b));
        return ibom.a;
    }
}

