import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public final class acbn extends wbx implements IInterface {
    public acbn(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.appinvite.internal.IAppInviteCallbacks");
    }

    public final void a(Status status0, Intent intent0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        wbz.f(parcel0, intent0);
        this.jp(2, parcel0);
    }

    public final void b(Status status0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, status0);
        this.jp(1, parcel0);
    }
}

