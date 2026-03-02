import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.thunderbird.state.ActivationInfo;
import com.google.android.gms.thunderbird.state.AeiState;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.EmergencyInfo;

public final class ewqy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ActivationInfo activationInfo0 = null;
        Iterable iterable0 = null;
        AeiState aeiState0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 9: {
                    activationInfo0 = (ActivationInfo)baua.m(parcel0, v1, ActivationInfo.CREATOR);
                    break;
                }
                case 10: {
                    iterable0 = baua.y(parcel0, v1, DeviceState.CREATOR);
                    break;
                }
                case 11: {
                    aeiState0 = (AeiState)baua.m(parcel0, v1, AeiState.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new EmergencyInfo(activationInfo0, iterable0, aeiState0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new EmergencyInfo[v];
    }
}

