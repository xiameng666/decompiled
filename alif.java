import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

public abstract class alif extends wby implements alig {
    public alif() {
        super("com.google.android.gms.auth.proximity.internal.IGetSyncedDevicesCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            ArrayList arrayList0 = parcel0.createTypedArrayList(SyncedCryptauthDevice.CREATOR);
            alif.gr(parcel0);
            this.a(status0, arrayList0);
            return true;
        }
        return false;
    }
}

