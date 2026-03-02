import org.json.JSONException;
import org.json.JSONObject;

public final class fmmd {
    public final fmmb a;
    public static final int b = 0;
    private static final String c = "fmmd";
    private final String d;

    static {
    }

    public fmmd() {
        throw null;
    }

    public fmmd(String s, fmmb fmmb0) {
        this.d = s;
        this.a = fmmb0;
    }

    public static gfsx a(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            fmmc fmmc0 = new fmmc();
            fmmc0.b(jSONObject0.getString("JSON_SOURCE"));
            gfsx gfsx0 = fmmb.a(jSONObject0.getJSONObject("STACK_CARD"));
            if(!gfsx0.i()) {
                flbj.c(fmmd.c, "Failed to convert JSONObject to StandaloneCard.");
                return gfqx.a;
            }
            fmmc0.a = (fmmb)gfsx0.d();
            return gfsx.m(fmmc0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d(fmmd.c, "Failed to convert JSONObject to StandaloneCard.", jSONException0);
            return gfqx.a;
        }
    }

    public final gfsx b() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("JSON_SOURCE", this.d);
            gfsx gfsx0 = this.a.b();
            if(!gfsx0.i()) {
                flbj.c(fmmd.c, "Failed to convert StandaloneCard to JSONObject.");
                return gfqx.a;
            }
            jSONObject0.put("STACK_CARD", gfsx0.d());
            return gfsx.m(jSONObject0);
        }
        catch(JSONException jSONException0) {
            flbj.d(fmmd.c, "Failed to convert StandaloneCard to JSONObject.", jSONException0);
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmmd) && this.d.equals(((fmmd)object0).d) && this.a.equals(((fmmd)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ (this.d.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "StandaloneCard{jsonSource=" + this.d + ", stackCard=" + this.a + "}";
    }
}

