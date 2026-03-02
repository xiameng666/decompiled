import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

final class rwq implements icih {
    final ErasedOnboardingTaskToken a;
    final rut b;
    final rxl c;

    public rwq(ErasedOnboardingTaskToken erasedOnboardingTaskToken0, rut rut0, rxl rxl0) {
        this.a = erasedOnboardingTaskToken0;
        this.b = rut0;
        this.c = rxl0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        rnv rnv0 = (rnv)object0;
        sct.c("OTMServiceBinder", "metadataChanges#Observed task(" + this.a + ") metadata update: " + rnv0);
        PersistableBundle persistableBundle0 = rnv0.a();
        PersistableBundle persistableBundle1 = this.c.s(persistableBundle0);
        this.b.fe(persistableBundle1);
        return ibom.a;
    }
}

