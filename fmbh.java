import org.json.JSONException;
import org.json.JSONObject;

public final class fmbh {
    public final String a;
    public final String b;

    public fmbh() {
        throw null;
    }

    public fmbh(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    public static gfsx a(JSONObject jSONObject0) {
        if(jSONObject0.has("TEXT") && jSONObject0.has("MESSAGE_CALLBACK_PAYLOAD")) {
            fmbg fmbg0 = new fmbg();
            try {
                fmbg0.c(((String)jSONObject0.get("TEXT")));
                fmbg0.b(((String)jSONObject0.get("MESSAGE_CALLBACK_PAYLOAD")));
                return gfsx.m(fmbg0.a());
            }
            catch(JSONException unused_ex) {
                flbj.c("Action", "failed to convert JSONObject to ReplyActionPayload");
                return gfqx.a;
            }
        }
        flbj.c("Action", "failed to convert JSONObject to ReplyActionPayload, missing necessary properties");
        return gfqx.a;
    }

    public final gfsx b() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("TEXT", this.a);
            jSONObject0.put("MESSAGE_CALLBACK_PAYLOAD", this.b);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("Action", "failed to convert ReplyActionPayload to JSONObject");
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmbh) && this.a.equals(((fmbh)object0).a) && this.b.equals(((fmbh)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "ReplyActionPayload{text=" + this.a + ", messageCallbackPayload=" + this.b + "}";
    }
}

