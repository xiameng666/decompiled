import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public final class azum implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        String s = null;
        ConnectionResult connectionResult0 = null;
        int v1 = 0;
        PendingIntent pendingIntent0 = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 3: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v2, PendingIntent.CREATOR);
                    break;
                }
                case 4: {
                    connectionResult0 = (ConnectionResult)baua.m(parcel0, v2, ConnectionResult.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new Status(v1, s, pendingIntent0, connectionResult0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new Status[v];
    }
}

