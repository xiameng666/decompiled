import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.nearby.internal.connection.ConnectionListeningOptions;
import com.google.android.gms.nearby.internal.connection.StartListeningParams;

public final class czif implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        int v = baua.h(parcel0);
        IBinder iBinder0 = null;
        String s = null;
        ConnectionListeningOptions connectionListeningOptions0 = null;
        IBinder iBinder1 = null;
        IBinder iBinder2 = null;
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
                    connectionListeningOptions0 = (ConnectionListeningOptions)baua.m(parcel0, v1, ConnectionListeningOptions.CREATOR);
                    break;
                }
                case 4: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                case 5: {
                    iBinder2 = baua.k(parcel0, v1);
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
        return new StartListeningParams(iBinder0, s, connectionListeningOptions0, iBinder1, iBinder2, s1);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StartListeningParams[v];
    }
}

