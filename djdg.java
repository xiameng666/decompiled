import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.uwb.internal.AddControleeWithSessionParamsParams;
import com.google.android.gms.nearby.uwb.internal.RangingControleeParams;

public final class djdg implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        RangingControleeParams rangingControleeParams0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    rangingControleeParams0 = (RangingControleeParams)baua.m(parcel0, v1, RangingControleeParams.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new AddControleeWithSessionParamsParams(iBinder0, rangingControleeParams0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AddControleeWithSessionParamsParams[v];
    }
}

