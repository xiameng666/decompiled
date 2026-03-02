final class dxsv extends ibsl implements ibtw {
    int a;
    final dxsw b;

    public dxsv(dxsw dxsw0, ibrl ibrl0) {
        this.b = dxsw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dxsv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dxsv(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.f.b(String.valueOf((this.b.e.o == null ? ftei.a : this.b.e.o).s), this);
            if(object0 == object1) {
                return object1;
            }
        }
        this.b.l(((ftix)object0));
        return ibom.a;
    }
}

