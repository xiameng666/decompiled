import j..util.DesugarCollections;
import java.util.List;

public final class aqhx {
    public final ProtoLiteBuilder a;

    public aqhx(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final aqhv a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (aqhv)hftv0;
    }

    public final void b(aqep aqep0) {
        ibuq.f(aqep0, "value");
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        aqhv aqhv0 = (aqhv)hftp0.b_message;
        aqep0.getClass();
        aqhv0.b();
        aqhv0.b.add(aqep0);
    }

    public final void c() {
        List list0 = DesugarCollections.unmodifiableList(((aqhv)this.a.b_message).b);
        ibuq.e(list0, "getBackupRecordsList(...)");
        new hfxu(list0);
    }
}

