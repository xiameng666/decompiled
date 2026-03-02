import j..util.DesugarCollections;
import java.util.List;

public final class hcsh {
    public final hftr a;

    public hcsh(hftr hftr0) {
        this.a = hftr0;
    }

    public final hcsi a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hcsi)hftv0;
    }

    public final void b(hfta hfta0, Object object0) {
        ibuq.f(hfta0, "extension");
        ibuq.f(object0, "value");
        this.a.n(hfta0, object0);
    }

    public final void c(int v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hcsi hcsi0 = (hcsi)hftr0.b_message;
        hcsi0.b |= 1;
        hcsi0.d = v;
    }

    public final void d(long v) {
        this.a.dl(v);
    }

    public final void e() {
        List list0 = DesugarCollections.unmodifiableList(((hcsi)this.a.b_message).c);
        ibuq.e(list0, "getEventRuleIdList(...)");
        new hfxu(list0);
    }
}

