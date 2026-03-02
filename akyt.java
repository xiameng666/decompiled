import android.os.RemoteException;
import com.google.android.gms.auth.proximity.FileParams;

public final class akyt implements azys {
    public final FileParams a;

    public akyt(FileParams fileParams0) {
        this.a = fileParams0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        alir alir0 = (alir)object0;
        try {
            ((alim)alir0.H()).e(this.a);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
        ((evqp)object1).b(null);
    }
}

