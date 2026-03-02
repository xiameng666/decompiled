import org.json.JSONException;
import org.json.JSONObject;

public final class fmlr {
    public final fmjm a;
    public final ByteString b;
    public final int c;
    public final String d;
    private final String e;
    private final int f;

    public fmlr() {
        throw null;
    }

    public fmlr(fmjm fmjm0, String s, ByteString hfsf0, int v, int v1, String s1) {
        this.a = fmjm0;
        this.e = s;
        this.b = hfsf0;
        this.f = v;
        this.c = v1;
        this.d = s1;
    }

    public static fmlq a() {
        fmlq fmlq0 = new fmlq();
        fmlq0.e(new byte[0]);
        return fmlq0;
    }

    public static gfsx b(JSONObject jSONObject0) {
        try {
            fmlq fmlq0 = fmlr.a();
            gfsx gfsx0 = fmjm.a(jSONObject0.getJSONObject("MEDIA_ID"));
            if(!gfsx0.i()) {
                return gfqx.a;
            }
            fmlq0.a = (fmjm)gfsx0.d();
            if(jSONObject0.has("LOCAL_URI")) {
                fmlq0.b = jSONObject0.getString("LOCAL_URI");
            }
            if(jSONObject0.has("THUMBNAIL")) {
                fmlq0.e(flbm.k(jSONObject0.getString("THUMBNAIL")));
            }
            fmlq0.d(jSONObject0.getInt("WIDTH"));
            fmlq0.b(jSONObject0.getInt("HEIGHT"));
            fmlq0.c(jSONObject0.getString("IMAGE_DESCRIPTION"));
            return gfsx.m(fmlq0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d("ImageElement", "Failed to convert ImageElement from JSONObject.", jSONException0);
            return gfqx.a;
        }
    }

    public final gfsx c() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            gfsx gfsx0 = this.a.b();
            if(gfsx0.i()) {
                jSONObject0.put("MEDIA_ID", gfsx0.d());
                String s = this.e;
                if(s != null) {
                    jSONObject0.put("LOCAL_URI", s);
                }
                ByteString hfsf0 = this.b;
                if(hfsf0.size() > 0) {
                    jSONObject0.put("THUMBNAIL", flbm.f(hfsf0.toByteArray()));
                }
                jSONObject0.put("WIDTH", this.f);
                jSONObject0.put("HEIGHT", this.c);
                jSONObject0.put("IMAGE_DESCRIPTION", this.d);
                return gfsx.m(jSONObject0);
            }
            flbj.c("ImageElement", "failed to convert ImageElement to JSONObject.");
        }
        catch(JSONException jSONException0) {
            flbj.d("ImageElement", "Failed to convert ImageElement to JSONObject.", jSONException0);
        }
        return gfqx.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fmlr) && this.a.equals(((fmlr)object0).a)) {
            String s = this.e;
            if(s == null) {
                return ((fmlr)object0).e == null ? this.b.equals(((fmlr)object0).b) && this.f == ((fmlr)object0).f && this.c == ((fmlr)object0).c && this.d.equals(((fmlr)object0).d) : false;
            }
            return s.equals(((fmlr)object0).e) ? this.b.equals(((fmlr)object0).b) && this.f == ((fmlr)object0).f && this.c == ((fmlr)object0).c && this.d.equals(((fmlr)object0).d) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.e == null ? this.d.hashCode() ^ (((v * 1000003 * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.f) * 1000003 ^ this.c) * 1000003 : this.d.hashCode() ^ ((((v * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.f) * 1000003 ^ this.c) * 1000003;
    }

    @Override
    public final String toString() {
        return "ImageElement{mediaId=" + this.a + ", localURI=" + this.e + ", thumbnail=" + this.b + ", width=" + this.f + ", height=" + this.c + ", imageDescription=" + this.d + "}";
    }
}

