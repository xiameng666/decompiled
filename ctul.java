import com.google.android.gms.nearby.presence.PresenceDevice;

final class ctul extends ibsl implements ibtw {
    int a;
    final ctuy b;
    final PresenceDevice c;
    private Object d;

    public ctul(ctuy ctuy0, PresenceDevice presenceDevice0, ibrl ibrl0) {
        this.b = ctuy0;
        this.c = presenceDevice0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctul)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ctul(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.d;
            ctuk ctuk0 = new ctuk(this.c, ichm0);
            this.b.a.c(this.c.f, ctuk0);
            this.a = 1;
            if(ichl.b(ichm0, new ichi(), this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

