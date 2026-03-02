import j..util.Objects;

final class iatb implements ibbf {
    final iate a;

    public iatb(iate iate0) {
        Objects.requireNonNull(iate0);
        this.a = iate0;
        super();
    }

    @Override  // ibbf
    public final iavd a() {
        iatd iatd0 = new iatd(this.a.a, this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
        ibfu ibfu0 = this.a.b.a();
        return new iatc(iatd0, gmap.a, ibfu0);
    }
}

