import com.google.android.gms.dtdi.core.ConnectionCapabilities;

public final class ctrn implements bhzm {
    final ctrq a;

    public ctrn(ctrq ctrq0) {
        this.a = ctrq0;
        super();
    }

    @Override  // bhzm
    public final void a(ConnectionCapabilities connectionCapabilities0) {
        ibuq.f(connectionCapabilities0, "capabilities");
        if(connectionCapabilities0.a == 2) {
            ctrq ctrq0 = this.a;
            ((ggtj)ctrq0.d.h()).x("onConnectionCapabilitiesChanged to HIGH quality");
            do {
                Object object0 = ctrq0.k.b();
                ctow ctow0 = (ctow)object0;
            }
            while(!ctrq0.k.h(object0, ctor.a));
        }
    }
}

