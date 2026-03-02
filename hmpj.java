import org.json.JSONException;
import org.json.JSONObject;

public final class hmpj {
    public byte[] a;

    public hmpj() {
        byte[] arr_b = new byte[16];
        this.a = arr_b;
        arr_b[0] = 0;
        arr_b[1] = -86;
        arr_b[2] = 85;
        arr_b[11] = 85;
    }

    public final void a(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            try {
                byte[] arr_b = this.a;
                arr_b[0] = (byte)jSONObject0.getInt("vctIdOverride");
                byte[] arr_b1 = this.a;
                arr_b1[1] = (byte)jSONObject0.getInt("useRID");
                byte[] arr_b2 = this.a;
                arr_b2[2] = (byte)jSONObject0.getInt("pcMandatory");
                byte[] arr_b3 = this.a;
                arr_b3[4] = (byte)jSONObject0.getInt("pdCap1.2");
                byte[] arr_b4 = this.a;
                arr_b4[5] = (byte)jSONObject0.getInt("pdCap2.1");
                byte[] arr_b5 = this.a;
                arr_b5[9] = (byte)jSONObject0.getInt("pdCap2.5");
                byte[] arr_b6 = this.a;
                arr_b6[10] = (byte)jSONObject0.getInt("pdCap2.6");
                byte[] arr_b7 = this.a;
                arr_b7[11] = (byte)jSONObject0.getInt("authVCMandatory");
            }
            catch(JSONException jSONException0) {
                throw new hmou(jSONException0.getMessage());
            }
        }
    }
}

