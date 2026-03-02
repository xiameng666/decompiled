import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

public final class ajov implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = null;
        AppDescription appDescription0 = null;
        String s = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = null;
        int v1 = 0;
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
                    appDescription0 = (AppDescription)baua.m(parcel0, v2, AppDescription.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    accountAuthenticatorResponse0 = (AccountAuthenticatorResponse)baua.m(parcel0, v2, AccountAuthenticatorResponse.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new FinishSessionWorkflowRequest(v1, bundle0, appDescription0, s, accountAuthenticatorResponse0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new FinishSessionWorkflowRequest[v];
    }
}

