import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;

public final class ajnd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        FACLConfig fACLConfig0 = null;
        String s1 = null;
        String s2 = null;
        String s3 = "com.google.android.gms.auth.firstparty.shared.Consent.UNKNOWN.toString()";
        String s4 = "com.google.android.gms.auth.firstparty.shared.Status.UNKNOWN.toString()";
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    fACLConfig0 = (FACLConfig)baua.m(parcel0, v2, FACLConfig.CREATOR);
                    break;
                }
                case 5: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConsentResult(v1, s4, s, fACLConfig0, s3, s1, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConsentResult[v];
    }
}

