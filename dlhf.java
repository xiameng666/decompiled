import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.pay.PaycacheSetupIntentArgs;
import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dlhf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        ProtoSafeParcelable protoSafeParcelable0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            if(((char)v1) == 1) {
                protoSafeParcelable0 = (ProtoSafeParcelable)baua.m(parcel0, v1, ProtoSafeParcelable.CREATOR);
            }
            else {
                baua.C(parcel0, v1);
            }
        }
        baua.A(parcel0, v);
        return new PaycacheSetupIntentArgs(protoSafeParcelable0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PaycacheSetupIntentArgs[v];
    }
}

