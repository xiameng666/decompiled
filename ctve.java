import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;

public final class ctve extends wbx implements IInterface {
    public ctve(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.multidevice.sync.internal.IQuickAccessOpenDocumentCallbacks");
    }

    public final void a(ParcelFileDescriptor parcelFileDescriptor0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, parcelFileDescriptor0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

