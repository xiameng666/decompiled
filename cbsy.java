import java.util.List;

final class cbsy extends ibsl implements ibtw {
    int a;
    final cbte b;

    public cbsy(cbte cbte0, ibrl ibrl0) {
        this.b = cbte0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbsy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbsy(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.g(this);
            if(object0 == object1) {
                return object1;
            }
        }
        return new Integer(((List)object0).size());
    }
}

