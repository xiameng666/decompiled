import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnPayloadReceivedParams;
import com.google.android.gms.nearby.internal.connection.OnPayloadTransferUpdateParams;

public abstract class czfv extends wby implements czfw {
    public czfv() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                OnPayloadReceivedParams onPayloadReceivedParams0 = (OnPayloadReceivedParams)wbz.a(parcel0, OnPayloadReceivedParams.CREATOR);
                czfv.gr(parcel0);
                this.a(onPayloadReceivedParams0);
                return true;
            }
            case 3: {
                OnPayloadTransferUpdateParams onPayloadTransferUpdateParams0 = (OnPayloadTransferUpdateParams)wbz.a(parcel0, OnPayloadTransferUpdateParams.CREATOR);
                czfv.gr(parcel0);
                this.c(onPayloadTransferUpdateParams0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

