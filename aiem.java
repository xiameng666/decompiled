import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class aiem {
    final aiex a;
    private static aiem b;

    static {
    }

    private aiem(Context context0) {
        aiex aiex0 = aiex.c(context0);
        this.a = aiex0;
        aiex0.a();
        aiex0.b();
    }

    public static aiem a(Context context0) {
        aiem aiem0;
        synchronized(aiem.class) {
            aiem0 = aiem.d(context0.getApplicationContext());
        }
        return aiem0;
    }

    public final void b() {
        synchronized(this) {
            this.a.a.lock();
            try {
                this.a.b.edit().clear().apply();
            }
            finally {
                this.a.a.unlock();
            }
        }
    }

    public final void c(GoogleSignInOptions googleSignInOptions0, GoogleSignInAccount googleSignInAccount0) {
        synchronized(this) {
            batl.s(googleSignInOptions0);
            aiex aiex0 = this.a;
            String s = googleSignInAccount0.h;
            aiex0.f("defaultGoogleSignInAccount", s);
            batl.s(googleSignInOptions0);
            String s1 = aiex0.e("googleSignInAccount", s);
            JSONObject jSONObject0 = new JSONObject();
            try {
                String s2 = googleSignInAccount0.a;
                if(s2 != null) {
                    jSONObject0.put("id", s2);
                }
                String s3 = googleSignInAccount0.b;
                if(s3 != null) {
                    jSONObject0.put("tokenId", s3);
                }
                String s4 = googleSignInAccount0.c;
                if(s4 != null) {
                    jSONObject0.put("email", s4);
                }
                String s5 = googleSignInAccount0.d;
                if(s5 != null) {
                    jSONObject0.put("displayName", s5);
                }
                String s6 = googleSignInAccount0.j;
                if(s6 != null) {
                    jSONObject0.put("givenName", s6);
                }
                String s7 = googleSignInAccount0.k;
                if(s7 != null) {
                    jSONObject0.put("familyName", s7);
                }
                Uri uri0 = googleSignInAccount0.e;
                if(uri0 != null) {
                    jSONObject0.put("photoUrl", uri0.toString());
                }
                String s8 = googleSignInAccount0.f;
                if(s8 != null) {
                    jSONObject0.put("serverAuthCode", s8);
                }
                jSONObject0.put("expirationTime", googleSignInAccount0.g);
                jSONObject0.put("obfuscatedIdentifier", s);
                JSONArray jSONArray0 = new JSONArray();
                Scope[] arr_scope = (Scope[])googleSignInAccount0.i.toArray(new Scope[googleSignInAccount0.i.size()]);
                Arrays.sort(arr_scope, new aidt());
                for(int v1 = 0; v1 < arr_scope.length; ++v1) {
                    jSONArray0.put(arr_scope[v1].b);
                }
                jSONObject0.put("grantedScopes", jSONArray0);
            }
            catch(JSONException jSONException0) {
                throw new RuntimeException(jSONException0);
            }
            jSONObject0.remove("serverAuthCode");
            aiex0.f(s1, jSONObject0.toString());
            String s9 = aiex0.e("googleSignInOptions", s);
            JSONObject jSONObject1 = new JSONObject();
            try {
                JSONArray jSONArray1 = new JSONArray();
                Collections.sort(googleSignInOptions0.i, GoogleSignInOptions.g);
                for(Object object0: googleSignInOptions0.i) {
                    jSONArray1.put(((Scope)object0).b);
                }
                jSONObject1.put("scopes", jSONArray1);
                Account account0 = googleSignInOptions0.j;
                if(account0 != null) {
                    jSONObject1.put("accountName", account0.name);
                }
                jSONObject1.put("idTokenRequested", googleSignInOptions0.k);
                jSONObject1.put("forceCodeForRefreshToken", googleSignInOptions0.m);
                jSONObject1.put("serverAuthRequested", googleSignInOptions0.l);
                String s10 = googleSignInOptions0.n;
                if(!TextUtils.isEmpty(s10)) {
                    jSONObject1.put("serverClientId", s10);
                }
                String s11 = googleSignInOptions0.o;
                if(!TextUtils.isEmpty(s11)) {
                    jSONObject1.put("hostedDomain", s11);
                }
            }
            catch(JSONException jSONException1) {
                throw new RuntimeException(jSONException1);
            }
            aiex0.f(s9, jSONObject1.toString());
        }
    }

    private static aiem d(Context context0) {
        aiem aiem1;
        synchronized(aiem.class) {
            aiem aiem0 = aiem.b;
            if(aiem0 != null) {
                return aiem0;
            }
            aiem1 = new aiem(context0);
            aiem.b = aiem1;
        }
        return aiem1;
    }
}

