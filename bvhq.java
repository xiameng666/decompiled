final class bvhq implements icih {
    final bvkk a;

    public bvhq(bvkk bvkk0) {
        this.a = bvkk0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        bvgx bvgx1;
        while(true) {
            icnl icnl0 = this.a.t;
            Object object1 = icnl0.b();
            bvgx bvgx0 = (bvgx)object1;
            if(ibuq.m(((bvkw)object0), bvkv.a)) {
                bvgx1 = bvgx.a(bvgx0, null, bvky.a, null, null, 29);
            }
            else {
                if(!(((bvkw)object0) instanceof bvku)) {
                    break;
                }
                ibuq.f(bvgx0, "<this>");
                ibuq.f(((bvku)(((bvkw)object0))).b, "tabOrder");
                bvgx1 = bvgx.a(bvgx0, null, bvky.a(bvgx0.b, ((bvku)(((bvkw)object0))).b, null, null, 6), null, null, 29);
            }
            if(icnl0.h(object1, bvgx1)) {
                return ibom.a;
            }
        }
        throw new ibnq();
    }
}

