final class lev extends ibsl implements ibtw {
    int a;
    Object b;
    final ibtw c;

    public lev(ibtw ibtw0, ibrl ibrl0) {
        this.c = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((lev)this.c(((lfa)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new lev(this.c, ibrl0);
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
            object0 = this.c.a(((lfa)this.b), this);
            if(object0 == object1) {
                return object1;
            }
        }
        ibuq.d(((lfa)object0), "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((lfa)object0).a.a.set(true);
        return (lfa)object0;
    }
}

