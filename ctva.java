import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.sync.QuickAccessDevice;

public final class ctva extends wbx implements IInterface {
    public ctva(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.multidevice.sync.internal.IQuickAccessDiscoveryCallbacks");
    }

    public final void a(QuickAccessDevice quickAccessDevice0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, quickAccessDevice0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(2, parcel0);
    }
}

