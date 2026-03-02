import j..util.DesugarCollections;
import java.util.List;

public final class gyvx {
    public final ProtoLiteBuilder a;

    public gyvx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gyvv a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gyvv)hftv0;
    }

    public final void b(gyve gyve0) {
        ibuq.f(gyve0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyvv gyvv0 = (gyvv)hftp0.b_message;
        gyve0.getClass();
        gyvv0.d = gyve0;
        gyvv0.b |= 1;
    }

    public final void c(gyvu gyvu0) {
        ibuq.f(gyvu0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyvv gyvv0 = (gyvv)hftp0.b_message;
        gyvv0.c = gyvu0.a();
    }

    public final void d(gyvd gyvd0) {
        ibuq.f(gyvd0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gyvv gyvv0 = (gyvv)hftp0.b_message;
        gyvd0.getClass();
        hfuo hfuo0 = gyvv0.f;
        if(!hfuo0.c()) {
            gyvv0.f = ProtoLiteMessage.E(hfuo0);
        }
        gyvv0.f.add(gyvd0);
    }

    public final void e() {
        List list0 = DesugarCollections.unmodifiableList(((gyvv)this.a.b_message).f);
        ibuq.e(list0, "getTargetDeviceDimensionsList(...)");
        new hfxu(list0);
    }
}

