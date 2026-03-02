import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class bmga extends wbx implements IInterface {
    public bmga(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    public final void a(List list0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        parcel0.writeList(list0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(1, parcel0);
    }

    public final void b(Status status0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, apiMetadata0);
        this.jp(2, parcel0);
    }
}

