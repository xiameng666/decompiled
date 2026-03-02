import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import com.google.android.gms.mobiledataplan.service.background.GetCpidBackgroundTask.GetCpidCallback;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public final class cryv extends clcy {
    final ByteArrayOutputStream a;
    final GetCpidBackgroundTask.GetCpidCallback b;

    public cryv(GetCpidBackgroundTask.GetCpidCallback getCpidBackgroundTask$GetCpidCallback0, ByteArrayOutputStream byteArrayOutputStream0, ByteArrayOutputStream byteArrayOutputStream1) {
        this.a = byteArrayOutputStream1;
        Objects.requireNonNull(getCpidBackgroundTask$GetCpidCallback0);
        this.b = getCpidBackgroundTask$GetCpidCallback0;
        super(byteArrayOutputStream0);
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        boolean z;
        ByteArrayOutputStream byteArrayOutputStream0;
        cryw cryw0;
        GetCpidBackgroundTask.GetCpidCallback getCpidBackgroundTask$GetCpidCallback0;
        try {
            getCpidBackgroundTask$GetCpidCallback0 = this.b;
            cryw0 = getCpidBackgroundTask$GetCpidCallback0.d;
            byteArrayOutputStream0 = this.a;
            z = false;
            bboh bboh0 = cryw.a;
            ((ggtj)bboh0.j()).R("%s HandleCpidResponse:{%s}", "BgTaskGetCpid:", new gpnd(gpnc.b, byteArrayOutputStream0.toString()));
            JSONObject jSONObject0 = new JSONObject(byteArrayOutputStream0.toString());
            MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0 = new MdpCarrierPlanIdResponse(jSONObject0.getString("cpid"), jSONObject0.getLong("ttlSeconds"));
            int v = cryw0.c;
            crxn.c().F(mdpCarrierPlanIdResponse0, ((long)v), 16);
            boolean z1 = crvw.c().y(cryw0.e, cryw0.f, mdpCarrierPlanIdResponse0.a, mdpCarrierPlanIdResponse0.b);
            crxn crxn0 = crxn.c();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((giyo)hftv0).b = 4;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((giyo)hftp0.b_message).c = z1;
            crxn0.j(((giyo)hftp0.N_build()), "MDP_BgTask", Integer.valueOf(v));
            if(z1) {
                z = true;
            }
            else {
                cryw0.a(27050L);
                ((ggtj)bboh0.j()).B("%s Unable to save data to cache.", "BgTaskGetCpid:");
            }
        }
        catch(JSONException jSONException0) {
            ((ggtj)((ggtj)cryw.a.i()).s(jSONException0)).R("%s Unable to parse json from carrier:{%s}", "BgTaskGetCpid:", new gpnd(gpnc.b, byteArrayOutputStream0.toString()));
            ((ggtj)cryw.a.j()).B("%s MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response.", "BgTaskGetCpid:");
            cryw0.a(27008L);
        }
        getCpidBackgroundTask$GetCpidCallback0.c = Boolean.valueOf(z);
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        a.ae(cryw.a.j(), "getCpid background task failed to send request or read response.", clbw0);
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ((ggtj)cryw.a.j()).B("MDP_SERVER_CARRIER_INVALID_RESPONSE. getCpid background task received invalid URL redirect: %s", s);
        this.b.d.a(27008L);
        throw new UnsupportedOperationException("Redirect is unsupported for GetCpidBackgroundTask.");
    }
}

