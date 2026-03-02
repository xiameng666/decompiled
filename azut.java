import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

public final class azut extends azup {
    private final azzd a;
    private final evqp b;
    private final azyx d;

    public azut(int v, azzd azzd0, evqp evqp0, azyx azyx0) {
        super(v);
        this.b = evqp0;
        this.a = azzd0;
        this.d = azyx0;
        if(v == 2 && azzd0.g) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override  // azup
    public final Feature[] a(azxi azxi0) {
        return this.a.f();
    }

    @Override  // azuv
    public final void c(Status status0) {
        Exception exception0 = this.d.a(status0);
        this.b.d(exception0);
    }

    @Override  // azuv
    public final void d(Exception exception0) {
        this.b.d(exception0);
    }

    @Override  // azuv
    public final void e(azxi azxi0) {
        try {
            this.a.a(azxi0.b, this.b);
        }
        catch(DeadObjectException deadObjectException0) {
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
    public final void f(azwb azwb0, boolean z) {
        azwb0.b.put(this.b, Boolean.valueOf(z));
        azwa azwa0 = new azwa(azwb0, this.b);
        this.b.a.z(azwa0);
    }
}

