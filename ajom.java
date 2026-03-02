import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

public final class ajom implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = new Bundle();
        String s = ajol.a.toString();
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v1 = 0;
        boolean z3 = false;
        int v2 = 0;
        int v3 = 0;
        boolean z4 = true;
        boolean z5 = true;
        String s1 = null;
        String s2 = null;
        FACLConfig fACLConfig0 = null;
        PACLConfig pACLConfig0 = null;
        AppDescription appDescription0 = null;
        CaptchaSolution captchaSolution0 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        long v4 = 0L;
        String s8 = "com.google";
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 2: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 3: {
                    s2 = baua.s(parcel0, v5);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v5);
                    break;
                }
                case 5: {
                    fACLConfig0 = (FACLConfig)baua.m(parcel0, v5, FACLConfig.CREATOR);
                    break;
                }
                case 6: {
                    pACLConfig0 = (PACLConfig)baua.m(parcel0, v5, PACLConfig.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 9: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 10: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v5, AppDescription.CREATOR);
                    break;
                }
                case 11: {
                    captchaSolution0 = (CaptchaSolution)baua.m(parcel0, v5, CaptchaSolution.CREATOR);
                    break;
                }
                case 13: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 14: {
                    z4 = baua.D(parcel0, v5);
                    break;
                }
                case 15: {
                    s8 = baua.s(parcel0, v5);
                    break;
                }
                case 16: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 17: {
                    s3 = baua.s(parcel0, v5);
                    break;
                }
                case 18: {
                    s4 = baua.s(parcel0, v5);
                    break;
                }
                case 19: {
                    s5 = baua.s(parcel0, v5);
                    break;
                }
                case 20: {
                    v4 = baua.i(parcel0, v5);
                    break;
                }
                case 21: {
                    z3 = baua.D(parcel0, v5);
                    break;
                }
                case 22: {
                    s6 = baua.s(parcel0, v5);
                    break;
                }
                case 23: {
                    s7 = baua.s(parcel0, v5);
                    break;
                }
                case 24: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 25: {
                    z5 = baua.D(parcel0, v5);
                    break;
                }
                case 26: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new TokenRequest(s1, s2, bundle0, fACLConfig0, pACLConfig0, z, z1, s, appDescription0, captchaSolution0, z2, z4, s8, v1, s3, s4, s5, v4, z3, s6, s7, v2, z5, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TokenRequest[v];
    }
}

