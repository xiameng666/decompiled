import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;
import java.util.concurrent.CancellationException;

final class rxg extends ibsl implements ibtw {
    int a;
    final rxl b;
    final ErasedOnboardingTaskToken c;
    final PersistableBundle d;

    public rxg(rxl rxl0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0, PersistableBundle persistableBundle0, ibrl ibrl0) {
        this.b = rxl0;
        this.c = erasedOnboardingTaskToken0;
        this.d = persistableBundle0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((rxg)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new rxg(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        if(this.a != 0) {
            try {
                ibnx.b(object0);
                return Boolean.valueOf(true);
            }
            catch(Exception exception0) {
                goto label_10;
            }
        }
        ibnx.b(object0);
        try {
            PersistableBundle persistableBundle0 = this.b.r(this.d);
            this.a = 1;
            return this.b.y(this.c, persistableBundle0, this) == object1 ? object1 : Boolean.valueOf(true);
        }
        catch(Exception exception0) {
        label_10:
            sct.f("OTMServiceBinder", "Task " + this.c + " failed to start", exception0);
            if(!(exception0 instanceof CancellationException)) {
                return Boolean.valueOf(false);
            }
            throw exception0;
        }
        return object1;
    }
}

