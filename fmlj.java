import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmlj {
    public final int a;
    public final gged_interceptors b;
    public static final int c = 0;
    private static final String d = "fmlj";
    private final String e;

    static {
    }

    public fmlj() {
        throw null;
    }

    public fmlj(int v, String s, gged_interceptors gged0) {
        this.a = v;
        this.e = s;
        this.b = gged0;
    }

    public static gfsx a(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            fmli fmli0 = new fmli();
            fmli0.b(jSONObject0.getInt("CARD_WIDTH"));
            fmli0.d(jSONObject0.getString("JSON_SOURCE"));
            ggdy ggdy0 = new ggdy();
            JSONArray jSONArray0 = jSONObject0.getJSONArray("CARDS");
            for(int v = 0; v < jSONArray0.length(); ++v) {
                gfsx gfsx0 = fmmb.a(jSONArray0.getJSONObject(v));
                if(!gfsx0.i()) {
                    flbj.c(fmlj.d, "Failed to convert JSONObject to CardCarousel.");
                    return gfqx.a;
                }
                ggdy0.i(gfsx0.d());
            }
            fmli0.c(ggdy0.h());
            return gfsx.m(fmli0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d(fmlj.d, "Failed to convert JSONObject to CardCarousel.", jSONException0);
            return gfqx.a;
        }
    }

    public final gfsx b() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("CARD_WIDTH", this.a);
            jSONObject0.put("JSON_SOURCE", this.e);
            JSONArray jSONArray0 = new JSONArray();
            ggqk ggqk0 = this.b.E();
            while(ggqk0.hasNext()) {
                Object object0 = ggqk0.next();
                gfsx gfsx0 = ((fmmb)object0).b();
                if(!gfsx0.i()) {
                    flbj.c(fmlj.d, "Failed to convert CardCarousel to JSONObject.");
                    return gfqx.a;
                }
                jSONArray0.put(gfsx0.d());
            }
            jSONObject0.put("CARDS", jSONArray0);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException jSONException0) {
            flbj.d(fmlj.d, "Failed to convert CardCarousel to JSONObject.", jSONException0);
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmlj) && this.a == ((fmlj)object0).a && this.e.equals(((fmlj)object0).e) && ggia.i(this.b, ((fmlj)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003 ^ this.e.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "CardCarousel{cardWidth=" + this.a + ", jsonSource=" + this.e + ", cards=" + this.b + "}";
    }
}

