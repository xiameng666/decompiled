import java.util.LinkedHashMap;

final class dgkg extends ibsl implements ibtw {
    int a;
    final dgkm b;
    private Object c;

    public dgkg(dgkm dgkm0, ibrl ibrl0) {
        this.b = dgkm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgkg)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgkg(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            dgkf dgkf0 = new dgkf(this.b, ichm0, linkedHashMap0);
            this.a = 1;
            if(((dgkw)this.b.b).e.oR(dgkf0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

