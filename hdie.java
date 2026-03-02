import j..util.DesugarCollections;
import java.util.List;

public final class hdie {
    public final ProtoLiteBuilder a;

    public hdie(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdil a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdil)hftv0;
    }

    public final void b(String s) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdil hdil0 = (hdil)hftp0.b_message;
        hdil0.b |= 1;
        hdil0.e = s;
    }

    public final void c(Iterable iterable0) {
        ibuq.f(iterable0, "values");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdil hdil0 = (hdil)hftp0.b_message;
        hdil0.b();
        hfrj.E(iterable0, hdil0.f);
    }

    public final void d() {
        List list0 = DesugarCollections.unmodifiableList(((hdil)this.a.b_message).f);
        ibuq.e(list0, "getConditionalSourceList(...)");
        new hfxu(list0);
    }
}

