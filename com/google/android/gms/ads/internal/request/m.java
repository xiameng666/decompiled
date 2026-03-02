package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.w;
import com.google.android.gms.ads.internal.config.i;
import com.google.android.gms.ads.internal.config.j;
import com.google.android.gms.ads.internal.flag.n;
import com.google.android.gms.ads.internal.util.client.h;
import gfsi;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class m implements gfsi {
    public final l a;

    public m(l l0) {
        this.a = l0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        l l0 = this.a;
        Context context0 = l0.b;
        SharedPreferences sharedPreferences0 = com.google.android.gms.ads.internal.config.l.c(context0);
        if(sharedPreferences0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            new j(w.a(), sharedPreferences$Editor0, jSONObject0);
            for(Object object1: w.a().a) {
                i i0 = (i)object1;
                if(i0.a == 1) {
                    i0.d(sharedPreferences$Editor0, i0.a(jSONObject0));
                }
            }
            if(jSONObject0 == null) {
                h.f("Flag Json is null.");
            }
            else {
                sharedPreferences$Editor0.putString("flag_configuration", jSONObject0.toString());
            }
            com.google.android.gms.ads.internal.config.l.a(context0, sharedPreferences$Editor0);
            if(((Boolean)n.c.d()).booleanValue() && !TextUtils.equals("com.google.android.gms", "com.google.android.gms")) {
                SharedPreferences sharedPreferences1 = com.google.android.gms.ads.internal.config.l.b(context0);
                if(sharedPreferences1 != null) {
                    SharedPreferences.Editor sharedPreferences$Editor1 = sharedPreferences1.edit();
                    JSONObject jSONObject1 = new JSONObject();
                    Iterator iterator1 = jSONObject0.keys();
                    while(iterator1.hasNext()) {
                        Object object2 = iterator1.next();
                        String s = (String)object2;
                        if(s.startsWith("adapter:")) {
                            goto label_29;
                        }
                        continue;
                        try {
                        label_29:
                            jSONObject1.put(s, jSONObject0.get(s));
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    sharedPreferences$Editor1.putString("flag_configuration", jSONObject1.toString());
                    sharedPreferences$Editor1.commit();
                }
            }
            SharedPreferences sharedPreferences2 = l0.c;
            if(sharedPreferences2 != null) {
                sharedPreferences2.edit().putLong("js_last_update", System.currentTimeMillis()).apply();
            }
        }
        return null;
    }
}

