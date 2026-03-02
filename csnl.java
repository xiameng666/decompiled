import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobilesubscription.serviceconfig.GetPhoneNumbersRequest;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

public final class csnl implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
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
        return new GetPhoneNumbersRequest(s, userKey0, bundle0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPhoneNumbersRequest[v];
    }
}

