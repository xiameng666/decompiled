import com.google.android.gms.nearby.presence.PresenceDevice;

final class cttw extends ibsl implements ibtw {
    int a;
    final ctox b;
    final cttz c;
    final PresenceDevice d;
    final ctoq e;
    private Object f;

    public cttw(ctox ctox0, cttz cttz0, PresenceDevice presenceDevice0, ctoq ctoq0, ibrl ibrl0) {
        this.b = ctox0;
        this.c = cttz0;
        this.d = presenceDevice0;
        this.e = ctoq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cttw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cttw(this.b, this.c, this.d, this.e, ibrl0);
        ibrl1.f = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icck icck0 = (icck)this.f;
            icnj icnj0 = this.b.b();
            cttv cttv0 = new cttv(this.c, this.d, this.e, icck0);
            this.a = 1;
            if(icnj0.oR(cttv0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

