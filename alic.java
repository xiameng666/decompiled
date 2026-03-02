import android.os.Parcel;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import com.google.android.gms.common.api.Status;

public abstract class alic extends wby implements alid {
    public alic() {
        super("com.google.android.gms.auth.proximity.internal.IGetMySyncedMetadataCallback");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        if(v == 1) {
            Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
            SyncedCryptauthDevice syncedCryptauthDevice0 = (SyncedCryptauthDevice)wbz.a(parcel0, SyncedCryptauthDevice.CREATOR);
            alic.gr(parcel0);
            this.a(status0, syncedCryptauthDevice0);
            return true;
        }
        return false;
    }
}

