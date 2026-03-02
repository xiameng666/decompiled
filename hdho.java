import j..util.DesugarCollections;
import java.util.List;

public final class hdho {
    public final hdhp a;

    public hdho(hdhp hdhp0) {
        this.a = hdhp0;
    }

    public final hdhq a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdhq)hftv0;
    }

    public final void b() {
        List list0 = DesugarCollections.unmodifiableList(((hdhq)this.a.b_message).b);
        ibuq.e(list0, "getGroupedDataReferenceList(...)");
        new hfxu(list0);
    }
}

