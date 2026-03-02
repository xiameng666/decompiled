import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aube {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;
    public final List i;
    public String j;
    private static final aurs k;
    private final gful_cronetEngineProvider l;
    private final List m;

    static {
        aube.k = new avjh("ApplicationInfo");
    }

    private aube() {
        this.l = gfus.a(((gful_cronetEngineProvider)new aubd()));
        this.i = new ArrayList();
        this.m = new ArrayList();
    }

    public aube(JSONObject jSONObject0) {
        this.l = gfus.a(((gful_cronetEngineProvider)new aubd()));
        this.i = new ArrayList();
        this.m = new ArrayList();
        this.a = jSONObject0.getString("appId");
        this.e = jSONObject0.getString("sessionId");
        jSONObject0.optString("transportId");
        this.d = jSONObject0.optString("displayName");
        this.f = jSONObject0.optString("statusText");
        this.j = jSONObject0.optString("iconUrl");
        this.b = jSONObject0.optString("universalAppId");
        this.c = jSONObject0.optString("appType");
        if(jSONObject0.has("senderApps")) {
            JSONArray jSONArray0 = jSONObject0.getJSONArray("senderApps");
            int v = jSONArray0.length();
            for(int v1 = 0; v1 < v; ++v1) {
                try {
                    audo audo0 = new audo(jSONArray0.getJSONObject(v1));
                    this.i.add(audo0);
                }
                catch(JSONException jSONException0) {
                    aube.k.g("Ignoring invalid sender app structure: %s", new Object[]{jSONException0.getMessage()});
                }
            }
        }
        if(jSONObject0.has("namespaces")) {
            JSONArray jSONArray1 = jSONObject0.getJSONArray("namespaces");
            int v2 = jSONArray1.length();
            if(v2 > 0) {
                this.m.clear();
                for(int v3 = 0; v3 < v2; ++v3) {
                    String s = jSONArray1.getJSONObject(v3).getString("name");
                    this.m.add(s);
                }
            }
        }
        if(((Boolean)this.l.mr()).booleanValue() && jSONObject0.has("senderConnected")) {
            this.g = Boolean.valueOf(jSONObject0.optBoolean("senderConnected", false));
        }
        if(((Boolean)this.l.mr()).booleanValue() && jSONObject0.has("launchedFromCloud")) {
            this.h = Boolean.valueOf(jSONObject0.optBoolean("launchedFromCloud", false));
        }
    }

    public final List a() {
        return DesugarCollections.unmodifiableList(this.m);
    }
}

