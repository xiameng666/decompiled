package com.google.android.gms.ads.internal.state;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.i;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.mediation.b;
import com.google.android.gms.ads.internal.util.client.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public String a;
    public long b;
    public final List c;
    private final List d;
    private final List e;
    private final Map f;
    private JSONObject g;

    public a(String s, long v) {
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new HashMap();
        this.c = new ArrayList();
        this.a = s;
        this.b = v;
        if(!TextUtils.isEmpty(s)) {
            try {
                this.g = new JSONObject(s);
                if(!((Boolean)s.bO.g()).booleanValue() || !this.a()) {
                    if(this.g.optInt("status", -1) != 1) {
                        h.k("App settings could not be fetched successfully.");
                        return;
                    }
                    this.g.optString("app_id");
                    JSONArray jSONArray0 = this.g.optJSONArray("ad_unit_id_settings");
                    if(jSONArray0 != null) {
                        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                            JSONObject jSONObject0 = jSONArray0.getJSONObject(v1);
                            String s1 = jSONObject0.optString("format");
                            String s2 = jSONObject0.optString("ad_unit_id");
                            if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                                if("interstitial".equalsIgnoreCase(s1)) {
                                    this.e.add(s2);
                                }
                                else if("rewarded".equalsIgnoreCase(s1) || "rewarded_interstitial".equals(s1)) {
                                    JSONObject jSONObject1 = jSONObject0.optJSONObject("mediation_config");
                                    if(jSONObject1 != null) {
                                        b b0 = new b(jSONObject1);
                                        this.f.put(s2, b0);
                                    }
                                }
                            }
                        }
                    }
                    JSONArray jSONArray1 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
                    if(jSONArray1 != null) {
                        for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                            String s3 = jSONArray1.optString(v2);
                            this.d.add(s3);
                        }
                    }
                    if(((Boolean)s.aU.g()).booleanValue()) {
                        JSONObject jSONObject2 = this.g.optJSONObject("common_settings");
                        if(jSONObject2 != null) {
                            JSONArray jSONArray2 = jSONObject2.optJSONArray("loeid");
                            if(jSONArray2 != null) {
                                for(int v3 = 0; v3 < jSONArray2.length(); ++v3) {
                                    String s4 = jSONArray2.get(v3).toString();
                                    this.c.add(s4);
                                }
                            }
                        }
                    }
                    if(((Boolean)s.aS.g()).booleanValue()) {
                        JSONObject jSONObject3 = this.g.optJSONObject("common_settings");
                        if(jSONObject3 != null) {
                            jSONObject3.optBoolean("is_prefetching_enabled", false);
                        }
                    }
                }
                return;
            }
            catch(JSONException jSONException0) {
                goto label_57;
            }
        }
        return;
    label_57:
        h.m("Exception occurred while processing app setting json", jSONException0);
        c.d().c(jSONException0, "AppSettings.parseAppSettingsJson");
    }

    public final boolean a() {
        if(!TextUtils.isEmpty(this.a) && this.g != null) {
            i i0 = s.bR;
            long v = (long)(((Long)i0.g()));
            if(((Boolean)s.bQ.g()).booleanValue() && !TextUtils.isEmpty(this.a)) {
                v = this.g.optLong("cache_ttl_sec", ((Long)i0.g()).longValue());
            }
            long v1 = System.currentTimeMillis();
            if(Long.compare(v, 0L) >= 0 && (this.b > v1 || TimeUnit.MILLISECONDS.toSeconds(v1 - this.b) > v)) {
                boolean z = !((Boolean)s.ah.g()).booleanValue();
                this.d.clear();
                this.e.clear();
                this.f.clear();
                this.a = "";
                this.g = null;
                this.c.clear();
                return true;
            }
        }
        return false;
    }
}

