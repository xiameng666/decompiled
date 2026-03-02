import android.app.Activity;
import android.content.Context;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

public final class egve {
    public static void a(xob xob0, int v, String s) {
        egve.b(xob0, xob0.getContainerActivity(), v, s);
    }

    public static void b(Context context0, Activity activity0, int v, String s) {
        GoogleHelp googleHelp0 = new GoogleHelp(s);
        ThemeSettings themeSettings0 = new ThemeSettings();
        themeSettings0.a = 3;
        googleHelp0.s = themeSettings0;
        efol efol0 = new efol();
        efol0.a = 80;
        efzw efzw0 = new efzw(context0, efol0.a());
        bkyf bkyf0 = new bkyf(context0);
        bkyf0.d = "com.google.android.gms.contacts_sync_core.USER_INITIATED_FEEDBACK_REPORT";
        bkyf0.a = azts.Z(activity0);
        bkyf0.e(new egvd(v, efzw0), true);
        googleHelp0.d(bkyf0.a(), context0.getCacheDir());
        new bthl(activity0).a(googleHelp0.a());
    }
}

