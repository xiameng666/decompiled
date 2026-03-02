import com.google.android.gms.update.SystemUpdateStatus;
import java.util.Locale;
import java.util.regex.Pattern;

public final class ezwx {
    public static final baun a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    private static final ggfp f;
    private static final ggfp g;

    static {
        ezwx.a = fabk.c("Ui");
        ezwx.b = Pattern.compile(String.format(Locale.US, "^%d$", ((int)0)));
        ezwx.c = Pattern.compile(String.format(Locale.US, "^%d,(\\d+)$", ((int)1)));
        ezwx.d = Pattern.compile(String.format(Locale.US, "^%d,(\\d+)$", ((int)2)));
        ezwx.e = Pattern.compile("^\\d+,(\\d+)$");
        ezwx.f = ggfp.O(Integer.valueOf(0x10B), Integer.valueOf(0xC0B), Integer.valueOf(0x60B), Integer.valueOf(0x70B), Integer.valueOf(0xB0B), Integer.valueOf(0x110), new Integer[]{((int)531), ((int)787), ((int)1043)});
        ezwx.g = ggfp.L(Integer.valueOf(0x210), Integer.valueOf(0x510), Integer.valueOf(0x710));
    }

    public static int a(String s, long v) {
        int v1 = 0;
        if(gfta.c(s)) {
            return 0;
        }
        long v2 = 0L;
        for(Object object0: gfud.e(',').l(s)) {
            String s1 = (String)object0;
            try {
                v2 += Long.parseLong(s1.trim());
            }
            catch(NumberFormatException unused_ex) {
                ezwx.a.d("Malformed elapsed time string: %s.", new Object[]{s1});
                return v1;
            }
            if(v < v2) {
                break;
            }
            ++v1;
        }
        return v1;
    }

    public static int b(long v) {
        return ezwx.a(ezwg.b(), v);
    }

    public static int c(long v) {
        return ezwx.a(hwau.a.b().a(), v);
    }

    public static boolean d(SystemUpdateStatus systemUpdateStatus0) {
        if(!ezwj.j().equals(ezwy.b)) {
            Integer integer0 = (int)systemUpdateStatus0.c;
            if(!ezwx.f.contains(integer0)) {
                return ezwx.g.contains(integer0) ? !systemUpdateStatus0.z : false;
            }
            return true;
        }
        return false;
    }
}

