import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.proximity.firstparty.DeviceFilter;
import com.google.android.gms.auth.proximity.firstparty.SyncedDevicesUpdateSubscription;

public final class algv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        PendingIntent pendingIntent0 = null;
        DeviceFilter deviceFilter0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v2, PendingIntent.CREATOR);
                    break;
                }
                case 2: {
                    deviceFilter0 = (DeviceFilter)baua.m(parcel0, v2, DeviceFilter.CREATOR);
                    break;
                }
                case 3: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 4: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new SyncedDevicesUpdateSubscription(pendingIntent0, deviceFilter0, s, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SyncedDevicesUpdateSubscription[v];
    }
}

