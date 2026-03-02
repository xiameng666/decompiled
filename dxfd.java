import j..util.DesugarCollections;
import java.util.Map;

public final class dxfd {
    public final ProtoLiteBuilder a;

    public dxfd(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final dxfb a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (dxfb)hftv0;
    }

    public final void b() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((dxfb)this.a.b_message).b));
        ibuq.e(map0, "getTokenizeTipStatusesMap(...)");
        new hfxv(map0);
    }
}

