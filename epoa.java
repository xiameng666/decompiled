import java.util.ArrayList;

final class epoa extends ibsl implements ibtw {
    int a;
    final Iterable b;
    private Object c;

    public epoa(Iterable iterable0, ibrl ibrl0) {
        this.b = iterable0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epoa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new epoa(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        icck icck0 = (icck)this.c;
        ArrayList arrayList0 = new ArrayList(ibpo.q(this.b, 10));
        for(Object object2: this.b) {
            arrayList0.add(icbb.a(icck0, null, null, new epnz(((epng)object2), null), 3));
        }
        this.a = 1;
        Object object3 = icay.a(arrayList0, this);
        return object3 == object1 ? object1 : object3;
    }
}

