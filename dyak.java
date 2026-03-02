import j..util.DesugarCollections;
import java.util.Map;

public final class dyak implements ibts {
    public final String a;
    public final ftix b;

    public dyak(String s, ftix ftix0) {
        this.a = s;
        this.b = ftix0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((fter)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((fter)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((fter)object0))));
        ibuq.f(hftp0, "builder");
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((fter)hftp0.b_message).b));
        ibuq.e(map0, "getLastTopupSettingsMap(...)");
        new hfxv(map0);
        String s = this.a;
        ibuq.f(s, "key");
        ftix ftix0 = this.b;
        ibuq.f(ftix0, "value");
        s.getClass();
        ftix0.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        fter fter0 = (fter)hftp0.b_message;
        hfvh hfvh0 = fter0.b;
        if(!hfvh0.b) {
            fter0.b = hfvh0.a();
        }
        fter0.b.put(s, ftix0);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (fter)hftv0;
    }
}

