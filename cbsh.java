import android.view.View;

final class cbsh extends ibsl implements ibtw {
    int a;
    final cbsk b;
    final View c;

    public cbsh(cbsk cbsk0, View view0, ibrl ibrl0) {
        this.b = cbsk0;
        this.c = view0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbsh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbsh(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            cbsg cbsg0 = new cbsg(this.b, this.c, null);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, cbsg0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

