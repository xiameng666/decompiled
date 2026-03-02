import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ahfc implements bxto {
    public final ahfm a;

    public ahfc(ahfm ahfm0) {
        this.a = ahfm0;
    }

    @Override  // bxto
    public final Object a(Object object0) {
        ahbe ahbe0 = (ahbe)object0;
        JSONObject jSONObject0 = new JSONObject();
        try {
            JSONObject jSONObject1 = new JSONObject();
            JSONArray jSONArray0 = new JSONArray().put(ahbe0.b);
            jSONObject0.put("vp_token", jSONObject1.put(ahbe0.a, jSONArray0));
        }
        catch(JSONException jSONException0) {
            throw bxma.g(0x6F2E, jSONException0);
        }
        this.a.j = new kjx(jSONObject0.toString());
        return gfqx.a;
    }
}

