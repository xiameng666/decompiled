import android.content.Context;

final class ehoj extends ibsl implements ibtw {
    int a;
    final ehoq b;
    final Context c;

    public ehoj(ehoq ehoq0, Context context0, ibrl ibrl0) {
        this.b = ehoq0;
        this.c = context0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ehoj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ehoj(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Context context0 = this.c.getApplicationContext();
            ibuq.e(context0, "getApplicationContext(...)");
            this.a = 1;
            if(this.b.b(context0, this.b.a, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

