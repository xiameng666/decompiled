import java.util.ArrayList;

final class bvhm implements ibum, icih {
    final bvkk a;

    public bvhm(bvkk bvkk0) {
        this.a = bvkk0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        do {
            icnl icnl0 = this.a.t;
            Object object1 = icnl0.b();
            cmhx cmhx0 = bvih.a(((String)object0), (((String)object0) == null ? cmew.c : cmew.b), this.a.f);
            bvgd bvgd0 = ((bvgx)object1).a;
            bvgc bvgc0 = bvgd0.b;
            bvhl bvhl0 = new bvhl(this.a, ((String)object0));
            ArrayList arrayList0 = new ArrayList(ibpo.q(bvgc0.b, 10));
            int v = 0;
            for(Object object2: bvgc0.b) {
                if(v < 0) {
                    ibpo.m();
                }
                bvfz bvfz0 = (bvfz)object2;
                cmeu cmeu0 = bvfz0.b;
                if(cmeu0 == cmeu.e) {
                    bvfz0 = bvhi.b(bvkp.a(bvfz0.a, cmeu0, bvhl0), v);
                }
                arrayList0.add(bvfz0);
                ++v;
            }
            ibuq.f(((bvgx)object1), "<this>");
            bvgc bvgc1 = new bvgc(bvgc0.a, arrayList0);
            ibuq.f(bvgd0.a, "title");
        }
        while(!icnl0.h(object1, bvgx.a(bvgx.a(((bvgx)object1), new bvgd(bvgd0.a, bvgc1), null, null, null, 30), null, null, null, cmhx0, 23)));
        return ibom.a;
    }

    @Override  // ibum
    public final ibnk b() {
        return new ibue(2, this.a, bvkk.class, "updateAccount", "updateAccount(Ljava/lang/String;)V", 4);
    }

    @Override
    public final boolean equals(Object object0) {
        return !(object0 instanceof icih) || !(object0 instanceof ibum) ? false : ibuq.m(this.b(), ((ibum)object0).b());
    }

    @Override
    public final int hashCode() {
        return this.b().hashCode();
    }
}

