import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import j..util.Objects;

final class ffjb extends ffee {
    final AddListenerRequest c;
    final boolean d;
    final fdiy e;
    final fflv f;

    public ffjb(fflv fflv0, AddListenerRequest addListenerRequest0, boolean z, fdiy fdiy0) {
        this.c = addListenerRequest0;
        this.d = z;
        this.e = fdiy0;
        Objects.requireNonNull(fflv0);
        this.f = fflv0;
        super("addListener");
    }

    @Override  // ffee
    public final void a() {
        try {
            AddListenerRequest addListenerRequest0 = this.c;
            fdjb fdjb0 = addListenerRequest0.a;
            IBinder iBinder0 = fdjb0.asBinder();
            String s = addListenerRequest0.c;
            if(s != null) {
                fdrq.a(this.f.e, s);
            }
            ffls ffls0 = new ffls(this.f, fdjb0, addListenerRequest0.b, s, this.d, addListenerRequest0.d);
            if(this.f.b.putIfAbsent(iBinder0, ffls0) != null) {
                Log.w("WearableService", "addListener: Duplicate listener for " + this.c);
                Status status0 = new Status(4001);
                this.e.a(status0);
                return;
            }
            if(Log.isLoggable("WearableService", 3)) {
                Log.d("WearableService", a.ab(ffls0, "addListener: Added record "));
            }
            try {
                iBinder0.linkToDeath(ffls0, 0);
                Status status1 = new Status(0);
                this.e.a(status1);
            }
            catch(RemoteException remoteException0) {
                Log.w("WearableService", "addListener: Exception for " + this.c, remoteException0);
                ffls0.binderDied();
                Status status2 = new Status(13);
                this.e.a(status2);
            }
        }
        catch(Exception exception0) {
            Log.e("WearableService", "addListener: exception during processing", exception0);
            Status status3 = new Status(8);
            this.e.a(status3);
        }
    }
}

