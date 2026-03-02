import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ClosedLoopCardFilter;
import com.google.android.gms.pay.GetClosedLoopCardsRequest;

public final class dldr implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ClosedLoopCardFilter closedLoopCardFilter0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    closedLoopCardFilter0 = (ClosedLoopCardFilter)baua.m(parcel0, v1, ClosedLoopCardFilter.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetClosedLoopCardsRequest(account0, closedLoopCardFilter0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetClosedLoopCardsRequest[v];
    }
}

