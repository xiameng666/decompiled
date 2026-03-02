import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

public final class ajpb implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = new Bundle();
        boolean z = true;
        String s = null;
        String s1 = null;
        FACLConfig fACLConfig0 = null;
        PACLConfig pACLConfig0 = null;
        AppDescription appDescription0 = null;
        Account account0 = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = null;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 4: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 5: {
                    fACLConfig0 = (FACLConfig)baua.m(parcel0, v1, FACLConfig.CREATOR);
                    break;
                }
                case 6: {
                    pACLConfig0 = (PACLConfig)baua.m(parcel0, v1, PACLConfig.CREATOR);
                    break;
                }
                case 7: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 8: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v1, AppDescription.CREATOR);
                    break;
                }
                case 9: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 10: {
                    accountAuthenticatorResponse0 = (AccountAuthenticatorResponse)baua.m(parcel0, v1, AccountAuthenticatorResponse.CREATOR);
                    break;
                }
                case 11: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TokenWorkflowRequest(s, s1, bundle0, fACLConfig0, pACLConfig0, z1, appDescription0, account0, accountAuthenticatorResponse0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TokenWorkflowRequest[v];
    }
}

