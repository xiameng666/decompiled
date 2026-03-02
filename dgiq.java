import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.gms.nearby.sharing.provider.impl.postprocess.PackageInstallMonitor.start.result.1.1.1;

final class dgiq extends ibsl implements ibtw {
    int a;
    final ibvd b;
    final dgir c;

    public dgiq(ibvd ibvd0, dgir dgir0, ibrl ibrl0) {
        this.b = ibvd0;
        this.c = dgir0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dgiq)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new dgiq(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            this.a = 1;
            icbk icbk0 = new icbk(ibsc.c(this), 1);
            icbk0.z();
            this.b.a = new PackageInstallMonitor.start.result.1.1.1(this.c, icbk0);
            BroadcastReceiver broadcastReceiver0 = (BroadcastReceiver)this.b.a;
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter0.addDataScheme("package");
            cutr.b(this.c.a, broadcastReceiver0, intentFilter0);
            Object object2 = icbk0.k();
            if(object2 == object1) {
                ibsi.b(this);
            }
            if(object2 == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

