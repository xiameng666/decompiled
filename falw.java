import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.userlocation.internal.UserLocationClientIdentifier;
import com.google.android.gms.userlocation.internal.UserLocationParameters;
import java.util.List;

public final class falw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        UserLocationClientIdentifier userLocationClientIdentifier0 = null;
        List list0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    userLocationClientIdentifier0 = (UserLocationClientIdentifier)baua.m(parcel0, v1, UserLocationClientIdentifier.CREATOR);
                    break;
                }
                case 3: {
                    list0 = baua.x(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UserLocationParameters(s, userLocationClientIdentifier0, list0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UserLocationParameters[v];
    }
}

