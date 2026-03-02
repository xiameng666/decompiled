import org.json.JSONException;
import org.json.JSONObject;

public final class hmpm {
    public static JSONObject a;
    public byte[] b;

    public hmpm() {
        byte[] arr_b = new byte[16];
        this.b = arr_b;
        arr_b[0] = 0;
        arr_b[1] = 15;
        arr_b[3] = -86;
        arr_b[4] = 85;
        arr_b[5] = 3;
        arr_b[6] = 85;
    }

    public final void a(JSONObject jSONObject0) {
        if(jSONObject0 != null) {
            try {
                hmpm.a = new JSONObject(jSONObject0.toString());
                if(jSONObject0.has("maxUMRead")) {
                    byte[] arr_b = this.b;
                    arr_b[0] = (byte)jSONObject0.getInt("maxUMRead");
                }
                if(jSONObject0.has("defaultPlainAC")) {
                    byte[] arr_b1 = this.b;
                    arr_b1[1] = (byte)jSONObject0.getInt("defaultPlainAC");
                }
                if(jSONObject0.has("keySystemDataWrite")) {
                    byte[] arr_b2 = this.b;
                    arr_b2[3] = (byte)jSONObject0.getInt("keySystemDataWrite");
                }
                return;
            }
            catch(JSONException jSONException0) {
                throw new hmou(jSONException0.getMessage());
            }
        }
        throw new hmou("Null MFPConfigurationBlock configuration");
    }
}

