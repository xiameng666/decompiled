import android.os.Looper;
import android.os.Message;
import android.util.Log;
import j..util.Objects;

final class azwu extends clht {
    final azww a;

    public azwu(azww azww0, Looper looper0) {
        Objects.requireNonNull(azww0);
        this.a = azww0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(message0.what) {
            case 1: {
                azww azww0 = this.a;
                azww0.b.lock();
                try {
                    if(azww0.u()) {
                        azww0.s();
                    }
                }
                finally {
                    azww0.b.unlock();
                }
                return;
            }
            case 2: {
                this.a.t();
                return;
            }
            default: {
                Log.w("GoogleApiClientImpl", a.aG(message0, "Unknown message id: "));
            }
        }
    }
}

