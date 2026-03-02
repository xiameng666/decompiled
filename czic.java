import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.connection.v3.AdvertisingOptions;
import com.google.android.gms.nearby.internal.connection.StartAdvertisingParamsV3;

public final class czic implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        String s = null;
        AdvertisingOptions advertisingOptions0 = null;
        IBinder iBinder1 = null;
        byte[] arr_b = null;
        String s1 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v1);
                    break;
                }
                case 3: {
                    advertisingOptions0 = (AdvertisingOptions)baua.m(parcel0, v1, AdvertisingOptions.CREATOR);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                case 5: {
                    arr_b = baua.E(parcel0, v1);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new StartAdvertisingParamsV3(iBinder0, s, advertisingOptions0, iBinder1, arr_b, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartAdvertisingParamsV3[v];
    }
}

