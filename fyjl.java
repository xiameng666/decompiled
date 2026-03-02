import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.material.datepicker.SingleDateSelector;

public final class fyjl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Object object0 = new SingleDateSelector();
        object0.a = (Long)parcel0.readValue(Long.class.getClassLoader());
        return object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SingleDateSelector[v];
    }
}

