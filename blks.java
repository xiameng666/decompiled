import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

final class blks implements evpz {
    final blkt a;

    public blks(blkt blkt0) {
        Objects.requireNonNull(blkt0);
        this.a = blkt0;
        super();
    }

    @Override  // evpz
    public final void hF(evql evql0) {
        try {
            if(evql0.n()) {
                this.a.c.a(Status.b);
                return;
            }
            Exception exception0 = evql0.i();
            ((ggtj)((ggtj)((ggtj)blkt.a.i()).s(exception0)).ar(3110)).x("UpdatePasskey failed");
            Status status0 = bxma.i(exception0).a();
            this.a.c.a(status0);
        }
        catch(RemoteException unused_ex) {
        }
    }
}

