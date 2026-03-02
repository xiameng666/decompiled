import java.util.LinkedHashMap;
import java.util.List;

final class gbfl extends ibsl implements ibtw {
    final boolean a;
    final gbkj b;
    final String c;

    public gbfl(boolean z, gbkj gbkj0, String s, ibrl ibrl0) {
        this.a = z;
        this.b = gbkj0;
        this.c = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbfl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbfl(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        if(this.a) {
            gbkk gbkk0 = new gbkk(this.c);
            List list0 = (List)oqj.b(((gbkr)this.b).a, true, false, gbkk0);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
            for(Object object1: list0) {
                linkedHashMap0.put(((gbks)object1).b, object1);
            }
            return ibpz.r(linkedHashMap0);
        }
        return new LinkedHashMap();
    }
}

