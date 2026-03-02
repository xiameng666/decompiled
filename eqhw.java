import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import j..util.Objects;
import java.util.List;

final class eqhw extends clht {
    final eqhz a;

    public eqhw(eqhz eqhz0, Looper looper0) {
        Objects.requireNonNull(eqhz0);
        this.a = eqhz0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        try {
            switch(message0.what) {
                case 0: {
                    this.a.a.e(((List)message0.obj));
                    return;
                }
                case 1: {
                    this.a.a.g(((PendingIntent)message0.obj));
                    return;
                }
                case 2: {
                    this.a.a.f(message0.arg1, ((String)message0.obj));
                    return;
                }
                default: {
                    throw new IllegalArgumentException(a.aG(message0, "Unrecognized message: "));
                }
            }
        }
        catch(RemoteException remoteException0) {
            Log.e("DirectTransferLisHand", "Error invoking ISourceBootstrapListener.", remoteException0);
        }
    }
}

