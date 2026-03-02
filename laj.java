import java.util.List;

final class laj extends ibsl implements ibtw {
    int a;
    Object b;
    final List c;

    public laj(List list0, ibrl ibrl0) {
        this.c = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((laj)this.c(((lax)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new laj(this.c, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(lao.a.a(this.c, ((lax)this.b), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

