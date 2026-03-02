import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.home.matter.commissioning.DeviceInfo;
import com.google.android.gms.home.matter.common.Discriminator;
import com.google.android.gms.home.matter.common.NetworkLocation;

public final class bwhe implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Discriminator discriminator0 = null;
        String s = null;
        NetworkLocation networkLocation0 = null;
        String s1 = null;
        int v1 = 0;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    discriminator0 = (Discriminator)baua.m(parcel0, v3, Discriminator.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 5: {
                    networkLocation0 = (NetworkLocation)baua.m(parcel0, v3, NetworkLocation.CREATOR);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        Object object0 = new DeviceInfo(v1, v2, discriminator0, s, networkLocation0, s1);
        DeviceInfo.a(object0.d);
        return object0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceInfo[v];
    }
}

