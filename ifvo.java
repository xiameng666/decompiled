import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ifvo extends wbx implements IInterface {
    public ifvo(IBinder iBinder0) {
        super(iBinder0, "org.chromium.IsReadyToPayServiceCallback");
    }

    public final void a(boolean z) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(((int)z));
        this.jq(1, parcel0);
    }
}

