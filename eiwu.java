import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.play.integrity.api.DisplayListenerData;

public final class eiwu extends wbx implements IInterface {
    public eiwu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.play.integrity.api.internal.IIntegrityApiDisplayListenerCallbacks");
    }

    public final void a(Status status0, DisplayListenerData displayListenerData0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, displayListenerData0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

