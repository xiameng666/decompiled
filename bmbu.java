import j..util.Objects;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

public final class bmbu implements blyh {
    private static final bboh a;
    private final bmbt b;
    private final String c;
    private final String d;
    private final JSONObject e;
    private final String f;
    private final MessageDigest g;

    static {
        bmbu.a = bnaa.e("CollectedClientData");
    }

    public bmbu(bmbt bmbt0, String s, String s1, String s2, JSONObject jSONObject0) {
        gftb.check(bmbt0);
        this.b = bmbt0;
        gftb.check(s);
        this.c = s;
        gftb.check(s1);
        this.d = s1;
        gftb.check(s2);
        this.f = s2;
        this.e = jSONObject0;
        this.g = blzb.a();
    }

    @Override  // blyh
    public final JSONObject a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("type", this.b);
            jSONObject0.put("challenge", this.c);
            jSONObject0.put("origin", this.d);
            jSONObject0.put("androidPackageName", this.f);
            JSONObject jSONObject1 = this.e;
            if(jSONObject1 != null) {
                jSONObject0.put("tokenBinding", jSONObject1);
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            throw new RuntimeException(jSONException0);
        }
    }

    public final byte[] b() {
        byte[] arr_b = this.c();
        this.g.update(arr_b);
        return this.g.digest();
    }

    public final byte[] c() {
        try {
            return this.a().toString().getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            ((ggtj)bmbu.a.i()).x("UTF-8 encoding is not supported");
            throw new RuntimeException(unsupportedEncodingException0);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof bmbu)) {
            return false;
        }
        if(this.c.equals(((bmbu)object0).c) && this.d.equals(((bmbu)object0).d) && this.f.equals(((bmbu)object0).f)) {
            JSONObject jSONObject0 = this.e;
            JSONObject jSONObject1 = ((bmbu)object0).e;
            if(jSONObject0 == jSONObject1) {
                return true;
            }
            return jSONObject0 == null || jSONObject1 == null ? false : gpzv.b(jSONObject0.toString()).equals(gpzv.b(jSONObject1.toString()));
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.e == null ? Objects.hash(new Object[]{this.c, this.d, this.f, null}) : Objects.hash(new Object[]{this.c, this.d, this.f, gpzv.b(this.e.toString()).hashCode()});
    }
}

