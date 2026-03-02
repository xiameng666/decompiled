import j..util.DesugarCollections;
import java.util.Map;

public final class hdun {
    private final hdup a;

    public hdun(hdup hdup0) {
        this.a = hdup0;
    }

    public final hdus a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdus)hftv0;
    }

    public final void b(hdrw hdrw0) {
        ibuq.f(hdrw0, "value");
        this.a.a(hdrw0);
    }

    public final void c() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((hdus)this.a.b_message).b));
        ibuq.e(map0, "getPropertiesMap(...)");
        new hfxv(map0);
    }
}

