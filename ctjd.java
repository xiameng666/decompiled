import com.google.android.gms.multidevice.sync.appcast.client.ui.RemoteAppListChimeraActivity;
import java.util.Map;
import java.util.Set;

final class ctjd implements icih {
    final RemoteAppListChimeraActivity a;

    public ctjd(RemoteAppListChimeraActivity remoteAppListChimeraActivity0) {
        this.a = remoteAppListChimeraActivity0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        RemoteAppListChimeraActivity remoteAppListChimeraActivity0 = this.a;
        ctho ctho0 = (ctho)remoteAppListChimeraActivity0.h.b();
        if(ctho0 == null) {
            return ibom.a;
        }
        if(((Map)remoteAppListChimeraActivity0.j.b()).containsKey(((ctza)object0).c)) {
            return ibom.a;
        }
        Set set0 = remoteAppListChimeraActivity0.f;
        if(set0.contains(((ctza)object0).c)) {
            return ibom.a;
        }
        String s = ((ctza)object0).c;
        ibuq.e(s, "getPackageName(...)");
        set0.add(s);
        icbb.b(lpt.a(remoteAppListChimeraActivity0), null, null, new ctjc(ctho0, ((ctza)object0), remoteAppListChimeraActivity0, null), 3);
        return ibom.a;
    }
}

