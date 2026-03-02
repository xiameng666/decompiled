import android.os.IBinder.DeathRecipient;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.internal.connection.OnDisconnectedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;

public final class czet extends wby implements czeu {
    final czfq a;

    public czet() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    public czet(czfq czfq0) {
        this.a = czfq0;
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    @Override  // czeu
    public final void a(OnDisconnectedParams onDisconnectedParams0) {
        String s = onDisconnectedParams0.a;
        Parcel parcel0 = this.a.jo();
        parcel0.writeString(s);
        this.a.jp(0x3F0, parcel0);
    }

    @Override  // czeu
    public final void b(OnPayloadReceivedParams onPayloadReceivedParams0) {
        ParcelablePayload parcelablePayload0 = onPayloadReceivedParams0.b;
        if(parcelablePayload0.b != 1) {
            return;
        }
        String s = onPayloadReceivedParams0.a;
        byte[] arr_b = parcelablePayload0.c;
        boolean z = onPayloadReceivedParams0.c;
        Parcel parcel0 = this.a.jo();
        parcel0.writeString(s);
        parcel0.writeByteArray(arr_b);
        parcel0.writeInt(((int)z));
        this.a.jp(1007, parcel0);
    }

    @Override  // czeu
    public final void c(OnPayloadTransferUpdateParams onPayloadTransferUpdateParams0) {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                OnPayloadReceivedParams onPayloadReceivedParams0 = (OnPayloadReceivedParams)wbz.a(parcel0, OnPayloadReceivedParams.CREATOR);
                czet.gr(parcel0);
                this.b(onPayloadReceivedParams0);
                return true;
            }
            case 3: {
                OnDisconnectedParams onDisconnectedParams0 = (OnDisconnectedParams)wbz.a(parcel0, OnDisconnectedParams.CREATOR);
                czet.gr(parcel0);
                this.a(onDisconnectedParams0);
                return true;
            }
            case 4: {
                OnPayloadTransferUpdateParams onPayloadTransferUpdateParams0 = (OnPayloadTransferUpdateParams)wbz.a(parcel0, OnPayloadTransferUpdateParams.CREATOR);
                czet.gr(parcel0);
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

