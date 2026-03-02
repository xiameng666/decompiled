import org.json.JSONException;
import org.json.JSONObject;

public final class hmpk {
    public String a;
    public String b;
    public int c;

    public final void a(JSONObject jSONObject0) {
        String s = "AES";
        if(jSONObject0 != null) {
            try {
                this.c = jSONObject0.getInt("blockNumber");
                this.a = jSONObject0.getString("keyAlias");
                if(!jSONObject0.getString("type").equalsIgnoreCase("AES")) {
                    s = "UNSPECIFIED";
                }
                this.b = s;
            }
            catch(JSONException jSONException0) {
                throw new hmou(jSONException0.getMessage());
            }
        }
    }
}

