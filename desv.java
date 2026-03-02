import com.google.android.chimera.android.Activity;

final class desv extends ibsl implements ibtw {
    int a;
    final Activity b;

    public desv(Activity activity0, ibrl ibrl0) {
        this.b = activity0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((desv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new desv(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            Activity activity0 = this.b;
            if(activity0 != null) {
                evql evql0 = djbz.c(activity0);
                this.a = 1;
                if(dcwp.a(evql0, this) == object1) {
                    return object1;
                }
            }
        }
        return ibom.a;
    }
}

