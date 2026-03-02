import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import j..util.Objects;

final class ffjc extends ffee {
    final RemoveListenerRequest c;
    final fdiy d;
    final fflv e;

    public ffjc(fflv fflv0, RemoveListenerRequest removeListenerRequest0, fdiy fdiy0) {
        this.c = removeListenerRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("removeListener");
    }

    @Override  // ffee
    public final void a() {
        try {
            IBinder iBinder0 = this.c.b.asBinder();
            ffls ffls0 = (ffls)this.e.b.remove(iBinder0);
            if(ffls0 != null) {
                ffls0.binderDied();
                Status status0 = new Status(0);
                this.d.a(status0);
                return;
            }
            Status status1 = new Status(4002);
            this.d.a(status1);
        }
        catch(Exception exception0) {
            Log.e("WearableService", "removeListener: exception during processing", exception0);
            Status status2 = new Status(8);
            this.d.a(status2);
        }
    }
}

