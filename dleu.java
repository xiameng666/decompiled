import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetSeMfiPrepaidCardsRequest;
import com.google.android.gms.pay.SeServiceProvider;

public final class dleu implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        boolean z = false;
        Account account0 = null;
        SeServiceProvider seServiceProvider0 = null;
        String s = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v4, Account.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v4, SeServiceProvider.CREATOR);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v4);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 8: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 9: {
                    s1 = baua.s(parcel0, v4);
                    break;
                }
                case 10: {
                    z = baua.D(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetSeMfiPrepaidCardsRequest(account0, v1, seServiceProvider0, s, v2, v3, s1, z);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetSeMfiPrepaidCardsRequest[v];
    }
}

