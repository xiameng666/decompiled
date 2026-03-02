import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.MarkTosAcceptedForPartnerRequest;
import com.google.android.gms.pay.SeServiceProvider;

public final class dlgc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        byte[] arr_b = null;
        int v1 = 0;
        SeServiceProvider seServiceProvider0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 2: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v2, SeServiceProvider.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new MarkTosAcceptedForPartnerRequest(account0, seServiceProvider0, v1, arr_b);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new MarkTosAcceptedForPartnerRequest[v];
    }
}

