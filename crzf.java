import android.content.ContentValues;
import android.content.Context;
import android.telephony.TelephonyManager;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import j..util.Objects;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import org.json.JSONException;
import org.json.JSONObject;

final class crzf extends clcy {
    final ByteArrayOutputStream a;
    final String b;
    final crzj d;

    public crzf(crzj crzj0, ByteArrayOutputStream byteArrayOutputStream0, ByteArrayOutputStream byteArrayOutputStream1, String s) {
        this.a = byteArrayOutputStream1;
        this.b = s;
        Objects.requireNonNull(crzj0);
        this.d = crzj0;
        super(byteArrayOutputStream0);
    }

    @Override  // clck
    public final void b(clcn clcn0, clcq clcq0) {
        ProtoLiteBuilder hftp0;
        boolean z;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse0;
        Integer integer1;
        String s;
        crzj crzj0;
        Level level0 = cslm.h();
        ggtj ggtj0 = crzj.a.g(level0);
        Integer integer0 = clcq0.a();
        ByteArrayOutputStream byteArrayOutputStream0 = this.a;
        ggtj0.X("getCpid Server statusCode: %s, Response: %s, from url: %s", integer0, byteArrayOutputStream0, this.b);
        if(clcq0.a() == 200) {
            try {
                crzj0 = this.d;
                s = byteArrayOutputStream0.toString();
                integer1 = null;
                JSONObject jSONObject0 = new JSONObject(s);
                mdpCarrierPlanIdResponse0 = new MdpCarrierPlanIdResponse(jSONObject0.getString("cpid"), jSONObject0.getLong("ttlSeconds"));
            }
            catch(JSONException jSONException0) {
                a.e(crzj.a.i(), "Unable to parse json from carrier:{%s}", new gpnd(gpnc.b, s), jSONException0);
                mdpCarrierPlanIdResponse0 = null;
            }
            if(mdpCarrierPlanIdResponse0 != null) {
                String s1 = mdpCarrierPlanIdResponse0.a;
                if(s1 != null && !s1.isEmpty()) {
                    if(hvko.a.q().H()) {
                        long v = mdpCarrierPlanIdResponse0.b;
                        if(v <= 0L) {
                            ((ggtj)crzj.a.j()).A("MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: %d", v);
                            crzj0.j(new Status(27053, "MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: " + s));
                            return;
                        }
                    }
                    crzj0.f = s1;
                    MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest0 = crzj0.c;
                    if(mdpCarrierPlanIdRequest0.c != null && crzj0.e.h != ((int)mdpCarrierPlanIdRequest0.c)) {
                        ((ggtj)crzj.a.j()).P("gRPC response object\'s EventFlowId did not match the one sent to GTAF: original=%s, received=%s", mdpCarrierPlanIdRequest0.c, crzj0.e.h);
                    }
                    if(mdpCarrierPlanIdRequest0.d != null && crzj0.e.g != ((long)mdpCarrierPlanIdRequest0.d)) {
                        ((ggtj)crzj.a.j()).Q("gRPC response object\'s UniqueRequestId did not match the one sent to GTAF: original=%s, received=%s", mdpCarrierPlanIdRequest0.d, crzj0.e.g);
                    }
                    MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse1 = new MdpCarrierPlanIdResponse(crwm.c().d(crzj0.f, mdpCarrierPlanIdRequest0.a), mdpCarrierPlanIdResponse0.b, crzj0.e.d, crzj0.e.e, crzj0.e.c, crzj0.f, 2, cryi.e((crzj0.e.f == null ? gsnm.a : crzj0.e.f)), mdpCarrierPlanIdRequest0.c, mdpCarrierPlanIdRequest0.d);
                    if(mdpCarrierPlanIdResponse1.a == null) {
                        ((ggtj)crzj.a.j()).R("Cannot find a matching client when CPID returns. Req:{%s} Rsp:{%s}", mdpCarrierPlanIdRequest0, mdpCarrierPlanIdResponse1);
                        crzj0.j(new Status(27005, a.ad(mdpCarrierPlanIdRequest0, mdpCarrierPlanIdResponse1, "MDP_INVALID_CARRIER_PLAN_ID. Cannot find a matching client. Req:", " Rsp:")));
                        return;
                    }
                    if(hvko.D() && !mdpCarrierPlanIdRequest0.c() && !crzj0.h.a.equals("AIzaSyCTa7aViyHnB3GLIqhL5hQFZGb675SoCIA")) {
                        if(hvjq.j()) {
                            z = crvw.c().d.k(crzj0.g, Long.valueOf(mdpCarrierPlanIdResponse1.e), mdpCarrierPlanIdResponse1.f, mdpCarrierPlanIdResponse1.b);
                        }
                        else {
                            crvw crvw0 = crvw.c();
                            gspd gspd0 = crzj0.e;
                            Context context0 = crzj0.d;
                            TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService(TelephonyManager.class);
                            crvx crvx0 = crvw0.d;
                            crwg crwg0 = crvx0.c(csli.g(context0));
                            if(crwg0 != null && crwg0.d() != null) {
                                hfyu hfyu0 = crwg0.d();
                                hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)hfyu0).jf(5, null);
                                hftp0.X(((ProtoLiteMessage)hfyu0));
                            }
                            else {
                                hftp0 = ((ProtoLiteMessage)hfyu.a).v_newBuilder();
                            }
                            crwf crwf0 = new crwf();
                            crwf0.b(Long.valueOf(mdpCarrierPlanIdResponse1.e));
                            crwf0.c(mdpCarrierPlanIdResponse1.f);
                            crwf0.f(Long.valueOf(0x7FFFFFFFFFFFFFFFL));
                            crwf0.g(csli.g(context0));
                            if(telephonyManager0 != null) {
                                integer1 = telephonyManager0.getSimState();
                            }
                            crwf0.k(integer1);
                            long v1 = mdpCarrierPlanIdResponse1.b;
                            long v2 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + v1;
                            if(!hftp0.b_message.isImmutable()) {
                                hftp0.ensureMutable();
                            }
                            ((hfyu)hftp0.b_message).e = v2;
                            crwf0.i(((hfyu)hftp0.N_build()));
                            boolean z1 = crvx0.i(crwf0.a());
                            ContentValues contentValues0 = new ContentValues();
                            crvz.c(Long.valueOf(mdpCarrierPlanIdResponse1.e), contentValues0);
                            contentValues0.put("expiration_time", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + v1));
                            crvz.d(gspd0, contentValues0);
                            if(!crvx0.g(crvz.a(contentValues0))) {
                                Level level1 = cslm.h();
                                crvw.c.g(level1).A("Failed to update carrier table with carrier ID %d", mdpCarrierPlanIdResponse1.e);
                            }
                            z = z1;
                        }
                        crxn crxn0 = crxn.c();
                        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)giyo.a).v_newBuilder();
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((giyo)hftv0).b = 4;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ((giyo)hftp1.b_message).c = z;
                        crxn0.j(((giyo)hftp1.N_build()), (crzj0.h == null ? "CLIENT_TestInvalid" : crzj0.h.c), Integer.valueOf((mdpCarrierPlanIdRequest0.c == null ? 0 : ((int)mdpCarrierPlanIdRequest0.c))));
                    }
                    else {
                        z = false;
                    }
                    crzj0.c(mdpCarrierPlanIdResponse1, false, z);
                    crzg crzg0 = new crzg(crzj0);
                    crzj0.i.execute(crzg0);
                    return;
                }
            }
            ((ggtj)crzj.a.j()).x("MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response.");
            crzj0.j(new Status(27008, "MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response: " + s));
            return;
        }
        String s2 = clcq0.e();
        this.d.j(this.d.b(s2, clcq0, this.b, this.a.toString()));
    }

    @Override  // clck
    public final void c(gfsx gfsx0, clbw clbw0) {
        a.ae(crzj.a.j(), "getCpid failed to send request or read response.", clbw0);
        Object object0 = gfsx0.d();
        this.d.j(this.d.b(clbw0.getMessage(), ((clcq)object0), this.b, this.a.toString()));
    }

    @Override  // clck
    public final void in(clcn clcn0, clcq clcq0, String s) {
        ((ggtj)crzj.a.j()).B("MDP_SERVER_CARRIER_INVALID_RESPONSE. getCpid received invalid URL redirect: %s", s);
        this.d.j(new Status(27008, "MDP_SERVER_CARRIER_INVALID_RESPONSE. getCpid received invalid URL redirect: " + s));
        throw new UnsupportedOperationException("GetCarrierPlanIdOperation does not support redirects");
    }
}

