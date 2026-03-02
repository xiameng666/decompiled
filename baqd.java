import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AuthAccountRequest;

public final class baqd implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        IBinder iBinder0 = null;
        Scope[] arr_scope = null;
        Integer integer0 = null;
        Integer integer1 = null;
        Account account0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    arr_scope = (Scope[])baua.J(parcel0, v2, Scope.CREATOR);
                    break;
                }
                case 4: {
                    integer0 = baua.q(parcel0, v2);
                    break;
                }
                case 5: {
                    integer1 = baua.q(parcel0, v2);
                    break;
                }
                case 6: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new AuthAccountRequest(v1, iBinder0, arr_scope, integer0, integer1, account0, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AuthAccountRequest[v];
    }
}

