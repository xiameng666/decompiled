package com.google.android.gms.ads.internal.scionintegration;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.c;

public final class e {
    public static Uri a(String s, String s1, String s2) {
        int v = s.indexOf("&adurl") == -1 ? s.indexOf("?adurl") : s.indexOf("&adurl");
        return v == -1 ? Uri.parse(s).buildUpon().appendQueryParameter(s1, s2).build() : Uri.parse((s.substring(0, v + 1) + s1 + "=" + s2 + "&" + s.substring(v + 1)));
    }

    public static String b(String s, Context context0) {
        CharSequence charSequence0;
        d d0 = c.c();
        if(d0.e(context0)) {
            synchronized(d0.a) {
                String s1 = d0.b;
                if(s1 == null) {
                    d0.b = (String)d0.a("getGmpAppId", context0);
                    charSequence0 = d0.b;
                }
                else {
                    charSequence0 = s1;
                }
            }
        }
        else {
            charSequence0 = null;
        }
        String s2 = c.c().b(context0);
        if(!s.contains("gmp_app_id") && !TextUtils.isEmpty(charSequence0)) {
            s = e.a(s, "gmp_app_id", ((String)charSequence0)).toString();
        }
        return s.contains("fbs_aiid") || TextUtils.isEmpty(s2) ? s : e.a(s, "fbs_aiid", s2).toString();
    }
}

