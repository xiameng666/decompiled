import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskState;

public final class ruj implements Parcelable.Creator, sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        return ruj.d(persistableBundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ibuq.f(parcel0, "parcel");
        Object object0 = PersistableBundle.CREATOR.createFromParcel(parcel0);
        ibuq.e(object0, "createFromParcel(...)");
        return new ErasedOnboardingTaskState(((PersistableBundle)object0));
    }

    public static final ErasedOnboardingTaskState d(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return new ErasedOnboardingTaskState(persistableBundle0);
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ErasedOnboardingTaskState[v];
    }
}

