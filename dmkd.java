import android.net.Uri;
import android.util.Base64;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class dmkd {
    public static final bboh a;

    static {
        dmkd.a = bboh.b("Pay", bbcu.cZ);
    }

    public static final boolean a(Uri uri0) {
        List list0 = uri0.getPathSegments();
        if(list0.size() <= 3) {
            return false;
        }
        if(!"savecard".equals(((String)list0.get(2)))) {
            return false;
        }
        byte[] arr_b = Base64.decode(((String)list0.get(3)), 0);
        try {
            ibuq.c(arr_b);
            JSONObject jSONObject0 = new JSONObject(new String(arr_b, ibyo.a));
            String s = null;
            String s1 = jSONObject0.has("accountHubId") ? jSONObject0.getString("accountHubId") : null;
            if(jSONObject0.has("serviceProviderId")) {
                s = jSONObject0.getString("serviceProviderId");
            }
            hwgk hwgk0 = hwgk.a;
            if(hwgk0.l().F().b.contains(s1)) {
                return true;
            }
            if("MIFARE_2GO_CARD_CENTRIC".equals(s1)) {
                return hwgk0.l().E().b.contains(s);
            }
        }
        catch(JSONException jSONException0) {
            a.ae(dmkd.a.j(), "Unable to parse account object in save link", jSONException0);
        }
        return false;
    }
}

