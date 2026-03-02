import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aiex {
    public final Lock a;
    public final SharedPreferences b;
    private static final Lock c;
    private static aiex d;

    static {
        aiex.c = new ReentrantLock();
    }

    public aiex(Context context0) {
        this.a = new ReentrantLock();
        this.b = context0.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final GoogleSignInAccount a() {
        String s = this.d("defaultGoogleSignInAccount");
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = this.d(this.e("googleSignInAccount", s));
        if(s1 != null) {
            try {
                if(TextUtils.isEmpty(s1)) {
                    return null;
                }
                JSONObject jSONObject0 = new JSONObject(s1);
                String s2 = jSONObject0.optString("photoUrl");
                Uri uri0 = TextUtils.isEmpty(s2) ? null : Uri.parse(s2);
                long v = Long.parseLong(jSONObject0.getString("expirationTime"));
                HashSet hashSet0 = new HashSet();
                JSONArray jSONArray0 = jSONObject0.getJSONArray("grantedScopes");
                int v1 = jSONArray0.length();
                for(int v2 = 0; v2 < v1; ++v2) {
                    hashSet0.add(new Scope(jSONArray0.getString(v2)));
                }
                GoogleSignInAccount googleSignInAccount0 = GoogleSignInAccount.b(jSONObject0.optString("id"), (jSONObject0.has("tokenId") ? jSONObject0.optString("tokenId") : null), (jSONObject0.has("email") ? jSONObject0.optString("email") : null), (jSONObject0.has("displayName") ? jSONObject0.optString("displayName") : null), (jSONObject0.has("givenName") ? jSONObject0.optString("givenName") : null), (jSONObject0.has("familyName") ? jSONObject0.optString("familyName") : null), uri0, Long.valueOf(v), jSONObject0.getString("obfuscatedIdentifier"), hashSet0);
                googleSignInAccount0.f = jSONObject0.has("serverAuthCode") ? jSONObject0.optString("serverAuthCode") : null;
                return googleSignInAccount0;
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions b() {
        String s = this.d("defaultGoogleSignInAccount");
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        String s1 = this.d(this.e("googleSignInOptions", s));
        if(s1 != null) {
            try {
                if(TextUtils.isEmpty(s1)) {
                    return null;
                }
                JSONObject jSONObject0 = new JSONObject(s1);
                HashSet hashSet0 = new HashSet();
                JSONArray jSONArray0 = jSONObject0.getJSONArray("scopes");
                int v = jSONArray0.length();
                for(int v1 = 0; v1 < v; ++v1) {
                    hashSet0.add(new Scope(jSONArray0.getString(v1)));
                }
                String s2 = jSONObject0.has("accountName") ? jSONObject0.optString("accountName") : null;
                Account account0 = TextUtils.isEmpty(s2) ? null : new Account(s2, "com.google");
                return new GoogleSignInOptions(3, new ArrayList(hashSet0), account0, jSONObject0.getBoolean("idTokenRequested"), jSONObject0.getBoolean("serverAuthRequested"), jSONObject0.getBoolean("forceCodeForRefreshToken"), (jSONObject0.has("serverClientId") ? jSONObject0.optString("serverClientId") : null), (jSONObject0.has("hostedDomain") ? jSONObject0.optString("hostedDomain") : null), new HashMap(), null);
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }

    public static aiex c(Context context0) {
        aiex aiex0;
        batl.s(context0);
        Lock lock0 = aiex.c;
        lock0.lock();
        try {
            if(aiex.d == null) {
                aiex.d = new aiex(context0.getApplicationContext());
            }
            aiex0 = aiex.d;
        }
        catch(Throwable throwable0) {
            aiex.c.unlock();
            throw throwable0;
        }
        lock0.unlock();
        return aiex0;
    }

    public final String d(String s) {
        String s1;
        this.a.lock();
        try {
            s1 = this.b.getString(s, null);
        }
        finally {
            this.a.unlock();
        }
        return s1;
    }

    public final String e(String s, String s1) {
        return a.r(s1, s, ":");
    }

    protected final void f(String s, String s1) {
        this.a.lock();
        try {
            this.b.edit().putString(s, s1).apply();
        }
        finally {
            this.a.unlock();
        }
    }
}

