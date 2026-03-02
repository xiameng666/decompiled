public final class cbot implements icig {
    final icig a;
    final cbpb b;

    public cbot(icig icig0, cbpb cbpb0) {
        this.a = icig0;
        this.b = cbpb0;
        super();
    }

    @Override  // icig
    public final Object oR(icih icih0, ibrl ibrl0) {
        cbos cbos0 = new cbos(icih0, this.b);
        Object object0 = icoa.h(((icoa)this.a), cbos0, ibrl0);
        return object0 == ibrx.a ? object0 : ibom.a;
    }
}

