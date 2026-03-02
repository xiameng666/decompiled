import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.List;

public final class aidy implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        List list0 = null;
        ArrayList arrayList0 = null;
        Account account0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    arrayList0 = baua.y(parcel0, v2, Scope.CREATOR);
                    break;
                }
                case 3: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    z1 = baua.D(parcel0, v2);
                    break;
                }
                case 6: {
                    z2 = baua.D(parcel0, v2);
                    break;
                }
                case 7: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 8: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 9: {
                    list0 = baua.y(parcel0, v2, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                }
                case 10: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GoogleSignInOptions(v1, arrayList0, account0, z, z1, z2, s, s1, GoogleSignInOptions.b(list0), s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GoogleSignInOptions[v];
    }
}

