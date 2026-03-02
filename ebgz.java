import j..util.DesugarCollections;
import java.util.List;

public final class ebgz extends ebhb {
    public static final ebgy a;
    public dtsh b;
    public dtpl c;
    private final String d;

    static {
        ebgz.a = new ebgy();
        bboh.b("Pay", bbcu.cZ);
    }

    public ebgz(String s) {
        this.d = s;
    }

    @Override  // ebhb
    public final ftcg a() {
        List list0;
        String s = this.d;
        if(s != null && !ibzk.D(s)) {
            list0 = ibpo.b(this.d().c(s));
        }
        else {
            list0 = this.d().a();
            ibuq.c(list0);
        }
        ftci ftci0 = ftch.a(((ProtoLiteMessage)ftcg.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftbo.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        List list1 = DesugarCollections.unmodifiableList(((ftbo)hftp0.b_message).b);
        ibuq.e(list1, "getRpInfoList(...)");
        new hfxu(list1);
        List list2 = ibpo.ag(list0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ftbo ftbo0 = (ftbo)hftp0.b_message;
        hfuo hfuo0 = ftbo0.b;
        if(!hfuo0.c()) {
            ftbo0.b = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list2, ftbo0.b);
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(((ftbo)hftv0), "value");
        ProtoLiteBuilder hftp1 = ftci0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ftcg ftcg0 = (ftcg)hftp1.b_message;
        ((ftbo)hftv0).getClass();
        ftcg0.c = (ftbo)hftv0;
        ftcg0.b = 5;
        return ftci0.a();
    }

    public final dtsh d() {
        dtsh dtsh0 = this.b;
        if(dtsh0 != null) {
            return dtsh0;
        }
        ibuq.j("database");
        return null;
    }
}

