import android.os.IBinder;
import android.os.IInterface;

public final class bt implements IInterface {
    public final IBinder a;

    public bt(IBinder iBinder0) {
        this.a = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}

