import j..util.DesugarCollections;
import java.util.Map;

public final class bvnn implements ibts {
    public final String a;
    public final hgnr b;
    public final hfwn c;

    public bvnn(String s, hgnr hgnr0, hfwn hfwn0) {
        this.a = s;
        this.b = hgnr0;
        this.c = hfwn0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((hgnx)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((hgnx)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((hgnx)object0))));
        ibuq.f(hftp0, "builder");
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((hgnx)hftp0.b_message).c));
        ibuq.e(map0, "getLatestCampaignStatusPerUserMap(...)");
        new hfxv(map0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgnv.a).v_newBuilder();
        ibuq.f(hftp1, "builder");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hfwn hfwn0 = this.c;
        ((hgnv)hftp1.b_message).c = this.b;
        ((hgnv)hftp1.b_message).b |= 1;
        ibuq.f(hfwn0, "value");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        String s = this.a;
        hgnv hgnv0 = (hgnv)hftp1.b_message;
        hfwn0.getClass();
        hgnv0.d = hfwn0;
        hgnv0.b |= 2;
        ProtoLiteMessage hftv0 = hftp1.N_build();
        ibuq.e(hftv0, "build(...)");
        ibuq.f(s, "key");
        ibuq.f(((hgnv)hftv0), "value");
        s.getClass();
        ((hgnv)hftv0).getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgnx hgnx0 = (hgnx)hftp0.b_message;
        hfvh hfvh0 = hgnx0.c;
        if(!hfvh0.b) {
            hgnx0.c = hfvh0.a();
        }
        hgnx0.c.put(s, ((hgnv)hftv0));
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (hgnx)hftv1;
    }
}

