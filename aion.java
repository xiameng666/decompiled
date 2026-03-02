import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class aion extends wbx implements IInterface {
    public aion(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.blockstore.internal.IGetAccessForPackageCallback");
    }

    public final void a(Status status0, int v) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeInt(v);
        this.jq(1, parcel0);
    }
}

