import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class aijl extends wbx implements IInterface {
    public aijl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.auth.authzen.internal.IBooleanCallback");
    }

    public final void a(boolean z) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(((int)z));
        this.jq(1, parcel0);
    }
}

