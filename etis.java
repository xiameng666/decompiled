import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tapandpay.issuer.CobadgedTokenInfo;
import com.google.android.gms.tapandpay.issuer.PushTokenizeExtraOptions;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.SupervisedUserInfo;
import com.google.android.gms.tapandpay.issuer.UserAddress;

public final class etis implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        PushTokenizeExtraOptions pushTokenizeExtraOptions0 = new PushTokenizeExtraOptions(false, false, null);
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        byte[] arr_b = null;
        String s = null;
        String s1 = null;
        UserAddress userAddress0 = null;
        int[] arr_v = null;
        IBinder iBinder0 = null;
        CobadgedTokenInfo cobadgedTokenInfo0 = null;
        SupervisedUserInfo supervisedUserInfo0 = null;
        String[] arr_s = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    userAddress0 = (UserAddress)baua.m(parcel0, v3, UserAddress.CREATOR);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    arr_v = baua.H(parcel0, v3);
                    break;
                }
                case 10: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                case 11: {
                    cobadgedTokenInfo0 = (CobadgedTokenInfo)baua.m(parcel0, v3, CobadgedTokenInfo.CREATOR);
                    break;
                }
                case 12: {
                    supervisedUserInfo0 = (SupervisedUserInfo)baua.m(parcel0, v3, SupervisedUserInfo.CREATOR);
                    break;
                }
                case 13: {
                    arr_s = baua.K(parcel0, v3);
                    break;
                }
                case 14: {
                    pushTokenizeExtraOptions0 = (PushTokenizeExtraOptions)baua.m(parcel0, v3, PushTokenizeExtraOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PushTokenizeRequest(v1, v2, arr_b, s, s1, userAddress0, z, arr_v, iBinder0, cobadgedTokenInfo0, supervisedUserInfo0, arr_s, pushTokenizeExtraOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PushTokenizeRequest[v];
    }
}

