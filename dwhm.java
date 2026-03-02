import android.content.Intent;

final class dwhm extends ibsl implements ibtw {
    final dwhp a;
    final Intent b;

    public dwhm(dwhp dwhp0, Intent intent0, ibrl ibrl0) {
        this.a = dwhp0;
        this.b = intent0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dwhm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dwhm(this.a, this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        icck icck0 = lsc.a(this.a);
        frxf[] arr_frxf = new frxf[1];
        Intent intent0 = this.b.setFlags(0x4000000);
        ibuq.e(intent0, "setFlags(...)");
        arr_frxf[0] = new frxg(intent0);
        this.a.e(icck0, arr_frxf);
        return ibom.a;
    }
}

