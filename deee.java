final class deee extends ibsl implements ibtw {
    int a;
    final ddag b;
    final ichm c;

    public deee(ddag ddag0, ichm ichm0, ibrl ibrl0) {
        this.b = ddag0;
        this.c = ichm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((deee)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new deee(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            deed deed0 = new deed(this.c);
            this.a = 1;
            if(this.b.k.oR(deed0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

