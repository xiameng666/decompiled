public final class dxou implements ibts {
    public final dxpm a;
    public final dxpn b;

    public dxou(dxpm dxpm0, dxpn dxpn0) {
        this.a = dxpm0;
        this.b = dxpn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        boolean z = ((Boolean)object0).booleanValue();
        this.a.B(z, (z ? this.b.b : null));
        return ibom.a;
    }
}

