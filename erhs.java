import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.AuthenticatingUser;
import com.google.android.gms.smartdevice.setup.auth.StartSessionRequest;

public final class erhs implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        byte[] arr_b = null;
        byte[] arr_b1 = null;
        byte[] arr_b2 = null;
        String s3 = null;
        String s4 = null;
        AuthenticatingUser authenticatingUser0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 2: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 6: {
                    s2 = baua.s(parcel0, v4);
                    break;
                }
                case 7: {
                    arr_b = baua.E(parcel0, v4);
                    break;
                }
                case 8: {
                    arr_b1 = baua.E(parcel0, v4);
                    break;
                }
                case 9: {
                    arr_b2 = baua.E(parcel0, v4);
                    break;
                }
                case 10: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 11: {
                    s3 = baua.s(parcel0, v4);
                    break;
                }
                case 12: {
                    s4 = baua.s(parcel0, v4);
                    break;
                }
                case 13: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                case 14: {
                    authenticatingUser0 = (AuthenticatingUser)baua.m(parcel0, v4, AuthenticatingUser.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartSessionRequest(s, v1, s1, v2, s2, arr_b, arr_b1, arr_b2, v3, s3, s4, z, authenticatingUser0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartSessionRequest[v];
    }
}

