import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParams;

public final class czib implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        String s = null;
        String s1 = null;
        AdvertisingOptions advertisingOptions0 = null;
        IBinder iBinder2 = null;
        byte[] arr_b = null;
        String s2 = null;
        long v1 = 0L;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    s1 = baua.s(parcel0, v2);
                    break;
                }
                case 5: {
                    v1 = baua.i(parcel0, v2);
                    break;
                }
                case 6: {
                    advertisingOptions0 = (AdvertisingOptions)baua.m(parcel0, v2, AdvertisingOptions.CREATOR);
                    break;
                }
                case 7: {
                    iBinder2 = baua.k(parcel0, v2);
                    break;
                }
                case 8: {
                    arr_b = baua.E(parcel0, v2);
                    break;
                }
                case 9: {
                    s2 = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartAdvertisingParams(iBinder0, iBinder1, s, s1, v1, advertisingOptions0, iBinder2, arr_b, s2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartAdvertisingParams[v];
    }
}

