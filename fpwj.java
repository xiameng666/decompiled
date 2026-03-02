import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import j..util.Objects;

public final class fpwj {
    static final void a(Context context0) {
        try {
            ank ank0 = new ank();
            ank0.d(Color.parseColor("#eeeeee"));
            ank0.a().a(context0, Uri.parse("https://www.google.com/policies/privacy/"));
        }
        catch(ActivityNotFoundException unused_ex) {
            throw new fpwf();
        }
    }

    public static final void b(Context context0, acp acp0, String s) {
        fpwj.d(new fpwh(acp0), context0, s, -1);
    }

    public static final void c(Activity activity0, String s) {
        Objects.requireNonNull(activity0);
        fpwj.d(new fpwg(activity0), activity0, s, 0);
    }

    private static final void d(fpwi fpwi0, Context context0, String s, int v) {
        if(s != null && !s.isEmpty()) {
            Intent intent0 = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", s).putExtra("extra.screenId", 500);
            if(intent0.resolveActivity(context0.getPackageManager()) == null) {
                fpwj.a(context0);
                return;
            }
            fpwi0.a(intent0, v);
            return;
        }
        fpwj.a(context0);
    }
}

