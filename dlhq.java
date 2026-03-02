import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.RefreshSePrepaidTransactionsFromChipRequest;
import com.google.android.gms.pay.SeServiceProvider;

public final class dlhq implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        GooglePaymentMethodId[] arr_googlePaymentMethodId = null;
        SeServiceProvider seServiceProvider0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    arr_googlePaymentMethodId = (GooglePaymentMethodId[])baua.J(parcel0, v1, GooglePaymentMethodId.CREATOR);
                    break;
                }
                case 3: {
                    seServiceProvider0 = (SeServiceProvider)baua.m(parcel0, v1, SeServiceProvider.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RefreshSePrepaidTransactionsFromChipRequest(account0, arr_googlePaymentMethodId, seServiceProvider0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RefreshSePrepaidTransactionsFromChipRequest[v];
    }
}

