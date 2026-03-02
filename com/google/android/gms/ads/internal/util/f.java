package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.client.w;
import com.google.android.gms.ads.internal.state.a;
import com.google.android.gms.ads.internal.util.client.h;
import org.json.JSONException;
import org.json.JSONObject;

public final class f implements Runnable {
    public final g a;
    public final Context b;
    public final String c;

    public f(g g0, Context context0) {
        this.a = g0;
        this.b = context0;
        this.c = "admob";
    }

    @Override
    public final void run() {
        SharedPreferences sharedPreferences0 = this.b.getSharedPreferences(this.c, 0);
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        g g0 = this.a;
        try {
            synchronized(g0.a) {
                g0.f = sharedPreferences0;
                g0.g = sharedPreferences$Editor0;
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                g0.h = g0.f.getBoolean("use_https", g0.h);
                g0.t = g0.f.getBoolean("content_url_opted_out", g0.t);
                g0.i = g0.f.getString("content_url_hashes", g0.i);
                g0.k = g0.f.getBoolean("gad_idless", g0.k);
                g0.u = g0.f.getBoolean("content_vertical_opted_out", g0.u);
                g0.j = g0.f.getString("content_vertical_hashes", g0.j);
                g0.r = g0.f.getInt("version_code", g0.r);
                g0.n = ((Boolean)com.google.android.gms.ads.internal.flag.g.e.d()).booleanValue() && w.b().i ? new a("", 0L) : new a(g0.f.getString("app_settings_json", g0.n.a), g0.f.getLong("app_settings_last_update_ms", g0.n.b));
                g0.o = g0.f.getLong("app_last_background_time_ms", g0.o);
                g0.q = g0.f.getInt("request_in_session_count", g0.q);
                g0.p = g0.f.getLong("first_ad_req_time_ms", g0.p);
                g0.s = g0.f.getStringSet("never_pool_slots", g0.s);
                g0.v = g0.f.getString("display_cutout", g0.v);
                g0.A = g0.f.getInt("app_measurement_npa", g0.A);
                g0.B = g0.f.getInt("sd_app_measure_npa", g0.B);
                g0.C = g0.f.getLong("sd_app_measure_npa_ts", g0.C);
                g0.w = g0.f.getString("inspector_info", g0.w);
                g0.x = g0.f.getBoolean("linked_device", g0.x);
                g0.y = g0.f.getString("linked_ad_unit", g0.y);
                g0.z = g0.f.getString("inspector_ui_storage", g0.z);
                g0.l = g0.f.getString("IABTCF_TCString", g0.l);
                g0.m = g0.f.getInt("gad_has_consent_for_cookies", g0.m);
                try {
                    new JSONObject(g0.f.getString("native_advanced_settings", "{}"));
                }
                catch(JSONException jSONException0) {
                    h.m("Could not convert native advanced settings to json object", jSONException0);
                }
                g0.b();
            }
        }
        catch(Throwable throwable0) {
            c.d().c(throwable0, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
        }
    }
}

