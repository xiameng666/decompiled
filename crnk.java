import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class crnk implements Runnable {
    public final crnl a;
    public final int b;
    public final Exception c;
    public final byte[] d;

    public crnk(crnl crnl0, int v, Exception exception0, byte[] arr_b) {
        this.a = crnl0;
        this.b = v;
        this.c = exception0;
        this.d = arr_b;
    }

    @Override
    public final void run() {
        int v = this.b;
        Exception exception0 = this.c;
        crkt crkt0 = this.a.b.a;
        switch(v) {
            case 200: 
            case 204: {
            label_6:
                if(exception0 == null) {
                    byte[] arr_b = this.d;
                    crkt0.g().s.a(true);
                    if(arr_b != null && arr_b.length != 0) {
                        try {
                            JSONObject jSONObject0 = new JSONObject(new String(arr_b));
                            String s = jSONObject0.optString("deeplink", "");
                            if(TextUtils.isEmpty(s)) {
                                crkt0.aJ().j.a("Deferred Deep Link is empty.");
                                return;
                            }
                            String s1 = jSONObject0.optString("gclid", "");
                            String s2 = jSONObject0.optString("gbraid", "");
                            String s3 = jSONObject0.optString("gad_source", "");
                            double f = jSONObject0.optDouble("timestamp", 0.0);
                            Bundle bundle0 = new Bundle();
                            crqx crqx0 = crkt0.p();
                            crqx0.m();
                            if(TextUtils.isEmpty(s)) {
                                crkt0.aJ().f.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", s1, s2, s);
                                return;
                            }
                            Intent intent0 = new Intent("android.intent.action.VIEW", Uri.parse(s));
                            List list0 = crqx0.aj().getPackageManager().queryIntentActivities(intent0, 0);
                            if(list0 == null || list0.isEmpty()) {
                                crkt0.aJ().f.d("Deferred Deep Link validation failed. gclid, gbraid, deep link", s1, s2, s);
                                return;
                            }
                            if(!TextUtils.isEmpty(s2)) {
                                bundle0.putString("gbraid", s2);
                            }
                            if(!TextUtils.isEmpty(s3)) {
                                bundle0.putString("gad_source", s3);
                            }
                            bundle0.putString("gclid", s1);
                            bundle0.putString("_cis", "ddp");
                            crkt0.k.w("auto", "_cmp", bundle0);
                            crqx crqx1 = crkt0.p();
                            if(!TextUtils.isEmpty(s)) {
                                try {
                                    SharedPreferences.Editor sharedPreferences$Editor0 = crqx1.aj().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    sharedPreferences$Editor0.putString("deeplink", s);
                                    sharedPreferences$Editor0.putLong("timestamp", Double.doubleToRawLongBits(f));
                                    if(sharedPreferences$Editor0.commit()) {
                                        goto label_45;
                                    }
                                }
                                catch(RuntimeException runtimeException0) {
                                    crqx1.aJ().c.b("Failed to persist Deferred Deep Link. exception", runtimeException0);
                                }
                                return;
                            label_45:
                                Intent intent1 = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context0 = crqx1.aj();
                                if(Build.VERSION.SDK_INT < 34) {
                                    context0.sendBroadcast(intent1);
                                    return;
                                }
                                context0.sendBroadcast(intent1, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                return;
                            }
                        }
                        catch(JSONException jSONException0) {
                            crkt0.aJ().c.b("Failed to parse the Deferred Deep Link response. exception", jSONException0);
                        }
                        return;
                    }
                    crkt0.aJ().j.a("Deferred Deep Link response empty.");
                    return;
                }
                break;
            }
            case 304: {
                v = 304;
                goto label_6;
            }
        }
        crkt0.aJ().f.c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(v), exception0);
    }
}

