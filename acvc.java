import j..util.DesugarCollections;
import java.util.Map;

public final class acvc implements gfsi {
    public final String a;
    public final String b;

    public acvc(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((adru)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((adru)object0))));
        String s = this.a;
        adrs adrs0 = adrs.a;
        s.getClass();
        Map map0 = DesugarCollections.unmodifiableMap(((adru)hftp0.b_message).b);
        if(map0.containsKey(s)) {
            adrs0 = (adrs)map0.get(s);
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)adrs0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)adrs0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        adrs adrs1 = (adrs)hftp1.b_message;
        this.b.getClass();
        adrs1.b = this.b;
        adrs adrs2 = (adrs)hftp1.N_build();
        s.getClass();
        adrs2.getClass();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        adru adru0 = (adru)hftp0.b_message;
        hfvh hfvh0 = adru0.b;
        if(!hfvh0.b) {
            adru0.b = hfvh0.a();
        }
        adru0.b.put(s, adrs2);
        return (adru)hftp0.N_build();
    }
}

