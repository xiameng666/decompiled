import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class aisk extends wbx implements IInterface {
    public aisk(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.blockstore.restorecredential.internal.IClearRestoreCredentialCallback");
    }

    public final void a(Status status0, boolean z) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeInt(((int)z));
        this.jq(1, parcel0);
    }
}

