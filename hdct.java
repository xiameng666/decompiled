import j..util.DesugarCollections;
import java.util.List;

public final class hdct {
    private final hddk a;

    public hdct(hddk hddk0) {
        this.a = hddk0;
    }

    public final hddl a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hddl)hftv0;
    }

    public final void b(long v) {
        this.a.a(v);
    }

    public final void c() {
        List list0 = DesugarCollections.unmodifiableList(((hddl)this.a.b_message).c);
        ibuq.e(list0, "getSecureDataReferencesToSubmitList(...)");
        new hfxu(list0);
    }
}

