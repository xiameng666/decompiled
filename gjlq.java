import j..util.DesugarCollections;
import java.util.List;

public final class gjlq {
    public final ProtoLiteBuilder a;

    public gjlq(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gjlz a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gjlz)hftv0;
    }

    public final void b(gjlu gjlu0) {
        ibuq.f(gjlu0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gjlz gjlz0 = (gjlz)hftp0.b_message;
        gjlu0.getClass();
        hfuo hfuo0 = gjlz0.d;
        if(!hfuo0.c()) {
            gjlz0.d = ProtoLiteMessage.E(hfuo0);
        }
        gjlz0.d.add(gjlu0);
    }

    public final void c() {
        List list0 = DesugarCollections.unmodifiableList(((gjlz)this.a.b_message).d);
        ibuq.e(list0, "getLatencyItemsList(...)");
        new hfxu(list0);
    }
}

