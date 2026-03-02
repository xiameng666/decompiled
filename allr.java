import android.content.Context;
import android.content.Intent;

public final class allr {
    public static Intent a(Context context0) {
        Intent intent0 = new Intent();
        intent0.setClassName(context0, "com.google.android.gms.auth.proximity.multidevice.SettingsActivity");
        return intent0;
    }

    public static Intent b() {
        return bbmq.j(new Intent(hvbr.g()).addCategory("android.intent.category.DEFAULT").putExtra("EXTRA_SETTINGS_INTENT_SOURCE", "CHROMEBOOK_SETTINGS_PAGE"));
    }

    public static boolean c() {
        return hpzt.a.b().w();
    }
}

