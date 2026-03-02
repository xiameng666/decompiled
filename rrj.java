import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.android.onboarding.pending.PendingActivityContract;

public final class rrj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ibuq.f(parcel0, "parcel");
        Object object0 = Intent.CREATOR.createFromParcel(parcel0);
        ibuq.e(object0, "createFromParcel(...)");
        return new PendingActivityContract(((Intent)object0));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PendingActivityContract[v];
    }
}

