import com.google.android.gms.common.Feature;

final class auep extends ibsl implements ibtw {
    int a;
    final auez b;

    public auep(auez auez0, ibrl ibrl0) {
        this.b = auez0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((auep)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new auep(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            azzc azzc0 = new azzc();
            azzc0.c = new Feature[]{aaxe.a};
            azzc0.d = 0x9027;
            azzc0.a = new aaxt();
            azzd azzd0 = azzc0.a();
            Object object2 = ictn.b(this.b.e.a.jn(azzd0), this);
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 != object1) {
                object2 = ibom.a;
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

