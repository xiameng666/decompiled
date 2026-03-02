import j..util.DesugarCollections;
import java.util.List;

public final class hcry {
    public final hftr a;

    public hcry(hftr hftr0) {
        this.a = hftr0;
    }

    public final hcrz a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcrz)hftv0;
    }

    public final void b(hfta hfta0, Object object0) {
        ibuq.f(hfta0, "extension");
        ibuq.f(object0, "value");
        this.a.n(hfta0, object0);
    }

    public final void c(long v) {
        this.a.t(v);
    }

    public final void d() {
        List list0 = DesugarCollections.unmodifiableList(((hcrz)this.a.b_message).c);
        ibuq.e(list0, "getEventRuleIdList(...)");
        new hfxu(list0);
    }
}

