import j..util.DesugarCollections;
import java.util.Map;

public final class ctem {
    public final ProtoLiteBuilder a;

    public ctem(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ctek a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ctek)hftv0;
    }

    public final void b() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ctek)this.a.b_message).b));
        ibuq.e(map0, "getDevicesDataMap(...)");
        new hfxv(map0);
    }
}

