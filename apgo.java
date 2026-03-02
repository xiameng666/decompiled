import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.autofill.sharedpreferences.Change.Put;
import com.google.android.gms.autofill.sharedpreferences.Change;

public final class apgo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = parcel0.readByte();
        Change.Put[] arr_change$Put = (Change.Put[])parcel0.createTypedArray(Change.Put.CREATOR);
        return v == 0 ? new Change(false, arr_change$Put) : new Change(true, arr_change$Put);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Change[v];
    }
}

