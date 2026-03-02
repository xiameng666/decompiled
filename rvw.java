import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.concurrent.CancellationException;

final class rvw extends ibsl implements ibtw {
    Object a;
    int b;
    final rzz c;
    final rxl d;
    final sac e;

    public rvw(rzz rzz0, rxl rxl0, sac sac0, ibrl ibrl0) {
        this.c = rzz0;
        this.d = rxl0;
        this.e = sac0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rvw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rvw(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object3;
        ErasedOnboardingTaskToken erasedOnboardingTaskToken0;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                try {
                    this.b = 1;
                    object0 = sbz.a(this.c, ErasedOnboardingTaskToken.CREATOR, this);
                    if(object0 != object1) {
                        erasedOnboardingTaskToken0 = (ErasedOnboardingTaskToken)object0;
                        goto label_16;
                    label_10:
                        ibnx.b(object0);
                        erasedOnboardingTaskToken0 = (ErasedOnboardingTaskToken)object0;
                        goto label_16;
                    }
                    break;
                }
                catch(Exception exception0) {
                    object2 = null;
                    goto label_32;
                }
            }
            case 1: {
                goto label_10;
                try {
                label_16:
                    ryh ryh0 = rxl.B(erasedOnboardingTaskToken0);
                    this.a = erasedOnboardingTaskToken0;
                    this.b = 2;
                    object3 = this.d.g.ff(ryh0, this);
                }
                catch(Exception exception1) {
                    object2 = erasedOnboardingTaskToken0;
                    exception0 = exception1;
                    goto label_32;
                }
                if(object3 != object1) {
                    object2 = erasedOnboardingTaskToken0;
                    object0 = object3;
                    try {
                    label_28:
                        rzy rzy0 = new rzy(((rxp)object0));
                        this.e.b(rzy0);
                        return ibom.a;
                    }
                    catch(Exception exception0) {
                    }
                label_32:
                    rzy rzy1 = rxl.C(this.d, ((rrc)object2), exception0);
                    this.e.a(rzy1);
                    if(!(exception0 instanceof CancellationException)) {
                        return ibom.a;
                    }
                    throw exception0;
                }
                break;
            }
            default: {
                try {
                    object2 = this.a;
                    ibnx.b(object0);
                    goto label_28;
                }
                catch(Exception exception0) {
                    goto label_32;
                }
            }
        }
        return object1;
    }
}

