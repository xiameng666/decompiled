import android.content.Context;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.Objects;
import java.util.concurrent.CancellationException;

final class rwe extends ibsl implements ibtw {
    int a;
    final rxl b;
    final ErasedOnboardingTaskToken c;
    final run d;

    public rwe(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, run run0, ibrl ibrl0) {
        this.b = rxl0;
        this.c = erasedOnboardingTaskToken0;
        this.d = run0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwe(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ryt ryt0;
        Object object1;
        try {
            object1 = ibrx.a;
            switch(this.a) {
                case 0: {
                    break;
                }
                case 1: {
                    goto label_22;
                }
                default: {
                    ibnx.b(object0);
                    ryt0 = this.b.v(this.c);
                    goto label_24;
                }
            }
        }
        catch(Exception exception0) {
            goto label_29;
        }
        ibnx.b(object0);
        try {
            rxl rxl0 = this.b;
            Object object2 = rxl0.c.get();
            ibuq.e(object2, "get(...)");
            if(((sel)object2).b(0x199A39C6L)) {
                this.a = 1;
                object0 = rxl0.w(this.c, this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_23;
            }
            else {
                sct.c("OTMServiceBinder", "getTaskStateWithCallback token=" + this.c);
                Context context0 = ((Context)rxl0.a.get()).getApplicationContext();
                ibuq.e(context0, "getApplicationContext(...)");
                rzq.a(context0);
                this.a = 2;
                if(rxl0.f.f(this) == object1) {
                    return object1;
                }
                ryt0 = this.b.v(this.c);
                goto label_24;
            label_22:
                ibnx.b(object0);
            label_23:
                ryt0 = (ryt)object0;
            }
        label_24:
            ErasedOnboardingTaskState erasedOnboardingTaskState0 = ryt0.i();
            ErasedOnboardingTaskState erasedOnboardingTaskState1 = this.b.u(erasedOnboardingTaskState0);
            this.d.a(erasedOnboardingTaskState1);
            return ibom.a;
        }
        catch(Exception exception0) {
        label_29:
            Objects.toString(this.c);
            sct.f("OTMServiceBinder", "Failed to fetch task state for " + this.c, exception0);
            rnr rnr0 = new rnr("Task execution failed with an exception.");
            ErasedOnboardingTaskState erasedOnboardingTaskState2 = rys.a(rxr.b(this.c, rnr0));
            ErasedOnboardingTaskState erasedOnboardingTaskState3 = this.b.u(erasedOnboardingTaskState2);
            this.d.a(erasedOnboardingTaskState3);
            if(!(exception0 instanceof CancellationException)) {
                return ibom.a;
            }
            throw exception0;
        }
    }
}

