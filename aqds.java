import j..util.DesugarCollections;
import java.util.Map;

public final class aqds {
    public final ProtoLiteBuilder a;

    public aqds(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    public final aqdq a() {
        ProtoLiteMessage hftv0 = this.a.N_build();
        ibuq.e(hftv0, "build(...)");
        return (aqdq)hftv0;
    }

    public final hfxv b() {
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((aqdq)this.a.b_message).b));
        ibuq.e(map0, "getPackageNameToBackupRecordsMap(...)");
        return new hfxv(map0);
    }
}

