import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import j..util.Objects;

public final class equk extends clil {
    final eqvw a;
    final String b;
    final String c;
    final Bundle d;
    public final equm e;

    public equk(equm equm0, eqvw eqvw0, String s, String s1, Bundle bundle0) {
        this.a = eqvw0;
        this.b = s;
        this.c = s1;
        this.d = bundle0;
        Objects.requireNonNull(equm0);
        this.e = equm0;
        super("SmartDevice");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        eqxa eqxa0;
        baun baun0 = equm.a;
        baun0.d("doServiceConnected", new Object[0]);
        if(iBinder0 == null) {
            eqxa0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.smartdevice.quickstart.ITargetQuickStartService");
            eqxa0 = (iInterface0 instanceof eqxa) ? ((eqxa)iInterface0) : new eqwy(iBinder0);
        }
        equm equm0 = this.e;
        equm0.d = eqxa0;
        eqxa eqxa1 = equm0.d;
        if(eqxa1 != null) {
            try {
                eqxa1.i(new eqxf(this, this.a, this.b, this.c), this.b, this.c, this.d);
            }
            catch(RemoteException remoteException0) {
                equm.a.l(remoteException0);
                Status status0 = new Status(19);
                StartServiceResponse startServiceResponse0 = new StartServiceResponse(0);
                this.e.d(this.a, this.b, this.c, status0, startServiceResponse0);
            }
            return;
        }
        baun0.f("Failed to start service", new Object[0]);
        StartServiceResponse startServiceResponse1 = new StartServiceResponse(3);
        equm0.d(this.a, this.b, this.c, Status.b, startServiceResponse1);
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        equm.a.j("service disconnected %s", new Object[]{componentName0});
    }
}

