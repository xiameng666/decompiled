import com.google.android.gms.multidevice.sync.appcast.client.ui.AppCastChimeraActivity;
import java.util.Iterator;
import java.util.Set;

final class ctik implements icih {
    final AppCastChimeraActivity a;

    public ctik(AppCastChimeraActivity appCastChimeraActivity0) {
        this.a = appCastChimeraActivity0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        Object object1;
        AppCastChimeraActivity appCastChimeraActivity0;
        Iterator iterator0 = ((Set)object0).iterator();
        do {
            appCastChimeraActivity0 = this.a;
            if(!iterator0.hasNext()) {
                goto label_6;
            }
            object1 = iterator0.next();
        }
        while(!ibuq.m(((ctho)object1).c(), appCastChimeraActivity0.getIntent().getStringExtra("deviceId")));
        goto label_7;
    label_6:
        object1 = null;
    label_7:
        icnl icnl0 = appCastChimeraActivity0.g;
        do {
            Object object2 = icnl0.b();
            ctho ctho0 = (ctho)object2;
        }
        while(!icnl0.h(object2, ((ctho)object1)));
        if(((ctho)object1) != null) {
            appCastChimeraActivity0.setTitle(((ctho)object1).b());
            return ibom.a;
        }
        ((ggtj)appCastChimeraActivity0.e.h()).x("Device not found");
        return ibom.a;
    }
}

