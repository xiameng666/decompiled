import android.content.ComponentName;
import android.os.IBinder;
import android.os.RemoteException;

public final class etkv extends clil {
    final etlf a;
    final String b;
    final evqp c;

    public etkv(etlf etlf0, String s, evqp evqp0) {
        this.a = etlf0;
        this.b = s;
        this.c = evqp0;
        super("tapandpay");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        ibuq.f(componentName0, "componentName");
        ibuq.f(iBinder0, "iBinder");
        evqp evqp0 = this.c;
        try {
            etig etig0 = new etig(this.a.e, evqp0);
            this.a.e.a.b(this.b, etig0);
        }
        catch(RemoteException remoteException0) {
            evqp0.d(remoteException0);
        }
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        ibuq.f(componentName0, "componentName");
    }
}

