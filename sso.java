import j..util.DesugarTimeZone;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public enum sso {
    @Deprecated
    SEOS_TSM(-1),
    SPECIFICATION_STRICT(0);

    public static final List c;
    public final int d;
    private static final Charset e;

    static {
        sso.e = Charset.forName("UTF-8");
        sso.c = Arrays.asList(new Integer[]{((int)0), ((int)1), ((int)2), ((int)3), ((int)4), ((int)5), ((int)6), ((int)7), ((int)8), ((int)9)});
    }

    private sso(int v1) {
        this.d = v1;
    }

    public final String a(idsd idsd0) {
        return ifuf.a(idsd0.b);
    }

    public final Calendar b(idsd idsd0) {
        String s;
        byte[] arr_b = idsd0.b;
        if(arr_b.length == 0) {
            return null;
        }
        try {
            s = new String(arr_b, sso.e);
            String s1 = new idre(s).f();
            int v = sso.d(s1, 0) + 2000;
            int v1 = sso.d(s1, 2) - 1;
            int v2 = sso.d(s1, 4);
            int v3 = sso.d(s1, 6);
            int v4 = sso.d(s1, 8);
            Calendar calendar0 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            calendar0.set(1, v);
            calendar0.set(2, v1);
            calendar0.set(5, v2);
            calendar0.set(11, v3);
            calendar0.set(12, v4);
            calendar0.set(13, 0);
            calendar0.set(14, 0);
            if(this == sso.b) {
                calendar0.set(13, sso.d(s1, 10));
                calendar0.setTimeZone(DesugarTimeZone.getTimeZone(s1.substring(12, s1.length())));
            }
            return calendar0;
        }
        catch(Exception unused_ex) {
            try {
                Date date0 = new SimpleDateFormat("M/dd/yyyy KK:mm:ss aa", Locale.US).parse(s);
                Calendar calendar1 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar1.setTime(date0);
                return calendar1;
            }
            catch(ParseException parseException0) {
                throw new IllegalArgumentException(parseException0.getMessage() + a.a(str.b(idsd0.b), " (", ")"), parseException0);
            }
        }
    }

    public static final String c(String s) {
        return s == null ? "" : s;
    }

    private static final int d(String s, int v) {
        return Integer.parseInt(s.substring(v, v + 2));
    }
}

