import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.util.List;

public final class ajpa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = new Bundle();
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        String s = "null";
        String s1 = "null";
        List list0 = null;
        AppDescription appDescription0 = null;
        String s2 = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    list0 = baua.x(parcel0, v2);
                    break;
                }
                case 3: {
                    bundle0 = baua.j(parcel0, v2);
                    break;
                }
                case 4: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v2, AppDescription.CREATOR);
                    break;
                }
                case 5: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    accountAuthenticatorResponse0 = (AccountAuthenticatorResponse)baua.m(parcel0, v2, AccountAuthenticatorResponse.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 8: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 9: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 10: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 11: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                case 12: {
                    z3 = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartAddAccountSessionWorkflowRequest(v1, list0, bundle0, appDescription0, s2, accountAuthenticatorResponse0, z, z1, s, s1, z2, z3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartAddAccountSessionWorkflowRequest[v];
    }
}

