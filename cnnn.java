import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.location.places.UserDataType;
import java.util.List;

public final class cnnn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        List list1 = null;
        boolean z = false;
        List list2 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    list0 = baua.v(parcel0, v1);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    list1 = baua.y(parcel0, v1, UserDataType.CREATOR);
                    break;
                }
                case 6: {
                    list2 = baua.x(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PlaceFilter(list0, z, list2, list1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PlaceFilter[v];
    }
}

