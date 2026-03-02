package com.google.android.libraries.messaging.lighter.model;

import ByteString;
import android.os.Parcelable;
import flbj;
import fmat;
import fmav;
import fmaw;
import fmay;
import gfqx;
import gfsx;
import gged_interceptors;
import ggqk;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class AccountContext implements Parcelable, Serializable {
    public abstract long a();

    public abstract fmav b();

    public abstract AccountUsers c();

    public abstract ByteString d();

    public static fmat e() {
        fmat fmat0 = new fmat();
        fmat0.b(-1L);
        return fmat0;
    }

    public static gfsx f(JSONObject jSONObject0) {
        gfsx gfsx0;
        try {
            fmat fmat0 = AccountContext.e();
            fmat0.b(jSONObject0.getLong("REGISTRATION_ID"));
            JSONObject jSONObject1 = jSONObject0.getJSONObject("ACCOUNT_USERS");
            try {
                fmay fmay0 = new fmay(null);
                if(jSONObject1.has("GAIA_EMAIL")) {
                    fmay0.c(jSONObject1.getString("GAIA_EMAIL"));
                }
                if(jSONObject1.has("DEVICE_ID")) {
                    fmay0.b(jSONObject1.getString("DEVICE_ID"));
                }
                HashSet hashSet0 = new HashSet();
                JSONArray jSONArray0 = jSONObject1.getJSONArray("PHONE_NUMBERS");
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    hashSet0.add(jSONArray0.getString(v));
                }
                fmay0.d(hashSet0);
                fmay0.e(jSONObject1.getString("TACHYON_APP_NAME"));
                gfsx0 = gfsx.m(fmay0.a());
            }
            catch(JSONException unused_ex) {
                flbj.c("AccountUsers", "failed to convert JSONObject to AccountUsers");
                gfsx0 = gfqx.a;
            }
            if(gfsx0.i()) {
                fmat0.a = (AccountUsers)gfsx0.d();
            }
            fmat0.c(ByteString.x(jSONObject0.getString("SERVER_REGISTRATION_ID"), StandardCharsets.UTF_8));
            fmat0.d(fmav.a(jSONObject0.getInt("SERVER_REGISTRATION_STATUS")));
            return gfsx.m(fmat0.a());
        }
        catch(JSONException unused_ex) {
            flbj.c("AccountContext", "failed to convert JSONObject to AccountContext");
            return gfqx.a;
        }
    }

    public final gfsx g() {
        gfsx gfsx1;
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("REGISTRATION_ID", this.a());
            AccountUsers accountUsers0 = this.c();
            try {
                JSONObject jSONObject1 = new JSONObject();
                gfsx gfsx0 = accountUsers0.b();
                if(gfsx0.i()) {
                    jSONObject1.put("GAIA_EMAIL", gfsx0.d());
                }
                if(accountUsers0.a().i()) {
                    jSONObject1.put("DEVICE_ID", accountUsers0.a().d());
                }
                jSONObject1.put("PHONE_NUMBERS", new JSONArray(accountUsers0.d()));
                jSONObject1.put("TACHYON_APP_NAME", accountUsers0.c());
                gged_interceptors gged0 = accountUsers0.g();
                fmaw fmaw0 = new fmaw();
                JSONArray jSONArray0 = new JSONArray();
                ggqk ggqk0 = gged0.E();
                while(ggqk0.hasNext()) {
                    Object object0 = ggqk0.next();
                    Object object1 = fmaw0.apply(object0);
                    if(((gfsx)object1).i()) {
                        jSONArray0.put(((gfsx)object1).d());
                    }
                }
                jSONObject1.put("ALL", jSONArray0);
                gfsx1 = gfsx.m(jSONObject1);
            }
            catch(JSONException unused_ex) {
                flbj.c("AccountUsers", "failed to convert AccountUsers to JSONObject");
                gfsx1 = gfqx.a;
            }
            if(!gfsx1.i()) {
                return gfqx.a;
            }
            jSONObject0.put("ACCOUNT_USERS", gfsx1.d());
            jSONObject0.put("SERVER_REGISTRATION_ID", this.d().toStringUtf8());
            jSONObject0.put("SERVER_REGISTRATION_STATUS", this.b().c);
            return gfsx.m(jSONObject0);
        }
        catch(JSONException unused_ex) {
            flbj.c("AccountContext", "failed to convert AccountContext to JSONObject");
            return gfqx.a;
        }
    }

    public final String h() {
        return this.c().c();
    }
}

