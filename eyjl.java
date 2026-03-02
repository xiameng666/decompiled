import j..time.Duration;
import java.util.List;

final class eyjl extends ibsl implements ibtw {
    int a;
    final eyce b;
    final exwv c;
    final eyfr d;
    final Duration e;
    final eygi f;

    public eyjl(eyce eyce0, exwv exwv0, eyfr eyfr0, Duration duration0, eygi eygi0, ibrl ibrl0) {
        this.b = eyce0;
        this.c = exwv0;
        this.d = eyfr0;
        this.e = duration0;
        this.f = eygi0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyjl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyjl(this.b, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            List list0 = ibpo.b(this.c);
            this.a = 1;
            object0 = this.b.b(list0, this.d, this.e, this);
            if(object0 == object1) {
                return object1;
            }
        }
        eycd eycd0 = (eycd)object0;
        Duration duration0 = this.f.d.d();
        this.f.g.V(duration0);
        return object0;
    }
}

