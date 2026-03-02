import android.accounts.Account;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

public final class cchp {
    public static void a(Activity activity0, grwc grwc0, String s) {
        String s3;
        gsae gsae0;
        String s1 = grwc0.d;
        if((grwc0.b & 4) == 0) {
            gsae0 = null;
        }
        else {
            gsae0 = grwc0.e;
            if(gsae0 == null) {
                gsae0 = gsae.a;
            }
        }
        String s2 = ccht.b(s1, gsae0);
        GoogleHelp googleHelp0 = new GoogleHelp(((grwc0.b & 1) == 0 ? "MY_GOOGLE_ANDROID_MAIN_SCREEN" : grwc0.c));
        ThemeSettings themeSettings0 = new ThemeSettings();
        themeSettings0.a = cchl.d() ? 2 : 0;
        googleHelp0.s = themeSettings0;
        int v = grwc0.b;
        if((v & 8) == 0) {
            s3 = (v & 2) == 0 ? "https://support.google.com/accounts" : grwc0.d;
        }
        else {
            s3 = grwc0.f;
        }
        googleHelp0.q = Uri.parse(s3);
        googleHelp0.F = (grwc0.b & 0x20) == 0 ? "com.google.android.gms.accountsettings" : grwc0.g;
        if(!bbqr.d(s)) {
            googleHelp0.c = new Account(s, "com.google");
        }
        String s4 = grwc0.h;
        bkyf bkyf0 = new bkyf(activity0.getApplicationContext());
        if(bbqr.d(s4)) {
            s4 = "com.google.android.gms.accountsettings.feedback";
        }
        bkyf0.d = s4;
        Bitmap bitmap0 = azts.Z(activity0.getContainerActivity());
        if(bitmap0 != null) {
            bkyf0.a = bitmap0;
        }
        if(!bbqr.d(s)) {
            gftb.check(s);
            bkyf0.b = s;
        }
        googleHelp0.d(bkyf0.a(), activity0.getCacheDir());
        if(s2 != null) {
            InProductHelp inProductHelp0 = new InProductHelp(googleHelp0, null, null, 0, null, 0, null);
            inProductHelp0.c = s2;
            new bthl(activity0).b(inProductHelp0);
            return;
        }
        Intent intent0 = googleHelp0.a();
        new bthl(activity0).a(intent0);
    }
}

