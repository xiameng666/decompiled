import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.RefreshSePostpaidsTransactionsFromChipRequest;

public final class dlhp implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        GooglePaymentMethodId[] arr_googlePaymentMethodId = null;
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
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new RefreshSePostpaidsTransactionsFromChipRequest(account0, arr_googlePaymentMethodId);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RefreshSePostpaidsTransactionsFromChipRequest[v];
    }
}

