import android.content.Context;
import android.net.Uri.Builder;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import j..util.Map.-EL;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public final class rhk {
    public final rhp a;
    private final Context b;
    private final int c;
    private final String d;
    private final String e;
    private final TelephonyManager f;

    public rhk(Context context0, int v, rhp rhp0, String s) {
        String s1;
        this.b = context0;
        this.c = v;
        this.a = rhp0;
        this.d = s;
        try {
            s1 = "";
            s1 = context0.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionName;
        }
        catch(Exception unused_ex) {
        }
        this.e = s1;
        this.f = ((TelephonyManager)this.b.getSystemService(TelephonyManager.class)).createForSubscriptionId(this.c);
    }

    public final rhu a(String s, rgw rgw0, String s1, String s2, ggeo ggeo0) {
        rhr rhr0 = rhs.a();
        rhr0.e(s);
        rhr0.a = "GET";
        rhr0.c("Accept", s1);
        rhr0.c("User-Agent", s2);
        rhr0.d(rgw0.d);
        rhr0.c = rgw0.e;
        rhr0.d = rgw0.g;
        Map.-EL.forEach(ggeo0, new rhj(rhr0));
        rhs rhs0 = rhr0.a();
        return this.a.a(rhs0);
    }

    public final rhu b(JSONObject jSONObject0, rgw rgw0, String s, String s1, ggeo ggeo0) {
        return this.n(jSONObject0, rgw0, s, s1, "application/json", ggna.a, ggeo0);
    }

    public final rhu c(rgw rgw0, String s, gged_interceptors gged0, int v, String s1, String s2, ggeo ggeo0) {
        String s3 = this.d;
        if(!s3.isEmpty()) {
            return this.m(s3, rgw0, gged0, "application/vnd.gsma.eap-relay.v1.0+json, " + s1, s2, ggeo0);
        }
        rhl rhl0 = rhl.a(s);
        rhm rhm0 = rhm.a(this.b, this.c, rhl0, rgw0.f);
        String s4 = rhm0.a;
        if(s4 != null) {
            rhu rhu0 = this.m(s4, rgw0, gged0, "application/vnd.gsma.eap-relay.v1.0+json, " + s1, s2, ggeo0);
            String s5 = rhk.l(rhu0);
            if(s5 == null) {
                return rhu0;
            }
            if(v > 0) {
                return this.c(rgw0, s5, gged0, v - 1, s1, s2, ggeo0);
            }
            throw new rhb(22, "Unable to EAP-AKA authenticate");
        }
        String s6 = rhm0.b;
        if(s6 == null) {
            throw new AssertionError("EapAkaResponse invalid.");
        }
        rhu rhu1 = this.m(s6, rgw0, gged0, "application/vnd.gsma.eap-relay.v1.0+json", s2, ggeo0);
        String s7 = rhk.l(rhu1);
        if(s7 == null) {
            throw new rhb(0x20, "Failed to parse EAP-AKA challenge: " + rhu1.b);
        }
        if(v > 0) {
            return this.c(rgw0, s7, gged0, v - 1, s1, s2, ggeo0);
        }
        throw new rhb(21, "Unable to recover from EAP-AKA synchroinization failure");
    }

    public static String d(String s, String s1, String s2) {
        if(s == null || s.length() < 5 || s1 == null) {
            throw new rhb(11, String.format("Invalid imsi or mccmnc. imsi: %s, mccmnc: %s", s1, s));
        }
        String s3 = s.substring(3);
        return "0" + s1 + "@" + s2 + ".mnc" + (s3.length() == 2 ? "0" + s3 : s.substring(3)) + ".mcc" + s.substring(0, 3) + ".3gppnetwork.org";
    }

    public final String e(String s, String s1, String s2, String s3) {
        return String.format("PRD-TS43 term-%s/%s %s/%s OS-Android/%s", rhk.o(s1, 4), rhk.o(s2, 10), s, this.e, rhk.o(s3, 20));
    }

    public final void f(Uri.Builder uri$Builder0, rhd rhd0, rgw rgw0) {
        String s = rhd0.c;
        if(TextUtils.isEmpty(s)) {
            String s1 = rhd0.d;
            if(!TextUtils.isEmpty(s1)) {
                uri$Builder0.appendQueryParameter("temporary_token", s1);
                return;
            }
            uri$Builder0.appendQueryParameter("EAP_ID", rhk.d(this.f.getSimOperator(), this.f.getSubscriberId(), rgw0.f));
            return;
        }
        uri$Builder0.appendQueryParameter("IMSI", this.f.getSubscriberId()).appendQueryParameter("token", s);
    }

    public final void g(JSONObject jSONObject0, rhd rhd0, rgw rgw0) {
        try {
            String s = rhd0.c;
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("IMSI", this.f.getSubscriberId());
                jSONObject0.put("token", s);
                return;
            }
            String s1 = rhd0.d;
            if(!TextUtils.isEmpty(s1)) {
                jSONObject0.put("temporary_token", s1);
                return;
            }
            jSONObject0.put("EAP_ID", rhk.d(this.f.getSimOperator(), this.f.getSubscriberId(), rgw0.f));
        }
        catch(JSONException jSONException0) {
            throw new rhb(1, "Failed to compose JSON", jSONException0);
        }
    }

    public final void h(Uri.Builder uri$Builder0, gged_interceptors gged0, rhd rhd0) {
        String s = rhd0.k;
        if(!TextUtils.isEmpty(s)) {
            uri$Builder0.appendQueryParameter("notif_action", Integer.toString(rhd0.l)).appendQueryParameter("notif_token", s);
        }
        String s1 = rhd0.e;
        if(TextUtils.isEmpty(s1)) {
            uri$Builder0.appendQueryParameter("terminal_id", this.f.getImei());
        }
        else {
            uri$Builder0.appendQueryParameter("terminal_id", s1);
        }
        String s2 = rhd0.o;
        if(!TextUtils.isEmpty(s2)) {
            uri$Builder0.appendQueryParameter("GID1", s2);
        }
        else if(new BigDecimal(rhd0.b).intValue() >= 12) {
            uri$Builder0.appendQueryParameter("GID1", this.f.getGroupIdLevel1());
        }
        rhk.j(uri$Builder0, "app_version", rhd0.j);
        rhk.j(uri$Builder0, "app_name", rhd0.i);
        rhk.j(uri$Builder0, "boost_type", rhd0.n);
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            uri$Builder0.appendQueryParameter("app", ((String)gged0.get(v1)));
        }
        uri$Builder0.appendQueryParameter("terminal_vendor", rhk.o(rhd0.f, 4)).appendQueryParameter("terminal_model", rhk.o(rhd0.g, 10)).appendQueryParameter("terminal_sw_version", rhk.o(rhd0.h, 20)).appendQueryParameter("vers", Integer.toString(rhd0.a)).appendQueryParameter("entitlement_version", rhd0.b);
    }

    public final void i(JSONObject jSONObject0, gged_interceptors gged0, rhd rhd0) {
        try {
            String s = rhd0.k;
            if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("notif_action", Integer.toString(rhd0.l));
                jSONObject0.put("notif_token", s);
            }
            String s1 = rhd0.e;
            if(TextUtils.isEmpty(s1)) {
                jSONObject0.put("terminal_id", this.f.getImei());
            }
            else {
                jSONObject0.put("terminal_id", s1);
            }
            String s2 = rhd0.o;
            if(!TextUtils.isEmpty(s2)) {
                jSONObject0.put("GID1", s2);
            }
            else if(new BigDecimal(rhd0.b).intValue() >= 12) {
                jSONObject0.put("GID1", this.f.getGroupIdLevel1());
            }
            rhk.k(jSONObject0, "app_version", rhd0.j);
            rhk.k(jSONObject0, "app_name", rhd0.i);
            rhk.k(jSONObject0, "boost_type", rhd0.n);
            if(((ggna)gged0).c == 1) {
                rhk.k(jSONObject0, "app", ((String)gged0.get(0)));
            }
            else {
                rhk.k(jSONObject0, "app", a.T(gged0, "[", ",", "]"));
            }
            rhk.k(jSONObject0, "terminal_vendor", rhk.o(rhd0.f, 4));
            rhk.k(jSONObject0, "terminal_model", rhk.o(rhd0.g, 10));
            rhk.k(jSONObject0, "terminal_sw_version", rhk.o(rhd0.h, 20));
            rhk.k(jSONObject0, "vers", Integer.toString(rhd0.a));
            rhk.k(jSONObject0, "entitlement_version", rhd0.b);
        }
        catch(JSONException jSONException0) {
            throw new rhb(1, "Failed to compose JSON", jSONException0);
        }
    }

    public static final void j(Uri.Builder uri$Builder0, String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            uri$Builder0.appendQueryParameter(s, s1);
        }
    }

    public static final void k(JSONObject jSONObject0, String s, String s1) {
        if(!TextUtils.isEmpty(s1)) {
            jSONObject0.put(s, s1);
        }
    }

    public static final String l(rhu rhu0) {
        String s = rhu0.b;
        int v = rhu0.a;
        if(v == 0) {
            try {
                return new JSONObject(s).optString("eap-relay-packet", null);
            }
            catch(JSONException jSONException0) {
                throw new rhb(0x20, "Failed to parse json object", jSONException0);
            }
        }
        if(v == 1) {
            return null;
        }
        throw new rhb(0x20, "Unknown HTTP content type");
    }

    private final rhu m(String s, rgw rgw0, gged_interceptors gged0, String s1, String s2, ggeo ggeo0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("eap-relay-packet", s);
            return this.n(jSONObject0, rgw0, s1, s2, "application/vnd.gsma.eap-relay.v1.0+json", gged0, ggeo0);
        }
        catch(JSONException jSONException0) {
            throw new rhb(0x20, "Failed to put post data", jSONException0);
        }
    }

    private final rhu n(JSONObject jSONObject0, rgw rgw0, String s, String s1, String s2, gged_interceptors gged0, ggeo ggeo0) {
        rhr rhr0 = rhs.a();
        rhr0.e(rgw0.a);
        rhr0.a = "POST";
        rhr0.b = jSONObject0;
        rhr0.c("Accept", s);
        rhr0.c("Content-Type", s2);
        rhr0.b().c("Cookie", gged0);
        rhr0.c("User-Agent", s1);
        rhr0.d(rgw0.d);
        rhr0.c = rgw0.e;
        rhr0.d = rgw0.g;
        Map.-EL.forEach(ggeo0, new rhi(rhr0));
        rhs rhs0 = rhr0.a();
        return this.a.a(rhs0);
    }

    private static final String o(String s, int v) {
        return s.substring(0, Math.min(s.length(), v));
    }
}

