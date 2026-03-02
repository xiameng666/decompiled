import com.google.android.gms.multidevice.service.enrollment.trigger.EligibilityTaskService;

public final class ctfm extends ibsl implements ibtw {
    int a;
    final EligibilityTaskService b;

    public ctfm(EligibilityTaskService eligibilityTaskService0, ibrl ibrl0) {
        this.b = eligibilityTaskService0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctfm)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctfm(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ctfl ctfl0 = this.b.b;
            if(ctfl0 == null) {
                ibuq.j("eligibilityChecker");
                ctfl0 = null;
            }
            this.a = 1;
            if(ctfl0.a(this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

