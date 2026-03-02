import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

public final class sam extends rus {
    final ryh a;
    final saq b;
    final ErasedOnboardingTaskToken c;
    final ichm d;

    public sam(ryh ryh0, ichm ichm0, saq saq0, ErasedOnboardingTaskToken erasedOnboardingTaskToken0) {
        this.a = ryh0;
        this.d = ichm0;
        this.b = saq0;
        this.c = erasedOnboardingTaskToken0;
        super();
    }

    @Override  // rut
    public final void a(ErasedOnboardingTaskState erasedOnboardingTaskState0, PersistableBundle persistableBundle0) {
        ibuq.f(erasedOnboardingTaskState0, "state");
        ibuq.f(persistableBundle0, "metadata");
        ryh ryh0 = this.a;
        sct.c("OnboardingTaskServiceClientCompat", a.U(ryh0, "observeTaskMetadata(", ") Observer closed"));
        rnv rnv0 = erasedOnboardingTaskState0.g();
        if(rnv0 == null) {
            rnv0 = new rnv();
        }
        ichm ichm0 = this.d;
        Object object0 = ichm0.b(rnv0);
        if((object0 instanceof icgz)) {
            Throwable throwable0 = icha.b(object0);
            sct.e("OnboardingTaskServiceClientCompat", "observeTaskMetadata(" + rqy.a(ryh0) + ") Failed to send metadata update on task completed. Cause: " + throwable0);
        }
        ichp.a(ichm0);
    }

    @Override  // rut
    public final void fe(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "metadata");
        saq saq0 = this.b;
        if(saq0.b.b(0x17879DF8L) && scr.f(persistableBundle0)) {
            int v = scr.a(persistableBundle0);
            sct.c("OnboardingTaskServiceClientCompat", a.f(v, "Restoring pending data ", " with full data."));
            int v1 = scr.c(persistableBundle0);
            int v2 = scr.b(persistableBundle0);
            persistableBundle0 = saq.e(saq0.a, this.c, v, v1, v2);
            scr.h(persistableBundle0);
            sct.c("OnboardingTaskServiceClientCompat", "Restored pending data " + v + " with full data.");
        }
        ryh ryh0 = this.a;
        rnv rnv0 = rnu.d(persistableBundle0);
        sct.c("OnboardingTaskServiceClientCompat", "observeTaskMetadata(" + rqy.a(ryh0) + ") Observed metadata " + rnv0);
        Object object0 = this.d.b(rnv0);
        if((object0 instanceof icgz)) {
            Throwable throwable0 = icha.b(object0);
            sct.e("OnboardingTaskServiceClientCompat", "observeTaskMetadata(" + rqy.a(ryh0) + ") Failed to send metadata update while observing. Cause: " + throwable0);
        }
    }
}

