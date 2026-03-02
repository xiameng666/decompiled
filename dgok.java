import java.util.Set;

final class dgok extends ibsl implements ibtw {
    Object a;
    final int b;

    public dgok(int v, ibrl ibrl0) {
        this.b = v;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgok)this.c(((Set)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dgok(this.b, ibrl0);
        ibrl1.a = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        return ((Set)this.a).size() == this.b ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

