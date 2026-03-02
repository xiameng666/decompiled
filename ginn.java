import j..util.DesugarCollections;
import java.util.List;

public final class ginn {
    private final ProtoLiteBuilder a;

    public ginn(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gkaj a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gkaj)hftv0;
    }

    public final void b(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkaj gkaj0 = (gkaj)hftp0.b_message;
        gkaj0.b |= 1;
        gkaj0.c = v;
    }

    public final void c(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkaj gkaj0 = (gkaj)hftp0.b_message;
        gkaj0.b |= 2;
        gkaj0.d = v;
    }

    public final void d(int v) {
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkaj gkaj0 = (gkaj)hftp0.b_message;
        gkaj0.b |= 4;
        gkaj0.f = v;
    }

    public final void e(Iterable iterable0) {
        ibuq.f(iterable0, "values");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkaj gkaj0 = (gkaj)hftp0.b_message;
        gkaj0.b();
        hfrj.E(iterable0, gkaj0.e);
    }

    public final void f(Iterable iterable0) {
        ibuq.f(iterable0, "values");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkaj gkaj0 = (gkaj)hftp0.b_message;
        hfuo hfuo0 = gkaj0.g;
        if(!hfuo0.c()) {
            gkaj0.g = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(iterable0, gkaj0.g);
    }

    public final void g(gkas gkas0) {
        ibuq.f(gkas0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gkaj gkaj0 = (gkaj)hftp0.b_message;
        gkas0.getClass();
        gkaj0.b();
        gkaj0.e.add(gkas0);
    }

    public final void h() {
        List list0 = DesugarCollections.unmodifiableList(((gkaj)this.a.b_message).e);
        ibuq.e(list0, "getFormFieldStatesList(...)");
        new hfxu(list0);
    }

    public final void i() {
        List list0 = DesugarCollections.unmodifiableList(((gkaj)this.a.b_message).g);
        ibuq.e(list0, "getResourceLanguagesList(...)");
        new hfxu(list0);
    }
}

