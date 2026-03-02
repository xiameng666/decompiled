import com.google.android.gms.common.Feature;

final class aueu extends ibsl implements ibtw {
    int a;
    final auez b;

    public aueu(auez auez0, ibrl ibrl0) {
        this.b = auez0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((aueu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new aueu(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        this.a = 1;
        azzc azzc0 = new azzc();
        azzc0.c = new Feature[]{aaxe.a};
        azzc0.d = 0x9028;
        azzc0.a = new aaxq();
        azzd azzd0 = azzc0.a();
        Object object2 = ictn.b(this.b.e.a.iG(azzd0).h(new aaxr(), new aaxs()), this);
        return object2 == object1 ? object1 : object2;
    }
}

