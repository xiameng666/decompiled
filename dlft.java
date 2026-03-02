import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.HomescreenConfig;
import com.google.android.gms.pay.NavigationConfig;

public final class dlft implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        NavigationConfig navigationConfig0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                navigationConfig0 = (NavigationConfig)baua.m(parcel0, v1, NavigationConfig.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new HomescreenConfig(navigationConfig0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new HomescreenConfig[v];
    }
}

