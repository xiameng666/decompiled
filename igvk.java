import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class igvk implements ftrw {
    private JSONObject a;
    private int b;

    public igvk(int v, igvd igvd0, ftrs ftrs0) {
        this.a = null;
        this.b = v;
        JSONObject jSONObject0 = new JSONObject();
        JSONArray jSONArray0 = new JSONArray();
        for(int v1 = 0; v1 < igvd0.a(); ++v1) {
            igvo igvo0 = igvd0.c[v1];
            JSONObject jSONObject1 = new JSONObject();
            try {
                byte[] arr_b = igvo0.c;
                if(arr_b != null) {
                    jSONObject1.put("accessKey", new JSONArray(arr_b));
                }
                byte[] arr_b1 = igvo0.a;
                if(arr_b1 != null) {
                    jSONObject1.put("data", new JSONArray(arr_b1));
                }
                jSONObject1.put("dirty", igvo0.b);
            }
            catch(JSONException jSONException0) {
                try {
                    jSONObject1.put("conversion_error", jSONException0.getMessage());
                }
                catch(JSONException unused_ex) {
                    ftrs0.a("JSON conversion error", jSONException0);
                }
            }
            catch(Exception exception0) {
                ftrs0.a("JSON exception", exception0);
            }
            jSONArray0.put(jSONObject1);
        }
        try {
            jSONObject0.put("sectors", jSONArray0);
        }
        catch(JSONException jSONException1) {
            try {
                jSONObject0.put("conversion_error", jSONException1.getMessage());
            }
            catch(JSONException unused_ex) {
                ftrs0.a("JSON conversion error", jSONException1);
            }
        }
        this.a = jSONObject0;
    }

    @Override  // ftrw
    public final JSONObject a() {
        return this.a;
    }

    @Override  // ftrw
    public final int b() {
        return this.b;
    }
}

