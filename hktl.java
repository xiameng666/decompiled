import j..util.DesugarCollections;
import java.util.List;

public final class hktl {
    private final ProtoLiteBuilder a;

    public hktl(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hkte a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hkte)hftv0;
    }

    public final void b(Iterable iterable0) {
        ibuq.f(iterable0, "values");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkte hkte0 = (hkte)hftp0.b_message;
        hkte0.b();
        hfrj.E(iterable0, hkte0.b);
    }

    public final void c(ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hkte hkte0 = (hkte)hftp0.b_message;
        hkte0.b();
        hkte0.b.add(hfsf0);
    }

    public final void d() {
        List list0 = DesugarCollections.unmodifiableList(((hkte)this.a.b_message).b);
        ibuq.e(list0, "getApduList(...)");
        new hfxu(list0);
    }
}

