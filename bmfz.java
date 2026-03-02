import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bmfz extends wbx implements IInterface {
    public bmfz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.fido.fido2.api.IByteArrayCallback");
    }

    public final void a(Status status0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(2, parcel0);
    }
}

