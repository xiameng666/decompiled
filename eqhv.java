import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;

public final class eqhv implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        eqik eqik0;
        int v = baua.h(parcel0);
        eqih eqih0 = null;
        IBinder iBinder0 = null;
        IBinder iBinder1 = null;
        ConnectionRequest connectionRequest0 = null;
        while(parcel0.dataPosition() < v) {
            int v1 = parcel0.readInt();
            switch(((char)v1)) {
                case 1: {
                    iBinder0 = baua.k(parcel0, v1);
                    break;
                }
                case 2: {
                    connectionRequest0 = (ConnectionRequest)baua.m(parcel0, v1, ConnectionRequest.CREATOR);
                    break;
                }
                case 3: {
                    iBinder1 = baua.k(parcel0, v1);
                    break;
                }
                default: {
                    baua.C(parcel0, v1);
                }
            }
        }
        baua.A(parcel0, v);
        if(iBinder0 == null) {
            eqik0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
            eqik0 = (iInterface0 instanceof eqik) ? ((eqik)iInterface0) : new eqii(iBinder0);
        }
        if(iBinder1 != null) {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ISourceConnectionListener");
            if((iInterface1 instanceof eqih)) {
                return new ConnectParams(eqik0, connectionRequest0, ((eqih)iInterface1));
            }
            eqih0 = new eqif(iBinder1);
        }
        return new ConnectParams(eqik0, connectionRequest0, eqih0);
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new ConnectParams[v];
    }
}

