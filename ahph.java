import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.List;

public final class ahph implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        List list0 = null;
        String s = null;
        Account account0 = null;
        String s1 = null;
        String s2 = null;
        Bundle bundle0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    list0 = baua.y(parcel0, v1, Scope.CREATOR);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 7: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 8: {
                    z2 = baua.D(parcel0, v1);
                    break;
                }
                case 9: {
                    bundle0 = baua.j(parcel0, v1);
                    break;
                }
                case 10: {
                    z3 = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AuthorizationRequest(list0, s, z, z1, account0, s1, s2, z2, bundle0, z3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AuthorizationRequest[v];
    }
}

