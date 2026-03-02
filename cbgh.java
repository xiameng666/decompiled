import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri.Builder;
import android.util.DisplayMetrics;
import java.util.Locale;
import java.util.Map.Entry;

public final class cbgh {
    private final Context a;

    public cbgh(Context context0) {
        this.a = context0;
    }

    public final void a(Uri.Builder uri$Builder0, int v, int v1) {
        boolean z;
        ibuq.f(uri$Builder0, "uri");
        Context context0 = this.a;
        Configuration configuration0 = context0.getResources().getConfiguration();
        if(v == 2) {
            z = true;
        }
        else {
            z = v == 1 ? false : configuration0.isNightModeActive();
        }
        uri$Builder0.appendQueryParameter("color_scheme", (z ? "dark" : "light"));
        uri$Builder0.appendQueryParameter("theme", (1 == v1 ? "gm3x" : "mn"));
        uri$Builder0.appendQueryParameter("hl", Locale.getDefault().toLanguageTag());
        DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
        gaec gaec0 = gaec.h(context0);
        uri$Builder0.appendQueryParameter("c_enable", "1");
        for(Object object0: cbgk.a.entrySet()) {
            gaea gaea0 = (gaea)((Map.Entry)object0).getKey();
            String s = (String)((Map.Entry)object0).getValue();
            float f = gaec0.a(context0, gaea0);
            if(f != 0.0f) {
                uri$Builder0.appendQueryParameter(s, String.valueOf(((int)kbc.a(1, f, displayMetrics0))));
            }
        }
        for(Object object1: cbgk.b.entrySet()) {
            gaea gaea1 = (gaea)((Map.Entry)object1).getKey();
            String s1 = (String)((Map.Entry)object1).getValue();
            float f1 = gaec0.a(context0, gaea1);
            if(f1 != 0.0f) {
                uri$Builder0.appendQueryParameter(s1, String.valueOf(((int)kbc.a(2, f1, displayMetrics0))));
            }
        }
        for(Object object2: cbgk.c.entrySet()) {
            gaea gaea2 = (gaea)((Map.Entry)object2).getKey();
            String s2 = (String)((Map.Entry)object2).getValue();
            int v2 = gaec0.d(context0, gaea2, -1);
            if(v2 != -1) {
                uri$Builder0.appendQueryParameter(s2, String.valueOf(v2));
            }
        }
    }

    public static void b(cbgh cbgh0, Uri.Builder uri$Builder0, int v, int v1) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        cbgh0.a(uri$Builder0, v, 0);
    }
}

