import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;

public final class daoi implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        int v3 = 0;
        int v4 = 0;
        IBinder iBinder0 = null;
        Strategy strategy0 = null;
        IBinder iBinder1 = null;
        MessageFilter messageFilter0 = null;
        PendingIntent pendingIntent0 = null;
        String s = null;
        String s1 = null;
        byte[] arr_b = null;
        IBinder iBinder2 = null;
        ClientAppContext clientAppContext0 = null;
        while(parcel0.dataPosition() < v) {
            int v5 = parcel0.readInt();
            switch(((char)v5)) {
                case 1: {
                    v1 = baua.f(parcel0, v5);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v5);
                    break;
                }
                case 3: {
                    strategy0 = (Strategy)baua.m(parcel0, v5, Strategy.CREATOR);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v5);
                    break;
                }
                case 5: {
                    messageFilter0 = (MessageFilter)baua.m(parcel0, v5, MessageFilter.CREATOR);
                    break;
                }
                case 6: {
                    pendingIntent0 = (PendingIntent)baua.m(parcel0, v5, PendingIntent.CREATOR);
                    break;
                }
                case 7: {
                    v2 = baua.f(parcel0, v5);
                    break;
                }
                case 8: {
                    s = baua.s(parcel0, v5);
                    break;
                }
                case 9: {
                    s1 = baua.s(parcel0, v5);
                    break;
                }
                case 10: {
                    arr_b = baua.E(parcel0, v5);
                    break;
                }
                case 11: {
                    z = baua.D(parcel0, v5);
                    break;
                }
                case 12: {
                    iBinder2 = baua.k(parcel0, v5);
                    break;
                }
                case 13: {
                    z1 = baua.D(parcel0, v5);
                    break;
                }
                case 14: {
                    clientAppContext0 = (ClientAppContext)baua.m(parcel0, v5, ClientAppContext.CREATOR);
                    break;
                }
                case 15: {
                    z2 = baua.D(parcel0, v5);
                    break;
                }
                case 16: {
                    v3 = baua.f(parcel0, v5);
                    break;
                }
                case 17: {
                    v4 = baua.f(parcel0, v5);
                    break;
                }
                default: {
                    baua.C(parcel0, v5);
                }
            }
        }
        baua.A(parcel0, v);
        return new SubscribeRequest(v1, iBinder0, strategy0, iBinder1, messageFilter0, pendingIntent0, v2, s, s1, arr_b, z, iBinder2, z1, clientAppContext0, z2, v3, v4);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SubscribeRequest[v];
    }
}

