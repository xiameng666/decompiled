import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aukg implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        String s;
        try(owg owg0 = ((oxi)object0).a("SELECT * FROM wifi_network_info")) {
            int v = oqn.b(owg0, "device_ids");
            int v1 = oqn.b(owg0, "network_id");
            int v2 = oqn.b(owg0, "last_connected_timestamp_ms");
            Object object1 = new ArrayList();
            while(true) {
                if(!owg0.k()) {
                    return object1;
                }
                auju auju0 = new auju(owg0.d(v1));
                s = owg0.j(v) ? null : owg0.d(v);
                ArrayList arrayList0 = new ArrayList();
                try {
                    JSONArray jSONArray0 = new JSONObject(s).optJSONArray("array");
                    if(jSONArray0 == null) {
                        goto label_31;
                    }
                    for(int v3 = 0; true; ++v3) {
                        if(v3 >= jSONArray0.length()) {
                            break;
                        }
                        arrayList0.add(jSONArray0.getString(v3));
                    }
                }
                catch(JSONException unused_ex) {
                }
            label_31:
                auju0.a.clear();
                auju0.a.addAll(arrayList0);
                auju0.c = owg0.b(v2);
                ((List)object1).add(auju0);
            }
        }
    }
}

