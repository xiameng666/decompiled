import android.app.KeyguardManager;
import android.content.Context;
import android.os.UserManager;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class ajlf implements ajlk {
    public static final bboh a;
    public final ajli b;
    public final ajll c;
    public final ajkz d;
    public final ajkw e;
    public final Object f;
    public final alez g;
    public final Set h;
    public final gmcg i;
    public int j;

    static {
        ajlf.a = ajlr.a("ConnectionHandler");
    }

    public ajlf(Context context0, ajli ajli0) {
        ajkw ajkw0 = ajkw.a(context0);
        ajly ajly0 = new ajly(context0);
        ajme ajme0 = ajme.a(context0);
        ajmb ajmb0 = ajmb.a(context0);
        ajll ajll0 = new ajll(((KeyguardManager)context0.getSystemService("keyguard")), ajly0, ajme0, ajmb0, bbpj.a(context0), ((UserManager)context0.getSystemService("user")), new ajls());
        ajkz ajkz0 = new ajkz(context0);
        alez alez0 = new alez(context0);
        bblp bblp0 = new bblp(1, 9);
        super();
        this.b = ajli0;
        batl.s(ajkw0);
        this.e = ajkw0;
        this.c = ajll0;
        this.d = ajkz0;
        this.g = alez0;
        this.f = new Object();
        this.j = 0;
        this.h = new HashSet();
        this.i = bblp0;
    }

    @Override  // ajlk
    public final void a(ajlp ajlp0) {
        byte[] arr_b;
        ((ggtj)ajlf.a.h()).x("Sending status update...");
        Object object0 = this.f;
        __monitor_enter(object0);
        try {
            try {
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("type", "status_update");
                    jSONObject0.put("user_presence", ajlp.a.get(ajlp0.d));
                    jSONObject0.put("secure_screen_lock", ajlp.b.get(ajlp0.e));
                    jSONObject0.put("trust_agent", ajlp.c.get(ajlp0.f));
                    arr_b = jSONObject0.toString().getBytes("UTF-8");
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                    throw new RuntimeException(unsupportedEncodingException0);
                }
                for(Object object1: this.h) {
                    this.b.f(((String)object1), arr_b);
                }
                while(true) {
                label_17:
                    __monitor_exit(object0);
                    return;
                label_20:
                    __monitor_exit(object0);
                    throw throwable0;
                }
            }
            catch(JSONException jSONException0) {
            }
            a.ae(ajlf.a.j(), "Failed to serialize StatusUpdateOutgoingMessage", jSONException0);
            goto label_17;
        }
        catch(Throwable throwable0) {
            goto label_20;
        }
    }
}

