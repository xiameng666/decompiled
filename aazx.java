import com.google.android.gms.ads.internal.client.AdErrorParcel;
import org.json.JSONException;
import org.json.JSONObject;

public class aazx {
    public final int a;
    public final String b;
    public final String c;
    private final aazx d;

    public aazx(int v, String s, String s1) {
        this(v, s, s1, null);
    }

    public aazx(int v, String s, String s1, aazx aazx0) {
        this.a = v;
        this.b = s;
        this.c = s1;
        this.d = aazx0;
    }

    public final AdErrorParcel a() {
        aazx aazx0 = this.d;
        if(aazx0 == null) {
            return new AdErrorParcel(this.a, this.b, this.c, null, null);
        }
        AdErrorParcel adErrorParcel0 = new AdErrorParcel(aazx0.a, aazx0.b, aazx0.c, null, null);
        return new AdErrorParcel(this.a, this.b, this.c, adErrorParcel0, null);
    }

    public JSONObject b() {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("Code", this.a);
        jSONObject0.put("Message", this.b);
        jSONObject0.put("Domain", this.c);
        aazx aazx0 = this.d;
        if(aazx0 == null) {
            jSONObject0.put("Cause", "null");
            return jSONObject0;
        }
        jSONObject0.put("Cause", aazx0.b());
        return jSONObject0;
    }

    @Override
    public String toString() {
        try {
            return this.b().toString(2);
        }
        catch(JSONException unused_ex) {
            return "Error forming toString output.";
        }
    }
}

