import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class hmpr {
    public final List a;

    public hmpr() {
        this.a = new ArrayList();
    }

    public final void a(JSONObject jSONObject0) {
        this.b("transactionMACBlockSet1", Integer.valueOf(1), jSONObject0);
        this.b("transactionMACBlockSet2", Integer.valueOf(2), jSONObject0);
        this.b("transactionMACBlockSet3", Integer.valueOf(3), jSONObject0);
        this.b("transactionMACBlockSet4", Integer.valueOf(4), jSONObject0);
    }

    private final void b(String s, Integer integer0, JSONObject jSONObject0) {
        JSONObject jSONObject1;
        try {
            jSONObject1 = jSONObject0.isNull(s) ? null : jSONObject0.getJSONObject(s);
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage());
        }
        if(jSONObject1 != null) {
            hmpq hmpq0 = new hmpq(null);
            hmpq0.g = s;
            hmpq0.a = integer0;
            hmpq0.c(jSONObject1);
            this.a.add(hmpq0);
        }
    }
}

