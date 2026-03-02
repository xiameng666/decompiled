import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.tflite.dynamite.internal.CustomerInfo;
import com.google.android.gms.tflite.dynamite.internal.GetInternalNativeInitializationHandleParams;

public final class evuo implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        boolean z = false;
        CustomerInfo customerInfo0 = null;
        boolean z1 = false;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    customerInfo0 = (CustomerInfo)baua.m(parcel0, v1, CustomerInfo.CREATOR);
                    break;
                }
                case 2: {
                    z = baua.D(parcel0, v1);
                    break;
                }
                case 3: {
                    z1 = baua.D(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new GetInternalNativeInitializationHandleParams(customerInfo0, z, z1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new GetInternalNativeInitializationHandleParams[v];
    }
}

