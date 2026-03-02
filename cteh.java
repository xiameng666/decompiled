import j..util.DesugarCollections;
import java.util.Map;

public final class cteh {
    public final ProtoLiteBuilder a;

    public cteh(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final ctef a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ctef)hftv0;
    }

    public final hfxv b() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ctef)this.a.b_message).e));
        ibuq.e(map0, "getEmailGaiaMapMap(...)");
        return new hfxv(map0);
    }

    public final hfxv c() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(new hfun(((ctef)this.a.b_message).c, ctef.g)));
        ibuq.e(map0, "getEmailOptInStatusMap(...)");
        return new hfxv(map0);
    }

    public final void d(ctec ctec0) {
        ibuq.f(ctec0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ctef ctef0 = (ctef)hftp0.b_message;
        ctef0.b = ctec0.a();
    }

    public final void e(String s, ctee ctee0) {
        ibuq.f(s, "key");
        ibuq.f(ctee0, "value");
        s.getClass();
        ctee0.getClass();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        new hfun(((ctef)hftp0.b_message).c(), ctef.g).put(s, ctee0);
    }

    public final void f(int v, cteb cteb0) {
        ibuq.f(cteb0, "value");
        cteb0.getClass();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        new hfun(((ctef)hftp0.b_message).d(), ctef.h).put(Integer.valueOf(v), cteb0);
    }

    public final void g(String s) {
        ibuq.f(s, "key");
        s.getClass();
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        new hfun(((ctef)hftp0.b_message).c(), ctef.g).remove(s);
    }

    public final void h() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(new hfun(((ctef)this.a.b_message).d, ctef.h)));
        ibuq.e(map0, "getFeatureSettingDataMap(...)");
        new hfxv(map0);
    }
}

