import java.util.ArrayList;

final class bghq extends ibsl implements ibtw {
    int a;
    final ggfd b;
    final bghr c;
    private Object d;

    public bghq(ggfd ggfd0, bghr bghr0, ibrl ibrl0) {
        this.b = ggfd0;
        this.c = bghr0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bghq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new bghq(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        icck icck0 = (icck)this.d;
        ggfd ggfd0 = this.b;
        ggfp ggfp0 = ggfd0.r();
        ibuq.e(ggfp0, "keySet(...)");
        bghr bghr0 = this.c;
        ArrayList arrayList0 = new ArrayList(ibpo.q(ggfp0, 10));
        for(Object object2: ggfp0) {
            arrayList0.add(icbb.a(icck0, null, null, new bghp(bghr0, ((bggb)object2), ggfd0, null), 3));
        }
        this.a = 1;
        Object object3 = icay.a(arrayList0, this);
        return object3 == object1 ? object1 : object3;
    }
}

