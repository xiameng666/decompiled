import android.os.RemoteException;
import com.google.android.gms.auth.proximity.Role;
import java.util.List;

public final class akyx implements azys {
    public final Role a;

    public akyx(Role role0) {
        this.a = role0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        List list0;
        alir alir0 = (alir)object0;
        try {
            list0 = ((alim)alir0.H()).a(this.a);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
        ((evqp)object1).b(list0);
    }
}

