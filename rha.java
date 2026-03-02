import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.SystemProperties;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class rha {
    private final rgw a;
    private final rhk b;

    public rha(Context context0, rgw rgw0, int v) {
        this(context0, rgw0, v, false);
    }

    public rha(Context context0, rgw rgw0, int v, boolean z) {
        String s = SystemProperties.get("persist.entitlement.fake_eap_aka_response");
        if(TextUtils.isEmpty(s) || !rib.b()) {
            s = "";
        }
        this(context0, rgw0, v, z, s);
    }

    public rha(Context context0, rgw rgw0, int v, boolean z, String s) {
        this.a = rgw0;
        this.b = new rhk(context0, v, new rhp(z), s);
    }

    public final rhu a(gged_interceptors gged0, rhd rhd0) {
        rhu rhu0;
        JSONObject jSONObject0;
        rhk rhk0 = this.b;
        rgw rgw0 = this.a;
        boolean z = rgw0.c;
        ggeo ggeo0 = ggnf.a;
        Uri.Builder uri$Builder0 = null;
        if(z) {
            jSONObject0 = new JSONObject();
            rhk0.g(jSONObject0, rhd0, rgw0);
            rhk0.i(jSONObject0, gged0, rhd0);
        }
        else {
            Uri.Builder uri$Builder1 = Uri.parse(rgw0.a).buildUpon();
            rhk0.f(uri$Builder1, rhd0, rgw0);
            rhk0.h(uri$Builder1, gged0, rhd0);
            jSONObject0 = null;
            uri$Builder0 = uri$Builder1;
        }
        String s = rhk0.e(rgw0.b, rhd0.f, rhd0.g, rhd0.h);
        if(!TextUtils.isEmpty(rhd0.c)) {
            if(z) {
                gftb.check(jSONObject0);
                return rhk0.b(jSONObject0, rgw0, rhd0.m, s, ggeo0);
            }
            gftb.check(uri$Builder0);
            return rhk0.a(uri$Builder0.toString(), rgw0, rhd0.m, s, ggeo0);
        }
        if(z) {
            gftb.check(jSONObject0);
            rhu0 = rhk0.b(jSONObject0, rgw0, "application/vnd.gsma.eap-relay.v1.0+json", s, ggeo0);
        }
        else {
            gftb.check(uri$Builder0);
            rhu0 = rhk0.a(uri$Builder0.toString(), rgw0, "application/vnd.gsma.eap-relay.v1.0+json", s, ggeo0);
        }
        String s1 = rhk.l(rhu0);
        if(s1 != null) {
            return rhk0.c(rgw0, s1, rhq.a(rhu0.e).b(), 3, rhd0.m, s, ggeo0);
        }
        throw new rhb(0x20, "Failed to parse EAP-AKA challenge: " + rhu0.b);
    }

    public final String b(String s, rhd rhd0, rgz rgz0) {
        rhu rhu0;
        ggeo ggeo1;
        rhk rhk1;
        rgw rgw2;
        Uri.Builder uri$Builder0;
        rgw rgw1;
        JSONObject jSONObject0;
        rhk rhk0 = this.b;
        rgw rgw0 = this.a;
        boolean z = rgw0.c;
        ggeo ggeo0 = ggnf.a;
        if(z) {
            jSONObject0 = new JSONObject();
            rhk0.g(jSONObject0, rhd0, rgw0);
            rgw1 = rgw0;
            rhk0.i(jSONObject0, gged_interceptors.l(s), rhd0);
            try {
                jSONObject0.put("operation", rgz0.a);
                int v = rgz0.b;
                if(v != -1) {
                    jSONObject0.put("operation_type", Integer.toString(v));
                }
                rhk.k(jSONObject0, "operation_targets", TextUtils.join(",", rgz0.e));
                rhk.k(jSONObject0, "companion_terminal_id", rgz0.f);
                rhk.k(jSONObject0, "companion_terminal_vendor", rgz0.g);
                rhk.k(jSONObject0, "companion_terminal_model", rgz0.h);
                rhk.k(jSONObject0, "companion_terminal_sw_version", rgz0.i);
                rhk.k(jSONObject0, "companion_terminal_friendly_name", rgz0.j);
                rhk.k(jSONObject0, "companion_terminal_service", rgz0.k);
                rhk.k(jSONObject0, "companion_terminal_iccid", rgz0.l);
                rhk.k(jSONObject0, "companion_terminal_eid", rgz0.m);
                rhk.k(jSONObject0, "terminal_iccid", rgz0.n);
                rhk.k(jSONObject0, "terminal_eid", rgz0.o);
                rhk.k(jSONObject0, "target_terminal_id", rgz0.p);
                gged_interceptors gged0 = rgz0.q;
                int v1 = gged0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    String s1 = (String)gged0.get(v2);
                    if(!TextUtils.isEmpty(s1)) {
                        jSONObject0.put("target_terminal_imeis", s1);
                    }
                }
                rhk.k(jSONObject0, "target_terminal_iccid", rgz0.r);
                rhk.k(jSONObject0, "target_terminal_eid", rgz0.s);
                rhk.k(jSONObject0, "target_terminal_sn", rgz0.t);
                rhk.k(jSONObject0, "target_terminal_model", rgz0.u);
                rhk.k(jSONObject0, "target_terminal_entitlement_protocol", rgz0.v);
                rhk.k(jSONObject0, "old_terminal_iccid", rgz0.x);
                rhk.k(jSONObject0, "old_terminal_id", rgz0.w);
                rhk.k(jSONObject0, "old_terminal_entitlement_protocol", rgz0.y);
                rhk.k(jSONObject0, "MSG_response", rgz0.z);
                rhk.k(jSONObject0, "MSG_btn", rgz0.A);
                rhk.k(jSONObject0, "ipv6_addr", rgz0.c);
                rhk.k(jSONObject0, "ipv4_addr", rgz0.d);
                uri$Builder0 = null;
            }
            catch(JSONException jSONException0) {
                throw new rhb(1, "Failed to compose JSON", jSONException0);
            }
        }
        else {
            Uri.Builder uri$Builder1 = Uri.parse(rgw0.a).buildUpon();
            rhk0.f(uri$Builder1, rhd0, rgw0);
            rgw1 = rgw0;
            rhk0.h(uri$Builder1, gged_interceptors.l(s), rhd0);
            uri$Builder1.appendQueryParameter("operation", rgz0.a);
            int v3 = rgz0.b;
            if(v3 != -1) {
                uri$Builder1.appendQueryParameter("operation_type", Integer.toString(v3));
            }
            rhk.j(uri$Builder1, "operation_targets", TextUtils.join(",", rgz0.e));
            rhk.j(uri$Builder1, "companion_terminal_id", rgz0.f);
            rhk.j(uri$Builder1, "companion_terminal_vendor", rgz0.g);
            rhk.j(uri$Builder1, "companion_terminal_model", rgz0.h);
            rhk.j(uri$Builder1, "companion_terminal_sw_version", rgz0.i);
            rhk.j(uri$Builder1, "companion_terminal_friendly_name", rgz0.j);
            rhk.j(uri$Builder1, "companion_terminal_service", rgz0.k);
            rhk.j(uri$Builder1, "companion_terminal_iccid", rgz0.l);
            rhk.j(uri$Builder1, "companion_terminal_eid", rgz0.m);
            rhk.j(uri$Builder1, "terminal_iccid", rgz0.n);
            rhk.j(uri$Builder1, "terminal_eid", rgz0.o);
            rhk.j(uri$Builder1, "target_terminal_id", rgz0.p);
            gged_interceptors gged1 = rgz0.q;
            int v4 = gged1.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                String s2 = (String)gged1.get(v5);
                if(!TextUtils.isEmpty(s2)) {
                    uri$Builder1.appendQueryParameter("target_terminal_imeis", s2);
                }
            }
            rhk.j(uri$Builder1, "target_terminal_iccid", rgz0.r);
            rhk.j(uri$Builder1, "target_terminal_eid", rgz0.s);
            rhk.j(uri$Builder1, "target_terminal_sn", rgz0.t);
            rhk.j(uri$Builder1, "target_terminal_model", rgz0.u);
            rhk.j(uri$Builder1, "target_terminal_entitlement_protocol", rgz0.v);
            rhk.j(uri$Builder1, "old_terminal_iccid", rgz0.x);
            rhk.j(uri$Builder1, "old_terminal_id", rgz0.w);
            rhk.j(uri$Builder1, "old_terminal_entitlement_protocol", rgz0.y);
            rhk.j(uri$Builder1, "MSG_response", rgz0.z);
            rhk.j(uri$Builder1, "MSG_btn", rgz0.A);
            jSONObject0 = null;
            uri$Builder0 = uri$Builder1;
        }
        String s3 = rhk0.e(rgw1.b, rhd0.f, rhd0.g, rhd0.h);
        if(TextUtils.isEmpty(rhd0.c) && TextUtils.isEmpty(rhd0.d)) {
            if(z) {
                gftb.check(jSONObject0);
                rgw2 = rgw1;
                rhk1 = rhk0;
                ggeo1 = ggeo0;
                rhu0 = rhk1.b(jSONObject0, rgw2, "application/vnd.gsma.eap-relay.v1.0+json", s3, ggeo1);
            }
            else {
                rgw2 = rgw1;
                rhk1 = rhk0;
                ggeo1 = ggeo0;
                gftb.check(uri$Builder0);
                rhu0 = rhk1.a(uri$Builder0.toString(), rgw2, "application/vnd.gsma.eap-relay.v1.0+json", s3, ggeo1);
            }
            String s4 = rhk.l(rhu0);
            if(s4 != null) {
                return rhk1.c(rgw2, s4, rhq.a(rhu0.e).b(), 3, rhd0.m, s3, ggeo1).b;
            }
            throw new rhb(0x20, "Failed to parse EAP-AKA challenge: " + rhu0.b);
        }
        if(z) {
            gftb.check(jSONObject0);
            return rhk0.b(jSONObject0, rgw1, rhd0.m, s3, ggeo0).b;
        }
        gftb.check(uri$Builder0);
        return rhk0.a(uri$Builder0.toString(), rgw1, rhd0.m, s3, ggeo0).b;
    }

    public final String c(gged_interceptors gged0, rhd rhd0) {
        return this.a(gged0, rhd0).b;
    }

    public final String d(String s, rhd rhd0) {
        return this.c(gged_interceptors.l(s), rhd0);
    }

    public final List e() {
        return this.b.a.a;
    }

    public final void f() {
        this.b.a.a.clear();
    }
}

