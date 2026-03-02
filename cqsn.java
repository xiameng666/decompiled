import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mdns.MdnsServiceInfo.TextEntry;
import com.google.android.gms.mdns.MdnsServiceInfo;
import java.util.List;

public final class cqsn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        gged_interceptors gged0 = ggna.a;
        gged_interceptors gged1 = gged0;
        String s = null;
        String[] arr_s = null;
        List list0 = null;
        String[] arr_s1 = null;
        String s1 = null;
        String s2 = null;
        List list1 = null;
        List list2 = null;
        Network network0 = null;
        int v1 = -1;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 3: {
                    arr_s = baua.K(parcel0, v3);
                    break;
                }
                case 4: {
                    list0 = baua.x(parcel0, v3);
                    break;
                }
                case 5: {
                    arr_s1 = baua.K(parcel0, v3);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 7: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 9: {
                    list1 = baua.x(parcel0, v3);
                    break;
                }
                case 10: {
                    list2 = baua.y(parcel0, v3, MdnsServiceInfo.TextEntry.CREATOR);
                    break;
                }
                case 11: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 12: {
                    gged0 = baua.x(parcel0, v3);
                    break;
                }
                case 13: {
                    gged1 = baua.x(parcel0, v3);
                    break;
                }
                case 14: {
                    network0 = (Network)baua.m(parcel0, v3, Network.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new MdnsServiceInfo(s, arr_s, list0, arr_s1, v2, s1, s2, list1, list2, v1, gged0, gged1, network0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MdnsServiceInfo[v];
    }
}

