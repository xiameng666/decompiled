import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import java.util.List;

public final class ajoz implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Bundle bundle0 = new Bundle();
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        int v2 = 0;
        boolean z10 = false;
        List list0 = null;
        AppDescription appDescription0 = null;
        String s = null;
        AccountAuthenticatorResponse accountAuthenticatorResponse0 = null;
        String s1 = null;
        String s2 = null;
        ManagedAuthOptions managedAuthOptions0 = null;
        String s3 = null;
        String s4 = "null";
        String s5 = "null";
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 3: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 4: {
                    list0 = baua.x(parcel0, v3);
                    break;
                }
                case 5: {
                    bundle0 = baua.j(parcel0, v3);
                    break;
                }
                case 6: {
                    appDescription0 = (AppDescription)baua.m(parcel0, v3, AppDescription.CREATOR);
                    break;
                }
                case 7: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 8: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 9: {
                    accountAuthenticatorResponse0 = (AccountAuthenticatorResponse)baua.m(parcel0, v3, AccountAuthenticatorResponse.CREATOR);
                    break;
                }
                case 10: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                case 11: {
                    z4 = baua.D(parcel0, v3);
                    break;
                }
                case 12: {
                    s4 = baua.s(parcel0, v3);
                    break;
                }
                case 13: {
                    s5 = baua.s(parcel0, v3);
                    break;
                }
                case 14: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 15: {
                    s2 = baua.s(parcel0, v3);
                    break;
                }
                case 16: {
                    z5 = baua.D(parcel0, v3);
                    break;
                }
                case 17: {
                    z6 = baua.D(parcel0, v3);
                    break;
                }
                case 18: {
                    z7 = baua.D(parcel0, v3);
                    break;
                }
                case 19: {
                    z8 = baua.D(parcel0, v3);
                    break;
                }
                case 20: {
                    managedAuthOptions0 = (ManagedAuthOptions)baua.m(parcel0, v3, ManagedAuthOptions.CREATOR);
                    break;
                }
                case 21: {
                    s3 = baua.s(parcel0, v3);
                    break;
                }
                case 22: {
                    z9 = baua.D(parcel0, v3);
                    break;
                }
                case 23: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 24: {
                    z10 = baua.D(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new SetupAccountWorkflowRequest(v1, z, z1, list0, bundle0, appDescription0, z2, s, accountAuthenticatorResponse0, z3, z4, s4, s5, s1, s2, z5, z6, z7, z8, managedAuthOptions0, s3, z9, v2, z10);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SetupAccountWorkflowRequest[v];
    }
}

