import android.content.Context;
import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class auct extends auqv {
    private final String a;
    public final auxc b;
    private final String c;
    private final String d;
    private final int e;

    public auct(Context context0, String s, String s1, CastDevice castDevice0, auxc auxc0) {
        super(avjg.a, "ConnectionControlChannel", s1);
        this.a = String.format(Locale.ROOT, "Android CastSDK,%d,%s,%s,%s", bbms.a(context0), Build.MODEL, Build.PRODUCT, Build.VERSION.RELEASE);
        this.d = Integer.toString(bbms.a(context0));
        this.c = s;
        this.b = auxc0;
        this.e = castDevice0.p() ? 1 : 2;
    }

    @Override  // auqv
    public final void E(String s) {
        aurs aurs0 = this.n;
        aurs0.c("Received: %s", new Object[]{s});
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            String s1 = jSONObject0.getString("type");
            if(s1.hashCode() == 0x839202E9 && s1.equals("CONNECTED") && jSONObject0.has("protocolVersion")) {
                int v = jSONObject0.getInt("protocolVersion");
                switch(v) {
                    case 1: {
                        aurs0.c("Negotiated protocol version is %d, which is unsupported. Using fallback version", new Object[]{((int)1)});
                        v = 0;
                        break;
                    }
                    case 2: {
                        aurs0.c("Negotiated protocol version is %d, which is unsupported. Using fallback version", new Object[]{((int)2)});
                        v = 0;
                    }
                }
                if(v >= 0 && v <= 3) {
                    this.a((gehk.b(Math.min(v, 3)) == null ? gehk.a : gehk.b(Math.min(v, 3))));
                    return;
                }
                aurs0.g("Negotiated protocol version is %d, which is out of supported range [0, %d]", new Object[]{v, ((int)3)});
            }
        }
        catch(JSONException unused_ex) {
            this.n.g("Error when processing CONNECTED payload", new Object[0]);
        }
    }

    protected void a(gehk gehk0) {
    }

    public final JSONObject b() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("type", "CONNECT");
            JSONObject jSONObject1 = new JSONObject();
            jSONObject1.put("package", this.c);
            jSONObject0.put("origin", jSONObject1);
            jSONObject0.put("userAgent", this.a);
            JSONObject jSONObject2 = new JSONObject();
            boolean z = true;
            jSONObject2.put("sdkType", 1);
            jSONObject2.put("version", this.d);
            jSONObject2.put("platform", 1);
            jSONObject2.put("systemVersion", Build.VERSION.RELEASE);
            jSONObject2.put("model", Build.MODEL);
            jSONObject2.put("connectionType", this.e);
            jSONObject0.put("senderInfo", jSONObject2);
            if(this.b.e == null) {
                z = false;
            }
            jSONObject0.put("multiplexed", z);
            jSONObject0.put("protocolVersion", 3);
        }
        catch(JSONException jSONException0) {
            this.n.g("Error while creating creating the connect payload: %s", new Object[]{jSONException0.getMessage()});
        }
        return jSONObject0;
    }

    public final void d() {
        String s = this.b.f;
        if(TextUtils.isEmpty(s)) {
            this.n.f("skip sending out disconnectFromApplicationDestination as the sessionId is null", new Object[0]);
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("type", "CLOSE");
        }
        catch(JSONException jSONException0) {
            this.n.g("Error while creating a disconnect message: %s", new Object[]{jSONException0.getMessage()});
        }
        this.n.c("send out disconnectFromApplicationDestination to (destinationId = %s): %s", new Object[]{s, jSONObject0.toString()});
        this.m(jSONObject0.toString(), 0L, s);
    }
}

