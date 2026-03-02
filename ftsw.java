import com.google.android.libraries.tapandpay.ui.bulletin.Bulletin;

public final class ftsw extends ibsl implements ibtw {
    int a;
    final Bulletin b;

    public ftsw(Bulletin bulletin0, ibrl ibrl0) {
        this.b = bulletin0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ftsw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ftsw(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            fyx fyx0 = this.b.b;
            if(fyx0 == null) {
                ibuq.j("sheetState");
                fyx0 = null;
            }
            this.a = 1;
            if(fyx0.f(this) == object1) {
                return object1;
            }
        }
        this.b.a(false);
        return ibom.a;
    }
}

