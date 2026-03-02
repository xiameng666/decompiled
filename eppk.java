import com.google.android.gms.trustlet.place.model.LightPlace;

final class eppk extends ibsl implements ibtw {
    int a;
    final ezmb b;
    final String c;
    final boolean d;

    public eppk(ezmb ezmb0, String s, boolean z, ibrl ibrl0) {
        this.b = ezmb0;
        this.c = s;
        this.d = z;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eppk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eppk(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            bblp bblp0 = new bblp(1, 9);
            gmcd gmcd0 = this.b.a(this.c, bblp0, this.d);
            this.a = 1;
            object0 = icpu.c(gmcd0, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return ((LightPlace)object0) != null ? ((LightPlace)object0).c() : null;
    }
}

