import android.os.PersistableBundle;

final class rte extends ibsl implements ibtw {
    int a;
    final ryh b;
    final rrh c;
    final Object d;
    private Object e;

    public rte(ryh ryh0, rrh rrh0, Object object0, ibrl ibrl0) {
        this.b = ryh0;
        this.c = rrh0;
        this.d = object0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rte)this.c(((sag)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rte(this.b, this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            sag sag0 = (sag)this.e;
            PersistableBundle persistableBundle0 = (PersistableBundle)this.c.p().fm(this.d);
            this.a = 1;
            if(sag0.b(this.b, persistableBundle0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

