import android.content.Context;

final class cbps extends ibsl implements ibtw {
    int a;
    final cbpu b;
    final Context c;
    final String d;

    public cbps(cbpu cbpu0, Context context0, String s, ibrl ibrl0) {
        this.b = cbpu0;
        this.c = context0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbps)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbps(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.b.b(this.c, this.d, this);
            if(object0 == object1) {
                return object1;
            }
        }
        Object object2 = ((cbpg)object0) == cbpg.a ? cbpq.c : cbpq.b;
        ((ggtj)cbpu.a.h()).B("Module prefetch finished with %s.", (object2 == cbpq.c ? "success" : "failure"));
        return object2;
    }
}

