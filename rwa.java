import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.Objects;
import java.util.concurrent.CancellationException;

final class rwa extends ibsl implements ibtw {
    int a;
    final rxl b;
    final ErasedOnboardingTaskToken c;

    public rwa(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, ibrl ibrl0) {
        this.b = rxl0;
        this.c = erasedOnboardingTaskToken0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rwa)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rwa(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            try {
                this.a = 1;
                object0 = this.b.D(this.c);
                if(object0 == object1) {
                    return object1;
                }
            label_9:
                PersistableBundle persistableBundle0 = ((rnv)object0).a();
                return this.b.s(persistableBundle0);
            }
            catch(Exception exception0) {
                goto label_12;
            }
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Exception exception0) {
                goto label_12;
            }
        }
        goto label_9;
    label_12:
        Objects.toString(this.c);
        sct.f("OTMServiceBinder", "Failed to fetch task metadata for " + this.c, exception0);
        if(!(exception0 instanceof CancellationException)) {
            return new PersistableBundle();
        }
        throw exception0;
    }
}

