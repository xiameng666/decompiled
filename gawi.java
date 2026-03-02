import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

public final class gawi {
    public static Spanned a(ghim ghim0) {
        return Html.fromHtml(gawi.m(ghim0), 0);
    }

    public static ghim b(ghim[] arr_ghim) {
        ArrayList arrayList0 = new ArrayList(arr_ghim.length);
        for(int v = 0; v < arr_ghim.length; ++v) {
            arrayList0.add(ghin.b(arr_ghim[v]));
        }
        return ghin.d(ghin.a(arrayList0));
    }

    public static ghim c(String s) {
        return ghin.d(new ghik(ghin.e(s).replaceAll("\r?\n|\r", "<br>")));
    }

    public static MessageLite d(Intent intent0, String s, MessageLite hfvm0) {
        return intent0.hasExtra(s) ? hfxk.e(intent0, s, hfvm0, hftc.a()) : null;
    }

    public static MessageLite e(Bundle bundle0, String s, MessageLite hfvm0) {
        return bundle0.containsKey(s) ? hfxk.f(bundle0, s, hfvm0, hftc.a()) : null;
    }

    public static MessageLite f(byte[] arr_b, Parser hfvs0) {
        return hfvs0.p(arr_b, hftc.a());
    }

    public static MessageLite g(byte[] arr_b, Parser hfvs0) {
        try {
            return gawi.f(arr_b, hfvs0);
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException(hfur0);
        }
    }

    public static MessageLite h(ByteString hfsf0, Parser hfvs0) {
        return hfsf0 != null && hfvs0 != null ? hfvs0.j(hfsf0) : null;
    }

    public static MessageLite i(Intent intent0, String s, MessageLite hfvm0) {
        return hfxk.e(intent0, s, hfvm0, hftc.a());
    }

    public static MessageLite j(Bundle bundle0, String s, MessageLite hfvm0) {
        return hfxk.f(bundle0, s, hfvm0, hftc.a());
    }

    public static MessageLite k(byte[] arr_b, Parser hfvs0) {
        try {
            return gawi.f(arr_b, hfvs0);
        }
        catch(hfur unused_ex) {
            return null;
        }
    }

    public static String l(MessageLite hfvm0) {
        return hfvm0 == null ? null : Base64.encodeToString(hfvm0.toBytesArray(), 0);
    }

    public static String m(ghim ghim0) {
        return ghin.b(ghim0).b;
    }

    public static List n(Bundle bundle0, String s, MessageLite hfvm0) {
        hftc hftc0 = hftc.a();
        try {
            return hfxk.i(bundle0, s, hfvm0, hftc0);
        }
        catch(hfur hfur0) {
            throw new RuntimeException(hfur0);
        }
    }

    public static List o(Intent intent0, String s, MessageLite hfvm0) {
        if(intent0.hasExtra(s)) {
            hftc hftc0 = hftc.a();
            try {
                return hfxk.h(intent0, s, hfvm0, hftc0);
            }
            catch(hfur hfur0) {
                throw new RuntimeException(hfur0);
            }
        }
        return ggna.a;
    }

    public static void p(Bundle bundle0, String s, MessageLite hfvm0) {
        if(hfvm0 != null) {
            hfxk.m(bundle0, s, hfvm0);
        }
    }

    public static void q(Intent intent0, String s, MessageLite hfvm0) {
        if(hfvm0 != null) {
            hfxk.k(intent0, s, hfvm0);
        }
    }

    public static void r(Bundle bundle0, String s, List list0) {
        if(list0 != null) {
            hfxk.n(bundle0, s, list0);
        }
    }

    public static void s(Intent intent0, String s, List list0) {
        if(list0 != null) {
            hfxk.l(intent0, s, list0);
        }
    }
}

