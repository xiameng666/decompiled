import android.os.IBinder.DeathRecipient;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedAdvertisingParams;

public final class czeh extends wby implements czei {
    final czfq a;

    public czeh() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    public czeh(czfq czfq0) {
        this.a = czfq0;
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    @Override  // czei
    public final void a(OnConnectionRequestParams onConnectionRequestParams0) {
        String s = onConnectionRequestParams0.a;
        String s1 = onConnectionRequestParams0.b;
        byte[] arr_b = onConnectionRequestParams0.c;
        Parcel parcel0 = this.a.jo();
        parcel0.writeString(s);
        parcel0.writeString(null);
        parcel0.writeString(s1);
        parcel0.writeByteArray(arr_b);
        this.a.jp(1001, parcel0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                OnConnectionRequestParams onConnectionRequestParams0 = (OnConnectionRequestParams)wbz.a(parcel0, OnConnectionRequestParams.CREATOR);
                czeh.gr(parcel0);
                this.a(onConnectionRequestParams0);
                return true;
            }
            case 3: {
                OnStoppedAdvertisingParams onStoppedAdvertisingParams0 = (OnStoppedAdvertisingParams)wbz.a(parcel0, OnStoppedAdvertisingParams.CREATOR);
                czeh.gr(parcel0);
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

