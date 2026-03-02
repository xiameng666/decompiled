import j..util.DesugarCollections;
import java.util.List;

public final class hdkk {
    private final ProtoLiteBuilder a;

    public hdkk(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final hdjx a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdjx)hftv0;
    }

    public final void b(hdsn hdsn0) {
        ibuq.f(hdsn0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdjx hdjx0 = (hdjx)hftp0.b_message;
        hdsn0.getClass();
        hdjx0.d = hdsn0;
        hdjx0.b |= 1;
    }

    public final void c(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hdjx hdjx0 = (hdjx)hftp0.b_message;
        hfuf hfuf0 = hdjx0.c;
        if(!hfuf0.c()) {
            hdjx0.c = ProtoLiteMessage.C(hfuf0);
        }
        hdjx0.c.i(v);
    }

    public final void d() {
        List list0 = DesugarCollections.unmodifiableList(((hdjx)this.a.b_message).c);
        ibuq.e(list0, "getColorArgbList(...)");
        new hfxu(list0);
    }
}

