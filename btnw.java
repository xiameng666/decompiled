import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.feedback.Screenshot;

public final class btnw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        Object object0 = new Screenshot();
        object0.d = parcel0.readString();
        try {
            object0.b = parcel0.readInt();
            object0.c = parcel0.readInt();
        }
        catch(Exception unused_ex) {
            object0.b = 0;
            object0.c = 0;
        }
        return object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Screenshot[v];
    }
}

