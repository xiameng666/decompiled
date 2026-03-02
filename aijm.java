import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class aijm extends wbx implements IInterface {
    public aijm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.authzen.internal.IBundleCallback");
    }

    public final void a(Bundle bundle0) {
        Parcel parcel0 = this.jo();
        wbz.f(parcel0, bundle0);
        this.jq(1, parcel0);
    }
}

