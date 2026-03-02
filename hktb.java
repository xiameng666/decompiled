import j..util.DesugarCollections;
import java.util.List;

public final class hktb {
    public final ProtoLiteBuilder a;

    public hktb(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hksz a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hksz)hftv0;
    }

    public final void b(hktf hktf0) {
        ibuq.f(hktf0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hksz hksz0 = (hksz)hftp0.b_message;
        hktf0.getClass();
        hksz0.b();
        hksz0.c.add(hktf0);
    }

    public final void c() {
        List list0 = DesugarCollections.unmodifiableList(((hksz)this.a.b_message).c);
        ibuq.e(list0, "getOperationsList(...)");
        new hfxu(list0);
    }
}

