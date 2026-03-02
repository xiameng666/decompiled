public final class ckp implements ibts {
    public final ibtw a;
    public final cmc b;

    public ckp(ibtw ibtw0, cmc cmc0) {
        this.a = ibtw0;
        this.b = cmc0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        chk chk0 = (chk)object0;
        Object object1 = chk0.a();
        Object object2 = this.b.b.a(chk0.d);
        this.a.a(object1, object2);
        return ibom.a;
    }
}

