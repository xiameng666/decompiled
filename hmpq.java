import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

public final class hmpq {
    public Integer a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public String g;
    private static final byte[] h;
    private static final byte[] i;

    static {
        hmpq.h = new byte[]{85, 85};
        hmpq.i = new byte[14];
    }

    public hmpq() {
        this.b = new byte[16];
        this.c = new byte[16];
        this.d = hmpy.F(new byte[][]{hmpq.h, hmpq.i});
        this.e = new byte[16];
        this.f = new byte[16];
    }

    public hmpq(byte[] arr_b) {
    }

    public final boolean a() {
        return this.d[1] == -86;
    }

    public final boolean b() {
        return this.d[0] == -86;
    }

    public final void c(JSONObject jSONObject0) {
        try {
            this.b = hmql.a(jSONObject0.getString("transactionMACBlock").getBytes(StandardCharsets.US_ASCII));
            this.c = hmql.a(jSONObject0.getString("commitReaderIdBlock").getBytes(StandardCharsets.US_ASCII));
            this.d = hmql.a(jSONObject0.getString("tmcConfigurationBlock0").getBytes(StandardCharsets.US_ASCII));
            this.e = hmql.a(jSONObject0.getString("tmcConfigurationBlock1").getBytes(StandardCharsets.US_ASCII));
            this.f = hmql.a(jSONObject0.getString("tmcConfigurationBlock2").getBytes(StandardCharsets.US_ASCII));
        }
        catch(JSONException jSONException0) {
            throw new hmou(jSONException0.getMessage());
        }
    }
}

