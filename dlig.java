import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.SaveTransitPlcIntentArgs;

public final class dlig implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        long v1 = 0L;
        String s = null;
        ProtoSafeParcelable protoSafeParcelable0 = null;
        int v2 = 0;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 2: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 3: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v3, ProtoSafeParcelable.CREATOR);
                    break;
                }
                case 4: {
                    v1 = baua.i(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new SaveTransitPlcIntentArgs(s, v2, protoSafeParcelable0, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SaveTransitPlcIntentArgs[v];
    }
}

