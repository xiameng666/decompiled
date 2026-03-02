import android.content.Context;

final class cbph extends ibsl implements ibtw {
    int a;
    final cbpi b;
    final Context c;
    final String d;

    public cbph(cbpi cbpi0, Context context0, ibrl ibrl0) {
        this.b = cbpi0;
        this.c = context0;
        this.d = "recovery";
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbph)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbph(this.b, this.c, ibrl0);
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
        Object object2 = this.b.e(this.c, this.d, this);
        return object2 == object1 ? object1 : object2;
    }
}

