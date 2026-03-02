import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import j..time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public final class bybo {
    public static final byaw a(Context context0, String s, Bundle bundle0, Bundle bundle1, boolean z, String s1, String s2, boolean z1, Set set0) {
        String s9;
        String s8;
        ibuq.f(context0, "context");
        ibuq.f(s, "type");
        ibuq.f(bundle0, "credentialData");
        ibuq.f(bundle1, "candidateQueryData");
        ibuq.f(s2, "appPackageName");
        ibuq.f(set0, "userSetDefaultProviderIds");
        String s3 = bybz.b(context0, s1, s2);
        if(s3 == null) {
            return null;
        }
        kis kis0 = kip.a(s, bundle0, bundle1, z, s1);
        String s4 = z1 ? kis0.f.d : null;
        Icon icon0 = kis0.f.c;
        Drawable drawable0 = icon0 == null ? null : icon0.loadDrawable(context0);
        if((kis0 instanceof kiy)) {
            String s5 = ((kiy)kis0).i;
            String s6 = ((kiy)kis0).j;
            bxzs bxzs0 = bxzs.c;
            Drawable drawable1 = context0.getDrawable(0x7F080816);  // drawable:ic_password_24
            if(drawable1 == null) {
                return null;
            }
            boolean z2 = kis0.b.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
            return new byaw(s5, s6, bxzs0, s3, drawable1, kis0.h, s4, set0, z2);
        }
        if((kis0 instanceof kja)) {
            String s7 = ((kja)kis0).i;
            boolean z3 = kis0.h;
            boolean z4 = kis0.b.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
            Drawable drawable2 = context0.getDrawable(0x7F080814);  // drawable:ic_passkey_24
            if(drawable2 == null) {
                return null;
            }
            JSONObject jSONObject0 = new JSONObject(s7);
            if(jSONObject0.has("user")) {
                JSONObject jSONObject1 = jSONObject0.getJSONObject("user");
                ibuq.e(jSONObject1, "getJSONObject(...)");
                s8 = jSONObject1.getString("name");
                ibuq.e(s8, "getString(...)");
                s9 = jSONObject1.getString("displayName");
                ibuq.e(s9, "getString(...)");
            }
            else {
                s8 = "";
                s9 = "";
            }
            ibns ibns0 = bycb.a(s8, s9);
            return new byaw(((String)ibns0.a), ((String)ibns0.b), bxzs.b, s3, drawable2, z3, s4, set0, z4);
        }
        if((kis0 instanceof kiv)) {
            kir kir0 = kiq.a(kis0.b);
            String s10 = kir0.a.toString();
            String s11 = kir0.b == null ? null : kir0.b.toString();
            bxzs bxzs1 = bxzs.a;
            if(drawable0 == null) {
                drawable0 = context0.getDrawable(0x7F080813);  // drawable:ic_other_sign_in_24
                return drawable0 == null ? null : new byaw(s10, s11, bxzs1, s3, drawable0, kis0.h, s4, set0, kis0.e);
            }
            return new byaw(s10, s11, bxzs1, s3, drawable0, kis0.h, s4, set0, kis0.e);
        }
        return null;
    }

    public static final List b(Context context0, String s, List list0) {
        Context context1 = context0;
        ibuq.f(context1, "context");
        String s1 = s;
        ibuq.f(s1, "providerId");
        ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
        for(Object object0: list0) {
            kwa kwa0 = ((bybm)object0).a;
            String s2 = ((bybm)object0).c;
            PendingIntent pendingIntent0 = kwa0.b;
            String s3 = ((bybm)object0).b;
            Intent intent0 = ((bybm)object0).d;
            String s4 = kwa0.a.toString();
            Drawable drawable0 = kwa0.c == null ? null : kwa0.c.loadDrawable(context1);
            Integer integer0 = (Integer)kwa0.f.get("android.credentials.TYPE_PASSWORD_CREDENTIAL");
            Integer integer1 = (Integer)kwa0.f.get("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
            Integer integer2 = (Integer)kwa0.f.get("TOTAL_CREDENTIAL_COUNT_TYPE");
            Instant instant0 = kwa0.e;
            if(instant0 == null) {
                instant0 = Instant.MIN;
                ibuq.e(instant0, "MIN");
            }
            arrayList0.add(new byas(s1, s3, s2, pendingIntent0, intent0, s4, drawable0, integer0, integer1, integer2, instant0, (kwa0.d == null ? null : kwa0.d.toString()), kwa0.g, ((bybm)object0).e));
            context1 = context0;
            s1 = s;
        }
        return ibpo.ao(arrayList0, new bybn());
    }
}

