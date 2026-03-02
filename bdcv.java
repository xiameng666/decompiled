import java.util.List;

final class bdcv extends ibuo implements ibtw {
    public bdcv(Object object0) {
        super(2, object0, bddm.class, "passwordSelected", "passwordSelected(IZ)V", 0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object0).intValue();
        bddm bddm0 = (bddm)this.e;
        List list0 = bddm0.d;
        list0.set(v, ((Boolean)object1));
        lqi lqi0 = bddm0.n;
        boolean z = false;
        if(!list0.isEmpty()) {
            for(Object object2: list0) {
                if(((Boolean)object2).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        lqi0.l(Boolean.valueOf(z));
        List list1 = bdde.b(bddm0.c, list0);
        bddm0.f.l(list1);
        return ibom.a;
    }
}

