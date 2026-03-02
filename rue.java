import android.os.PersistableBundle;

final class rue extends ibsl implements ibtw {
    int a;
    Object b;
    final ryh c;
    final PersistableBundle d;

    public rue(ryh ryh0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        this.c = ryh0;
        this.d = persistableBundle0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rue)this.c(((sah)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new rue(this.c, this.d, ibrl0);
        ibrl1.b = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(((sah)this.b).b(this.c, this.d, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

