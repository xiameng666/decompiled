import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.thunderbird.state.ConnectionState;
import com.google.android.gms.thunderbird.state.DeviceState;
import com.google.android.gms.thunderbird.state.TelephoneNumber;
import java.util.List;

public final class ewqw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        String s8 = null;
        List list0 = null;
        ConnectionState connectionState0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    s = baua.s(parcel0, v6);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v6);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v6);
                    break;
                }
                case 4: {
                    s3 = baua.s(parcel0, v6);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v6);
                    break;
                }
                case 7: {
                    s5 = baua.s(parcel0, v6);
                    break;
                }
                case 9: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 10: {
                    z = baua.D(parcel0, v6);
                    break;
                }
                case 11: {
                    s6 = baua.s(parcel0, v6);
                    break;
                }
                case 12: {
                    list0 = baua.y(parcel0, v6, TelephoneNumber.CREATOR);
                    break;
                }
                case 13: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 14: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                case 15: {
                    s7 = baua.s(parcel0, v6);
                    break;
                }
                case 16: {
                    s8 = baua.s(parcel0, v6);
                    break;
                }
                case 17: {
                    v4 = baua.f(parcel0, v6);
                    break;
                }
                case 18: {
                    v5 = baua.f(parcel0, v6);
                    break;
                }
                case 19: {
                    connectionState0 = (ConnectionState)baua.m(parcel0, v6, ConnectionState.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new DeviceState(v1, v2, s, s1, s2, s3, z, s4, s5, s6, s7, s8, list0, v3, v4, v5, connectionState0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DeviceState[v];
    }
}

