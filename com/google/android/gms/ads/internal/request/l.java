package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.flag.n;
import com.google.android.gms.ads.internal.js.function.o;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

public final class l {
    public final Object a;
    public final Context b;
    public SharedPreferences c;
    public final VersionInfoParcel d;
    public final o e;

    public l() {
        throw null;
    }

    public l(Context context0, o o0, VersionInfoParcel versionInfoParcel0) {
        this.a = new Object();
        this.b = context0.getApplicationContext();
        this.d = versionInfoParcel0;
        this.e = o0;
    }

    public static JSONObject a(Context context0, VersionInfoParcel versionInfoParcel0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(((Boolean)n.d.d()).booleanValue()) {
                jSONObject0.put("package_name", "com.google.android.gms");
            }
            jSONObject0.put("js", versionInfoParcel0.a);
            jSONObject0.put("mf", n.e.d());
            jSONObject0.put("cl", "800653487");
            jSONObject0.put("rapid_rc", "dev");
            jSONObject0.put("rapid_rollup", "HEAD");
            jSONObject0.put("admob_module_version", 253434000);
            jSONObject0.put("dynamite_local_version", 253434000);
            jSONObject0.put("dynamite_version", com.google.android.gms.ads.internal.util.client.l.a(context0));
            jSONObject0.put("container_version", 0xF1B18AD);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

