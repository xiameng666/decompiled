import android.util.Base64;
import java.net.URI;
import java.util.Map;

final class bnhk {
    public static final bboh a;
    public final URI b;
    public final String c;
    public final String d;
    public final Map e;

    static {
        bnhk.a = bnaa.e("WebSocketHandshake");
    }

    public bnhk(URI uRI0, Map map0) {
        this.b = uRI0;
        byte[] arr_b = new byte[16];
        for(int v = 0; v < 16; ++v) {
            arr_b[v] = (byte)(((int)(Math.random() * 255.0 + 0.0)));
        }
        this.d = Base64.encodeToString(arr_b, 2);
        this.c = "fido.cable";
        this.e = map0;
    }
}

