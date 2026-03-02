import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobilesubscription.serviceconfig.GetEsimConfigRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

public final class csnj implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        UserKey userKey0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String[] arr_s = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            int v2 = (char)v1;
            if(v2 == 0x3F) {
                bundle0 = baua.j(parcel0, v1);
            }
            else {
                switch(v2) {
                    case 1: {
                        s = baua.s(parcel0, v1);
                        break;
                    }
                    case 2: {
                        userKey0 = (UserKey)baua.m(parcel0, v1, UserKey.CREATOR);
                        break;
                    }
                    case 3: {
                        s1 = baua.s(parcel0, v1);
                        break;
                    }
                    case 4: {
                        s2 = baua.s(parcel0, v1);
                        break;
                    }
                    case 5: {
                        s3 = baua.s(parcel0, v1);
                        break;
                    }
                    case 6: {
                        s4 = baua.s(parcel0, v1);
                        break;
                    }
                    case 7: {
                        arr_s = baua.K(parcel0, v1);
                        break;
                    }
                    default: {
                        baua.C(parcel0, v1);
                    }
                }
            }
        }
        baua.A(parcel0, v);
        return new GetEsimConfigRequest(s, userKey0, s1, s2, s3, s4, arr_s, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetEsimConfigRequest[v];
    }
}

