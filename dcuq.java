import java.util.ArrayList;
import java.util.List;

public final class dcuq extends ibsl implements ibtw {
    int a;
    final dcus b;
    final dcst c;
    final String d;

    public dcuq(dcus dcus0, dcst dcst0, String s, ibrl ibrl0) {
        this.b = dcus0;
        this.c = dcst0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcuq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcuq(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            String s = this.d;
            this.a = 1;
            dcrn dcrn0 = this.b.a.a(this.c);
            if(dcrn0 == null) {
                object2 = ibom.a;
            }
            else {
                List list0 = ((dcrq)dcrn0.c.b()).b;
                ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
                for(Object object3: list0) {
                    arrayList0.add(((dcsl)object3).b);
                }
                if(arrayList0.contains(s)) {
                    object2 = ibom.a;
                }
                else {
                    object2 = dcrn0.d(this);
                    if(object2 != object1) {
                        object2 = ibom.a;
                    }
                }
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

