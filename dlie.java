import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveTicketCentricIntentArgs;

public final class dlie implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ProtoSafeParcelable protoSafeParcelable0 = null;
        ProtoSafeParcelable protoSafeParcelable1 = null;
        String s = null;
        byte[] arr_b = null;
        ProtoSafeParcelable protoSafeParcelable2 = null;
        boolean z = false;
        int v1 = 0;
        long v2 = 0L;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 2: {
                    v2 = baua.i(parcel0, v3);
                    break;
                }
                case 3: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 5: {
                    protoSafeParcelable1 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    arr_b = baua.E(parcel0, v3);
                    break;
                }
                case 8: {
                    protoSafeParcelable2 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new SaveTicketCentricIntentArgs(protoSafeParcelable0, v2, z, v1, protoSafeParcelable1, s, arr_b, protoSafeParcelable2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SaveTicketCentricIntentArgs[v];
    }
}

