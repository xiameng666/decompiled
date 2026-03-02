final class duwj extends ibsl implements ibtw {
    final duxk a;
    final duwt b;

    public duwj(duxk duxk0, duwt duwt0, ibrl ibrl0) {
        this.a = duxk0;
        this.b = duwt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duwj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duwj(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        ByteString hfsf0 = this.a.b;
        if(hfsf0 != null) {
            duwt.B(this.b, hfsf0, null, 2);
            this.b.z().i();
        }
        return ibom.a;
    }
}

