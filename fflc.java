import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.wearable.AppRecommendationsRequest;
import com.google.android.gms.wearable.internal.AppParcelable;
import com.google.android.gms.wearable.internal.AppRecommendationsResponse;
import com.google.android.gms.wearable.internal.AppWearDetailsParcelable;
import com.google.android.gms.wearable.internal.WebIconParcelable;
import j..util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class fflc extends ffee {
    final AppRecommendationsRequest c;
    final fdiy d;
    final fflv e;

    public fflc(fflv fflv0, AppRecommendationsRequest appRecommendationsRequest0, fdiy fdiy0) {
        this.c = appRecommendationsRequest0;
        this.d = fdiy0;
        Objects.requireNonNull(fflv0);
        this.e = fflv0;
        super("getRecommendedApps");
    }

    @Override  // ffee
    public final void a() {
        AppRecommendationsResponse appRecommendationsResponse0;
        String s5;
        AppWearDetailsParcelable appWearDetailsParcelable0;
        List list0;
        ProxyResponse proxyResponse0;
        fflv fflv0 = this.e;
        batl.s(fflv0.A);
        AppRecommendationsRequest appRecommendationsRequest0 = this.c;
        String s = fflv0.f.c;
        if(Log.isLoggable("AppService", 4)) {
            Log.i("AppService", a.O(appRecommendationsRequest0, "getAppRecommendations(", ")"));
        }
        hzto hzto0 = hzto.a;
        if(hzto0.b().c()) {
            Uri.Builder uri$Builder0 = Uri.parse(hzto0.b().b()).buildUpon().appendQueryParameter("type", ((appRecommendationsRequest0.b & 2) == 0 ? "FREE" : "PAID")).appendQueryParameter("android_id", appRecommendationsRequest0.a);
            if(hztr.a.b().a() && (4 & appRecommendationsRequest0.b) != 0) {
                uri$Builder0.appendQueryParameter("category.category_type", "WATCH_FACE");
            }
            String s1 = uri$Builder0.build().toString();
            if(Log.isLoggable("AppService", 3)) {
                Log.d("AppService", "Sending request to " + s1);
            }
            Bundle bundle0 = new Bundle();
            adsy.a(s, bundle0);
            adsz adsz0 = new adsz(bundle0);
            azts azts0 = new azts(fflv0.I, adsz0);
            aide aide0 = new aide(s1);
            long v = hzto0.b().a();
            batl.c(Long.compare(v, 0L) >= 0, "The specified timeout must be non-negative.");
            aide0.b = v;
            ProxyRequest proxyRequest0 = aide0.a();
            try {
                proxyResponse0 = (ProxyResponse)evrg.n(azts0.jv(proxyRequest0));
            }
            catch(ExecutionException executionException0) {
                if(Log.isLoggable("AppService", 5)) {
                    Log.w("AppService", "Proxy execution error", executionException0.getCause());
                }
                appRecommendationsResponse0 = new AppRecommendationsResponse(8, null, null);
                goto label_116;
            }
            catch(InterruptedException interruptedException0) {
                if(Log.isLoggable("AppService", 5)) {
                    Log.w("AppService", "Proxy execution interrupted", interruptedException0);
                }
                appRecommendationsResponse0 = new AppRecommendationsResponse(15, null, null);
                goto label_116;
            }
            if(proxyResponse0.d == 200) {
                try {
                    int v2 = appRecommendationsRequest0.c;
                    JSONObject jSONObject1 = new JSONObject(new String(proxyResponse0.f, StandardCharsets.UTF_8));
                    JSONArray jSONArray0 = jSONObject1.getJSONArray("apps");
                    int v3 = jSONArray0.length();
                    if(v2 > 0) {
                        v3 = Math.min(v3, v2);
                    }
                    ggdy ggdy0 = gged_interceptors.e(v3);
                    int v4 = 0;
                    int v5 = 0;
                    while(v4 < jSONArray0.length()) {
                        JSONObject jSONObject2 = jSONArray0.getJSONObject(v4);
                        try {
                            String s6 = jSONObject2.getString("deeplink");
                            String s7 = jSONObject2.getString("title");
                            WebIconParcelable webIconParcelable0 = fcfx.a(jSONObject2.getJSONObject("icon"));
                            String s8 = jSONObject2.getString("developer");
                            String s9 = jSONObject2.optString("formattedPrice");
                            String s10 = TextUtils.isEmpty(s9) ? null : s9;
                            double f = jSONObject2.optDouble("starRating");
                            Float float0 = Double.isNaN(f) ? null : ((float)f);
                            JSONObject jSONObject3 = jSONObject2.optJSONObject("wearOsSpecificData");
                            if(jSONObject3 == null) {
                                appWearDetailsParcelable0 = null;
                            }
                            else {
                                boolean z = jSONObject3.optBoolean("isWatchface");
                                JSONArray jSONArray1 = jSONObject3.optJSONArray("watchfaceCategories");
                                if(jSONArray1 == null) {
                                    list0 = null;
                                }
                                else {
                                    ggdy ggdy1 = gged_interceptors.e(jSONArray1.length());
                                    for(int v6 = 0; v6 < jSONArray1.length(); ++v6) {
                                        String s11 = jSONArray1.optString(v6);
                                        if(!TextUtils.isEmpty(s11)) {
                                            ggdy1.i(s11);
                                        }
                                    }
                                    list0 = ggdy1.h();
                                }
                                appWearDetailsParcelable0 = new AppWearDetailsParcelable(z, list0);
                            }
                            ggdy0.i(new AppParcelable(s6, s7, webIconParcelable0, s8, s10, float0, appWearDetailsParcelable0));
                            ++v5;
                        }
                        catch(JSONException jSONException2) {
                            if(Log.isLoggable("AppService", 5)) {
                                Log.w("AppService", "[Parser] App failed to parse; skipping.", jSONException2);
                                if(Log.isLoggable("AppService", 3)) {
                                    Log.d("AppService", "[Parser] Bad app: " + jSONObject2);
                                }
                            }
                            ++v4;
                            continue;
                        }
                        if(v2 > 0 && v5 >= v2) {
                            break;
                        }
                        ++v4;
                    }
                    gged_interceptors gged0 = ggdy0.h();
                    JSONObject jSONObject4 = jSONObject1.optJSONObject("googlePlayLogo");
                    appRecommendationsResponse0 = new AppRecommendationsResponse(0, gged0, (jSONObject4 == null ? null : fcfx.a(jSONObject4)));
                }
                catch(JSONException jSONException1) {
                    if(Log.isLoggable("AppService", 5)) {
                        Log.w("AppService", "Could not parse response", jSONException1);
                    }
                    appRecommendationsResponse0 = new AppRecommendationsResponse(7, null, null);
                }
            }
            else {
                String s2 = new String(proxyResponse0.f, StandardCharsets.UTF_8);
                if(Log.isLoggable("AppService", 3)) {
                    Log.d("AppService", "[Parser] API Error Message:\n" + s2);
                }
                try {
                    JSONObject jSONObject0 = new JSONObject(s2).getJSONObject("error");
                    int v1 = jSONObject0.getInt("code");
                    String s3 = jSONObject0.optString("message");
                    String s4 = jSONObject0.optString("status", "UNKNOWN_STATUS");
                    s5 = String.format(Locale.US, "API error %s (%d): %s", s4, v1, s3);
                }
                catch(JSONException jSONException0) {
                    if(Log.isLoggable("AppService", 5)) {
                        Log.w("AppService", "[Parser] Could not extract error message from error response", jSONException0);
                    }
                    s5 = "Unknown API error";
                }
                if(Log.isLoggable("AppService", 5)) {
                    Log.w("AppService", String.format("Response code not OK: %d - %s", ((int)proxyResponse0.d), s5));
                }
                appRecommendationsResponse0 = new AppRecommendationsResponse(19, null, null);
            }
        }
        else {
            if(Log.isLoggable("AppService", 5)) {
                Log.w("AppService", "getAppRecommendations() API is disabled.");
            }
            appRecommendationsResponse0 = new AppRecommendationsResponse(16, null, null);
        }
    label_116:
        this.d.e(appRecommendationsResponse0);
    }
}

