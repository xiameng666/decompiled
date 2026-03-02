import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetTransactionsResponse;
import com.google.android.gms.pay.Transaction;

public final class dlfa implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Transaction[] arr_transaction = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                arr_transaction = (Transaction[])baua.J(parcel0, v1, Transaction.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new GetTransactionsResponse(arr_transaction);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetTransactionsResponse[v];
    }
}

