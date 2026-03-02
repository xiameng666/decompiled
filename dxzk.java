import j..util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class dxzk implements ibts {
    public final Set a;

    public dxzk(Set set0) {
        this.a = set0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.c(((dxfb)object0));
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((dxfb)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((dxfb)object0))));
        dxfd dxfd0 = dxfc.a(hftp0);
        Map map0 = DesugarCollections.unmodifiableMap(((dxfb)object0).b);
        ibuq.e(map0, "getTokenizeTipStatusesMap(...)");
        dxfd0.b();
        ProtoLiteBuilder hftp1 = dxfd0.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dxfb)hftp1.b_message).b().clear();
        dxfd0.b();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = map$Entry0.getKey();
            if(this.a.contains(object2)) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        Map map1 = ibpz.q(linkedHashMap0);
        ibuq.f(map1, "map");
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((dxfb)hftp1.b_message).b().putAll(map1);
        return dxfd0.a();
    }
}

