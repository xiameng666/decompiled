import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import com.google.android.gms.nearby.messages.internal.RegisterStatusCallbackRequest;

public final class daoh implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        String s = null;
        ClientAppContext clientAppContext0 = null;
        int v1 = 0;
        boolean z = false;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 1: {
                    v1 = baua.f(parcel0, v2);
                    break;
                }
                case 2: {
                    iBinder0 = baua.k(parcel0, v2);
                    break;
                }
                case 3: {
                    iBinder1 = baua.k(parcel0, v2);
                    break;
                }
                case 4: {
                    z = baua.D(parcel0, v2);
                    break;
                }
                case 5: {
                    s = baua.s(parcel0, v2);
                    break;
                }
                case 6: {
                    clientAppContext0 = (ClientAppContext)baua.m(parcel0, v2, ClientAppContext.CREATOR);
                    break;
                }
                default: {
                    baua.C(parcel0, v2);
                }
            }
        }
        baua.A(parcel0, v);
        return new RegisterStatusCallbackRequest(v1, iBinder0, iBinder1, z, s, clientAppContext0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new RegisterStatusCallbackRequest[v];
    }
}

