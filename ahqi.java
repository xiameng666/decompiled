import android.accounts.Account;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public final class ahqi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        SignInCredential signInCredential0 = null;
        List list0 = null;
        String s = null;
        Intent intent0 = null;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        long v1 = 0L;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 2: {
                    signInCredential0 = (SignInCredential)baua.m(parcel0, v3, SignInCredential.CREATOR);
                    break;
                }
                case 3: {
                    list0 = baua.y(parcel0, v3, Scope.CREATOR);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 6: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                case 7: {
                    z2 = baua.D(parcel0, v3);
                    break;
                }
                case 8: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 9: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 10: {
                    z3 = baua.D(parcel0, v3);
                    break;
                }
                case 11: {
                    intent0 = (Intent)baua.m(parcel0, v3, Intent.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new InternalSignInCredentialWrapper(account0, signInCredential0, list0, z, z1, v1, z2, v2, s, z3, intent0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new InternalSignInCredentialWrapper[v];
    }
}

