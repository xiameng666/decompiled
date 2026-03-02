import android.os.RemoteException;
import com.google.android.gms.mdocstore.DisconnectionCause;
import j..util.Objects;

final class cqzv implements azye {
    final DisconnectionCause a;
    final azyf b;
    final cqzw c;

    public cqzv(cqzw cqzw0, DisconnectionCause disconnectionCause0, azyf azyf0) {
        this.a = disconnectionCause0;
        this.b = azyf0;
        Objects.requireNonNull(cqzw0);
        this.c = cqzw0;
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cqxz cqxz0 = (cqxz)object0;
        try {
            cqxz0.a(this.a);
        }
        catch(RemoteException remoteException0) {
            craf.a.n("Triggering presentation onDisconnected callback failed.", remoteException0, new Object[0]);
        }
        azyd_linstner azyd0 = this.b.listener_;
        if(azyd0 != null) {
            this.c.b.jm(azyd0, 0x721E);
        }
    }

    @Override  // azye
    public final void b() {
    }
}

