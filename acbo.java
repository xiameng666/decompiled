import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

public final class acbo extends wbx implements IInterface {
    public acbo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.appinvite.internal.IAppInviteInternalCallbacks");
    }

    public final void a(Status status0, List list0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeStringList(list0);
        this.jq(1, parcel0);
    }

    public final void b(Status status0, List list0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        parcel0.writeList(list0);
        this.jq(2, parcel0);
    }
}

