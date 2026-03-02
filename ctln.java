final class ctln extends ibsl implements ibtw {
    final ctmk a;

    public ctln(ctmk ctmk0, ibrl ibrl0) {
        this.a = ctmk0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctln)this.c(((icih)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctln(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        this.a.a.c("AppCastService");
        return ibom.a;
    }
}

