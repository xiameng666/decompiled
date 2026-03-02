import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class esui {
    public static final Logger a;
    public static final String b;
    public final estr c;
    public final esup d;
    public final esuo e;
    public String f;
    public essp g;
    private ArrayList h;

    static {
        esui.a = Logger.getLogger(esui.class.getName());
        esui.b = "GPAY: esui";
    }

    public esui() {
        this.e = new esuo();
        this.d = new esup();
        this.c = new estr();
    }

    public final String a(byte b, byte b1) {
        JSONArray jSONArray0 = this.g.Q;
        for(int v = 0; v < jSONArray0.length(); ++v) {
            try {
                JSONObject jSONObject0 = (JSONObject)jSONArray0.get(v);
                if(b == ((byte)Integer.parseInt(jSONObject0.get("SFI").toString())) && b1 == ((byte)Integer.parseInt(jSONObject0.get("recordNumber").toString()))) {
                    return jSONObject0.get("recordData").toString();
                }
            }
            catch(JSONException jSONException0) {
                esui.a.logp(Level.SEVERE, "com.google.android.gms.tapandpay.hce.applet.openapplet.rupayimpl.ReadRecordImpl", "getRecord", jSONException0.getLocalizedMessage(), jSONException0);
            }
        }
        return null;
    }

    public final boolean b(byte b, byte b1) {
        if(this.h == null) {
            String s = essz.a(this.g.I());
            this.h = new ArrayList();
            for(int v = 0; v < (s + "18030300").length(); v += 8) {
                this.h.add((s + "18030300").substring(v, v + 8));
            }
        }
        ArrayList arrayList0 = this.h;
        int v1 = arrayList0.size();
        int v2 = 0;
        while(v2 < v1) {
            byte[] arr_b = essz.b(((String)arrayList0.get(v2)));
            ++v2;
            if(arr_b[0] >> 3 == b) {
                int v3 = arr_b[1];
                return v3 != 0 && v3 <= b1;
            }
        }
        return false;
    }
}

