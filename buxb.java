import android.content.ComponentName;
import android.content.Intent;

public final class buxb implements cmdi {
    private final cmdi a;

    public buxb(cmdi cmdi0) {
        ibuq.f(cmdi0, "activityLauncher");
        super();
        this.a = cmdi0;
    }

    @Override  // cmdi
    public final void a(Intent intent0, cmdm cmdm0) {
        ibuq.f(intent0, "intent");
        if(intent0.getBooleanExtra("calledFromGoogleSettings", false)) {
            Integer integer0 = cmdm0.b;
            ibuq.f(intent0, "intent");
            Intent intent1 = new Intent();
            intent1.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.googlesettings.ui.GoogleSettingsLauncherActivity"));
            intent1.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_INTENT", intent0);
            if(integer0 != null) {
                intent1.putExtra("com.google.android.gms.googlesettings.EXTRA_SETTINGS_EMBEDDED_DEEP_LINK_REQUEST_CODE", integer0.intValue());
            }
            intent1.addFlags(0x10000);
            intent0 = intent1;
        }
        this.a.a(intent0, cmdm0);
    }
}

