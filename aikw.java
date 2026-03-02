import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j..util.Objects;

final class aikw extends clil {
    final aiky a;

    public aikw(aiky aiky0) {
        Objects.requireNonNull(aiky0);
        this.a = aiky0;
        super("auth_authzen");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ajpf ajpf0;
        if(iBinder0 == null) {
            ajpf0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.firstparty.devicesignals.IDeviceSignalsService");
            ajpf0 = (iInterface0 instanceof ajpf) ? ((ajpf)iInterface0) : new ajpd(iBinder0);
        }
        try {
            long v = ajpf0.a();
            aiky aiky0 = this.a;
            if(v > 0L && aiky0.d - v < aiky0.b.k) {
                aiky0.c(false);
            }
        }
        catch(RemoteException unused_ex) {
        }
        this.a.d();
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
    }
}

