import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthStatus;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.CarrierInfo;
import com.google.android.gms.mobilesubscription.serviceconfig.CheckAuthStatusResponse;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

public final class csnf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        CarrierInfo carrierInfo0 = null;
        AuthType authType0 = null;
        AuthStatus authStatus0 = null;
        UserKey userKey0 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    carrierInfo0 = (CarrierInfo)baua.m(parcel0, v1, CarrierInfo.CREATOR);
                    break;
                }
                case 3: {
                    authType0 = (AuthType)baua.m(parcel0, v1, AuthType.CREATOR);
                    break;
                }
                case 4: {
                    authStatus0 = (AuthStatus)baua.m(parcel0, v1, AuthStatus.CREATOR);
                    break;
                }
                case 5: {
                    userKey0 = (UserKey)baua.m(parcel0, v1, UserKey.CREATOR);
                    break;
                }
                case 0x3F: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CheckAuthStatusResponse(s, carrierInfo0, authType0, authStatus0, userKey0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CheckAuthStatusResponse[v];
    }
}

