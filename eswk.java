import android.content.Context;

final class eswk extends ibsl implements ibtw {
    int a;
    final eswj b;
    final Context c;

    public eswk(eswj eswj0, Context context0, ibrl ibrl0) {
        this.b = eswj0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((eswk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new eswk(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            if(eswo.a.a(this) == object1) {
                return object1;
            }
        }
        boolean z = this.b.c();
        eswo.d(this.c, z);
        eswo.e(this.b.a());
        return ibom.a;
    }
}

