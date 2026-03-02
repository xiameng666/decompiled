import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

public final class ajmv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AppDescription appDescription0 = null;
        CaptchaSolution captchaSolution0 = null;
        AccountCredentials accountCredentials0 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v2, AppDescription.CREATOR);
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
                    captchaSolution0 = (CaptchaSolution)baua.m(parcel0, v2, CaptchaSolution.CREATOR);
                    break;
                }
                case 6: {
                    accountCredentials0 = (AccountCredentials)baua.m(parcel0, v2, AccountCredentials.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AccountSignInRequest(v1, appDescription0, z, z1, captchaSolution0, accountCredentials0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AccountSignInRequest[v];
    }
}

