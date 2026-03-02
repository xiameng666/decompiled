import android.content.Intent;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ahfe implements bxmw {
    public final ahfm a;

    public ahfe(ahfm ahfm0) {
        this.a = ahfm0;
    }

    @Override  // bxmw
    public final gmcd a() {
        String s4;
        String s3;
        ahfm ahfm0 = this.a;
        ahfm0.e.b();
        Intent intent0 = ahfm0.a;
        if(intent0 == null) {
            throw bxma.f(0x6F25, "Intent is null. Cannot retrieve request data.");
        }
        afgi afgi0 = (afgi)afgi.a.b();
        kwx kwx0 = kws.b(intent0);
        if(kwx0 == null) {
            throw bxma.f(0x6F25, "Failed to retrieve ProviderGetCredentialRequest from intent.");
        }
        bxjk bxjk0 = new bxjk(hplc.a.b().d(), ggnf.a);
        String s = kwx0.b.a;
        if(!bxjk0.a(s)) {
            throw bxma.e(0x6F1B);
        }
        List list0 = kwx0.a;
        if(list0.isEmpty() || list0.size() > 1) {
            throw bxma.h(10, "Expected exactly 1 CredentialOption, but found: %s", new Object[]{list0.size()});
        }
        kjn kjn0 = (kjn)list0.get(0);
        if(!(kjn0 instanceof kkc)) {
            throw bxma.h(10, "Expected the only CredentialOption to be GetDigitalCredentialOption, but found: %s", new Object[]{kjn0.getClass().getName()});
        }
        String s1 = intent0.getStringExtra("androidx.credentials.registry.provider.extra.CREDENTIAL_ID");
        if(s1 == null || s1.trim().isEmpty()) {
            throw bxma.h(0x6F25, "Intent extra \'%s\' is missing or empty.", new Object[]{"androidx.credentials.registry.provider.extra.CREDENTIAL_ID"});
        }
        ggdy ggdy0 = new ggdy();
        String s2 = ((kkc)kjn0).g;
        try {
            JSONObject jSONObject0 = new JSONObject(s2);
            if(jSONObject0.has("digital")) {
                JSONArray jSONArray0 = ahbd.b(jSONObject0.getJSONObject("digital"), "requests");
                if(jSONArray0.length() != 1) {
                    throw bxma.h(10, "JSON field \'%s\' is not an array of length 1.", new Object[]{"requests"});
                }
                JSONObject jSONObject1 = jSONArray0.getJSONObject(0);
                if(!jSONObject1.has("protocol")) {
                    throw bxma.h(10, "JSON field \'%s\' is missing or null.", new Object[]{"protocol"});
                }
                if(!jSONObject1.getString("protocol").equals("openid4vp-v1-unsigned")) {
                    throw bxma.h(10, "JSON field \'%s\' has invalid value, it should be \'%s\'.", new Object[]{"protocol", "openid4vp-v1-unsigned"});
                }
                jSONObject0 = jSONObject1.getJSONObject("data");
            }
            ahbd.c("response_type", ahbd.a(jSONObject0, "response_type"), "vp_token");
            ahbd.c("response_mode", ahbd.a(jSONObject0, "response_mode"), "dc_api");
            s3 = ahbd.a(jSONObject0, "nonce");
            if(!jSONObject0.has("dcql_query") || jSONObject0.isNull("dcql_query")) {
                throw bxma.h(10, "JSON field \'%s\' is missing or null.", new Object[]{"dcql_query"});
            }
            JSONArray jSONArray1 = ahbd.b(jSONObject0.getJSONObject("dcql_query"), "credentials");
            if(jSONArray1.length() != 1) {
                throw bxma.h(10, "JSON field \'%s\' is not an array of length 1.", new Object[]{"credentials"});
            }
            JSONObject jSONObject2 = jSONArray1.getJSONObject(0);
            s4 = ahbd.a(jSONObject2, "id");
            ahbd.c("format", ahbd.a(jSONObject2, "format"), "dc+sd-jwt");
            if(!jSONObject2.has("meta") || jSONObject2.isNull("meta")) {
                throw bxma.h(10, "JSON field \'%s\' is missing or null.", new Object[]{"meta"});
            }
            JSONArray jSONArray2 = ahbd.b(jSONObject2.getJSONObject("meta"), "vct_values");
            if(jSONArray2.length() != 1) {
                throw bxma.h(10, "JSON field \'%s\' is not an array of length 1.", new Object[]{"vct_values"});
            }
            ahbd.c("vct_values", jSONArray2.getString(0), "UserInfoCredential");
            JSONArray jSONArray3 = ahbd.b(jSONObject2, "claims");
            if(jSONArray3.length() == 0) {
                throw bxma.h(10, "JSON field \'%s\' array is empty.", new Object[]{"claims"});
            }
            for(int v = 0; v < jSONArray3.length(); ++v) {
                JSONArray jSONArray4 = ahbd.b(jSONArray3.getJSONObject(v), "path");
                if(jSONArray4.length() != 1) {
                    throw bxma.h(10, "JSON field \'%s\' is not an array of length 1.", new Object[]{"path"});
                }
                String s5 = jSONArray4.getString(0);
                if(s5 == null || s5.trim().isEmpty()) {
                    throw bxma.h(10, "JSON field \'%s\' has empty element.", new Object[]{"path"});
                }
                ggdy0.i(s5);
            }
        }
        catch(JSONException jSONException0) {
            throw bxma.g(0x6F2E, jSONException0);
        }
        if(s3 == null) {
            throw new NullPointerException("Null nonce");
        }
        if(s4 == null) {
            throw new NullPointerException("Null credentialKey");
        }
        String s6 = String.valueOf(s);
        gged_interceptors gged0 = ggdy0.h();
        if(gged0 == null) {
            throw new NullPointerException("Null claims");
        }
        ahfm0.h = new ahbd(s1, s3, "android_package:" + s6, gged0, s4);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giwc.a).v_newBuilder();
        String s7 = ahfm0.h.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s7.getClass();
        ((giwc)hftv0).b |= 1;
        ((giwc)hftv0).c = s7;
        gged_interceptors gged1 = ahfm0.h.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        giwc giwc0 = (giwc)hftp0.b_message;
        hfuo hfuo0 = giwc0.d;
        if(!hfuo0.c()) {
            giwc0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(gged1, giwc0.d);
        giwc giwc1 = (giwc)hftp0.N_build();
        bxod bxod0 = ahfm0.f;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gixr)hftv1).d = 37;
        ((gixr)hftv1).b |= 1;
        String s8 = ahfm0.b;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp1.b_message;
        s8.getClass();
        ((gixr)hftv2).b |= 2;
        ((gixr)hftv2).e = s8;
        if(!hftv2.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp1.b_message;
        giwc1.getClass();
        gixr0.L = giwc1;
        gixr0.c |= 16;
        bxod0.a(((gixr)hftp1.N_build()));
        return ahfm0.g.b(bxqz.c);
    }
}

