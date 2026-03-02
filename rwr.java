import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.Objects;

final class rwr extends ibsl implements ibtw {
    Object a;
    int b;
    final rxl c;
    final ErasedOnboardingTaskToken d;
    final rut e;

    public rwr(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0, ibrl ibrl0) {
        this.c = rxl0;
        this.d = erasedOnboardingTaskToken0;
        this.e = rut0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwr)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwr(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        ErasedOnboardingTaskState erasedOnboardingTaskState3;
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
                if(rxl0.v(erasedOnboardingTaskToken0).p()) {
                    sct.c("OTMServiceBinder", a.i(erasedOnboardingTaskToken0, "metadataChanges#Task(", ") is already complete."));
                    ErasedOnboardingTaskState erasedOnboardingTaskState0 = rxl0.v(erasedOnboardingTaskToken0).i();
                    sct.c("OTMServiceBinder", "listenForTaskMetadataChanges#Flushing before calling onTaskCompleted.");
                    this.a = erasedOnboardingTaskState0;
                    this.b = 2;
                    if(rxl0.f.d(this) != object1) {
                        object3 = erasedOnboardingTaskState0;
                        goto label_33;
                    }
                }
                else {
                    ibuq.f(erasedOnboardingTaskToken0, "token");
                    rrb rrb0 = new rrb(erasedOnboardingTaskToken0);
                    icgv icgv0 = (icgv)rxl0.f.d.get(rrb0);
                    if(icgv0 == null) {
                        goto label_38;
                    }
                    else {
                        icig icig0 = icjj.a(new icia(icgv0, true));
                        if(icig0 == null) {
                            goto label_38;
                        }
                        else {
                            rwq rwq0 = new rwq(erasedOnboardingTaskToken0, this.e, rxl0);
                            this.b = 3;
                            if(icig0.oR(rwq0, this) != object1) {
                                goto label_38;
                            }
                        }
                    }
                }
                break;
            }
            case 2: {
                object3 = this.a;
                ibnx.b(object0);
            label_33:
                ErasedOnboardingTaskState erasedOnboardingTaskState1 = this.c.u(((ErasedOnboardingTaskState)object3));
                PersistableBundle persistableBundle0 = this.c.t(((ryt)object3));
                this.e.a(erasedOnboardingTaskState1, persistableBundle0);
                return ibom.a;
            }
            case 3: {
                ibnx.b(object0);
            label_38:
                rxl rxl1 = this.c;
                ErasedOnboardingTaskToken erasedOnboardingTaskToken1 = this.d;
                ErasedOnboardingTaskState erasedOnboardingTaskState2 = rxl1.v(erasedOnboardingTaskToken1).i();
                if(erasedOnboardingTaskState2.p()) {
                    erasedOnboardingTaskState3 = erasedOnboardingTaskState2;
                    goto label_55;
                }
                else {
                    Objects.toString(erasedOnboardingTaskState2);
                    sct.e("OTMServiceBinder", "Task is not complete! Wait for it to complete. state=" + erasedOnboardingTaskState2.toString());
                    iced iced0 = rxl1.f.g(erasedOnboardingTaskToken1);
                    if(iced0 == null) {
                        goto label_52;
                    }
                    else {
                        this.b = 4;
                        if(iced0.r(this) != object1) {
                            goto label_52;
                        }
                    }
                }
                break;
            }
            case 4: {
                ibnx.b(object0);
            label_52:
                erasedOnboardingTaskState3 = this.c.v(this.d).i();
                Objects.toString(erasedOnboardingTaskState3);
                sct.c("OTMServiceBinder", "Task should now be complete. state=" + erasedOnboardingTaskState3.toString());
            label_55:
                sct.c("OTMServiceBinder", "listenForTaskMetadataChanges#Flushing before calling onTaskCompleted.");
                this.a = erasedOnboardingTaskState3;
                this.b = 5;
                if(this.c.f.d(this) != object1) {
                    object2 = erasedOnboardingTaskState3;
                label_60:
                    ErasedOnboardingTaskState erasedOnboardingTaskState4 = this.c.u(((ErasedOnboardingTaskState)object2));
                    PersistableBundle persistableBundle1 = this.c.t(((ryt)object2));
                    this.e.a(erasedOnboardingTaskState4, persistableBundle1);
                    return ibom.a;
                }
                break;
            }
            default: {
                object2 = this.a;
                ibnx.b(object0);
                goto label_60;
            }
        }
        return object1;
    }
}

