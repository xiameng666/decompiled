import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class bdhw extends wbx implements IInterface {
    public bdhw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.credential.manager.common.IIntegerCallback");
    }

    public final void a(Status status0, int v, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeInt(v);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

