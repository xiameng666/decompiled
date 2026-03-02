import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmfh {
    public final byte[] a;
    public final int b;
    public final int c;
    public final gfsx d;
    public final String e;
    private static final String f = "fmfh";

    static {
    }

    public fmfh() {
        throw null;
    }

    public fmfh(byte[] arr_b, int v, int v1, gfsx gfsx0, String s) {
        this.a = arr_b;
        this.b = v;
        this.c = v1;
        this.d = gfsx0;
        this.e = s;
    }

    public static fmfg a() {
        fmfg fmfg0 = new fmfg(null);
        fmfg0.f(0);
        fmfg0.c(0);
        fmfg0.e("");
        return fmfg0;
    }

    public static fmfh b() {
        fmfg fmfg0 = fmfh.a();
        fmfg0.d(new byte[0]);
        fmfg0.c(0);
        fmfg0.f(0);
        fmfg0.e("");
        return fmfg0.a();
    }

    public static gfsx c(JSONObject jSONObject0) {
        fmfg fmfg0 = fmfh.a();
        try {
            fmfg0.c(jSONObject0.getInt("ICON_HEIGHT"));
            fmfg0.f(jSONObject0.getInt("ICON_WIDTH"));
            fmfg0.d(flbm.k(jSONObject0.getString("ICON")));
            fmfg0.e(jSONObject0.getString("TALK_BACK_DESCRIPTION"));
            if(jSONObject0.has("ICON_COLOR")) {
                fmfg0.b(jSONObject0.getInt("ICON_COLOR"));
                return gfsx.m(fmfg0.a());
            }
        }
        catch(NullPointerException | JSONException unused_ex) {
            return gfqx.a;
        }
        return gfsx.m(fmfg0.a());
    }

    public final gfsx d() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("ICON", flbm.f(this.a));
            jSONObject0.put("ICON_WIDTH", this.b);
            jSONObject0.put("ICON_HEIGHT", this.c);
            jSONObject0.put("TALK_BACK_DESCRIPTION", this.e);
            gfsx gfsx0 = this.d;
            if(gfsx0.i()) {
                jSONObject0.put("ICON_COLOR", gfsx0.d());
                return gfsx.m(jSONObject0);
            }
        }
        catch(JSONException unused_ex) {
            flbj.c("fmfh", "failed to convert LighterIcon to JSONObject");
            return gfqx.a;
        }
        return gfsx.m(jSONObject0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof fmfh) ? Arrays.equals(this.a, ((((fmfh)object0) instanceof fmfh) ? ((fmfh)object0).a : ((fmfh)object0).a)) && this.b == ((fmfh)object0).b && this.c == ((fmfh)object0).c && this.d.equals(((fmfh)object0).d) && this.e.equals(((fmfh)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.a) ^ 1000003;
        return this.e.hashCode() ^ (((v * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "LighterIcon{icon=" + Arrays.toString(this.a) + ", width=" + this.b + ", height=" + this.c + ", color=" + this.d + ", talkBackDescription=" + this.e + "}";
    }
}

