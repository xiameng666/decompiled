import android.os.Parcel;
import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;

public abstract class rus extends wby implements rut {
    public rus() {
        super("com.android.onboarding.tasks.IOnboardingTaskManagerServiceListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                ErasedOnboardingTaskState erasedOnboardingTaskState0 = (ErasedOnboardingTaskState)wbz.a(parcel0, ErasedOnboardingTaskState.CREATOR);
                PersistableBundle persistableBundle0 = (PersistableBundle)wbz.a(parcel0, PersistableBundle.CREATOR);
                rus.gr(parcel0);
                this.a(erasedOnboardingTaskState0, persistableBundle0);
                break;
            }
            case 2: {
                PersistableBundle persistableBundle1 = (PersistableBundle)wbz.a(parcel0, PersistableBundle.CREATOR);
                rus.gr(parcel0);
                this.fe(persistableBundle1);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

