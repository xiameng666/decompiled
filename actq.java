import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.aang.GetTokenRequest;
import com.google.android.gms.auth.aang.GoogleAccount;
import java.util.List;

public final class actq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        GoogleAccount googleAccount0 = null;
        String s = null;
        List list0 = null;
        List list1 = null;
        List list2 = null;
        List list3 = null;
        String s1 = null;
        byte[] arr_b = null;
        String s2 = null;
        Network network0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    googleAccount0 = (GoogleAccount)baua.m(parcel0, v2, GoogleAccount.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    list0 = baua.x(parcel0, v2);
                    break;
                }
                case 4: {
                    list1 = baua.x(parcel0, v2);
                    break;
                }
                case 5: {
                    list2 = baua.x(parcel0, v2);
                    break;
                }
                case 6: {
                    list3 = baua.x(parcel0, v2);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 10: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 11: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 12: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 13: {
                    network0 = (Network)baua.m(parcel0, v2, Network.CREATOR);
                    break;
                }
                case 14: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetTokenRequest(googleAccount0, s, list0, list1, list2, list3, v1, s1, z, arr_b, s2, z1, network0, z2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetTokenRequest[v];
    }
}

