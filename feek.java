import android.os.Message;
import android.util.Log;
import j..util.Objects;

final class feek extends fefk {
    final feeq a;

    public feek(feeq feeq0) {
        Objects.requireNonNull(feeq0);
        this.a = feeq0;
        super();
    }

    @Override  // fefk
    public final String a() {
        return "ConnectingState";
    }

    @Override  // fefk
    public final void b() {
        this.a.x(1);
    }

    @Override  // fefk
    public final boolean d(Message message0) {
        switch(message0.what) {
            case 1: {
                feeq.k("onServiceChanged() Connection Model enabled, transitioning to Connected State.");
                this.a.B(this.a.n);
                return true;
            }
            case 2: {
                if(message0.arg1 == 10) {
                    this.a.B(this.a.o);
                    return true;
                }
                return true;
            }
            case 3: {
                feeq feeq0 = this.a;
                if(!((fczq)feeq0.g.get()).f) {
                    feeq0.B(feeq0.o);
                    return true;
                }
                return true;
            }
            case 10: {
                Log.e("BleConnectionManager", "Unexpected Services Discovered in Connecting w/ OnServiceChangedModel. Disconnecting.");
                this.a.B(this.a.o);
                return true;
            }
            default: {
                return this.a.i(message0);
            }
        }
    }
}

