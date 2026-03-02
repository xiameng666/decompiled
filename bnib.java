import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.findmydevice.spot.DeviceComponentImages;
import com.google.android.gms.findmydevice.spot.FastPairDeviceMetadata;

public final class bnib implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        String s = null;
        String s1 = null;
        DeviceComponentImages deviceComponentImages0 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v4);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 7: {
                    s4 = baua.s(parcel0, v4);
                    break;
                }
                case 8: {
                    deviceComponentImages0 = (DeviceComponentImages)baua.m(parcel0, v4, DeviceComponentImages.CREATOR);
                    break;
                }
                case 9: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 10: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new FastPairDeviceMetadata(s, s1, deviceComponentImages0, v1, s2, s3, v2, s4, v3, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FastPairDeviceMetadata[v];
    }
}

