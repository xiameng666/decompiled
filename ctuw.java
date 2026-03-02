import com.google.android.gms.nearby.presence.PresenceDevice;

final class ctuw extends ibsl implements ibtw {
    int a;
    final ctuy b;
    final PresenceDevice c;
    final icmn d;

    public ctuw(ctuy ctuy0, PresenceDevice presenceDevice0, icmn icmn0, ibrl ibrl0) {
        this.b = ctuy0;
        this.c = presenceDevice0;
        this.d = icmn0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctuw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctuw(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichv ichv0 = new ichv(new ctul(this.b, this.c, null));
            ctuv ctuv0 = new ctuv(this.d);
            this.a = 1;
            if(icoa.h(ichv0, ctuv0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

