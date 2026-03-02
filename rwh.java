import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.concurrent.CancellationException;

final class rwh extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    int d;
    final rzz e;
    final rxl f;
    final rzz g;
    final saf h;

    public rwh(rzz rzz0, rxl rxl0, rzz rzz1, saf saf0, ibrl ibrl0) {
        this.e = rzz0;
        this.f = rxl0;
        this.g = rzz1;
        this.h = saf0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwh(this.e, this.f, this.g, this.h, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object6;
        Object object5;
        Object object4;
        rxl rxl0;
        Object object3;
        Object object1 = ibrx.a;
        Object object2 = null;
        switch(this.d) {
            case 0: {
                ibnx.b(object0);
                try {
                    this.d = 1;
                    object0 = sbz.a(this.e, ErasedOnboardingTaskToken.CREATOR, this);
                    if(object0 != object1) {
                        object3 = (ErasedOnboardingTaskToken)object0;
                        goto label_13;
                    label_11:
                        ibnx.b(object0);
                        object3 = (ErasedOnboardingTaskToken)object0;
                        goto label_13;
                    }
                    break;
                }
                catch(Exception exception0) {
                    goto label_45;
                }
            }
            case 1: {
                goto label_11;
                try {
                label_13:
                    rxl0 = this.f;
                    this.a = object3;
                    this.b = rxl0;
                    this.c = object3;
                    this.d = 2;
                    object4 = sbz.a(this.g, rkc.a, this);
                }
                catch(Exception exception0) {
                    object2 = object3;
                    goto label_45;
                }
                if(object4 != object1) {
                    object5 = rxl0;
                    object0 = object4;
                    object6 = object3;
                    goto label_32;
                }
                break;
            }
            case 2: {
                try {
                    object3 = this.c;
                    object5 = this.b;
                    object6 = this.a;
                    ibnx.b(object0);
                label_32:
                    this.a = object6;
                    this.b = null;
                    this.c = null;
                    this.d = 3;
                    if(((rxl)object5).x(((ErasedOnboardingTaskToken)object3), ((rkc)object0), this) != object1) {
                        goto label_41;
                    }
                    break;
                }
                catch(Exception exception0) {
                    object2 = object6;
                    goto label_45;
                }
            label_41:
                object2 = object6;
                try {
                label_42:
                    this.h.b();
                    return ibom.a;
                }
                catch(Exception exception0) {
                }
            label_45:
                rzy rzy0 = rxl.C(this.f, ((rrc)object2), exception0);
                this.h.a(rzy0);
                if(!(exception0 instanceof CancellationException)) {
                    return ibom.a;
                }
                throw exception0;
            }
            default: {
                try {
                    object2 = this.a;
                    ibnx.b(object0);
                    goto label_42;
                }
                catch(Exception exception0) {
                    goto label_45;
                }
            }
        }
        return object1;
    }
}

