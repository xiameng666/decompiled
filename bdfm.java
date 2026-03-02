import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import java.util.Locale;

public final class bdfm {
    public static void a(gqmd gqmd0, xni xni0, gfsx gfsx0) {
        Uri uri0 = Uri.parse(((String)gqmd0.e().f(((bedg)gqmd0.j()).c)));
        if(gfsx0.i() && !gqmd0.e().i() && ((int)(((Integer)gfsx0.d()))) >= 86) {
            uri0 = Uri.parse(((bedg)gqmd0.j()).c).buildUpon().path("/.well-known/change-password").build();
        }
        gqmd0.k();
        bdfm.b(uri0, xni0, gfsx0.i(), xni0.getPackageManager());
    }

    public static void b(Uri uri0, xni xni0, boolean z, PackageManager packageManager0) {
        if(uri0.toString().toLowerCase(Locale.US).startsWith("android://")) {
            Toast.makeText(xni0, 0x7F152679, 1).show();  // string:pwm_checkup_change_for_app_message "Please open your Android app to change 
                                                         // password."
            return;
        }
        if(z) {
            try {
                new ank().a().a(xni0, uri0);
            }
            catch(ActivityNotFoundException unused_ex) {
                Toast.makeText(xni0, 0x7F1526DC, 1).show();  // string:pwm_generic_error "Something went wrong."
            }
            return;
        }
        Intent intent0 = new Intent("android.intent.action.VIEW", uri0);
        if(intent0.resolveActivity(packageManager0) != null) {
            xni0.startActivity(intent0);
            return;
        }
        Toast.makeText(xni0, 0x7F15270D, 1).show();  // string:pwm_install_browser_notification "To open this link, install a browser"
    }
}

