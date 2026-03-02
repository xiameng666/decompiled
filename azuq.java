import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

abstract class azuq extends azup {
    protected final evqp a;

    public azuq(int v, evqp evqp0) {
        super(v);
        this.a = evqp0;
    }

    protected abstract void b(azxi arg1);

    @Override  // azuv
    public final void c(Status status0) {
        aztb aztb0 = new aztb(status0);
        this.a.d(aztb0);
    }

    @Override  // azuv
    public final void d(Exception exception0) {
        this.a.d(exception0);
    }

    @Override  // azuv
    public final void e(azxi azxi0) {
        try {
            this.b(azxi0);
        }
        catch(DeadObjectException deadObjectException0) {
            this.c(azuv.g(deadObjectException0));
            throw deadObjectException0;
        }
        catch(RemoteException remoteException0) {
            this.c(azuv.g(remoteException0));
        }
        catch(RuntimeException runtimeException0) {
            this.d(runtimeException0);
        }
    }

    @Override  // azuv
    public void f(azwb azwb0, boolean z) {
    }
}

