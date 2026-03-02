import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.CastEurekaInfo;
import com.google.android.gms.common.images.WebImage;
import java.util.List;

public final class atrr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        List list0 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        byte[] arr_b = null;
        String s8 = null;
        CastEurekaInfo castEurekaInfo0 = null;
        Integer integer0 = null;
        Boolean boolean0 = null;
        Network network0 = null;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        int v4 = -1;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v5);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v5);
                    break;
                }
                case 6: {
                    s4 = baua.s(parcel0, v5);
                    break;
                }
                case 7: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    list0 = baua.y(parcel0, v5, WebImage.CREATOR);
                    break;
                }
                case 9: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 10: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                case 11: {
                    s5 = baua.s(parcel0, v5);
                    break;
                }
                case 12: {
                    s6 = baua.s(parcel0, v5);
                    break;
                }
                case 13: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 14: {
                    s7 = baua.s(parcel0, v5);
                    break;
                }
                case 15: {
                    arr_b = baua.E(parcel0, v5);
                    break;
                }
                case 16: {
                    s8 = baua.s(parcel0, v5);
                    break;
                }
                case 17: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 18: {
                    castEurekaInfo0 = (CastEurekaInfo)baua.m(parcel0, v5, CastEurekaInfo.CREATOR);
                    break;
                }
                case 19: {
                    integer0 = baua.q(parcel0, v5);
                    break;
                }
                case 20: {
                    boolean0 = baua.n(parcel0, v5);
                    break;
                }
                case 21: {
                    network0 = (Network)baua.m(parcel0, v5, Network.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new CastDevice(s, s1, s2, s3, s4, v1, list0, v2, v4, s5, s6, v3, s7, arr_b, s8, z, castEurekaInfo0, integer0, boolean0, network0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CastDevice[v];
    }
}

