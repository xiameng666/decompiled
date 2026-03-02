import java.util.List;

final class cbsm extends ibsl implements ibtw {
    Object a;
    int b;
    final cbte c;

    public cbsm(cbte cbte0, ibrl ibrl0) {
        this.c = cbte0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbsm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbsm(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            ibuq.f(((List)object0), "<set-?>");
            ((cbte)object2).g = (List)object0;
            return ibom.a;
        }
        ibnx.b(object0);
        cbte cbte0 = this.c;
        this.a = cbte0;
        this.b = 1;
        cbsw cbsw0 = new cbsw(cbte0, null);
        Object object3 = icbd.a(cbte0.a, cbsw0, this);
        if(object3 != object1) {
            object0 = object3;
            object2 = cbte0;
            ibuq.f(((List)object0), "<set-?>");
            ((cbte)object2).g = (List)object0;
            return ibom.a;
        }
        return object1;
    }
}

