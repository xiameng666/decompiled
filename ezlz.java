import com.google.android.gms.maps.model.LatLng;
import org.json.JSONException;
import org.json.JSONObject;

public final class ezlz implements gfsi {
    public final ezma a;

    public ezlz(ezma ezma0) {
        this.a = ezma0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        clcp clcp0 = (clcp)object0;
        JSONObject jSONObject0 = this.a.a;
        try {
            ezmb.b(jSONObject0);
            JSONObject jSONObject1 = jSONObject0.getJSONObject("result");
            try {
                String s = jSONObject1.getString("place_id");
                ((ggtj)ezmb.a.h()).B("place_id: %s", s);
                ((ggtj)ezmb.a.h()).B("place: %s", jSONObject1);
                String s1 = jSONObject1.optString("formatted_address", "");
                if(s1.isEmpty()) {
                    s1 = jSONObject1.optString("vicinity", "");
                }
                String s2 = jSONObject1.optString("name", "");
                JSONObject jSONObject2 = jSONObject1.getJSONObject("geometry").getJSONObject("location");
                LatLng latLng0 = new LatLng(jSONObject2.getDouble("lat"), jSONObject2.getDouble("lng"));
                ezlt ezlt0 = new ezlt();
                ezlt0.b(s1);
                ezlt0.d(s);
                ezlt0.e(s2);
                ezlt0.a = latLng0;
                ezlt0.c();
                return ezlt0.a();
            }
            catch(JSONException jSONException1) {
                a.ae(ezmb.a.i(), "[WsPlacesUtil] Error processing JSON generally", jSONException1);
                return null;
            }
        }
        catch(JSONException jSONException0) {
            a.ae(ezmb.a.j(), "Error processing JSON", jSONException0);
            return null;
        }
    }
}

