import android.content.Context;

public final class cjmp {
    public static void a(Context context0, String s, int v, int v1) {
        cjmj.a.a(context0, "change_component_enabled_state");
        context0.getPackageManager().setApplicationEnabledSetting(s, v, v1);
    }
}

