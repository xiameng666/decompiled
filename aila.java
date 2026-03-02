import org.json.JSONException;
import org.json.JSONObject;

public final class aila {
    public final hhqx a;
    public final String b;
    public final byte[] c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    public aila(hhqx hhqx0, String s, byte[] arr_b, long v, long v1, long v2, int v3, String s1) {
        batl.s(hhqx0);
        this.a = hhqx0;
        batl.s(s);
        this.b = s;
        batl.s(arr_b);
        this.c = arr_b;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.h = v3;
        this.g = s1;
    }

    public static aila a(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            byte[] arr_b = bbmu.d(jSONObject0.getString("txrequest"));
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)hhqx.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            long v = jSONObject0.getLong("expiration");
            long v1 = jSONObject0.getLong("reception_elapsed");
            long v2 = jSONObject0.getLong("reception_wall");
            return new aila(((hhqx)hftv0), jSONObject0.getString("account"), jSONObject0.getString("handle").getBytes(), v, v1, v2, ailg.b(jSONObject0.getInt("state")), (jSONObject0.has("droidguard") ? jSONObject0.getString("droidguard") : null));
        }
        catch(hfur | JSONException exception0) {
            ailb.d.g("Cannot reconstruct cache entry from string", exception0, new Object[0]);
            return null;
        }
    }

    @Override
    public final String toString() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("txrequest", bbmu.a(this.a.toBytesArray()));
            jSONObject0.put("expiration", this.d);
            jSONObject0.put("reception_elapsed", this.e);
            jSONObject0.put("reception_wall", this.f);
            jSONObject0.put("account", this.b);
            jSONObject0.put("handle", new String(this.c));
            jSONObject0.put("state", this.h);
            jSONObject0.put("droidguard", this.g);
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
            ailb.d.g("Cannot make cache entry into a string", jSONException0, new Object[0]);
            return null;
        }
    }
}

