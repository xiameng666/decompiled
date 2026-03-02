import j..util.DesugarCollections;
import java.util.List;

public final class hdrk {
    private final hftr a;

    public hdrk(hftr hftr0) {
        this.a = hftr0;
    }

    public final hdrl a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdrl)hftv0;
    }

    public final void b(long v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrl0.b |= 4;
        hdrl0.e = v;
    }

    public final void c(hfta hfta0, Object object0) {
        ibuq.f(hfta0, "extension");
        ibuq.f(object0, "value");
        this.a.n(hfta0, object0);
    }

    public final void d(int v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrl0.b |= 16;
        hdrl0.g = v;
    }

    public final void e(hdrw hdrw0) {
        ibuq.f(hdrw0, "value");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrw0.getClass();
        hdrl0.d = hdrw0;
        hdrl0.b |= 2;
    }

    public final void f(long v) {
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrl0.b |= 1;
        hdrl0.c = v;
    }

    public final void g(Iterable iterable0) {
        ibuq.f(iterable0, "values");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hdrl0.b();
        hfrj.E(iterable0, hdrl0.f);
    }

    public final void h(hcsi hcsi0) {
        ibuq.f(hcsi0, "value");
        hftr hftr0 = this.a;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        hdrl hdrl0 = (hdrl)hftr0.b_message;
        hcsi0.getClass();
        hdrl0.b();
        hdrl0.f.add(hcsi0);
    }

    public final void i() {
        List list0 = DesugarCollections.unmodifiableList(((hdrl)this.a.b_message).f);
        ibuq.e(list0, "getNodeTriggerList(...)");
        new hfxu(list0);
    }
}

