import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveLocalValuablesRequest;
import com.google.android.gms.pay.ValuableAsset;

public final class dlia implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        Account account0 = null;
        ProtoSafeParcelable protoSafeParcelable0 = null;
        String s = null;
        ValuableAsset[] arr_valuableAsset = null;
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
                case 4: {
                    arr_valuableAsset = (ValuableAsset[])baua.J(parcel0, v1, ValuableAsset.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new SaveLocalValuablesRequest(account0, protoSafeParcelable0, s, arr_valuableAsset);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SaveLocalValuablesRequest[v];
    }
}

