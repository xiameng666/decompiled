import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.serviceentitlement.AuthenticationException;
import com.google.android.gms.serviceentitlement.TempTokenBundle;

public final class eona implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        AuthenticationException authenticationException0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    authenticationException0 = (AuthenticationException)baua.m(parcel0, v1, AuthenticationException.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TempTokenBundle(s, authenticationException0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TempTokenBundle[v];
    }
}

