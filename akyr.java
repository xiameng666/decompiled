import android.os.RemoteException;
import com.google.android.gms.auth.proximity.Role;

public final class akyr implements azys {
    public final String a;
    public final Role b;

    public akyr(String s, Role role0) {
        this.a = s;
        this.b = role0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        alir alir0 = (alir)object0;
        try {
            ((alim)alir0.H()).f(this.a, this.b);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
        ((evqp)object1).b(null);
    }
}

