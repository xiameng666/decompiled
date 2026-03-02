import com.google.android.gms.nearby.sharing.ShareTarget;

final class dgcf extends ibsl implements ibtw {
    int a;
    final dgcp b;
    final ShareTarget c;

    public dgcf(dgcp dgcp0, ShareTarget shareTarget0, ibrl ibrl0) {
        this.b = dgcp0;
        this.c = shareTarget0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgcf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgcf(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dgdi dgdi0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        dgdt dgdt0 = this.b.n;
        synchronized(dgdt0) {
            dgdi0 = (dgdi)dgdt0.b.get(new Long(this.c.a));
            if(dgdi0 == null) {
                return ibps.a == object1 ? object1 : ibps.a;
            }
        }
        Object object2 = ((dgdf)dgdi0.c).b.a(this);
        return object2 == object1 ? object1 : object2;
    }
}

