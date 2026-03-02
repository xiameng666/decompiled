import com.google.android.gms.nearby.sharing.ShareTarget;

final class dcuo extends ibsl implements ibtw {
    int a;
    final icig b;
    final ShareTarget c;
    final dcus d;

    public dcuo(icig icig0, ShareTarget shareTarget0, dcus dcus0, ibrl ibrl0) {
        this.b = icig0;
        this.c = shareTarget0;
        this.d = dcus0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcuo)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dcuo(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            dcum dcum0 = new dcum(null);
            icig icig0 = ickq.b(this.b, dcum0);
            dcun dcun0 = new dcun(this.c, this.d);
            this.a = 1;
            if(icig0.oR(dcun0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

