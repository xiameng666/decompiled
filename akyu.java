import android.os.RemoteException;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;

public final class akyu implements azys {
    public final RemoteDevice a;
    public final Role b;

    public akyu(RemoteDevice remoteDevice0, Role role0) {
        this.a = remoteDevice0;
        this.b = role0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        alir alir0 = (alir)object0;
        try {
            ((alim)alir0.H()).d(this.a, this.b);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
        ((evqp)object1).b(null);
    }
}

