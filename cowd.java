import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.internal.LockboxSignedInStatus;

public final class cowd implements azys {
    @Override  // azys
    public final void d(Object object0, Object object1) {
        LockboxSignedInStatus lockboxSignedInStatus0;
        cowf cowf0 = (cowf)object0;
        Status status0 = Status.b;
        try {
            lockboxSignedInStatus0 = ((cowb)cowf0.H()).a();
        }
        catch(RemoteException unused_ex) {
            status0 = Status.d;
            lockboxSignedInStatus0 = null;
        }
        azzf.b(status0, new azui(new cowe(status0, lockboxSignedInStatus0)), ((evqp)object1));
    }
}

