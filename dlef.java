import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetPassesRequest;
import com.google.android.gms.pay.PassFilter;

public final class dlef implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        int v1 = 0;
        int v2 = 0;
        PassFilter passFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v3, Account.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 4: {
                    passFilter0 = (PassFilter)baua.m(parcel0, v3, PassFilter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetPassesRequest(account0, v1, v2, passFilter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPassesRequest[v];
    }
}

