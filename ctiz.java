import com.google.android.gms.multidevice.sync.appcast.client.ui.RemoteAppListChimeraActivity;
import java.util.Set;

final class ctiz implements icih {
    final RemoteAppListChimeraActivity a;

    public ctiz(RemoteAppListChimeraActivity remoteAppListChimeraActivity0) {
        this.a = remoteAppListChimeraActivity0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        RemoteAppListChimeraActivity remoteAppListChimeraActivity0 = this.a;
        icnl icnl0 = remoteAppListChimeraActivity0.h;
        ctho ctho0 = (ctho)icnl0.b();
        if(((Set)object0).isEmpty()) {
            icnl icnl1 = remoteAppListChimeraActivity0.i;
            do {
                Object object1 = icnl1.b();
                String s = (String)object1;
            }
            while(!icnl1.h(object1, null));
            do {
                Object object2 = icnl0.b();
                ctho ctho1 = (ctho)object2;
            }
            while(!icnl0.h(object2, null));
            return ibom.a;
        }
        if(ctho0 == null || !((Set)object0).contains(ctho0)) {
            icnl icnl2 = remoteAppListChimeraActivity0.i;
            do {
                Object object3 = icnl2.b();
                String s1 = (String)object3;
            }
            while(!icnl2.h(object3, null));
            do {
                Object object4 = icnl0.b();
                ctho ctho2 = (ctho)object4;
            }
            while(!icnl0.h(object4, ((ctho)ibpo.S(((Set)object0)))));
        }
        return ibom.a;
    }
}

