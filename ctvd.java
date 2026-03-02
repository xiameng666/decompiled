import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class ctvd extends wbx implements IInterface {
    public ctvd(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.multidevice.sync.internal.IQuickAccessGetThumbnailCallbacks");
    }

    public final void a(Bitmap bitmap0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, bitmap0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

