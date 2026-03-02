import j..util.DesugarCollections;
import java.util.List;

public final class grka {
    public final grjx a;

    public grka(grjx grjx0) {
        this.a = grjx0;
    }

    public final grjy a() {
        ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)this.a).N_build();
        ibuq.e(hftv0, "build(...)");
        return (grjy)hftv0;
    }

    public final void b(int v) {
        this.a.k(v);
    }

    public final void c() {
        List list0 = DesugarCollections.unmodifiableList(((grjy)this.a.b_message).b);
        ibuq.e(list0, "getResourceIdsList(...)");
        new hfxu(list0);
    }
}

