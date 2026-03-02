import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

public final class ajnw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = new Bundle();
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        AppDescription appDescription0 = null;
        AccountCredentials accountCredentials0 = null;
        CaptchaSolution captchaSolution0 = null;
        String s5 = null;
        String s6 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 7: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    s3 = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    z3 = baua.D(parcel0, v2);
                    break;
                }
                case 11: {
                    z4 = baua.D(parcel0, v2);
                    break;
                }
                case 12: {
                    z5 = baua.D(parcel0, v2);
                    break;
                }
                case 13: {
                    s4 = baua.s(parcel0, v2);
                    break;
                }
                case 14: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v2, AppDescription.CREATOR);
                    break;
                }
                case 15: {
                    accountCredentials0 = (AccountCredentials)baua.m(parcel0, v2, AccountCredentials.CREATOR);
                    break;
                }
                case 16: {
                    captchaSolution0 = (CaptchaSolution)baua.m(parcel0, v2, CaptchaSolution.CREATOR);
                    break;
                }
                case 17: {
                    s5 = baua.s(parcel0, v2);
                    break;
                }
                case 18: {
                    s6 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GoogleAccountSetupRequest(v1, bundle0, z, z1, z2, s, s1, s2, s3, z3, z4, z5, s4, appDescription0, accountCredentials0, captchaSolution0, s5, s6);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GoogleAccountSetupRequest[v];
    }
}

