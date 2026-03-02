import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class asdh extends wbx implements IInterface {
    public asdh(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.backup.migrate.helper.IBooleanCallbacks");
    }

    public final void a(boolean z) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(((int)z));
        this.jq(1, parcel0);
    }
}

