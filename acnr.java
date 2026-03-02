import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appusage.AppUsageIntervals;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class acnr extends wbx implements IInterface {
    public acnr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.appusage.internal.IAppUsageCallbacks");
    }

    public final void a(Status status0, List list0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeTypedList(list0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(2, parcel0);
    }

    public final void b(Status status0, AppUsageIntervals appUsageIntervals0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, appUsageIntervals0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(3, parcel0);
    }
}

