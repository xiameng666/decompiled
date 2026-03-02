import android.content.IntentFilter;
import com.google.android.gms.nearby.sharing.common.repository.RadioStatusRepository.radioChangeEvents.3.receiver.1;

final class dcxx extends ibsl implements ibtw {
    int a;
    final dcyu b;
    private Object c;

    public dcxx(dcyu dcyu0, ibrl ibrl0) {
        this.b = dcyu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((dcxx)this.c(((ichm)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new dcxx(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            ichm ichm0 = (ichm)this.c;
            RadioStatusRepository.radioChangeEvents.3.receiver.1 radioStatusRepository$radioChangeEvents$3$receiver$10 = new RadioStatusRepository.radioChangeEvents.3.receiver.1(ichm0);
            IntentFilter intentFilter0 = new IntentFilter();
            intentFilter0.addAction("android.location.MODE_CHANGED");
            intentFilter0.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter0.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter0.addAction("android.intent.action.AIRPLANE_MODE");
            intentFilter0.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
            jwe.b(this.b.a, radioStatusRepository$radioChangeEvents$3$receiver$10, intentFilter0, 2);
            dcxw dcxw0 = new dcxw(this.b, radioStatusRepository$radioChangeEvents$3$receiver$10);
            this.a = 1;
            if(ichl.b(ichm0, dcxw0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

