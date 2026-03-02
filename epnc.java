import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.json.JSONObject;

final class epnc extends clbf {
    private final ibrl a;

    public epnc(ibrl ibrl0) {
        this.a = ibrl0;
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        if((clbw0 instanceof clbr)) {
            ((clbr)clbw0).a();
        }
        else if((clbw0 instanceof clbq)) {
            a.ae(epon.a.i(), "lat/lng lookup callback failure", clbw0);
        }
        else if(!(clbw0.getCause() instanceof CancellationException)) {
            a.ae(epon.a.i(), "lat/lng lookup failure", clbw0);
        }
        this.a.w(null);
    }

    @Override  // clbf
    public final void d(ByteBuffer byteBuffer0, clcq clcq0) {
        ibuq.f(byteBuffer0, "bytesReceived");
        Object object0 = null;
        try {
            try {
                JSONObject jSONObject0 = new JSONObject(StandardCharsets.UTF_8.decode(byteBuffer0).toString());
                String s = jSONObject0.optString("status", "OK");
                ibuq.e(s, "optString(...)");
                if(ibuq.m("OK", s)) {
                    JSONObject jSONObject1 = jSONObject0.getJSONObject("result").getJSONObject("geometry").getJSONObject("location");
                    ibuq.e(jSONObject1, "getJSONObject(...)");
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hjij.a).v_newBuilder();
                    double f = jSONObject1.getDouble("lat");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hjij)hftp0.b_message).b = f;
                    double f1 = jSONObject1.getDouble("lng");
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    ((hjij)hftp0.b_message).c = f1;
                    object0 = (hjij)hftp0.N_build();
                }
                else {
                    ((ggtj)((ggtj)epon.a.j()).s(new IOException(s + ": " + jSONObject0.optString("error_message")))).x("lat/lng lookup request failure");
                }
            }
            catch(JSONException jSONException0) {
                ((ggtj)((ggtj)epon.a.j()).s(jSONException0)).x("lat/lng lookup json failure");
            }
        }
        catch(Throwable throwable0) {
            this.a.w(null);
            throw throwable0;
        }
        this.a.w(object0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ibuq.f(clcn0, "request");
        ibuq.f(s, "newLocationUrl");
    }
}

