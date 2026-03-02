import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;

public final class epuh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        String s = null;
        int v1 = 0;
        Scope[] arr_scope = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 3: {
                    arr_scope = (Scope[])baua.J(parcel0, v2, Scope.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new RecordConsentRequest(v1, account0, arr_scope, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RecordConsentRequest[v];
    }
}

