import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.DiscoveryOptions;
import com.google.android.gms.nearby.presence.internal.DiscoveryWithIntentParams;

public final class dbak implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        PendingIntent pendingIntent0 = null;
        DiscoveryFilter discoveryFilter0 = null;
        DiscoveryOptions discoveryOptions0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v1, PendingIntent.CREATOR);
                    break;
                }
                case 3: {
                    discoveryFilter0 = (DiscoveryFilter)baua.m(parcel0, v1, DiscoveryFilter.CREATOR);
                    break;
                }
                case 4: {
                    discoveryOptions0 = (DiscoveryOptions)baua.m(parcel0, v1, DiscoveryOptions.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        return new DiscoveryWithIntentParams(iBinder0, pendingIntent0, discoveryFilter0, discoveryOptions0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new DiscoveryWithIntentParams[v];
    }
}

