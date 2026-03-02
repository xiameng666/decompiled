import android.accounts.Account;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

public final class ekmx {
    public static Account a(String s) {
        return TextUtils.isEmpty(s) ? null : new Account(s, "com.google");
    }

    public static void b(View view0, int v) {
        view0.addOnLayoutChangeListener(new ekmw(v, view0));
    }

    public static void c(xob xob0) {
        GoogleHelp googleHelp0 = new GoogleHelp("contacts_restore");
        ThemeSettings themeSettings0 = new ThemeSettings();
        themeSettings0.a = 3;
        googleHelp0.s = themeSettings0;
        bkyf bkyf0 = new bkyf(xob0);
        bkyf0.d = "com.google.android.gms.contacts_restore.USER_INITIATED_FEEDBACK_REPORT";
        bkyf0.a = azts.Z(xob0.getContainerActivity());
        googleHelp0.d(bkyf0.a(), xob0.getCacheDir());
        new bthl(xob0).a(googleHelp0.a());
    }
}

