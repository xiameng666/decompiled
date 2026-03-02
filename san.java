import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

final class san extends ibsl implements ibtw {
    int a;
    final ryh b;
    final saq c;
    private Object d;

    public san(ryh ryh0, saq saq0, ibrl ibrl0) {
        this.b = ryh0;
        this.c = saq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((san)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new san(this.b, this.c, ibrl0);
        ibrl1.d = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.d;
            sct.c("OnboardingTaskServiceClientCompat", a.U(this.b, "observeTaskMetadata(", ") Observing task metadata"));
            ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = ryu.a(this.b);
            sam sam0 = new sam(this.b, ichm0, this.c, erasedOnboardingTaskToken0);
            this.c.a.fh(erasedOnboardingTaskToken0, sam0);
            sal sal0 = new sal();
            this.a = 1;
            if(ichl.b(ichm0, sal0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

