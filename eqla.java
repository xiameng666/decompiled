import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.GetServiceRequest;
import j..util.Objects;

final class eqla extends clil {
    final evqp a;
    final eqle b;

    public eqla(eqle eqle0, evqp evqp0) {
        this.a = evqp0;
        Objects.requireNonNull(eqle0);
        this.b = eqle0;
        super("smartdevice");
    }

    @Override  // clil
    public final void a(ComponentName componentName0, IBinder iBinder0) {
        GetServiceRequest getServiceRequest0 = new GetServiceRequest(bbcu.aO.a());
        eqle eqle0 = this.b;
        getServiceRequest0.f = "com.google.android.gms";
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        bask bask0 = iInterface0 != null && (iInterface0 instanceof bask) ? ((bask)iInterface0) : new basi(iBinder0);
        evqp evqp0 = this.a;
        eqle0.d = bask0;
        bask bask1 = eqle0.d;
        if(bask1 != null) {
            try {
                bask1.a(new eqld(eqle0.c, eqle0), getServiceRequest0);
            }
            catch(RemoteException remoteException0) {
                eqle.a.l(remoteException0);
                evqp0.d(remoteException0);
            }
            return;
        }
        evqp0.d(new IllegalStateException("Service broker is null"));
    }

    @Override  // clil
    public final void b(ComponentName componentName0) {
        eqle.a.j("service disconnected %s", new Object[]{componentName0});
    }
}

