import android.content.Intent;
import com.google.android.gms.mdm.settings.AdmSettingsChimeraActivity;

public final class cqpt implements ccrn {
    private final cqpv a;
    private final cqpw b;
    private final cqpx c;

    public cqpt(cqpv cqpv0, cqpw cqpw0, cqpx cqpx0) {
        this.a = cqpv0;
        this.b = cqpw0;
        this.c = cqpx0;
    }

    @Override  // ccrn
    public final Object g(ibrl ibrl0) {
        cqps cqps0;
        cqpx cqpx0 = this.c;
        if(cqpx0.b()) {
            if(!cqpx0.c()) {
                ibuq.e("Find, secure, or reset this device if it\'s lost", "getString(...)");
                ibuq.e("@com.google.android.gms:string/common_continue", "getString(...)");
                Intent intent0 = AdmSettingsChimeraActivity.g(this.a.a);
                intent0.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SOURCE", 2).putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_UTM_SESSION_ID", cjan.a());
                ibuq.c(intent0);
                ccmw ccmw0 = new ccmw(intent0, cmeu.f);
                cqps0 = new cqps(ccow.b, "Find, secure, or reset this device if it\'s lost", "@com.google.android.gms:string/common_continue", ccmw0);
            }
            else if(cqpx0.a()) {
                ibuq.e("Open the app to locate your device", "getString(...)");
                ibuq.e("@com.google.android.gms:string/common_open", "getString(...)");
                Intent intent1 = cqpz.a(this.a.a);
                ccmw ccmw2 = intent1 == null ? null : new ccmw(intent1, cmeu.h);
                cqps0 = new cqps(ccow.d, "Open the app to locate your device", "@com.google.android.gms:string/common_open", ccmw2);
            }
            else {
                ibuq.e("Download the app or open on the web to locate your device", "getString(...)");
                ibuq.e("@com.google.android.gms:string/common_download", "getString(...)");
                ccmw ccmw1 = new ccmw(cqpz.b(), cmeu.g);
                cqps0 = new cqps(ccow.c, "Download the app or open on the web to locate your device", "@com.google.android.gms:string/common_download", ccmw1);
            }
            ccmy ccmy0 = cqps0.d;
            if(ccmy0 != null) {
                ibuq.e("@com.google.android.gms:string/fmd_settings_activity_title", "getString(...)");
                ccne ccne0 = new ccne(new ccnb(cqps0.c, ccmy0));
                return new ccnh("@com.google.android.gms:string/fmd_settings_activity_title", cqps0.b, cqps0.a, ccmy0, ccne0, null, 0x60);
            }
        }
        return null;
    }
}

