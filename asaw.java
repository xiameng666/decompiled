import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.RestoreData;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class asaw extends wbx implements IInterface {
    public asaw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.backup.internal.IRestoreDataCallback");
    }

    public final void a(Status status0, RestoreData restoreData0, ApiMetadata apiMetadata0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, restoreData0);
        wbz.f(parcel0, apiMetadata0);
        this.jq(1, parcel0);
    }
}

