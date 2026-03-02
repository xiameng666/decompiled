import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public final class ctvb extends wbx implements IInterface {
    public ctvb(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.multidevice.sync.internal.IQuickAccessGetChildDocumentsCallbacks");
    }

    public final void a(List list0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        parcel0.writeTypedList(list0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

