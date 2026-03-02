import com.google.android.gms.googleone.smui.SmuiChimeraActivity;

final class buil extends ibsl implements ibtw {
    int a;
    final SmuiChimeraActivity b;

    public buil(SmuiChimeraActivity smuiChimeraActivity0, ibrl ibrl0) {
        this.b = smuiChimeraActivity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((buil)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new buil(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icnl icnl0 = this.b.b().f;
            buik buik0 = new buik(this.b);
            this.a = 1;
            if(icnl0.oR(buik0, this) == object1) {
                return object1;
            }
        }
        throw new ibnm();
    }
}

