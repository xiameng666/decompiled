import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class alac {
    public static final alaa a(byte[] arr_b) {
        int v1;
        DataInputStream dataInputStream0 = new DataInputStream(new ByteArrayInputStream(arr_b));
        int v = dataInputStream0.read();
        switch(v) {
            case -1: {
                throw new IOException("Unexpected EOF.");
            }
            case 3: {
                v1 = dataInputStream0.readUnsignedShort();
                break;
            }
            case 4: {
                v1 = dataInputStream0.readInt();
                break;
            }
            default: {
                throw new IOException("Received message with unsupported version: " + v);
            }
        }
        if(v1 > 0) {
            byte[] arr_b1 = Arrays.copyOfRange(arr_b, arr_b.length - v1, arr_b.length);
            try {
                JSONObject jSONObject0 = new JSONObject(new String(arr_b1));
                try {
                    return new alaa((jSONObject0.has("permit_id") ? jSONObject0.getString("permit_id") : null), Base64.decode(jSONObject0.getString("payload"), 8), (jSONObject0.has("feature") ? jSONObject0.getString("feature") : "easy_unlock"));
                }
                catch(JSONException jSONException1) {
                    throw new IOException("Error when parsing JSON message.", jSONException1);
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                    throw new IOException("Failed to decode the message.", illegalArgumentException0);
                }
                catch(NullPointerException nullPointerException0) {
                    throw new IOException("Mandatory field is missing in the message.", nullPointerException0);
                }
            }
            catch(JSONException jSONException0) {
                throw new IOException("Error when parsing JSON message.", jSONException0);
            }
        }
        throw new IOException("Invalid length of message: " + v1);
    }
}

