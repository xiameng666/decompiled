import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.dck.DigitalKeyConfigurationData;
import com.google.android.gms.dck.DigitalKeySharingSession;
import java.util.List;

public final class bhci implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = true;
        String s = null;
        DigitalKeyConfigurationData digitalKeyConfigurationData0 = null;
        Uri uri0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        List list0 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        String s9 = null;
        String s10 = null;
        String s11 = null;
        String s12 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 2: {
                    digitalKeyConfigurationData0 = (DigitalKeyConfigurationData)baua.m(parcel0, v2, DigitalKeyConfigurationData.CREATOR);
                    break;
                }
                case 3: {
                    uri0 = (Uri)baua.m(parcel0, v2, Uri.CREATOR);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    list0 = baua.x(parcel0, v2);
                    break;
                }
                case 9: {
                    s5 = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    s6 = baua.s(parcel0, v2);
                    break;
                }
                case 11: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 12: {
                    s7 = baua.s(parcel0, v2);
                    break;
                }
                case 13: {
                    s8 = baua.s(parcel0, v2);
                    break;
                }
                case 14: {
                    s9 = baua.s(parcel0, v2);
                    break;
                }
                case 15: {
                    s10 = baua.s(parcel0, v2);
                    break;
                }
                case 16: {
                    s11 = baua.s(parcel0, v2);
                    break;
                }
                case 17: {
                    s12 = baua.s(parcel0, v2);
                    break;
                }
                case 18: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new DigitalKeySharingSession(s, digitalKeyConfigurationData0, uri0, s1, s2, s3, s4, list0, s5, s6, v1, s7, s8, s9, s10, s11, s12, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DigitalKeySharingSession[v];
    }
}

