import j..util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class dmln extends clcy {
    private final icbi a;

    public dmln(icbi icbi0) {
        super(new ByteArrayOutputStream());
        this.a = icbi0;
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        JSONArray jSONArray0;
        if(clcq0.a() == 200) {
            String s = ((ByteArrayOutputStream)this.i()).toString();
            ibuq.e(s, "toString(...)");
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                Object object0 = jSONObject0.get("responseContext");
                ibuq.d(object0, "null cannot be cast to non-null type org.json.JSONObject");
                Object object1 = ((JSONObject)object0).get("responseCode");
                ibuq.e(object1, "get(...)");
                if(ibuq.m(object1, "0000")) {
                    if(jSONObject0.has("apduCommands")) {
                        Object object2 = jSONObject0.get("apduCommands");
                        ibuq.d(object2, "null cannot be cast to non-null type org.json.JSONArray");
                        jSONArray0 = (JSONArray)object2;
                    }
                    else if(jSONObject0.has("apduCommandList")) {
                        Object object3 = jSONObject0.get("apduCommandList");
                        ibuq.d(object3, "null cannot be cast to non-null type org.json.JSONArray");
                        jSONArray0 = (JSONArray)object3;
                    }
                    else {
                        jSONArray0 = null;
                    }
                    if(jSONArray0 == null) {
                        throw new JSONException("Empty apduCommands");
                    }
                    fswv fswv0 = (fswv)((ProtoLiteMessage)fsww.a).v_newBuilder();
                    ibuq.f(fswv0, "builder");
                    List list0 = DesugarCollections.unmodifiableList(((fsww)fswv0.b_message).e);
                    ibuq.e(list0, "getApduCommandsList(...)");
                    new hfxu(list0);
                    dmlm dmlm0 = new dmlm();
                    ibwm ibwm0 = ibwt.q(0, jSONArray0.length());
                    ArrayList arrayList0 = new ArrayList(ibpo.q(ibwm0, 10));
                    ibpw ibpw0 = ibwm0.e();
                    while(((ibwl)ibpw0).a) {
                        int v = ibpw0.a();
                        Object object4 = jSONArray0.get(v);
                        ibuq.d(object4, "null cannot be cast to non-null type org.json.JSONObject");
                        arrayList0.add(dmlm0.a(Integer.valueOf(v), ((JSONObject)object4)));
                    }
                    fswv0.a(arrayList0);
                    ProtoLiteMessage hftv0 = ((ProtoLiteBuilder)fswv0).N_build();
                    ibuq.e(hftv0, "build(...)");
                    this.a.w(((fsww)hftv0));
                    return;
                }
                Object object5 = ((JSONObject)object0).get("responseMessage");
                ibuq.e(object5, "get(...)");
                throw new JSONException(a.m(object5, object1, "Failed to fetch iPASS perso script with response code: ", ", message: "));
            }
            catch(JSONException jSONException0) {
                this.a.w(ibnx.a(new dmkz(a.L(jSONException0, s, "Failed to parse response JSON: ", ", exception: "))));
                return;
            }
        }
        Object object6 = ibnx.a(new dmkz(a.aD(((clex)clcq0), "Failed to fetch iPASS perso script with status code ")));
        this.a.w(object6);
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        Object object0 = ibnx.a(clbw0);
        this.a.w(object0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ibuq.f(clcn0, "request");
        ibuq.f(s, "newLocationUrl");
        Object object0 = ibnx.a(new dmkz("Redirected unexpectedly"));
        this.a.w(object0);
    }
}

