import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aumh implements ibts {
    @Override  // ibts
    public final Object a(Object object0) {
        Object object2;
        String s2;
        InetSocketAddress inetSocketAddress0;
        String s;
        try(owg owg0 = ((oxi)object0).a("SELECT * FROM probed_socket_address_info")) {
            int v = oqn.b(owg0, "socket_address");
            int v1 = oqn.b(owg0, "probed_networks");
            Object object1 = new ArrayList();
            while(true) {
                if(!owg0.k()) {
                    return object1;
                }
                s = owg0.j(v) ? null : owg0.d(v);
                if(s != null) {
                    try {
                        JSONObject jSONObject0 = new JSONObject(s);
                        String s1 = aurf.j(jSONObject0, "hostName");
                        if(s1 != null && jSONObject0.has("port")) {
                            inetSocketAddress0 = new InetSocketAddress(s1, jSONObject0.getInt("port"));
                            goto label_25;
                        }
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                inetSocketAddress0 = null;
            label_25:
                aume aume0 = new aume(inetSocketAddress0);
                s2 = owg0.j(v1) ? null : owg0.d(v1);
                HashMap hashMap0 = new HashMap();
                try {
                    JSONArray jSONArray0 = new JSONObject(s2).optJSONArray("array");
                    if(jSONArray0 == null) {
                        goto label_65;
                    }
                    int v2 = 0;
                    while(true) {
                        if(v2 >= jSONArray0.length()) {
                            break;
                        }
                        JSONObject jSONObject1 = new JSONObject(jSONArray0.getString(v2));
                        try {
                            String s3 = aurf.j(jSONObject1, "networkId");
                            if(s3 != null && jSONObject1.has("isDeviceRespondingToProbe")) {
                                boolean z = jSONObject1.getBoolean("isDeviceRespondingToProbe");
                                if(jSONObject1.has("lastProbedTimestampMillis")) {
                                    long v3 = jSONObject1.getLong("lastProbedTimestampMillis");
                                    if(jSONObject1.has("probingErrorCode")) {
                                        int v4 = jSONObject1.getInt("probingErrorCode");
                                        if(jSONObject1.has("numberOfProbedTimes")) {
                                            object2 = new aumd(s3, z, v3, v4, jSONObject1.getInt("numberOfProbedTimes"));
                                            goto label_60;
                                        }
                                    }
                                }
                            }
                        }
                        catch(JSONException unused_ex) {
                        }
                        object2 = null;
                    label_60:
                        if(object2 != null) {
                            hashMap0.put(object2.a, object2);
                        }
                        ++v2;
                    }
                }
                catch(JSONException unused_ex) {
                }
            label_65:
                aume0.b.clear();
                aume0.b.putAll(hashMap0);
                ((List)object1).add(aume0);
            }
        }
    }
}

