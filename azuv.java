import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class azuv {
    public final int c;

    public azuv(int v) {
        this.c = v;
    }

    public abstract void c(Status arg1);

    public abstract void d(Exception arg1);

    public abstract void e(azxi arg1);

    public abstract void f(azwb arg1, boolean arg2);

    public static Status g(RemoteException remoteException0) {
        return new Status(19, remoteException0.getClass().getSimpleName() + ": " + remoteException0.getLocalizedMessage());
    }
}

