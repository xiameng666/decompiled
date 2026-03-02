import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

final class rwc extends ibsl implements ibtw {
    int a;
    final rxl b;
    final ErasedOnboardingTaskToken c;

    public rwc(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, ibrl ibrl0) {
        this.b = rxl0;
        this.c = erasedOnboardingTaskToken0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwc)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwc(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            object0 = this.b.w(this.c, this);
            if(object0 == object1) {
                return object1;
            }
        }
        return rys.a(((rxv)object0));
    }
}

