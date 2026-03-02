import java.util.List;

final class bfaf extends ibsl implements ibtw {
    int a;
    final bfah b;

    public bfaf(bfah bfah0, ibrl ibrl0) {
        this.b = bfah0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bfaf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bfaf(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        gqsm gqsm0;
        bezx bezx0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.b.o.l(Boolean.valueOf(true));
            this.a = 1;
            object0 = this.b.a.c(this.b.d, this);
            if(object0 == object1) {
                return object1;
            }
        }
        List list0 = ((beya)object0).a;
        int v1 = list0.size();
        List list1 = ((beya)object0).b;
        int v2 = list1.size();
        if(v2 == 0) {
            bezx0 = new bezx(v1);
        }
        else if(v1 == 0) {
            bezx0 = new bezy(v2);
        }
        else {
            bezx0 = new bezz(list0, list1);
        }
        bfah bfah0 = this.b;
        if((bezx0 instanceof bezx)) {
            gqsm0 = gqsm.No;
        }
        else {
            if(!(bezx0 instanceof bezy) && !(bezx0 instanceof bezz)) {
                throw new ibnq();
            }
            gqsm0 = gqsm.Np;
        }
        bfah0.c.c(gqsm0);
        bfah0.q.l(bezx0);
        bfah0.o.l(Boolean.valueOf(false));
        return ibom.a;
    }
}

