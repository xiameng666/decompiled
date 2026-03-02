import android.content.Intent;

final class dwhk extends ibsl implements ibtw {
    final dwhp a;
    final gged_interceptors b;
    final gfsx c;

    public dwhk(dwhp dwhp0, gged_interceptors gged0, gfsx gfsx0, ibrl ibrl0) {
        this.a = dwhp0;
        this.b = gged0;
        this.c = gfsx0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwhk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwhk(this.a, this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icck icck0 = lsc.a(this.a);
        frxf[] arr_frxf = new frxf[1];
        int v = ((gvby)this.c.d()).c;
        Intent intent0 = dlnf.bF(this.b, v, true, this.a.h).setFlags(0x4000000);
        ibuq.e(intent0, "setFlags(...)");
        arr_frxf[0] = new frxg(intent0);
        this.a.e(icck0, arr_frxf);
        return ibom.a;
    }
}

