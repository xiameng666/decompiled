import java.util.ArrayList;
import java.util.List;

public final class bteg implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object1;
        try(owg owg0 = ((oxi)object0).a("SELECT * FROM time_zone_cell")) {
            int v = oqn.b(owg0, "id");
            int v1 = oqn.b(owg0, "time_zone_cache_validity_id");
            int v2 = oqn.b(owg0, "child_shifted_begin");
            int v3 = oqn.b(owg0, "child_shifted_length");
            int v4 = oqn.b(owg0, "time_zone_id");
            object1 = new ArrayList();
            while(true) {
                if(!owg0.k()) {
                    break;
                }
                bted bted0 = new bted(((int)owg0.b(v1)), owg0.b(v2), ((int)owg0.b(v3)), ((int)owg0.b(v4)));
                bted0.a = (int)owg0.b(v);
                ((List)object1).add(bted0);
            }
        }
        return object1;
    }
}

