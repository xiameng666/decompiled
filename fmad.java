import com.google.android.libraries.messaging.lighter.model.AccountContext;
import org.json.JSONException;
import org.json.JSONObject;

public final class fmad implements flwr {
    private static final String a = "fmad";

    static {
    }

    @Override  // flwr
    public final fmfr a(AccountContext accountContext0, hnub hnub0) {
        flbj.c(fmad.a, "link preview type is not associated with any LighterContentType");
        return fmcs.d(ByteString.b);
    }

    @Override  // flwr
    public final gfsx b(JSONObject jSONObject0) {
        gfsx gfsx0;
        fmfo fmfo0 = new fmfo();
        try {
            fmfo0.c(jSONObject0.getString("TYPE"));
            JSONObject jSONObject1 = jSONObject0.getJSONObject("CONTENT");
            try {
                fmag fmag0 = new fmag(null);
                fmag0.g(jSONObject1.getString("MESSAGE_TEXT"));
                fmag0.h(jSONObject1.getString("TITLE"));
                fmag0.c(jSONObject1.getString("DESCRIPTION"));
                fmag0.f(jSONObject1.getString("IMAGE_URL"));
                fmag0.d(jSONObject1.getString("DOMAIN"));
                fmag0.b(jSONObject1.getString("CANONICAL_URL"));
                if(jSONObject1.has("EXPIRATION_TIME_MS")) {
                    fmag0.e(jSONObject1.getLong("EXPIRATION_TIME_MS"));
                }
                gfsx0 = gfsx.m(fmag0.a());
            }
            catch(JSONException jSONException1) {
                flbj.d(fmah.a, "failed to convert JSON Object to LinkPreview", jSONException1);
                gfsx0 = gfqx.a;
            }
            if(!gfsx0.i()) {
                flbj.c("fmad", "Fail to convert json object to link preview");
                return gfqx.a;
            }
            fmfo0.b(flzv.d(((fmah)gfsx0.d())));
            return gfsx.m(fmfo0.a());
        }
        catch(JSONException jSONException0) {
            flbj.d("fmad", "Fail to convert json object to link preview due to ", jSONException0);
            return gfqx.a;
        }
    }

    @Override  // flwr
    public final gfsx c(fmfp fmfp0) {
        gfsx gfsx1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("TYPE", fmfp0.a);
            Object object0 = ((gftm)fmab.a(flbm.g(fmfp0.b))).a;
            try {
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.put("MESSAGE_TEXT", ((fmah)object0).b);
                jSONObject1.put("TITLE", ((fmah)object0).c);
                jSONObject1.put("DESCRIPTION", ((fmah)object0).d);
                jSONObject1.put("IMAGE_URL", ((fmah)object0).e);
                jSONObject1.put("DOMAIN", ((fmah)object0).f);
                jSONObject1.put("CANONICAL_URL", ((fmah)object0).g);
                gfsx gfsx0 = ((fmah)object0).i;
                if(gfsx0.i()) {
                    jSONObject1.put("EXPIRATION_TIME_MS", gfsx0.d());
                }
                gfsx1 = gfsx.m(jSONObject1);
            }
            catch(JSONException jSONException1) {
                flbj.d("fmah", "Failed to convert LinkPreview to JSONObject.", jSONException1);
                gfsx1 = gfqx.a;
            }
            if(gfsx1.i()) {
                jSONObject0.put("CONTENT", gfsx1.d());
                return gfsx.m(jSONObject0);
            }
        }
        catch(JSONException jSONException0) {
            flbj.d("fmad", "Fail to convert link preview to json object due to ", jSONException0);
        }
        return gfqx.a;
    }

    @Override  // flwr
    public final ProtoLiteBuilder d(fmga fmga0) {
        gfsx gfsx0 = gfqx.a;
        if(fmga0.f.a() == 3 && fmga0.f.b().a.equals("link_preview")) {
            gfsx0 = flzv.a(fmga0);
        }
        if(!gfsx0.i()) {
            flbj.c(fmad.a, "Attempted to convert non-link preview message");
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
            hnsv hnsv0 = hnsv.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hnub hnub0 = (hnub)hftp0.b_message;
            hnub0.n = hnsv0.a();
            return hftp0;
        }
        Object object0 = gfsx0.d();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hnub.a).v_newBuilder();
        hnsv hnsv1 = hnsv.c;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub1 = (hnub)hftp1.b_message;
        hnub1.n = hnsv1.a();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hnuh.a).v_newBuilder();
        String s = ((fmah)object0).b;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hnuh hnuh0 = (hnuh)hftp2.b_message;
        s.getClass();
        hnuh0.b = s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        hnub hnub2 = (hnub)hftp1.b_message;
        hnuh hnuh1 = (hnuh)hftp2.N_build();
        hnuh1.getClass();
        hnub2.f = hnuh1;
        hnub2.e = 102;
        return hftp1;
    }
}

