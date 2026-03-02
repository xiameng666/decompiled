import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.LocationRequestInternal;
import com.google.android.gms.location.internal.LocationRequestUpdateData;

public final class cnlc implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        LocationRequestInternal locationRequestInternal0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        PendingIntent pendingIntent0 = null;
        IBinder iBinder2 = null;
        String s = null;
        int v1 = 1;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    locationRequestInternal0 = (LocationRequestInternal)baua.m(parcel0, v2, LocationRequestInternal.CREATOR);
                    break;
                }
                case 3: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 4: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v2, PendingIntent.CREATOR);
                    break;
                }
                case 5: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                case 6: {
                    iBinder2 = baua.k(parcel0, v2);
                    break;
                }
                case 8: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new LocationRequestUpdateData(v1, locationRequestInternal0, iBinder0, iBinder1, pendingIntent0, iBinder2, s);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new LocationRequestUpdateData[v];
    }
}

