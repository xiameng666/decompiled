import android.content.Context;

final class asqk extends ibsl implements ibtw {
    final Context a;
    final aqso b;
    final fpwv c;
    final asxf d;
    final ibrt e;

    public asqk(Context context0, aqso aqso0, fpwv fpwv0, asxf asxf0, ibrt ibrt0, ibrl ibrl0) {
        this.a = context0;
        this.b = aqso0;
        this.c = fpwv0;
        this.d = asxf0;
        this.e = ibrt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((asqk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new asqk(this.a, this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        boolean z = new aqjk(this.a).i();
        fpwl fpwl0 = aqsl.a(this.a.getPackageManager()).c();
        ibuq.e(fpwl0, "getStateForBbG1(...)");
        return bayo.a(this.a).f() ? new asqp(z, fpwl0, ghzs.b, this.b, this.c, this.d, this.e) : new asqp(z, fpwl0, ghzs.c, this.b, this.c, this.d, this.e);
    }
}

