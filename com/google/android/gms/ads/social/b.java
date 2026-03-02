package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import hopm;
import java.net.HttpCookie;
import java.util.List;

final class b {
    public final SharedPreferences a;
    public final SharedPreferences b;
    private final Context c;

    public b(Context context0) {
        this.c = context0;
        this.a = context0.getSharedPreferences("social.account_doritos", 0);
        this.b = context0.getSharedPreferences("social.account_gaialess_doritos", 0);
    }

    final String a(String s, a a0) {
        a a1 = a.b;
        String s1 = a0 == a1 ? this.b.getString(s, null) : this.a.getString(s, null);
        if(s1 != null) {
            List list0 = HttpCookie.parse(s1);
            if(list0.size() == 1 && ((HttpCookie)list0.get(0)).getName().equals("DSID")) {
                HttpCookie httpCookie0 = (HttpCookie)list0.get(0);
                if(httpCookie0.hasExpired()) {
                    if(a0 == a1) {
                        this.b.edit().remove(s).commit();
                        return null;
                    }
                    this.a.edit().remove(s).commit();
                    return null;
                }
                return httpCookie0.toString();
            }
        }
        return null;
    }

    final boolean b(Account[] arr_account) {
        for(int v = 0; v < arr_account.length; ++v) {
            String s = arr_account[v].name;
            if(!TextUtils.isEmpty(s)) {
                if(hopm.j()) {
                    boolean z = com.google.android.gms.ads.identifier.settings.b.c(this.c).l();
                    String s1 = this.a(s, a.a);
                    String s2 = this.a(s, a.b);
                    if(z) {
                        if(TextUtils.isEmpty(s2)) {
                            return true;
                        }
                    }
                    else if(TextUtils.isEmpty(s1) || TextUtils.isEmpty(s2)) {
                        return true;
                    }
                }
                else if(TextUtils.isEmpty(this.a(s, a.a))) {
                    return true;
                }
            }
        }
        return false;
    }
}

