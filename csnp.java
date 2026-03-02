import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.mobilesubscription.serviceconfig.AuthType;
import com.google.android.gms.mobilesubscription.serviceconfig.UserKey;

public final class csnp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Long long0 = null;
        AuthType authType0 = null;
        String s = null;
        Long long1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    long0 = baua.r(parcel0, v1);
                    break;
                }
                case 2: {
                    authType0 = (AuthType)baua.m(parcel0, v1, AuthType.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    long1 = baua.r(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new UserKey(long0, authType0, s, long1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UserKey[v];
    }
}

