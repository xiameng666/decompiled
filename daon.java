import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

public final class daon implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        PendingIntent pendingIntent0 = null;
        String s = null;
        String s1 = null;
        ClientAppContext clientAppContext0 = null;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                case 3: {
                    iBinder1 = baua.k(parcel0, v3);
                    break;
                }
                case 4: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v3, PendingIntent.CREATOR);
                    break;
                }
                case 5: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                case 6: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 8: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 9: {
                    clientAppContext0 = (ClientAppContext)baua.m(parcel0, v3, ClientAppContext.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new UnsubscribeRequest(v1, iBinder0, iBinder1, pendingIntent0, v2, s, s1, z, clientAppContext0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new UnsubscribeRequest[v];
    }
}

