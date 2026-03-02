import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public final class gpfi {
    public final Bundle a;

    public gpfi(Bundle bundle0) {
        this.a = new Bundle(bundle0);
    }

    public final Bundle a() {
        Bundle bundle0 = new Bundle(this.a);
        for(Object object0: this.a.keySet()) {
            String s = (String)object0;
            if(!s.startsWith("google.c.a.") && !s.equals("from")) {
                bundle0.remove(s);
            }
        }
        return bundle0;
    }

    public final Integer b(String s) {
        String s1 = this.e(s);
        if(!TextUtils.isEmpty(s1)) {
            try {
                return Integer.parseInt(s1);
            }
            catch(NumberFormatException unused_ex) {
                Log.w("NotificationParams", "Couldn\'t parse value of " + gpfi.f(s) + "(" + s1 + ") into an int");
            }
        }
        return null;
    }

    public final String c(Resources resources0, String s, String s1) {
        String[] arr_s;
        String s2 = this.e(s1 + "_loc_key");
        if(TextUtils.isEmpty(s2)) {
            return null;
        }
        int v = resources0.getIdentifier(s2, "string", s);
        if(v != 0) {
            JSONArray jSONArray0 = this.g(s1 + "_loc_args");
            if(jSONArray0 == null) {
                arr_s = null;
            }
            else {
                int v1 = jSONArray0.length();
                arr_s = new String[v1];
                for(int v2 = 0; v2 < v1; ++v2) {
                    arr_s[v2] = jSONArray0.optString(v2);
                }
            }
            if(arr_s == null) {
                return resources0.getString(v);
            }
            try {
                return resources0.getString(v, arr_s);
            }
            catch(MissingFormatArgumentException missingFormatArgumentException0) {
                Log.w("NotificationParams", "Missing format argument for " + gpfi.f(s1) + ": " + Arrays.toString(arr_s) + " Default value will be used.", missingFormatArgumentException0);
                return null;
            }
        }
        Log.w("NotificationParams", gpfi.f((s1 + "_loc_key")) + " resource not found: " + s1 + " Default value will be used.");
        return null;
    }

    public final String d(Resources resources0, String s, String s1) {
        String s2 = this.e(s1);
        return TextUtils.isEmpty(s2) ? this.c(resources0, s, s1) : s2;
    }

    public final String e(String s) {
        Bundle bundle0 = this.a;
        if(!bundle0.containsKey(s) && s.startsWith("gcm.n.")) {
            String s1 = s.startsWith("gcm.n.") ? s.replace("gcm.n.", "gcm.notification.") : s;
            if(bundle0.containsKey(s1)) {
                s = s1;
            }
        }
        return bundle0.getString(s);
    }

    public static String f(String s) {
        return s.startsWith("gcm.n.") ? s.substring(6) : s;
    }

    public final JSONArray g(String s) {
        String s1 = this.e(s);
        if(!TextUtils.isEmpty(s1)) {
            try {
                return new JSONArray(s1);
            }
            catch(JSONException unused_ex) {
                Log.w("NotificationParams", "Malformed JSON for key " + gpfi.f(s) + ": " + s1 + ", falling back to default");
            }
        }
        return null;
    }

    public final boolean h(String s) {
        String s1 = this.e(s);
        return "1".equals(s1) || Boolean.parseBoolean(s1);
    }
}

