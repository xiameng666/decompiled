import j..util.DesugarCollections;
import java.util.Map;

public final class byfv {
    public final ProtoLiteBuilder a;

    public byfv(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final byfl a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (byfl)hftv0;
    }

    public final hfxv b() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((byfl)this.a.b_message).b));
        ibuq.e(map0, "getIdToEntryMap(...)");
        return new hfxv(map0);
    }

    public final hfxv c() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((byfl)this.a.b_message).c));
        ibuq.e(map0, "getProtocolToIdMap(...)");
        return new hfxv(map0);
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((byfl)hftp0.b_message).b().remove(Integer.valueOf(v));
    }
}

