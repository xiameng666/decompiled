import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

public final class ajpc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = new Bundle();
        String s = null;
        AppDescription appDescription0 = null;
        Account account0 = null;
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
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v2, AppDescription.CREATOR);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 5: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 6: {
                    accountAuthenticatorResponse0 = (AccountAuthenticatorResponse)baua.m(parcel0, v2, AccountAuthenticatorResponse.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new UpdateCredentialsWorkflowRequest(v1, s, appDescription0, bundle0, account0, accountAuthenticatorResponse0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UpdateCredentialsWorkflowRequest[v];
    }
}

