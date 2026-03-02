import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;

public final class ajct {
    private static final baun a;
    private final Context b;

    static {
        ajct.a = new baun("Auth", new String[]{"PackageManagerHelper"});
    }

    public ajct(Context context0) {
        this.b = context0;
    }

    public final Drawable a(String s) {
        try {
            return (Drawable)bbsr.b(this.b).f(s).b;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ajct.a.m("Package does not exist: %s", new Object[]{s, packageManager$NameNotFoundException0});
            return null;
        }
    }

    public final CharSequence b(String s) {
        try {
            return bbsr.b(this.b).g(s);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            ajct.a.m("Package does not exist: %s", new Object[]{s, packageManager$NameNotFoundException0});
            return null;
        }
    }
}

