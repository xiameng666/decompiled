import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bcap implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object1;
        String s3;
        Object object2;
        String s2;
        Long long0;
        String s1;
        try(owg owg0 = ((oxi)object0).a("SELECT * FROM gaia_lifecycle_state")) {
            int v = oqn.b(owg0, "id");
            int v1 = oqn.b(owg0, "obfuscated_gaia_id");
            int v2 = oqn.b(owg0, "access_token");
            int v3 = oqn.b(owg0, "added_time");
            int v4 = oqn.b(owg0, "lifecycle_state");
            int v5 = oqn.b(owg0, "account_name");
            object1 = new ArrayList();
            while(true) {
                if(!owg0.k()) {
                    break;
                }
                long v6 = owg0.b(v);
                String s = owg0.d(v1);
                s1 = owg0.j(v2) ? null : owg0.d(v2);
                long0 = owg0.j(v3) ? null : owg0.b(v3);
                s2 = owg0.j(v4) ? null : owg0.d(v4);
                Iterator iterator0 = ((ibsm)bcbc.a.a()).iterator();
                do {
                    if(!iterator0.hasNext()) {
                        goto label_44;
                    }
                    object2 = iterator0.next();
                }
                while(!ibuq.m(((bcbc)object2).name(), s2));
                goto label_46;
            label_44:
                object2 = null;
            label_46:
                bcbc bcbc0 = (bcbc)object2;
                if(bcbc0 == null) {
                    bcbc0 = bcbc.b;
                }
                s3 = owg0.j(v5) ? null : owg0.d(v5);
                ((List)object1).add(new bcav(v6, s, s1, long0, bcbc0, s3));
            }
        }
        return object1;
    }
}

