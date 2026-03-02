import android.content.Context;

public final class cbpt extends ibsl implements ibtw {
    int a;
    final cbpu b;
    final Context c;
    final String d;

    public cbpt(cbpu cbpu0, Context context0, String s, ibrl ibrl0) {
        this.b = cbpu0;
        this.c = context0;
        this.d = s;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cbpt)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cbpt(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                goto label_12;
            }
            catch(Throwable throwable0) {
                this.b.c.d();
                throw throwable0;
            }
        }
        ibnx.b(object0);
        cbpu cbpu0 = this.b;
        if(cbpu0.c.c()) {
            try {
                cbps cbps0 = new cbps(cbpu0, this.c, this.d, null);
                this.a = 1;
                object0 = icbd.a(icey.a, cbps0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_12:
                object2 = (cbpq)object0;
            }
            catch(Throwable throwable0) {
                this.b.c.d();
                throw throwable0;
            }
            this.b.c.d();
            return object2;
        }
        return cbpq.a;
    }
}

