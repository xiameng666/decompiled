import com.google.android.gms.nearby.sharing.ShareTarget;

final class dgci extends ibsl implements ibtw {
    int a;
    final dgcp b;
    final ShareTarget c;

    public dgci(dgcp dgcp0, ShareTarget shareTarget0, ibrl ibrl0) {
        this.b = dgcp0;
        this.c = shareTarget0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgci)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgci(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        dgdi dgdi0;
        Object object2;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        dgdt dgdt0 = this.b.n;
        long v1 = this.c.a;
        synchronized(dgdt0) {
            dgdi0 = (dgdi)dgdt0.b.get(new Long(v1));
            if(dgdi0 == null) {
                object2 = new Integer(0x8AB7);
                return object2 == object1 ? object1 : object2;
            }
        }
        dgym.a().a(new dgyr(v1, ((dgdf)dgdi0.c).a.j));
        object2 = ((dgdf)dgdi0.c).b.b(this);
        return object2 == object1 ? object1 : object2;
    }
}

