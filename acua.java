import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.aang.ReauthRequest;

public final class acua implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        GoogleAccount googleAccount0 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    googleAccount0 = (GoogleAccount)baua.m(parcel0, v1, GoogleAccount.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReauthRequest(googleAccount0, s, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReauthRequest[v];
    }
}

