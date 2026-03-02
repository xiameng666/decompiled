import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.GetPaymentMethodActionTokensRequest;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dlen implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ProtoSafeParcelable[] arr_protoSafeParcelable = null;
        String s = null;
        ProtoSafeParcelable protoSafeParcelable0 = null;
        int v1 = 0;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    account0 = (Account)baua.m(parcel0, v2, Account.CREATOR);
                    break;
                }
                case 2: {
                    arr_protoSafeParcelable = (ProtoSafeParcelable[])baua.J(parcel0, v2, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 3: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 4: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v2, ProtoSafeParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetPaymentMethodActionTokensRequest(account0, arr_protoSafeParcelable, v1, s, protoSafeParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetPaymentMethodActionTokensRequest[v];
    }
}

