import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;

public final class dahn implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        int v1 = 0;
        ClientAppContext clientAppContext0 = null;
        String s = null;
        while(parcel0.dataPosition() < v) {
            int v2 = parcel0.readInt();
            switch(((char)v2)) {
                case 2: {
                    clientAppContext0 = (ClientAppContext)baua.m(parcel0, v2, ClientAppContext.CREATOR);
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
        return new ClientAppIdentifier(clientAppContext0, s, v1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ClientAppIdentifier[v];
    }
}

