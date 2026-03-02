final class dxpc implements ibtw {
    final dxpm a;
    final dxpn b;

    public dxpc(dxpm dxpm0, dxpn dxpn0) {
        this.a = dxpm0;
        this.b = dxpn0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        this.a.E(((goz)object0), 0);
        this.a.D(this.b, ((goz)object0), 0);
        return ibom.a;
    }
}

