import j..util.DesugarCollections;
import java.util.List;
import java.util.Map;

public final class ahzj implements ibts {
    public final ahzo a;
    public final String b;
    public final long c;

    public ahzj(ahzo ahzo0, String s, long v) {
        this.a = ahzo0;
        this.b = s;
        this.c = v;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp1;
        ibuq.c(((ahzg)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ahzg)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ahzg)object0))));
        ibuq.e(hftp0, "toBuilder(...)");
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((ahzg)hftp0.b_message).b));
        String s = this.b;
        ahxg ahxg0 = (ahxg)map0.get(s);
        if(ahxg0 == null) {
            hftp1 = ((ProtoLiteMessage)ahxg.a).v_newBuilder();
            ibuq.e(hftp1, "newBuilder(...)");
        }
        else {
            hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)ahxg0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)ahxg0));
        }
        List list0 = DesugarCollections.unmodifiableList(((ahxg)hftp1.b_message).c);
        ibuq.e(list0, "getTimestampsList(...)");
        List list1 = ibpo.at(list0);
        list1.add(Long.valueOf(this.c));
        if(list1.size() > (aics.a(this.a.a, s) ? this.a.c : this.a.b)) {
            list1.remove(0);
        }
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((ahxg)hftp1.b_message).c = hfvb.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ahxg ahxg1 = (ahxg)hftp1.b_message;
        hfui hfui0 = ahxg1.c;
        if(!hfui0.c()) {
            ahxg1.c = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(list1, ahxg1.c);
        hftp0.bu(s, ((ahxg)hftp1.N_build()));
        ProtoLiteMessage hftv0 = hftp0.N_build();
        ibuq.e(hftv0, "build(...)");
        return (ahzg)hftv0;
    }
}

