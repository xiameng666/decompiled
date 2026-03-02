import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import j..util.Objects;

final class eqjf extends clht {
    final eqip a;

    public eqjf(eqip eqip0, Looper looper0) {
        Objects.requireNonNull(eqip0);
        this.a = eqip0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            switch(message0.what) {
                case 0: {
                    this.a.a.d();
                    return;
                }
                case 1: {
                    this.a.a.a(((D2DDevice)message0.obj));
                    return;
                }
                case 2: {
                    this.a.a.c(((Integer)message0.obj).intValue());
                    return;
                }
                case 3: {
                    this.a.a.b(((D2DDevice)message0.obj));
                    return;
                }
                default: {
                    throw new IllegalArgumentException(a.aG(message0, "Unrecognized message: "));
                }
            }
        }
        catch(RemoteException remoteException0) {
            Log.e("SmartDevice", "Error invoking ISourceScanListener.", remoteException0);
        }
    }
}

