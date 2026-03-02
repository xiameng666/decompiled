import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.Objects;
import java.util.concurrent.CancellationException;

final class rwf extends ibsl implements ibtw {
    int a;
    final rxl b;
    final ErasedOnboardingTaskToken c;
    final PersistableBundle d;

    public rwf(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        this.b = rxl0;
        this.c = erasedOnboardingTaskToken0;
        this.d = persistableBundle0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwf)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwf(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                return ibom.a;
            }
            catch(Exception exception0) {
                goto label_10;
            }
        }
        ibnx.b(object0);
        try {
            rkc rkc0 = rkb.d(this.d);
            this.a = 1;
            if(this.b.x(this.c, rkc0, this) == object1) {
                return object1;
            }
        }
        catch(Exception exception0) {
        label_10:
            Objects.toString(this.c);
            sct.f("OTMServiceBinder", "Failed to interrupt task for " + this.c, exception0);
            if((exception0 instanceof CancellationException)) {
                throw exception0;
            }
        }
        return ibom.a;
    }
}

