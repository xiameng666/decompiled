import java.util.ArrayList;

final class furp extends ibsl implements ibtw {
    int a;
    final furs b;
    private Object c;

    public furp(furs furs0, ibrl ibrl0) {
        this.b = furs0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((furp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new furp(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.c;
            ArrayList arrayList0 = new ArrayList(ibpo.q(this.b.c, 10));
            for(Object object2: this.b.c) {
                arrayList0.add(icbb.b(icck0, null, null, new furo(((furt)object2), null), 3));
            }
            this.a = 1;
            if(icay.c(arrayList0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

