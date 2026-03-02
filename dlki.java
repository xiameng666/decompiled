import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.ProtoSafeParcelable;
import com.google.android.gms.pay.TransitDisplayCardIntentArgs;

public final class dlki implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        String s1 = null;
        String s2 = null;
        ProtoSafeParcelable protoSafeParcelable0 = null;
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
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 4: {
                    s2 = baua.s(parcel0, v1);
                    break;
                }
                case 5: {
                    protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v1, ProtoSafeParcelable.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new TransitDisplayCardIntentArgs(s, s1, z, s2, protoSafeParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new TransitDisplayCardIntentArgs[v];
    }
}

