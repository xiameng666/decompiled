import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;

final class gbgn extends ibsl implements ibtw {
    final gbgr a;

    public gbgn(gbgr gbgr0, ibrl ibrl0) {
        this.a = gbgr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbgn)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbgn(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        gbgr gbgr0 = this.a;
        if(gbgr0.c) {
            List list0 = gbgr0.f.a(gbgr0.b);
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(list0, 10)), 16));
            for(Object object1: list0) {
                String s = ((gblm)object1).b;
                Bundle bundle0 = gcur.a(((gblm)object1).c, gblm.class.getClassLoader());
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                }
                ibns ibns0 = new ibns(s, bundle0);
                linkedHashMap0.put(ibns0.a, ibns0.b);
            }
            return ibpz.r(linkedHashMap0);
        }
        return new LinkedHashMap();
    }
}

