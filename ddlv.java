import android.content.Intent;

final class ddlv {
    public static final Intent a(ddlw ddlw0) {
        Intent intent0 = new Intent();
        String s = hvod.c() ? "com.google.android.gms.nearby.sharing.main.MainActivity" : "com.google.android.gms.nearby.sharing.settings.SettingsActivity";
        Intent intent1 = intent0.setClassName(ddlw0.d.a, s).setPackage("com.google.android.gms").addFlags(0x10000000).addFlags(0x8000).putExtra("is_from_onboarding", true);
        if(hvpy.c()) {
            intent1.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SOURCE", cmfd.c.f).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SESSION_ID", cjan.a());
        }
        return intent1;
    }

    static final ccnh b(int v, Intent intent0, cmeu cmeu0, ccow ccow0, ddlw ddlw0) {
        ccmy ccmy0 = ccmu.a(intent0, cmeu0);
        ccna ccna0 = new ccna();
        ccna0.e(ddlw0.a.getString(v));
        ccna0.d(ccow0);
        ccna0.b(ccmy0);
        ccmz ccmz0 = new ccmz();
        ccmz0.b("@com.google.android.gms:string/common_settings");
        ccmz0.a = ccmy0;
        ccna0.c(new ccne(ccmz0.a()));
        ccna0.f("Quick Share");
        return ccna0.a();
    }
}

