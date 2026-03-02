import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.concurrent.CancellationException;

final class rwx extends ibsl implements ibtw {
    Object a;
    int b;
    final rzz c;
    final rxl d;
    final rzt e;

    public rwx(rzz rzz0, rxl rxl0, rzt rzt0, ibrl ibrl0) {
        this.c = rzz0;
        this.d = rxl0;
        this.e = rzt0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwx)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwx(this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        ErasedOnboardingTaskToken erasedOnboardingTaskToken0;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                try {
                    this.b = 1;
                    object0 = sbz.a(this.c, ErasedOnboardingTaskToken.CREATOR, this);
                    if(object0 == object1) {
                        return object1;
                    label_12:
                        ibnx.b(object0);
                    }
                    erasedOnboardingTaskToken0 = (ErasedOnboardingTaskToken)object0;
                    goto label_18;
                }
                catch(Exception exception0) {
                    break;
                }
                catch(Throwable throwable0) {
                    this.e.b();
                    throw throwable0;
                }
            }
            case 1: {
                goto label_12;
            }
            default: {
                try {
                    object2 = this.a;
                    ibnx.b(object0);
                    goto label_35;
                }
                catch(Exception exception0) {
                }
                catch(Throwable throwable0) {
                    this.e.b();
                    throw throwable0;
                }
                goto label_27;
            }
        }
        object2 = null;
        goto label_27;
        try {
        label_18:
            rww rww0 = new rww(this.d.z(erasedOnboardingTaskToken0));
            rwt rwt0 = new rwt(this.e);
            this.a = erasedOnboardingTaskToken0;
            this.b = 2;
            if(rww0.oR(rwt0, this) == object1) {
                return object1;
            }
            goto label_35;
        }
        catch(Exception exception1) {
            object2 = erasedOnboardingTaskToken0;
            exception0 = exception1;
            try {
            label_27:
                rzy rzy0 = rxl.C(this.d, ((rrc)object2), exception0);
                this.e.c(rzy0);
                if((exception0 instanceof CancellationException)) {
                    throw exception0;
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                this.e.b();
                throw throwable0;
            }
        }
        catch(Throwable throwable0) {
            this.e.b();
            throw throwable0;
        }
        return object1;
    label_35:
        this.e.b();
        return ibom.a;
    }
}

