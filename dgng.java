import java.util.List;

final class dgng extends ibsl implements ibtw {
    int a;
    final dgop b;
    final dgfh c;
    final dgfc d;
    final String e;
    final List f;
    final ichm g;

    public dgng(dgop dgop0, ichm ichm0, dgfh dgfh0, dgfc dgfc0, String s, List list0, ibrl ibrl0) {
        this.b = dgop0;
        this.g = ichm0;
        this.c = dgfh0;
        this.d = dgfc0;
        this.e = s;
        this.f = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgng)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgng(this.b, this.g, this.c, this.d, this.e, this.f, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.m(this.g, this.c, this.d, this.e, this.f, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

