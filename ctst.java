import com.google.android.gms.dtdi.core.ConnectionCapabilities;

public final class ctst implements bhzm {
    final cttb a;

    public ctst(cttb cttb0) {
        this.a = cttb0;
        super();
    }

    @Override  // bhzm
    public final void a(ConnectionCapabilities connectionCapabilities0) {
        ibuq.f(connectionCapabilities0, "capabilities");
        if(connectionCapabilities0.a == 2) {
            ((ggtj)this.a.b.h()).x("onConnectionCapabilitiesChanged to HIGH quality");
        }
    }
}

