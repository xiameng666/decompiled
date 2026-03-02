import j..util.DesugarCollections;
import java.util.List;

public final class hcqu {
    private final hftr a;

    public hcqu(hftr hftr0) {
        this.a = hftr0;
    }

    public final hcqv a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcqv)hftv0;
    }

    public final void b(int v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcqv hcqv0 = (hcqv)hftr0.b_message;
        hcqv0.b |= 2;
        hcqv0.e = v;
    }

    public final void c(hfta hfta0, Object object0) {
        ibuq.f(hfta0, "extension");
        ibuq.f(object0, "value");
        this.a.n(hfta0, object0);
    }

    public final void d(long v) {
        this.a.r(v);
    }

    public final void e() {
        List list0 = DesugarCollections.unmodifiableList(((hcqv)this.a.b_message).c);
        ibuq.e(list0, "getEventRuleIdList(...)");
        new hfxu(list0);
    }
}

