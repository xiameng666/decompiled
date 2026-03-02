import android.os.IBinder.DeathRecipient;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnEndpointFoundParams;
import com.google.android.gms.nearby.internal.connection.OnEndpointLostParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedDiscoveryParams;

public final class czfi extends wby implements czfj {
    final czfq a;

    public czfi() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
    }

    public czfi(czfq czfq0) {
        this.a = czfq0;
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
    }

    @Override  // czfj
    public final void a(OnEndpointFoundParams onEndpointFoundParams0) {
        String s = onEndpointFoundParams0.a;
        String s1 = onEndpointFoundParams0.b;
        String s2 = onEndpointFoundParams0.c;
        Parcel parcel0 = this.a.jo();
        parcel0.writeString(s);
        parcel0.writeString(null);
        parcel0.writeString(s1);
        parcel0.writeString(s2);
        this.a.jp(1002, parcel0);
    }

    @Override  // czfj
    public final void b(OnEndpointLostParams onEndpointLostParams0) {
        String s = onEndpointLostParams0.a;
        Parcel parcel0 = this.a.jo();
        parcel0.writeString(s);
        this.a.jp(1003, parcel0);
    }

    @Override  // czfj
    public final void c(OnStoppedDiscoveryParams onStoppedDiscoveryParams0) {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                OnEndpointFoundParams onEndpointFoundParams0 = (OnEndpointFoundParams)wbz.a(parcel0, OnEndpointFoundParams.CREATOR);
                czfi.gr(parcel0);
                this.a(onEndpointFoundParams0);
                return true;
            }
            case 3: {
                OnEndpointLostParams onEndpointLostParams0 = (OnEndpointLostParams)wbz.a(parcel0, OnEndpointLostParams.CREATOR);
                czfi.gr(parcel0);
                this.b(onEndpointLostParams0);
                return true;
            }
            case 4: {
                OnStoppedDiscoveryParams onStoppedDiscoveryParams0 = (OnStoppedDiscoveryParams)wbz.a(parcel0, OnStoppedDiscoveryParams.CREATOR);
                czfi.gr(parcel0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // android.os.Binder
    public final void linkToDeath(IBinder.DeathRecipient iBinder$DeathRecipient0, int v) {
        super.linkToDeath(iBinder$DeathRecipient0, v);
        try {
            this.a.a.linkToDeath(iBinder$DeathRecipient0, v);
        }
        catch(RemoteException remoteException0) {
            cvau.b(remoteException0, "Exception calling linkToDeath on INearbyConnectionCallbacks", new Object[0]);
        }
    }

    @Override  // android.os.Binder
    public final boolean unlinkToDeath(IBinder.DeathRecipient iBinder$DeathRecipient0, int v) {
        this.a.a.unlinkToDeath(iBinder$DeathRecipient0, v);
        return super.unlinkToDeath(iBinder$DeathRecipient0, v);
    }
}

