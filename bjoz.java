import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.esim.DeviceInfo;
import com.google.android.gms.esim.ProfileInfo;
import com.google.android.gms.esim.ProfileTransferData;
import com.google.android.gms.esim.ProfileTransferMetaData;

public final class bjoz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        DeviceInfo deviceInfo0 = null;
        ProfileInfo profileInfo0 = null;
        ProfileTransferMetaData profileTransferMetaData0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    deviceInfo0 = (DeviceInfo)baua.m(parcel0, v2, DeviceInfo.CREATOR);
                    break;
                }
                case 2: {
                    profileInfo0 = (ProfileInfo)baua.m(parcel0, v2, ProfileInfo.CREATOR);
                    break;
                }
                case 3: {
                    profileTransferMetaData0 = (ProfileTransferMetaData)baua.m(parcel0, v2, ProfileTransferMetaData.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProfileTransferData(deviceInfo0, profileInfo0, profileTransferMetaData0, s, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProfileTransferData[v];
    }
}

