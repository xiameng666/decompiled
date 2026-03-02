import j..util.DesugarCollections;
import java.util.List;

public final class gkbl {
    public final ProtoLiteBuilder a;

    public gkbl(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gkbn a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkbn)hftv0;
    }

    public final void b(gkbm gkbm0) {
        ibuq.f(gkbm0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbn gkbn0 = (gkbn)hftp0.b_message;
        gkbn0.d = gkbm0.a();
        gkbn0.b |= 1;
    }

    public final void c(Iterable iterable0) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkbn gkbn0 = (gkbn)hftp0.b_message;
        hfuo hfuo0 = gkbn0.c;
        if(!hfuo0.c()) {
            gkbn0.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gkbn0.c);
    }

    public final void d() {
        List list0 = DesugarCollections.unmodifiableList(((gkbn)this.a.b_message).c);
        ibuq.e(list0, "getValuableInfoList(...)");
        new hfxu(list0);
    }
}

