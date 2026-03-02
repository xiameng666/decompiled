import java.util.Map;

final class dcsc extends ibsl implements ibtw {
    int a;
    final Map b;
    final dcsh c;

    public dcsc(Map map0, dcsh dcsh0, ibrl ibrl0) {
        this.b = map0;
        this.c = dcsh0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcsc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcsc(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcsb dcsb0 = new dcsb(this.b, this.c, null);
            this.a = 1;
            if(icfh.a(dcsb0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

