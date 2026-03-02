import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.safebrowsing.SafeBrowsingResponse;

public final class ekna extends wbx implements IInterface {
    public ekna(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.safebrowsing.internal.ISafeBrowsingCallbacks");
    }

    public final void a(SafeBrowsingResponse safeBrowsingResponse0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, safeBrowsingResponse0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

