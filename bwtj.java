import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class bwtj {
    public static Set a() {
        return new HashSet(Arrays.asList(TextUtils.split(hubg.a.j().K(), ",")));
    }

    public static void b(String s) {
        batl.s(s);
        Uri uri0 = Uri.parse(s);
        if(uri0 != null && uri0.isAbsolute()) {
            return;
        }
        throw new IllegalArgumentException(a.a(s, "Invalid String passed as URL: \'", "\'."));
    }

    public static void c(String s) {
        batl.s(s);
        if(!URLUtil.isHttpUrl(s) && !URLUtil.isHttpsUrl(s)) {
            throw new IllegalArgumentException(a.a(s, "Web URL must use http or https scheme: \'", "\'."));
        }
    }

    public static boolean d(Context context0, String s) {
        return hubn.g() && bwtj.e(context0, s);
    }

    public static boolean e(Context context0, String s) {
        return bbmt.e(htzg.a.b().a().split(","), s) ? false : hubu.a.b().y() || azql.c(context0).g(s);
    }

    public static boolean f(String s) {
        return hubu.a.b().c() && hubg.a.j().F().b.contains(s);
    }
}

