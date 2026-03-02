final class qnt extends ibsl implements ibts {
    final qnu a;
    final qkb b;
    final float c;
    final boolean d;

    public qnt(qnu qnu0, qkb qkb0, float f, boolean z, ibrl ibrl0) {
        this.a = qnu0;
        this.b = qkb0;
        this.c = f;
        this.d = z;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new qnt(this.a, this.b, this.c, this.d, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        qnu qnu0 = this.a;
        qnu0.j(this.b);
        qnu0.m(this.c);
        qnu0.k(1);
        qnu0.l(false);
        if(this.d) {
            qnu.p(qnu0);
        }
        return ibom.a;
    }
}

