import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import j..time.Instant;
import java.util.Map;
import java.util.Objects;

public final class bybp {
    public static final int a(Bundle bundle0, String s) {
        ibuq.f(bundle0, "credentialOptionData");
        ibuq.f(s, "credentialOptionType");
        if(ibuq.m(s, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
            return bundle0.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 1000);
        }
        return ibuq.m(s, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL") ? bundle0.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100) : bundle0.getInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 2000);
    }

    public static final bybs b(String s, kuu kuu0, String s1, String s2, Intent intent0, Drawable drawable0) {
        ibuq.f(s, "providerId");
        ibuq.f(kuu0, "actionEntry");
        ibuq.f(s1, "entryKey");
        ibuq.f(s2, "entrySubkey");
        ibuq.f(drawable0, "providerIcon");
        String s3 = kuu0.a.toString();
        return kuu0.c == null ? new bybs(s, s1, s2, kuu0.b, intent0, s3, drawable0, null) : new bybs(s, s1, s2, kuu0.b, intent0, s3, drawable0, kuu0.c.toString());
    }

    public static final bybt c(String s, String s1, Drawable drawable0, kuw kuw0, String s2, String s3, Intent intent0, boolean z, boolean z1) {
        ibuq.f(s, "providerId");
        ibuq.f(s1, "providerDisplayName");
        ibuq.f(drawable0, "providerIcon");
        ibuq.f(kuw0, "authEntry");
        ibuq.f(s2, "entryKey");
        ibuq.f(s3, "entrySubkey");
        String s4 = kuw0.a.toString();
        return s4.length() == 0 ? new bybt(s, s2, s3, kuw0.b, intent0, s1, s1, drawable0, z, z1) : new bybt(s, s2, s3, kuw0.b, intent0, s4, s1, drawable0, z, z1);
    }

    public static final bybu d(Context context0, String s, String s1, kwc kwc0, String s2, String s3, Intent intent0, byap byap0) {
        ibuq.f(context0, "context");
        ibuq.f(s, "providerId");
        ibuq.f(s1, "providerLabel");
        ibuq.f(kwc0, "credentialEntry");
        ibuq.f(s2, "entryKey");
        ibuq.f(s3, "entrySubkey");
        String s4 = null;
        if((kwc0 instanceof kwn)) {
            PendingIntent pendingIntent0 = ((kwn)kwc0).j;
            bxzs bxzs0 = bxzs.c;
            String s5 = ((kwn)kwc0).i.toString();
            String s6 = ((kwn)kwc0).g.toString();
            CharSequence charSequence0 = ((kwn)kwc0).h;
            String s7 = charSequence0 == null ? null : charSequence0.toString();
            Drawable drawable0 = ((kwn)kwc0).l.loadDrawable(context0);
            boolean z = kwl.b(((kwn)kwc0));
            Instant instant0 = ((kwn)kwc0).k;
            boolean z1 = ((kwn)kwc0).m && ((kwn)kwc0).p;
            String s8 = kwc0.c.toString();
            boolean z2 = kwc0.d;
            CharSequence charSequence1 = kwc0.e;
            if(charSequence1 != null) {
                s4 = charSequence1.toString();
            }
            return new bybu(s, s2, s3, pendingIntent0, intent0, bxzs0, "android.credentials.TYPE_PASSWORD_CREDENTIAL", s5, s1, s6, s7, drawable0, z, instant0, z1, s8, z2, s4, byap0);
        }
        if((kwc0 instanceof kxa)) {
            PendingIntent pendingIntent1 = ((kxa)kwc0).j;
            bxzs bxzs1 = bxzs.b;
            String s9 = ((kxa)kwc0).i.toString();
            String s10 = ((kxa)kwc0).g.toString();
            CharSequence charSequence2 = ((kxa)kwc0).h;
            String s11 = charSequence2 == null ? null : charSequence2.toString();
            Drawable drawable1 = kwy.b(((kxa)kwc0)) ? context0.getDrawable(0x7F080814) : ((kxa)kwc0).k.loadDrawable(context0);  // drawable:ic_passkey_24
            boolean z3 = kwy.b(((kxa)kwc0));
            Instant instant1 = ((kxa)kwc0).l;
            boolean z4 = ((kxa)kwc0).m && ((kxa)kwc0).p;
            String s12 = kwc0.c.toString();
            boolean z5 = kwc0.d;
            CharSequence charSequence3 = kwc0.e;
            if(charSequence3 != null) {
                s4 = charSequence3.toString();
            }
            return new bybu(s, s2, s3, pendingIntent1, intent0, bxzs1, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", s9, s1, s10, s11, drawable1, z3, instant1, z4, s12, z5, s4, byap0);
        }
        if((kwc0 instanceof kwk)) {
            PendingIntent pendingIntent2 = ((kwk)kwc0).i;
            String s13 = ((kwk)kwc0).g;
            CharSequence charSequence4 = ((kwk)kwc0).l;
            bxzs bxzs2 = bxzs.a;
            String s14 = charSequence4 == null ? null : charSequence4.toString();
            String s15 = ((kwk)kwc0).h.toString();
            CharSequence charSequence5 = ((kwk)kwc0).k;
            String s16 = charSequence5 == null ? null : charSequence5.toString();
            Drawable drawable2 = ((kwk)kwc0).m.loadDrawable(context0);
            boolean z6 = kwh.b(((kwk)kwc0));
            Instant instant2 = ((kwk)kwc0).n;
            boolean z7 = ((kwk)kwc0).j && ((kwk)kwc0).q;
            String s17 = kwc0.c.toString();
            boolean z8 = kwc0.d;
            CharSequence charSequence6 = kwc0.e;
            if(charSequence6 != null) {
                s4 = charSequence6.toString();
            }
            if(s14 == null) {
                s14 = "";
            }
            return new bybu(s, s2, s3, pendingIntent2, intent0, bxzs2, s13, s14, s1, s15, s16, drawable2, z6, instant2, z7, s17, z8, s4, byap0);
        }
        Class class0 = kwc0.getClass();
        Objects.toString(class0);
        Log.w("CredentialSelector", "Encountered unrecognized credential entry " + class0);
        return null;
    }

    public static final bybx e(Context context0, Bundle bundle0, String s, String s1, boolean z, Map map0) {
        ibuq.f(context0, "context");
        ibuq.f(bundle0, "requestData");
        ibuq.f(s1, "appPackageName");
        String s2 = bybz.b(context0, s, s1);
        byby byby0 = null;
        if(s2 == null) {
            return null;
        }
        boolean z1 = bundle0.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS");
        ComponentName componentName0 = Build.VERSION.SDK_INT < 33 ? ((ComponentName)bundle0.getParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME")) : ((ComponentName)bundle0.getParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", ComponentName.class));
        if(z && componentName0 != null) {
            PackageManager packageManager0 = context0.getPackageManager();
            ibuq.e(packageManager0, "getPackageManager(...)");
            String s3 = componentName0.flattenToString();
            ibuq.e(s3, "flattenToString(...)");
            ibns ibns0 = byca.d(packageManager0, s3);
            if(ibns0 == null) {
                ibns0 = new ibns(null, null);
            }
            String s4 = (String)ibns0.a;
            Drawable drawable0 = (Drawable)ibns0.b;
            if(s4 != null && drawable0 != null) {
                byby0 = new byby(drawable0, s4);
            }
        }
        return new bybx(s2, z1, bundle0.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI"), byby0, map0);
    }
}

