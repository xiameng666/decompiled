import j..util.DesugarCollections;
import java.util.List;

public final class ebgr extends ebhb {
    public static final ebgq a;
    public dtrz b;
    private final ftan c;

    static {
        ebgr.a = new ebgq();
    }

    public ebgr(ftan ftan0) {
        this.c = ftan0;
    }

    @Override  // ebhb
    public final ftcg a() {
        ftan ftan0 = this.c;
        gftb.g(((boolean)(bbqr.d(ftan0.b) ^ 1)), "ProvisioningId is required", new Object[0]);
        dtrz dtrz0 = this.b;
        if(dtrz0 == null) {
            ibuq.j("database");
            dtrz0 = null;
        }
        gged_interceptors gged0 = dtrz0.a(ftan0.b);
        ftci ftci0 = ftch.a(((ProtoLiteMessage)ftcg.a).v_newBuilder());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftjh.a).v_newBuilder();
        ibuq.f(hftp0, "builder");
        ggqk ggqk0 = gged0.E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            gfsz gfsz0 = (gfsz)ggqk0.next();
            Object object0 = gfsz0.a;
            if(object0 != null) {
                Object object1 = gfsz0.b;
                if(object1 != null) {
                    List list0 = DesugarCollections.unmodifiableList(((ftjh)hftp0.b_message).b);
                    ibuq.e(list0, "getActivityLogsList(...)");
                    new hfxu(list0);
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)ftjg.a).v_newBuilder();
                    ibuq.f(hftp1, "builder");
                    int v = ((Number)object0).intValue();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((ftjg)hftv0).d = v;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ftjg ftjg0 = (ftjg)hftp1.b_message;
                    ftjg0.c = (gtxo)object1;
                    ftjg0.b |= 1;
                    ProtoLiteMessage hftv1 = hftp1.N_build();
                    ibuq.e(hftv1, "build(...)");
                    ibuq.f(((ftjg)hftv1), "value");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ftjh ftjh0 = (ftjh)hftp0.b_message;
                    ((ftjg)hftv1).getClass();
                    ftjh0.b();
                    ftjh0.b.add(((ftjg)hftv1));
                }
            }
        }
        ProtoLiteMessage hftv2 = hftp0.N_build();
        ibuq.e(hftv2, "build(...)");
        ibuq.f(((ftjh)hftv2), "value");
        ProtoLiteBuilder hftp2 = ftci0.a;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ftcg ftcg0 = (ftcg)hftp2.b_message;
        ((ftjh)hftv2).getClass();
        ftcg0.c = (ftjh)hftv2;
        ftcg0.b = 2;
        return ftci0.a();
    }
}

