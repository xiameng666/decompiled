import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class bcql {
    public static long a(hfwn hfwn0) {
        return bcqk.a(glul.a(hfwn0.b, 1000L), ((long)hfwn0.c) / 1000000L);
    }

    public static long b(hogd hogd0) {
        return bcql.a((hogd0.c == null ? hfwn.a : hogd0.c)) - bcql.a((hogd0.d == null ? hfwn.a : hogd0.d));
    }

    public static hfwn c(long v) {
        int v1 = (int)(v % 1000L * 1000000L);
        long v2 = v / 1000L;
        if(v1 <= -1000000000 || v1 >= 1000000000) {
            v2 = bcqk.a(v2, v1 / 1000000000);
            v1 %= 1000000000;
        }
        if(v1 < 0) {
            v1 += 1000000000;
            int v3 = 1;
            int v4 = Long.compare(v2 ^ -1L + v2, 0L) < 0 ? 0 : 1;
            if((1L ^ v2) < 0L) {
                v3 = 0;
            }
            if((v4 | v3) == 0) {
                throw new ArithmeticException();
            }
            v2 = -1L + v2;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfwn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((hfwn)hftv0).b = v2;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hfwn)hftp0.b_message).c = v1;
        return (hfwn)hftp0.N_build();
    }

    public static String d(long v) {
        GregorianCalendar gregorianCalendar0 = new GregorianCalendar();
        gregorianCalendar0.setTimeInMillis(v);
        return new SimpleDateFormat("MMM dd yyyy - hh:mm:ss aa", Locale.getDefault()).format(gregorianCalendar0.getTime());
    }
}

