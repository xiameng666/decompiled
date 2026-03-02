import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ClosedLoopCardIntentArgs;
import com.google.android.gms.pay.GooglePaymentMethodId;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dlch implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ProtoSafeParcelable protoSafeParcelable0 = null;
        GooglePaymentMethodId googlePaymentMethodId0 = null;
        String s1 = null;
        ProtoSafeParcelable protoSafeParcelable1 = null;
        ProtoSafeParcelable protoSafeParcelable2 = null;
        String s2 = null;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 2: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v1, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 5: {
                    googlePaymentMethodId0 = (GooglePaymentMethodId)baua.m(parcel0, v1, GooglePaymentMethodId.CREATOR);
                    break;
                }
                case 6: {
                    protoSafeParcelable1 = (ProtoSafeParcelable)baua.m(parcel0, v1, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 7: {
                    protoSafeParcelable2 = (ProtoSafeParcelable)baua.m(parcel0, v1, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 8: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ClosedLoopCardIntentArgs(s, protoSafeParcelable0, googlePaymentMethodId0, s1, z, protoSafeParcelable1, protoSafeParcelable2, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ClosedLoopCardIntentArgs[v];
    }
}

