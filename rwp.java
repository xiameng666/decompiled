import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.Objects;
import java.util.concurrent.CancellationException;

final class rwp extends ibsl implements ibtw {
    Object a;
    int b;
    final rxl c;
    final ErasedOnboardingTaskToken d;
    final rut e;

    public rwp(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0, ibrl ibrl0) {
        this.c = rxl0;
        this.d = erasedOnboardingTaskToken0;
        this.e = rut0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwp)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwp(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1;
        try {
            object1 = ibrx.a;
            switch(this.b) {
                case 0: {
                    break;
                }
                case 1: {
                    goto label_10;
                }
                case 2: {
                    goto label_24;
                }
                case 3: {
                    goto label_30;
                }
                default: {
                    ibnx.b(object0);
                    goto label_35;
                }
            }
        }
        catch(Exception exception0) {
            goto label_42;
        }
        ibnx.b(object0);
        try {
            ryh ryh0 = rxl.B(this.d);
            this.b = 1;
            object0 = this.c.g.e(ryh0, this);
            if(object0 != object1) {
                goto label_11;
            label_10:
                ibnx.b(object0);
            label_11:
                ErasedOnboardingTaskState erasedOnboardingTaskState0 = rys.a(((rxv)object0));
                if(erasedOnboardingTaskState0.p()) {
                    sct.c("OTMServiceBinder", "listenForTaskMetadataChanges#Flushing before calling onTaskCompleted.");
                    this.a = erasedOnboardingTaskState0;
                    this.b = 2;
                    if(this.c.f.d(this) != object1) {
                        object2 = erasedOnboardingTaskState0;
                        goto label_26;
                    }
                }
                else {
                    rwo rwo0 = new rwo(new rwl(this.c.z(this.d)), this.c);
                    rwi rwi0 = new rwi(this.e);
                    this.b = 3;
                    if(rwo0.oR(rwi0, this) != object1) {
                        goto label_31;
                    label_24:
                        object2 = this.a;
                        ibnx.b(object0);
                    label_26:
                        ErasedOnboardingTaskState erasedOnboardingTaskState1 = this.c.u(((ErasedOnboardingTaskState)object2));
                        PersistableBundle persistableBundle0 = this.c.t(((ryt)object2));
                        this.e.a(erasedOnboardingTaskState1, persistableBundle0);
                        return ibom.a;
                    label_30:
                        ibnx.b(object0);
                    label_31:
                        ryh ryh1 = rxl.B(this.d);
                        this.b = 4;
                        object0 = this.c.g.ff(ryh1, this);
                        if(object0 != object1) {
                        label_35:
                            ErasedOnboardingTaskState erasedOnboardingTaskState2 = rys.a(((rxp)object0));
                            ErasedOnboardingTaskState erasedOnboardingTaskState3 = this.c.u(erasedOnboardingTaskState2);
                            PersistableBundle persistableBundle1 = this.c.t(erasedOnboardingTaskState2);
                            this.e.a(erasedOnboardingTaskState3, persistableBundle1);
                            return ibom.a;
                        }
                    }
                }
            }
            return object1;
        }
        catch(Exception exception0) {
        label_42:
            Objects.toString(this.d);
            sct.f("OTMServiceBinder", "Failed to observe task metadata for " + this.d, exception0);
            if(!(exception0 instanceof CancellationException)) {
                return ibom.a;
            }
            throw exception0;
        }
    }
}

