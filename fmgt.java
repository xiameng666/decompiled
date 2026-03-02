import org.json.JSONException;
import org.json.JSONObject;

public final class fmgt {
    public final String a;
    public final gfsx b;
    public final gfsx c;
    public final fmbi d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;

    public fmgt() {
        throw null;
    }

    public fmgt(String s, gfsx gfsx0, gfsx gfsx1, fmbi fmbi0, int v, int v1, int v2, boolean z) {
        this.a = s;
        this.b = gfsx0;
        this.c = gfsx1;
        this.d = fmbi0;
        this.e = v;
        this.f = v1;
        this.g = v2;
        this.h = z;
    }

    public static fmgs a() {
        fmgs fmgs0 = new fmgs(null);
        fmgs0.e(true);
        return fmgs0;
    }

    public static gfsx b(JSONObject jSONObject0) {
        try {
            fmgs fmgs0 = fmgt.a();
            fmgs0.g(jSONObject0.getString("TEXT"));
            if(jSONObject0.has("A11Y_TEXT")) {
                fmgs0.b(jSONObject0.getString("A11Y_TEXT"));
            }
            if(jSONObject0.has("LIGHTER_ICON")) {
                gfsx gfsx0 = fmfh.c(jSONObject0.getJSONObject("LIGHTER_ICON"));
                if(!gfsx0.i()) {
                    flbj.c(fmgu.a, "failed to convert JSONObject to LighterIcon");
                    return gfqx.a;
                }
                fmgs0.f(((fmfh)gfsx0.d()));
            }
            gfsx gfsx1 = fmbi.d(jSONObject0.getJSONObject("ACTION"));
            if(!gfsx1.i()) {
                return gfqx.a;
            }
            fmgs0.a = (fmbi)gfsx1.d();
            fmgs0.h(jSONObject0.getInt("TEXT_COLOR"));
            fmgs0.c(jSONObject0.getInt("BACKGROUND_COLOR"));
            fmgs0.d(jSONObject0.getInt("BORDER_COLOR"));
            fmgs0.e(jSONObject0.getBoolean("ENABLED"));
            return gfsx.m(fmgs0.a());
        }
        catch(JSONException unused_ex) {
            flbj.c("fmgu", "failed to convert JSONObject to RichCardButton");
            return gfqx.a;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fmgt) && this.a.equals(((fmgt)object0).a) && this.b.equals(((fmgt)object0).b) && this.c.equals(((fmgt)object0).c) && this.d.equals(((fmgt)object0).d) && this.e == ((fmgt)object0).e && this.f == ((fmgt)object0).f && this.g == ((fmgt)object0).g && this.h == ((fmgt)object0).h;
    }

    @Override
    public final int hashCode() {
        int v = (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
        return this.h ? (this.g ^ ((v * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003) * 1000003 ^ 0x4CF : (this.g ^ ((v * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003) * 1000003 ^ 0x4D5;
    }

    @Override
    public final String toString() {
        return "RichCardButton{text=" + this.a + ", a11yText=" + this.b + ", lighterIcon=" + this.c + ", action=" + this.d + ", textColor=" + this.e + ", backgroundColor=" + this.f + ", borderColor=" + this.g + ", enabled=" + this.h + "}";
    }
}

