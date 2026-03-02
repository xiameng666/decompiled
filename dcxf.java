import j..util.DesugarCollections;
import java.util.Map;

public final class dcxf implements ibts {
    public final String a;

    public dcxf(String s) {
        this.a = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dbyi)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dbyi)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dbyi)object0))));
        dbyk dbyk0 = dbyj.a(hftp0);
        ProtoLiteBuilder hftp1 = dbyk0.a;
        Map map0 = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((dbyi)hftp1.b_message).c));
        ibuq.e(map0, "getDataUsageMessageMap(...)");
        new hfxv(map0);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        dbyi dbyi0 = (dbyi)hftp1.b_message;
        hfvh hfvh0 = dbyi0.c;
        if(!hfvh0.b) {
            dbyi0.c = hfvh0.a();
        }
        String s = this.a;
        hfvh hfvh1 = dbyi0.c;
        Boolean boolean0 = Boolean.valueOf(true);
        if(s == null) {
            s = "";
        }
        hfvh1.put(s, boolean0);
        return dbyk0.a();
    }
}

