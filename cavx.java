import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.kids.auth.service.api.SupervisionSetupResult;

public final class cavx implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        ibuq.f(parcel0, "parcel");
        String s = parcel0.readString();
        return (SupervisionSetupResult)Enum.valueOf(SupervisionSetupResult.class, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SupervisionSetupResult[v];
    }
}

