import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

public final class gpci extends wbx implements IInterface {
    public gpci(IBinder iBinder0) {
        super(iBinder0, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public final void a(Status status0, ShortDynamicLinkImpl shortDynamicLinkImpl0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, shortDynamicLinkImpl0);
        this.jq(2, parcel0);
    }

    public final void b(Status status0, DynamicLinkData dynamicLinkData0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, dynamicLinkData0);
        this.jq(1, parcel0);
    }
}

