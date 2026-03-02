import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.esim.CarrierInfo;
import com.google.android.gms.esim.ProfileConversionData;
import com.google.android.gms.esim.ProfileTransferData;
import java.util.List;

public final class bjow implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        int v1 = 0;
        ProfileTransferData profileTransferData0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    list0 = baua.y(parcel0, v2, CarrierInfo.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 3: {
                    profileTransferData0 = (ProfileTransferData)baua.m(parcel0, v2, ProfileTransferData.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProfileConversionData(list0, v1, profileTransferData0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProfileConversionData[v];
    }
}

