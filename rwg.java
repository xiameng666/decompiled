import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

final class rwg extends ibsl implements ibtw {
    int a;
    final ErasedOnboardingTaskToken b;
    final PersistableBundle c;
    final rxl d;
    final rkc e;

    public rwg(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0, rxl rxl0, rkc rkc0, ibrl ibrl0) {
        this.b = erasedOnboardingTaskToken0;
        this.c = persistableBundle0;
        this.d = rxl0;
        this.e = rkc0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwg(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = this.b;
            sct.e("OTMServiceBinder", "got interrupt for " + rqy.a(erasedOnboardingTaskToken0) + " with reason " + this.c);
            rve rve0 = this.d.f.b(erasedOnboardingTaskToken0);
            if(rve0 == null) {
                sct.a("OTMServiceBinder", "No instance found for interrupt to token " + rqy.a(erasedOnboardingTaskToken0));
                return ibom.a;
            }
            rkc rkc0 = this.e;
            if(!rve0.k().v(rkc0)) {
                sct.c("OTMServiceBinder", "Task " + rve0.k() + " does not accept interrupt " + rkc0);
                return ibom.a;
            }
            this.a = 1;
            if(rve.A(rve0, rkc0) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

