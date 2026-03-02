import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetSortOrderRequest;
import com.google.android.gms.pay.SortOrderInfo;

public final class dlex implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        SortOrderInfo sortOrderInfo0 = null;
        Account account0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    sortOrderInfo0 = (SortOrderInfo)baua.m(parcel0, v1, SortOrderInfo.CREATOR);
                    break;
                }
                case 2: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetSortOrderRequest(sortOrderInfo0, account0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetSortOrderRequest[v];
    }
}

