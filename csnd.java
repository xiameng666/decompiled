import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobilesubscription.serviceconfig.CarrierInfo;
import com.google.android.gms.mobilesubscription.serviceconfig.OauthRedirect;

public final class csnd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Long long0 = null;
        String s = null;
        OauthRedirect oauthRedirect0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    oauthRedirect0 = (OauthRedirect)baua.m(parcel0, v1, OauthRedirect.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new CarrierInfo(long0, s, oauthRedirect0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new CarrierInfo[v];
    }
}

