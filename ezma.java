import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

final class ezma extends clbf {
    public JSONObject a;

    public ezma() {
        throw null;
    }

    public ezma(ezmb ezmb0) {
        Objects.requireNonNull(ezmb0);
        super();
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        a.e(ezmb.a.j(), "GmsNetworkException thrown while fetching data with message %s", clbw0.getMessage(), clbw0);
    }

    @Override  // clbf
    public final void d(ByteBuffer byteBuffer0, clcq clcq0) {
        if(byteBuffer0 != null && byteBuffer0.hasRemaining()) {
            String s = StandardCharsets.UTF_8.decode(byteBuffer0).toString();
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                this.a = jSONObject0;
                ezmb.b(jSONObject0);
            }
            catch(JSONException jSONException0) {
                a.ae(ezmb.a.j(), "error converting results from String to JSONObject", jSONException0);
            }
            return;
        }
        ((ggtj)ezmb.a.j()).x("Didn\'t receive anything from the server");
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ((ggtj)ezmb.a.h()).x("onRedirectReceived");
    }
}

