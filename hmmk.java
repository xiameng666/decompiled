import java.nio.charset.Charset;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

final class hmmk implements hmnn {
    final Map a;
    fsbl b;

    public hmmk(fsbl fsbl0) {
        this.b = fsbl0;
        HashMap hashMap0 = new HashMap();
        JSONArray jSONArray0 = fsbl0.c.getJSONArray("keys");
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = (JSONObject)jSONArray0.get(v);
            String s = jSONObject0.getString("algorithm");
            byte[] arr_b = hmql.a(((String)jSONObject0.get("keyMaterial")).getBytes(Charset.forName("US-ASCII")));
            hashMap0.put(jSONObject0.getString("alias"), new SecretKeySpec(arr_b, s));
        }
        this.a = hashMap0;
        new HashSet(hashMap0.keySet()).add(fsbl0.b);
    }

    @Override  // hmnn
    public final hmnm a(String s) {
        return s.equals(this.b.b) ? new hmmj(this, this.b.a.a) : new hmmj(this, ((Key)this.a.get(s)));
    }
}

