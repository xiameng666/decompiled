import org.json.JSONException;
import org.json.JSONObject;

public final class fmbf {
    public final gfsx a;
    public final gfsx b;

    public fmbf() {
        throw null;
    }

    public fmbf(gfsx gfsx0, gfsx gfsx1) {
        this.a = gfsx0;
        this.b = gfsx1;
    }

    public static gfsx a(fmbf fmbf0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            gfsx gfsx0 = fmbf0.b;
            if(gfsx0.i()) {
                gfsx gfsx1 = fmfc.b(((fmfc)gfsx0.d()));
                if(!gfsx1.i()) {
                    return gfqx.a;
                }
                jSONObject0.put("STACKED_REACTION_WEB_VIEW", gfsx1.d());
            }
            gfsx gfsx2 = fmbf0.a;
            if(gfsx2.i()) {
                gfsx gfsx3 = ((fmfw)gfsx2.d()).c();
                if(!gfsx3.i()) {
                    return gfqx.a;
                }
                jSONObject0.put("REACTION_OVERLAY_HEADER", gfsx3.d());
                return gfsx.m(jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
            flbj.c("Action", "failed to convert OverlayActionPayload to JSONObject.");
            return gfqx.a;
        }
        return gfsx.m(jSONObject0);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmbf) && this.a.equals(((fmbf)object0).a) && this.b.equals(((fmbf)object0).b);
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (this.a.hashCode() ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "OverlayActionPayload{reactionOverlayHeader=" + this.a + ", stackedReactionWebView=" + this.b + "}";
    }
}

