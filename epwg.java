import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.JSONObject;

public final class epwg {
    public static final Charset a;
    public final byte[] b;

    static {
        epwg.a = StandardCharsets.UTF_8;
    }

    public epwg(byte[] arr_b) {
        batl.s(arr_b);
        this.b = arr_b;
    }

    public static epwg a(JSONObject jSONObject0) {
        return new epwg(jSONObject0.toString().getBytes(epwg.a));
    }
}

