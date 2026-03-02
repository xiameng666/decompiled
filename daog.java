import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.MessageWrapper;
import com.google.android.gms.nearby.messages.internal.PublishRequest;

public final class daog implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        boolean z = false;
        boolean z1 = false;
        int v2 = 0;
        MessageWrapper messageWrapper0 = null;
        Strategy strategy0 = null;
        IBinder iBinder0 = null;
        String s = null;
        String s1 = null;
        IBinder iBinder1 = null;
        ClientAppContext clientAppContext0 = null;
        while(parcel0.dataPosition() < v) {
            int v3 = parcel0.readInt();
            switch(((char)v3)) {
                case 1: {
                    v1 = baua.f(parcel0, v3);
                    break;
                }
                case 2: {
                    messageWrapper0 = (MessageWrapper)baua.m(parcel0, v3, MessageWrapper.CREATOR);
                    break;
                }
                case 3: {
                    strategy0 = (Strategy)baua.m(parcel0, v3, Strategy.CREATOR);
                    break;
                }
                case 4: {
                    iBinder0 = baua.k(parcel0, v3);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v3);
                    break;
                }
                case 6: {
                    s1 = baua.s(parcel0, v3);
                    break;
                }
                case 7: {
                    z = baua.D(parcel0, v3);
                    break;
                }
                case 8: {
                    iBinder1 = baua.k(parcel0, v3);
                    break;
                }
                case 9: {
                    z1 = baua.D(parcel0, v3);
                    break;
                }
                case 10: {
                    clientAppContext0 = (ClientAppContext)baua.m(parcel0, v3, ClientAppContext.CREATOR);
                    break;
                }
                case 11: {
                    v2 = baua.f(parcel0, v3);
                    break;
                }
                default: {
                    baua.C(parcel0, v3);
                }
            }
        }
        baua.A(parcel0, v);
        return new PublishRequest(v1, messageWrapper0, strategy0, iBinder0, s, s1, z, iBinder1, z1, clientAppContext0, v2);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new PublishRequest[v];
    }
}

