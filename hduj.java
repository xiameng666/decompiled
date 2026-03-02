import j..util.DesugarCollections;
import java.util.List;

public final class hduj {
    private final hduk a;

    public hduj(hduk hduk0) {
        this.a = hduk0;
    }

    public final hdul a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (hdul)hftv0;
    }

    public final void b(hdrl hdrl0) {
        ibuq.f(hdrl0, "value");
        hduk hduk0 = this.a;
        if(!hduk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hduk0).ensureMutable();
        }
        hdul hdul0 = (hdul)hduk0.b_message;
        hdrl0.getClass();
        hdul0.c = hdrl0;
        hdul0.b |= 1;
    }

    public final void c(hdus hdus0) {
        ibuq.f(hdus0, "value");
        hduk hduk0 = this.a;
        if(!hduk0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hduk0).ensureMutable();
        }
        hdul hdul0 = (hdul)hduk0.b_message;
        hdus0.getClass();
        hdul0.f = hdus0;
        hdul0.b |= 2;
    }

    public final void d(Iterable iterable0) {
        this.a.a(iterable0);
    }

    public final void e(hcnu hcnu0) {
        ibuq.f(hcnu0, "value");
        this.a.l(hcnu0);
    }

    public final void f() {
        List list0 = DesugarCollections.unmodifiableList(((hdul)this.a.b_message).e);
        ibuq.e(list0, "getDataList(...)");
        new hfxu(list0);
    }
}

