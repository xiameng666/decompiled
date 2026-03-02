import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

public final class eqfy implements erpf {
    public final eqgd a;

    public eqfy(eqgd eqgd0) {
        this.a = eqgd0;
    }

    @Override  // erpf
    public final void a(byte[] arr_b) {
        eqgd.a.j("Received packet from Direct Transfer with length %d", new Object[]{((int)arr_b.length)});
        eqgd eqgd0 = this.a;
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("sddt_packet", Base64.encodeToString(arr_b, 0));
            epwg epwg0 = epwg.a(jSONObject0);
            gmbu.t(eqgd0.c.a(epwg0), new eqgc("Send DT packet to ATV device", eqgd0.d), eqgd0.k);
        }
        catch(JSONException jSONException0) {
            eqgd.a.g("Failed to Direct Transfer packet to ATV device", jSONException0, new Object[0]);
            eqgd0.d.a(-8);
        }
    }
}

