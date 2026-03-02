import j..util.DesugarCollections;
import java.util.List;

public final class gsld {
    public final ProtoLiteBuilder a;

    public gsld(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final gslb a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (gslb)hftv0;
    }

    public final void b() {
        List list0 = DesugarCollections.unmodifiableList(((gslb)this.a.b_message).b);
        ibuq.e(list0, "getRequestedLocationsList(...)");
        new hfxu(list0);
    }
}

