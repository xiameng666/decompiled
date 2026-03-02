import java.util.ArrayList;
import java.util.List;

public final class aukp implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        byte[] arr_b;
        String s;
        try(owg owg0 = ((oxi)object0).a("SELECT * FROM cloud_device_info")) {
            int v = oqn.b(owg0, "cloud_device_id");
            int v1 = oqn.b(owg0, "device_proto");
            int v2 = oqn.b(owg0, "last_updated_timestamp_ms");
            Object object1 = new ArrayList();
            while(true) {
                gqfu gqfu0 = null;
                if(!owg0.k()) {
                    return object1;
                }
                s = owg0.j(v) ? null : owg0.d(v);
                arr_b = owg0.j(v1) ? null : owg0.l(v1);
                try {
                    hftc hftc0 = hftc.a();
                    ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gqfu.a), arr_b, 0, arr_b.length, hftc0);
                    ProtoLiteMessage.P_makeImmutable(hftv0);
                    gqfu0 = (gqfu)hftv0;
                }
                catch(hfur hfur0) {
                    aukm.a.d("Failed to parse proto from database", new Object[]{hfur0});
                }
                ((List)object1).add(new aukm(s, gqfu0, owg0.b(v2)));
            }
        }
    }
}

