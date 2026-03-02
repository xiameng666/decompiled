import j..util.DesugarCollections;
import java.util.Map;

public final class byft {
    private final ProtoLiteBuilder a;

    public byft(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final byfr a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (byfr)hftv0;
    }

    public final hfxv b() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((byfr)this.a.b_message).b));
        ibuq.e(map0, "getProviderRegistryMap(...)");
        return new hfxv(map0);
    }

    public final void c(String s, byfo byfo0) {
        ibuq.f(s, "key");
        ibuq.f(byfo0, "value");
        s.getClass();
        byfo0.getClass();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((byfr)hftp0.b_message).b().put(s, byfo0);
    }

    public final void d(String s) {
        ibuq.f(s, "key");
        s.getClass();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((byfr)hftp0.b_message).b().remove(s);
    }
}

