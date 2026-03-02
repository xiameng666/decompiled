import j..util.DesugarCollections;
import java.util.Map;

public final class byfx {
    public final ProtoLiteBuilder a;

    public byfx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final byfo a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (byfo)hftv0;
    }

    public final hfxv b() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((byfo)this.a.b_message).e));
        ibuq.e(map0, "getProtocolsBasedEntryMap(...)");
        return new hfxv(map0);
    }

    public final void c(String s) {
        ibuq.f(s, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        byfo byfo0 = (byfo)hftp0.b_message;
        s.getClass();
        byfo0.b |= 1;
        byfo0.c = s;
    }

    public final void d() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((byfo)this.a.b_message).d));
        ibuq.e(map0, "getEntryMap(...)");
        new hfxv(map0);
    }

    public final void e(String s, byfl byfl0) {
        ibuq.f(s, "key");
        ibuq.f(byfl0, "value");
        s.getClass();
        byfl0.getClass();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((byfo)hftp0.b_message).c().put(s, byfl0);
    }

    public final void f(String s) {
        ibuq.f(s, "key");
        s.getClass();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((byfo)hftp0.b_message).c().remove(s);
    }
}

