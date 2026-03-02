public final class bejy implements ibth {
    public final lqd a;
    public final lqd b;
    public final lqh c;

    public bejy(lqd lqd0, lqd lqd1, lqh lqh0) {
        this.a = lqd0;
        this.b = lqd1;
        this.c = lqh0;
    }

    @Override  // ibth
    public final Object a() {
        bedv bedv0 = (bedv)this.a.ij();
        gged_interceptors gged0 = bedv0 == null ? null : ((gged_interceptors)bedv0.b);
        bedv bedv1 = (bedv)this.b.ij();
        gged_interceptors gged1 = bedv1 == null ? null : ((gged_interceptors)bedv1.b);
        lqh lqh0 = this.c;
        if(gged0 == null) {
            lqh0.l(null);
            return ibom.a;
        }
        lqh0.l(new bekt(gged0, gged1));
        return ibom.a;
    }
}

