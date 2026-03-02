import android.util.Base64;
import org.json.JSONException;
import org.json.JSONObject;

public final class kre {
    public static final byte[] a(String s) {
        ibuq.f(s, "str");
        byte[] arr_b = Base64.decode(s, 11);
        ibuq.e(arr_b, "decode(...)");
        return arr_b;
    }

    public static final byte[] b(JSONObject jSONObject0) {
        String s = jSONObject0.optString(krf.d, "");
        ibuq.c(s);
        if(s.length() != 0) {
            return kre.a(s);
        }
        throw new JSONException("Challenge not found in request or is unexpectedly empty");
    }
}

