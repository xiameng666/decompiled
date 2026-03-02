import android.os.RemoteException;
import j..util.Objects;

final class cqzt implements azye {
    final String a;

    public cqzt(cqzw cqzw0, String s) {
        this.a = s;
        Objects.requireNonNull(cqzw0);
        super();
    }

    @Override  // azye
    public final void a(Object object0) {
        cqxz cqxz0 = (cqxz)object0;
        try {
            cqxz0.c(this.a);
        }
        catch(RemoteException remoteException0) {
            craf.a.n("Triggering presentation onQrCodeReady callback failed.", remoteException0, new Object[0]);
        }
    }

    @Override  // azye
    public final void b() {
    }
}

