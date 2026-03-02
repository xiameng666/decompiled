import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.Objects;
import java.util.concurrent.CancellationException;

final class rxj extends ibsl implements ibtw {
    int a;
    final rxl b;
    final ErasedOnboardingTaskToken c;
    final rut d;

    public rxj(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0, ibrl ibrl0) {
        this.b = rxl0;
        this.c = erasedOnboardingTaskToken0;
        this.d = rut0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rxj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rxj(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                ryh ryh0 = rxl.B(this.c);
                this.a = 1;
                object0 = this.b.g.ff(ryh0, this);
                if(object0 == object1) {
                    return object1;
                }
            label_10:
                ErasedOnboardingTaskState erasedOnboardingTaskState0 = rys.a(((rxp)object0));
                ErasedOnboardingTaskState erasedOnboardingTaskState1 = this.b.u(erasedOnboardingTaskState0);
                PersistableBundle persistableBundle0 = this.b.t(erasedOnboardingTaskState0);
                this.d.a(erasedOnboardingTaskState1, persistableBundle0);
                return ibom.a;
            }
            catch(Exception exception0) {
                goto label_16;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Exception exception0) {
                goto label_16;
            }
        }
        goto label_10;
    label_16:
        Objects.toString(this.c);
        sct.f("OTMServiceBinder", "Failed to await task completion for " + this.c, exception0);
        rnr rnr0 = new rnr("Task execution failed with an exception.");
        ErasedOnboardingTaskState erasedOnboardingTaskState2 = rys.a(rxr.b(this.c, rnr0));
        ErasedOnboardingTaskState erasedOnboardingTaskState3 = this.b.u(erasedOnboardingTaskState2);
        PersistableBundle persistableBundle1 = this.b.t(erasedOnboardingTaskState2);
        this.d.a(erasedOnboardingTaskState3, persistableBundle1);
        if(!(exception0 instanceof CancellationException)) {
            return ibom.a;
        }
        throw exception0;
    }
}

