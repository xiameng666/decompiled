import j..util.Objects;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

final class acbg extends clbf {
    public volatile gpco a;

    public acbg() {
        this.a = null;
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        this.a = null;
    }

    @Override  // clbf
    public final void d(ByteBuffer byteBuffer0, clcq clcq0) {
        int v2;
        try {
            if(clcq0.a() >= 200 && clcq0.a() <= 299) {
                int v = byteBuffer0.remaining();
                byte[] arr_b = new byte[v];
                byteBuffer0.get(arr_b);
                byteBuffer0.position(byteBuffer0.position() - v);
                JSONObject jSONObject0 = new JSONObject(new String(arr_b));
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gpco.a).v_newBuilder();
                String s = jSONObject0.optString("deepLink");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gpco gpco0 = (gpco)hftp0.b_message;
                s.getClass();
                gpco0.c = s;
                String s1 = jSONObject0.optString("targetAndroidPackage");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gpco gpco1 = (gpco)hftp0.b_message;
                s1.getClass();
                gpco1.d = s1;
                int v1 = jSONObject0.optInt("minAndroidAppVersionCode");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gpco)hftp0.b_message).e = v1;
                String s2 = jSONObject0.optString("fallbackUri");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gpco gpco2 = (gpco)hftp0.b_message;
                s2.getClass();
                gpco2.f = s2;
                String s3 = jSONObject0.optString("resolvedLink");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gpco gpco3 = (gpco)hftp0.b_message;
                s3.getClass();
                gpco3.g = s3;
                String s4 = jSONObject0.optString("domainUriPrefix");
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gpco gpco4 = (gpco)hftp0.b_message;
                s4.getClass();
                gpco4.h = s4;
                JSONObject jSONObject1 = jSONObject0.optJSONObject("googleAnalyticsData");
                if(jSONObject1 != null) {
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gpcr.a).v_newBuilder();
                    String s5 = jSONObject1.optString("source");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpcr gpcr0 = (gpcr)hftp1.b_message;
                    s5.getClass();
                    gpcr0.b = s5;
                    String s6 = jSONObject1.optString("medium");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpcr gpcr1 = (gpcr)hftp1.b_message;
                    s6.getClass();
                    gpcr1.c = s6;
                    String s7 = jSONObject1.optString("campaign");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpcr gpcr2 = (gpcr)hftp1.b_message;
                    s7.getClass();
                    gpcr2.d = s7;
                    String s8 = jSONObject1.optString("term");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpcr gpcr3 = (gpcr)hftp1.b_message;
                    s8.getClass();
                    gpcr3.e = s8;
                    String s9 = jSONObject1.optString("content");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpcr gpcr4 = (gpcr)hftp1.b_message;
                    s9.getClass();
                    gpcr4.f = s9;
                    String s10 = jSONObject1.optString("linkId");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gpcr gpcr5 = (gpcr)hftp1.b_message;
                    s10.getClass();
                    gpcr5.h = s10;
                    String s11 = jSONObject1.optString("linkType");
                    if(Objects.equals(s11, "SHORT")) {
                        v2 = 3;
                    }
                    else {
                        v2 = Objects.equals(s11, "LONG") ? 4 : 2;
                    }
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gpcr)hftp1.b_message).g = v2 - 2;
                    long v3 = (long)jSONObject1.optInt("projectNumber");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ((gpcr)hftp1.b_message).i = v3;
                    gpcr gpcr6 = (gpcr)hftp1.N_build();
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    gpco gpco5 = (gpco)hftp0.b_message;
                    gpcr6.getClass();
                    gpco5.i = gpcr6;
                    gpco5.b |= 1;
                }
                this.a = (gpco)hftp0.N_build();
            }
        }
        catch(JSONException jSONException0) {
            ((ggtj)acbh.a.i()).B("Response processing failed: %s", jSONException0.getLocalizedMessage());
            this.a = null;
        }
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        clcn0.c();
    }
}

