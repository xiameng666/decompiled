import android.os.RemoteException;
import com.google.android.gms.auth.proximity.WireMessageParams;

public final class akys implements azys {
    public final WireMessageParams a;

    public akys(WireMessageParams wireMessageParams0) {
        this.a = wireMessageParams0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        alir alir0 = (alir)object0;
        try {
            ((alim)alir0.H()).g(this.a);
        }
        catch(RemoteException remoteException0) {
            throw new RuntimeException(remoteException0);
        }
        ((evqp)object1).b(null);
    }
}

