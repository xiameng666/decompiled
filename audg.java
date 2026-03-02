import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public final class audg extends auqv {
    public static final String a;
    public long b;
    public long c;
    public boolean d;
    public final long e;
    public final avjh f;
    public final gful_cronetEngineProvider g;

    static {
        audg.a = "urn:x-cast:com.google.cast.tp.heartbeat";
    }

    public audg(long v, String s) {
        super(audg.a, "HeartbeatChannel", s);
        this.g = gfus.a(((gful_cronetEngineProvider)new audf()));
        this.f = new avjh("HeartbeatChannel", s);
        this.e = v;
        this.b();
    }

    @Override  // auqv
    public final void E(String s) {
        JSONObject jSONObject0;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.b();
        avjh avjh0 = this.f;
        try {
            if("PING".equals(new JSONObject(s).getString("type"))) {
                try {
                    avjh0.c("sending PONG", new Object[0]);
                    jSONObject0 = new JSONObject();
                    goto label_7;
                }
                catch(IOException unused_ex) {
                }
            }
            goto label_13;
        }
        catch(JSONException jSONException0) {
            goto label_11;
        }
        try {
        label_7:
            jSONObject0.put("type", "PONG");
            goto label_8;
        }
        catch(JSONException unused_ex) {
            try {
            label_8:
                this.l(jSONObject0.toString(), 0L, "transport-0");
                return;
            }
            catch(IOException unused_ex) {
                goto label_13;
            }
            catch(JSONException jSONException0) {
            }
        label_11:
            this.f.g("Message is malformed (%s); ignoring: %s", new Object[]{jSONException0.getMessage(), s});
        }
        catch(IOException unused_ex) {
        label_13:
        }
    }

    public final void a() {
        this.f.c("sending PING", new Object[0]);
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("type", "PING");
        }
        catch(JSONException unused_ex) {
        }
        this.l(jSONObject0.toString(), 0L, "transport-0");
        this.b();
        this.d = true;
    }

    public final void b() {
        this.b = SystemClock.elapsedRealtime();
        if(this.d) {
            this.f.c("Received a message. Treating it as a PONG.", new Object[0]);
        }
        this.d = false;
    }
}

