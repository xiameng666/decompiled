import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetTransactionsRequest;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.GoogleTransactionId;

public final class dlez implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        long v4 = 0L;
        long v5 = 0L;
        Account account0 = null;
        GoogleTransactionId googleTransactionId0 = null;
        GooglePaymentMethodId[] arr_googlePaymentMethodId = null;
        while(parcel0.dataPosition() < v) {
            int v6 = parcel0.readInt();
            switch(((char)v6)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v6, Account.CREATOR);
                    break;
                }
                case 2: {
                    googleTransactionId0 = (GoogleTransactionId)baua.m(parcel0, v6, GoogleTransactionId.CREATOR);
                    break;
                }
                case 3: {
                    arr_googlePaymentMethodId = (GooglePaymentMethodId[])baua.J(parcel0, v6, GooglePaymentMethodId.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v6);
                    break;
                }
                case 5: {
                    v4 = baua.i(parcel0, v6);
                    break;
                }
                case 6: {
                    v2 = baua.f(parcel0, v6);
                    break;
                }
                case 7: {
                    v5 = baua.i(parcel0, v6);
                    break;
                }
                case 8: {
                    v3 = baua.f(parcel0, v6);
                    break;
                }
                default: {
                    baua.C(parcel0, v6);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetTransactionsRequest(account0, googleTransactionId0, arr_googlePaymentMethodId, v1, v4, v2, v5, v3);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetTransactionsRequest[v];
    }
}

