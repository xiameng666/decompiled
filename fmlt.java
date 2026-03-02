import j..util.Objects;
import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmlt {
    public final fmlw a;
    public final ByteString b;
    public final int c;
    public final String d;
    private static final String e = "fmlt";
    private final String f;
    private final int g;

    static {
    }

    public fmlt() {
        throw null;
    }

    public fmlt(fmlw fmlw0, String s, ByteString hfsf0, int v, int v1, String s1) {
        this.a = fmlw0;
        this.f = s;
        this.b = hfsf0;
        this.g = v;
        this.c = v1;
        this.d = s1;
    }

    public static fmls a() {
        fmls fmls0 = new fmls();
        fmls0.e(new byte[0]);
        return fmls0;
    }

    public static gfsx b(JSONObject jSONObject0) {
        gfsx gfsx0;
        try {
            fmls fmls0 = fmlt.a();
            JSONObject jSONObject1 = jSONObject0.getJSONObject("MEDIA_SOURCE");
            try {
                int v = jSONObject1.getInt("TYPE");
                fmlv fmlv0 = (fmlv)ggch.k(fmlv.values()).c(new fmlu(v)).g();
                if(fmlv0 == null) {
                    throw new InvalidParameterException("Invalid SourceType.");
                }
                switch(fmlv0.ordinal()) {
                    case 0: {
                        gfsx gfsx1 = fmjm.a(jSONObject1.getJSONObject("MEDIA_ID"));
                        if(gfsx1.i()) {
                            Object object0 = gfsx1.d();
                            Objects.requireNonNull(object0);
                            gfsx0 = gfsx.m(new fmkm(((fmjm)object0)));
                        }
                        else {
                            flbj.c(fmlw.a, "Failed to convert JSONObject to MediaSource.");
                            gfsx0 = gfqx.a;
                        }
                        break;
                    }
                    case 1: {
                        String s = jSONObject1.getString("URL");
                        if(s == null) {
                            flbj.c(fmlw.a, "Failed to convert JSONObject to MediaSource.");
                            gfsx0 = gfqx.a;
                        }
                        else {
                            gfsx0 = gfsx.m(fmkp.a(s));
                        }
                        break;
                    }
                    default: {
                        flbj.c(fmlw.a, "Failed to convert JSONObject to MediaSource, unsupported type: " + fmlv0.toString());
                        gfsx0 = gfqx.a;
                    }
                }
            }
            catch(JSONException jSONException1) {
                flbj.d(fmlw.a, "Failed to convert JSONObject to MediaSource.", jSONException1);
                gfsx0 = gfqx.a;
            }
            if(!gfsx0.i()) {
                flbj.c("fmlt", "Failed to convert MediaElement from JSONObject.");
                return gfqx.a;
            }
            fmls0.a = (fmlw)gfsx0.d();
            if(jSONObject0.has("LOCAL_URI")) {
                fmls0.b = jSONObject0.getString("LOCAL_URI");
            }
            if(jSONObject0.has("THUMBNAIL")) {
                fmls0.e(flbm.k(jSONObject0.getString("THUMBNAIL")));
            }
            fmls0.d(jSONObject0.getInt("WIDTH"));
            fmls0.b(jSONObject0.getInt("HEIGHT"));
            fmls0.c(jSONObject0.getString("MEDIA_DESCRIPTION"));
            return gfsx.m(fmls0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d("fmlt", "Failed to convert MediaElement from JSONObject.", jSONException0);
            return gfqx.a;
        }
    }

    public final gfsx c() {
        gfsx gfsx1;
        try {
            JSONObject jSONObject0 = new JSONObject();
            fmlw fmlw0 = this.a;
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("TYPE", fmlw0.b().c);
                switch(fmlw0.b().ordinal()) {
                    case 0: {
                        gfsx gfsx0 = fmlw0.a().b();
                        if(gfsx0.i()) {
                            jSONObject1.put("MEDIA_ID", gfsx0.d());
                            gfsx1 = gfsx.m(jSONObject1);
                            break;
                        }
                        else {
                            flbj.c(fmlw.a, "Failed to convert MediaId to JSONObject.");
                            gfsx1 = gfqx.a;
                        }
                        break;
                    }
                    case 1: {
                        if(fmlw0.c() == null) {
                            flbj.c(fmlw.a, "Failed to convert Url to JSONObject.");
                            gfsx1 = gfqx.a;
                        }
                        else {
                            jSONObject1.put("URL", fmlw0.c());
                            gfsx1 = gfsx.m(jSONObject1);
                        }
                        break;
                    }
                    default: {
                        gfsx1 = gfsx.m(jSONObject1);
                        break;
                    }
                }
            }
            catch(JSONException jSONException1) {
                flbj.d("fmlw", "Failed to convert MediaSource to JSONObject.", jSONException1);
                gfsx1 = gfqx.a;
            }
            if(gfsx1.i()) {
                jSONObject0.put("MEDIA_SOURCE", gfsx1.d());
                String s = this.f;
                if(s != null) {
                    jSONObject0.put("LOCAL_URI", s);
                }
                ByteString hfsf0 = this.b;
                if(hfsf0.size() > 0) {
                    jSONObject0.put("THUMBNAIL", flbm.f(hfsf0.toByteArray()));
                }
                jSONObject0.put("WIDTH", this.g);
                jSONObject0.put("HEIGHT", this.c);
                jSONObject0.put("MEDIA_DESCRIPTION", this.d);
                return gfsx.m(jSONObject0);
            }
            flbj.c(fmlt.e, "failed to convert MediaElement to JSONObject.");
        }
        catch(JSONException jSONException0) {
            flbj.d(fmlt.e, "Failed to convert MediaElement to JSONObject.", jSONException0);
        }
        return gfqx.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fmlt) && this.a.equals(((fmlt)object0).a)) {
            String s = this.f;
            if(s == null) {
                return ((fmlt)object0).f == null ? this.b.equals(((fmlt)object0).b) && this.g == ((fmlt)object0).g && this.c == ((fmlt)object0).c && this.d.equals(((fmlt)object0).d) : false;
            }
            return s.equals(((fmlt)object0).f) ? this.b.equals(((fmlt)object0).b) && this.g == ((fmlt)object0).g && this.c == ((fmlt)object0).c && this.d.equals(((fmlt)object0).d) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        return this.f == null ? this.d.hashCode() ^ (((v * 1000003 * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.g) * 1000003 ^ this.c) * 1000003 : this.d.hashCode() ^ ((((v * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.g) * 1000003 ^ this.c) * 1000003;
    }

    @Override
    public final String toString() {
        return "MediaElement{mediaSource=" + this.a + ", localURI=" + this.f + ", thumbnail=" + this.b + ", width=" + this.g + ", height=" + this.c + ", mediaDescription=" + this.d + "}";
    }
}

