import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j..util.Objects;
import java.util.concurrent.locks.Lock;

final class azwz extends clht {
    final azxa a;

    public azwz(azxa azxa0, Looper looper0) {
        Objects.requireNonNull(azxa0);
        this.a = azxa0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(message0.what) {
            case 1: {
                azwy azwy0 = (azwy)message0.obj;
                azxa azxa0 = this.a;
                Lock lock0 = azxa0.a;
                lock0.lock();
                if(azxa0.j != azwy0.c) {
                    lock0.unlock();
                    return;
                }
                try {
                    azwy0.a();
                }
                finally {
                    azxa0.a.unlock();
                }
                return;
            }
            case 2: {
                throw (RuntimeException)message0.obj;
            }
            default: {
                Log.w("GACStateManager", a.aG(message0, "Unknown message id: "));
            }
        }
    }
}

