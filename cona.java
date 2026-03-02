import j..util.DesugarCollections;
import java.util.Map;

public final class cona implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((cogm)object0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((cogm)object0))));
        Map map0 = DesugarCollections.unmodifiableMap(((cogm)object0).d);
        for(Object object1: map0.keySet()) {
            String s = (String)object1;
            cogd cogd0 = (cogd)map0.get(s);
            if(cogd0.f > 0L && System.currentTimeMillis() >= cogd0.f) {
                ((cogh)hftp0).m(s);
            }
        }
        return (cogm)((ProtoLiteBuilder)(((cogh)hftp0))).N_build();
    }
}

