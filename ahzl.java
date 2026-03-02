import j..util.DesugarCollections;
import java.util.Map;

public final class ahzl implements ibts {
    public final String a;

    public ahzl(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp1;
        ibuq.c(((ahzg)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ahzg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ahzg)object0))));
        ibuq.e(hftp0, "toBuilder(...)");
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ahzg)hftp0.b_message).b));
        String s = this.a;
        ahxg ahxg0 = (ahxg)map0.get(s);
        if(ahxg0 == null) {
            hftp1 = ((ProtoLiteMessage)ahxg.a).v_newBuilder();
            ibuq.e(hftp1, "newBuilder(...)");
        }
        else {
            hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ahxg0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)ahxg0));
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        int v = ((ahxg)hftv0).e + 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ahxg ahxg1 = (ahxg)hftp1.b_message;
        ahxg1.b |= 2;
        ahxg1.e = v;
        hftp0.bu(s, ((ahxg)hftp1.N_build()));
        ProtoLiteMessage hftv1 = hftp0.N_build();
        ibuq.e(hftv1, "build(...)");
        return (ahzg)hftv1;
    }
}

