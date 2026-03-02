import android.os.IBinder;
import android.os.IInterface;

final class jty implements IInterface {
    public final IBinder a;

    public jty(IBinder iBinder0) {
        this.a = iBinder0;
    }

    @Override  // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}

