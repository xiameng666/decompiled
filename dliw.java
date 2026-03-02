import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SelectPurchasablePassIntentArgs;

public final class dliw implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ProtoSafeParcelable protoSafeParcelable0 = null;
        long v1 = 0L;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v2, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 2: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SelectPurchasablePassIntentArgs(protoSafeParcelable0, v1, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SelectPurchasablePassIntentArgs[v];
    }
}

