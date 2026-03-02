import android.content.Context;
import android.provider.Settings.Secure;

public final class caaf {
    private final Context a;

    public caaf(Context context0) {
        this.a = context0.getApplicationContext();
    }

    public final boolean a() {
        if(!ffqm.a()) {
            return false;
        }
        Context context0 = this.a;
        if(bzvb.a == null) {
            bzvb.a = Boolean.valueOf(context0.getPackageManager().hasSystemFeature("android.software.leanback"));
        }
        return !bzvb.a.booleanValue() || hugt.a.d().y() ? Settings.Secure.getInt(context0.getContentResolver(), "instant_apps_enabled", 1) != 0 : false;
    }
}

