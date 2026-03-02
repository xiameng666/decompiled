import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import j..util.Objects;

public final class equj extends clil {
    final eqvw a;
    public final equm b;

    public equj(equm equm0, eqvw eqvw0) {
        this.a = eqvw0;
        Objects.requireNonNull(equm0);
        this.b = equm0;
        super("SmartDevice");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        eqxa eqxa0;
        if(iBinder0 == null) {
            eqxa0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartService");
            eqxa0 = (iInterface0 instanceof eqxa) ? ((eqxa)iInterface0) : new eqwy(iBinder0);
        }
        this.b.d = eqxa0;
        eqxa eqxa1 = this.b.d;
        if(eqxa1 != null) {
            try {
                eqxa1.h(new eqxc(this, this.a));
            }
            catch(RemoteException remoteException0) {
                equm.a.l(remoteException0);
            }
            return;
        }
        equm.a.f("Failed to start service", new Object[0]);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
    }
}

