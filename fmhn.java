import org.json.JSONException;
import org.json.JSONObject;

public final class fmhn {
    public final fmhm a;

    public fmhn() {
        throw null;
    }

    public fmhn(fmhm fmhm0) {
        this.a = fmhm0;
    }

    public final gfsx a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            gfsx gfsx0 = this.a.b();
            if(!gfsx0.i()) {
                flbj.c("RichTextContentModel", "Failed to convert RichText to JSONObject when encoding RichTextContentModel.");
            }
            jSONObject0.put("CONTENT", gfsx0.d());
            return gfsx.m(jSONObject0);
        }
        catch(JSONException jSONException0) {
            flbj.d("RichTextContentModel", "Failed to convert RichTextContentModel to JSONObject.", jSONException0);
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fmhn) ? this.a.equals(((fmhn)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override
    public final String toString() {
        return "RichTextContentModel{content=" + this.a + "}";
    }
}

