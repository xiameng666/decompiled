import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.PerformPaymentMethodServerActionRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dlhh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ProtoSafeParcelable protoSafeParcelable0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v1, Account.CREATOR);
                    break;
                }
                case 2: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v1, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new PerformPaymentMethodServerActionRequest(account0, protoSafeParcelable0, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PerformPaymentMethodServerActionRequest[v];
    }
}

