import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class fdir extends wbx implements IInterface {
    public fdir(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.wearable.internal.IChannelStreamCallbacks");
    }

    public final void a(int v, int v1) {
        Parcel parcel0 = this.jo();
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        this.jp(2, parcel0);
    }
}

