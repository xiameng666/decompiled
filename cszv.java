import java.util.List;

public final class cszv extends ibsl implements ibtw {
    int a;
    final cszw b;
    final cssq c;
    final List d;

    public cszv(cszw cszw0, cssq cssq0, List list0, ibrl ibrl0) {
        this.b = cszw0;
        this.c = cssq0;
        this.d = list0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cszv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cszv(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.b.a(this.c, this.d, this) == object1) {
                return object1;
            }
        }
        ibuq.f(ctdl.e, "source");
        int v1 = ctdn.c(ctdl.e);
        this.b.e.r(haat.f, v1);
        return ibom.a;
    }
}

