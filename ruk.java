import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.PersistableBundle;
import com.android.onboarding.tasks.ErasedOnboardingTaskToken;

public final class ruk implements Parcelable.Creator, sdg {
    @Override  // sdg
    public final Object b(PersistableBundle persistableBundle0) {
        return sdf.a(this, persistableBundle0);
    }

    @Override  // sdg
    public final Object c(PersistableBundle persistableBundle0) {
        ibuq.f(persistableBundle0, "persistableBundle");
        return new ErasedOnboardingTaskToken(persistableBundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ibuq.f(parcel0, "parcel");
        Object object0 = PersistableBundle.CREATOR.createFromParcel(parcel0);
        ibuq.e(object0, "createFromParcel(...)");
        return new ErasedOnboardingTaskToken(((PersistableBundle)object0));
    }

    @Override  // rna
    public final Object fm(Object object0) {
        return sdf.b(this, object0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ErasedOnboardingTaskToken[v];
    }
}

