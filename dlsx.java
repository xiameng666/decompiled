public final class dlsx extends ibsl implements ibtw {
    int a;
    final lps b;
    final icig c;
    final dlte d;

    public dlsx(lps lps0, icig icig0, ibrl ibrl0, dlte dlte0) {
        this.b = lps0;
        this.c = icig0;
        this.d = dlte0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dlsx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dlsx(this.b, this.c, ibrl0, this.d);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dlsw dlsw0 = new dlsw(this.c, null, this.d);
            this.a = 1;
            if(lqy.b(this.b, lpf.d, dlsw0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

