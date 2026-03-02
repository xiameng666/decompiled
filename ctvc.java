import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.multidevice.sync.QuickAccessDocument;

public final class ctvc extends wbx implements IInterface {
    public ctvc(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.multidevice.sync.internal.IQuickAccessGetDocumentCallbacks");
    }

    public final void a(QuickAccessDocument quickAccessDocument0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, quickAccessDocument0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

