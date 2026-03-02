import android.os.RemoteException;
import com.google.android.gms.mdocstore.PresentationRequest;
import j..util.Objects;

final class cqzu implements azye {
    final PresentationRequest a;

    public cqzu(cqzw cqzw0, PresentationRequest presentationRequest0) {
        this.a = presentationRequest0;
        Objects.requireNonNull(cqzw0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cqxz cqxz0 = (cqxz)object0;
        try {
            cqxz0.d(this.a);
        }
        catch(RemoteException remoteException0) {
            craf.a.n("Triggering presentation onRequest callback failed.", remoteException0, new Object[0]);
        }
    }

    @Override  // azye
    public final void b() {
    }
}

