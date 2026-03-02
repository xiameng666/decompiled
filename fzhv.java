import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.security.advancedprotection.AdvancedProtectionManager;

public final class fzhv {
    public static final boolean a(Context context0) {
        ibuq.f(context0, "context");
        return !hxiw.m() || !ccil.b() || !ccin.a(context0) ? false : an..ExternalSyntheticApiModelOutline0.m(context0.getSystemService(AdvancedProtectionManager.class)).isAdvancedProtectionEnabled();
    }

    public static final Intent b(Context context0) {
        ibuq.f(context0, "context");
        Intent intent0 = new Intent("com.google.android.gms.settings.ADVANCED_PROTECTION_DIALOG").setPackage("com.google.android.gms").addFlags(0x10000000);
        ibuq.e(intent0, "addFlags(...)");
        ResolveInfo resolveInfo0 = context0.getPackageManager().resolveActivity(intent0, 0);
        return (resolveInfo0 == null ? null : resolveInfo0.activityInfo) == null ? null : intent0;
    }
}

