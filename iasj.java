import android.os.Parcel;
import java.util.logging.Level;

public final class iasj implements Runnable {
    public final iask a;
    public final int b;
    public final Parcel c;

    public iasj(iask iask0, int v, Parcel parcel0) {
        this.a = iask0;
        this.b = v;
        this.c = parcel0;
    }

    @Override
    public final void run() {
        try {
            if(!this.a.c(this.b, this.c)) {
                iasm.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
            }
        }
        catch(Exception exception0) {
            iasm.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", exception0);
        }
    }
}

