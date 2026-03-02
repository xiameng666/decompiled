import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

public final class ajnc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AccountCredentials accountCredentials0 = null;
        int v1 = 0;
        CaptchaSolution captchaSolution0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    accountCredentials0 = (AccountCredentials)baua.m(parcel0, v2, AccountCredentials.CREATOR);
                    break;
                }
                case 3: {
                    captchaSolution0 = (CaptchaSolution)baua.m(parcel0, v2, CaptchaSolution.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new ConfirmCredentialsRequest(v1, accountCredentials0, captchaSolution0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConfirmCredentialsRequest[v];
    }
}

