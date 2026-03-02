final class dcom extends ibsl implements ibts {
    public dcom(ibrl ibrl0) {
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new dcom(((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return ibom.a;
    }
}

