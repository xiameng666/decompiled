import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.Transaction;
import com.google.android.gms.pay.TransactionListIntentArgs;

public final class dlkc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        GooglePaymentMethodId[] arr_googlePaymentMethodId = null;
        Transaction transaction0 = null;
        int v2 = 0;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    arr_googlePaymentMethodId = (GooglePaymentMethodId[])baua.J(parcel0, v4, GooglePaymentMethodId.CREATOR);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 4: {
                    transaction0 = (Transaction)baua.m(parcel0, v4, Transaction.CREATOR);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new TransactionListIntentArgs(arr_googlePaymentMethodId, v2, v3, transaction0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransactionListIntentArgs[v];
    }
}

