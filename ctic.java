import android.content.Intent;

final class ctic extends ibsl implements ibtw {
    int a;
    final ctid b;
    private Object c;

    public ctic(ctid ctid0, ibrl ibrl0) {
        this.b = ctid0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctic)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctic(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            Intent intent0 = ctlk.a(this.b.a);
            cthz cthz0 = new cthz(ichm0);
            ctib ctib0 = new ctib(ichm0, null);
            this.a = 1;
            if(ctnk.a(this.b.a, intent0, cthz0, ctib0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

