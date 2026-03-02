import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class aqic extends wbx implements IInterface {
    public aqic(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.backup.apps.internal.IBackupStateServiceCallback");
    }

    public final void a(Status status0, String s) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeString(s);
        this.jq(2, parcel0);
    }

    public final void b(Status status0, boolean z) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeInt(((int)z));
        this.jq(1, parcel0);
    }
}

