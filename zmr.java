import java.util.List;

final class zmr extends ibsl implements ibtw {
    final zms a;
    final List b;

    public zmr(zms zms0, List list0, ibrl ibrl0) {
        this.a = zms0;
        this.b = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((zmr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new zmr(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        for(Object object1: this.b) {
            ibuq.e(((zkx)object1).c, "getResourceKey(...)");
            ibuq.e(((zkx)object1).b, "getLanguage(...)");
            fhrt fhrt0 = fhrt.a(((zkx)object1).e);
            zjv zjv0 = new zjv(aaua.a(((zkx)object1).a), ((zkx)object1).c, ((zkx)object1).b, fhrt0, ((zkx)object1).f);
            zho zho0 = new zho(((zkx)object1).g.a, ((zkx)object1).g.b);
            this.a.e.c(zjv0).l(zho0);
        }
        return ibom.a;
    }
}

