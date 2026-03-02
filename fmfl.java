import org.json.JSONException;
import org.json.JSONObject;

public final class fmfl {
    public final int a;
    public final int b;

    public fmfl() {
        throw null;
    }

    public fmfl(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public final gfsx a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("BADGE", this.a);
            jSONObject0.put("PROFILE_LABEL_STYLE", this.b);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("LitUiConfig", "failed to convert LighterUiConfigurations to JSONObject");
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmfl) && this.a == ((fmfl)object0).a && this.b == ((fmfl)object0).b;
    }

    @Override
    public final int hashCode() {
        return this.b ^ (this.a ^ 1000003) * 1000003;
    }

    @Override
    public final String toString() {
        return "LighterUiConfigurations{badge=" + this.a + ", profileLabelStyle=" + this.b + "}";
    }
}

