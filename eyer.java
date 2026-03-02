import java.util.Collection;

final class eyer extends ibsl implements ibtw {
    int a;
    final eyet b;

    public eyer(eyet eyet0, ibrl ibrl0) {
        this.b = eyet0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eyer)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eyer(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = this.b.a.p();
            this.a = 1;
            object0 = icll.a(icig0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return Boolean.valueOf(((boolean)(((Collection)object0).isEmpty() ^ 1)));
    }
}

