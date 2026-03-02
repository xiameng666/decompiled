import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.ReversePurchaseRequest;

public final class dlhv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ProtoSafeParcelable protoSafeParcelable0 = null;
        long v1 = 0L;
        long v2 = 0L;
        int v3 = 0;
        while(parcel0.dataPosition() < v) {
            int v4 = parcel0.readInt();
            switch(((char)v4)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v4, Account.CREATOR);
                    break;
                }
                case 2: {
                    v3 = baua.f(parcel0, v4);
                    break;
                }
                case 3: {
                    v1 = baua.i(parcel0, v4);
                    break;
                }
                case 4: {
                    v2 = baua.i(parcel0, v4);
                    break;
                }
                case 5: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v4, ProtoSafeParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v4);
                }
            }
        }
        baua.A(parcel0, v);
        return new ReversePurchaseRequest(account0, v3, v1, v2, protoSafeParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ReversePurchaseRequest[v];
    }
}

