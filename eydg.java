import j..time.Duration;
import java.util.List;

final class eydg extends ibsl implements ibtw {
    int a;
    final eydm b;
    final List c;
    final exka d;
    final eyfr e;
    final Duration f;

    public eydg(eydm eydm0, List list0, exka exka0, eyfr eyfr0, Duration duration0, ibrl ibrl0) {
        this.b = eydm0;
        this.c = list0;
        this.d = exka0;
        this.e = eyfr0;
        this.f = duration0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eydg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eydg(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        exwv exwv0 = (exwv)this.c.get(0);
        this.a = 1;
        Object object2 = this.b.e(exwv0, this.b.c, this.b.d, this.d, this.e, this.f, this);
        return object2 == object1 ? object1 : object2;
    }
}

