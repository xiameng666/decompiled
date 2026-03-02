import android.os.PersistableBundle;

final class rmu extends ibsl implements ibtw {
    int a;
    final rmy b;
    final String c;
    final sdv d;
    final Object e;

    public rmu(rmy rmy0, String s, sdv sdv0, Object object0, ibrl ibrl0) {
        this.b = rmy0;
        this.c = s;
        this.d = sdv0;
        this.e = object0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rmu)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rmu(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            PersistableBundle persistableBundle0 = this.d.d(this.e);
            this.a = 1;
            if(this.b.f(this.c, persistableBundle0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

