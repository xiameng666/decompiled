import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dck.DigitalKeyAccessProfile;
import com.google.android.gms.dck.DigitalKeyConfigurationData;

public final class bhcd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = -1;
        DigitalKeyAccessProfile digitalKeyAccessProfile0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    digitalKeyAccessProfile0 = (DigitalKeyAccessProfile)baua.m(parcel0, v2, DigitalKeyAccessProfile.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = baua.z(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DigitalKeyConfigurationData(digitalKeyAccessProfile0, s, s1, s2, ((short)v1));
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DigitalKeyConfigurationData[v];
    }
}

