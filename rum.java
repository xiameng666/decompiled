import android.os.Parcel;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;

public final class rum extends wby implements run {
    final icbi a;

    public rum() {
        super("com.android.onboarding.tasks.IGetTaskStateListener");
    }

    public rum(icbi icbi0) {
        this.a = icbi0;
        super("com.android.onboarding.tasks.IGetTaskStateListener");
    }

    @Override  // run
    public final void a(ErasedOnboardingTaskState erasedOnboardingTaskState0) {
        ibuq.f(erasedOnboardingTaskState0, "state");
        this.a.w(erasedOnboardingTaskState0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            ErasedOnboardingTaskState erasedOnboardingTaskState0 = (ErasedOnboardingTaskState)wbz.a(parcel0, ErasedOnboardingTaskState.CREATOR);
            rum.gr(parcel0);
            this.a(erasedOnboardingTaskState0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

