import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

final class rxk extends ibsl implements ibtw {
    Object a;
    int b;
    final rxl c;
    final ErasedOnboardingTaskToken d;
    final rut e;

    public rxk(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0, ibrl ibrl0) {
        this.c = rxl0;
        this.d = erasedOnboardingTaskToken0;
        this.e = rut0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rxk)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rxk(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object3;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                this.b = 1;
                if(this.c.f.f(this) != object1) {
                    goto label_10;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
            label_10:
                rxl rxl0 = this.c;
                ErasedOnboardingTaskToken erasedOnboardingTaskToken0 = this.d;
                ryt ryt0 = rxl0.v(erasedOnboardingTaskToken0);
                if(ryt0.p()) {
                    ErasedOnboardingTaskState erasedOnboardingTaskState0 = ryt0.i();
                    sct.c("OTMServiceBinder", "[waitForCompleted] Flushing before calling onTaskCompleted.");
                    this.a = erasedOnboardingTaskState0;
                    this.b = 2;
                    if(rxl0.f.d(this) != object1) {
                        object3 = erasedOnboardingTaskState0;
                        goto label_29;
                    }
                }
                else {
                    iced iced0 = rxl0.f.g(erasedOnboardingTaskToken0);
                    if(iced0 == null) {
                        throw new IllegalStateException("[waitForCompleted] Task is not started.");
                    }
                    this.b = 3;
                    if(iced0.r(this) != object1) {
                        goto label_34;
                    }
                }
                break;
            }
            case 2: {
                object3 = this.a;
                ibnx.b(object0);
            label_29:
                ErasedOnboardingTaskState erasedOnboardingTaskState1 = this.c.u(((ErasedOnboardingTaskState)object3));
                PersistableBundle persistableBundle0 = this.c.t(((ryt)object3));
                this.e.a(erasedOnboardingTaskState1, persistableBundle0);
                return ibom.a;
            }
            case 3: {
                ibnx.b(object0);
            label_34:
                ErasedOnboardingTaskState erasedOnboardingTaskState2 = this.c.v(this.d).i();
                sct.c("OTMServiceBinder", "[waitForCompleted] Flushing before calling onTaskCompleted.");
                this.a = erasedOnboardingTaskState2;
                this.b = 4;
                if(this.c.f.d(this) != object1) {
                    object2 = erasedOnboardingTaskState2;
                label_40:
                    ErasedOnboardingTaskState erasedOnboardingTaskState3 = this.c.u(((ErasedOnboardingTaskState)object2));
                    PersistableBundle persistableBundle1 = this.c.t(((ryt)object2));
                    this.e.a(erasedOnboardingTaskState3, persistableBundle1);
                    return ibom.a;
                }
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                goto label_40;
            }
        }
        return object1;
    }
}

