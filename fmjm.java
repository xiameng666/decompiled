import org.json.JSONException;
import org.json.JSONObject;

public final class fmjm {
    public final String a;
    public final int b;

    public fmjm() {
        throw null;
    }

    public fmjm(String s, int v) {
        this.a = s;
        this.b = v;
    }

    public static gfsx a(JSONObject jSONObject0) {
        try {
            fmjl fmjl0 = new fmjl();
            fmjl0.b(jSONObject0.getString("RESOURCE_ID"));
            fmjl0.c(jSONObject0.getInt("RESOURCE_REGION"));
            return gfsx.m(fmjl0.a());
        }
        catch(Exception exception0) {
            flbj.d("LighterMediaId", "failed to convert JSON to LighterMediaId", exception0);
            return gfqx.a;
        }
    }

    public final gfsx b() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("RESOURCE_ID", this.a);
            jSONObject0.put("RESOURCE_REGION", this.b);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException jSONException0) {
            flbj.d("LighterMediaId", "failed to convert LighterMediaId to JSONObject", jSONException0);
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmjm) && this.a.equals(((fmjm)object0).a) && this.b == ((fmjm)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "LighterMediaId{resourceId=" + this.a + ", resourceRegion=" + this.b + "}";
    }
}

