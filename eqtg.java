import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class eqtg extends wbx implements IInterface {
    public eqtg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.smartdevice.directtransfer.internal.IDirectTransferCallback");
    }

    public final void a(Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        this.jq(1, parcel0);
    }
}

