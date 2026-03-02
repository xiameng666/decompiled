import android.content.Context;

final class ebbc extends ibsl implements ibtw {
    int a;
    final ebbi b;
    final Context c;

    public ebbc(ebbi ebbi0, Context context0, ibrl ibrl0) {
        this.b = ebbi0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebbc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ebbc(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(this.b.g(this.c, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

