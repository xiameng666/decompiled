import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.sharing.AdvertisingOptions;
import com.google.android.gms.nearby.sharing.internal.ProviderUpdateAdvertisingParams;

public final class ddtf implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        AdvertisingOptions advertisingOptions0 = null;
        IBinder iBinder0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    advertisingOptions0 = (AdvertisingOptions)baua.m(parcel0, v1, AdvertisingOptions.CREATOR);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new ProviderUpdateAdvertisingParams(advertisingOptions0, iBinder0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ProviderUpdateAdvertisingParams[v];
    }
}

