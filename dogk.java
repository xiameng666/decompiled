import android.content.Context;
import android.text.format.DateFormat;
import com.google.android.libraries.tapandpay.pay.pass.valuable.model.ValuableGroup;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class dogk {
    public static final bboh a;
    public final dvhd b;
    public final Context c;

    static {
        dogk.a = bboh.b("Pay", bbcu.cZ);
    }

    public dogk(dvhd dvhd0, Context context0) {
        this.b = dvhd0;
        this.c = context0;
    }

    public static String a(Context context0, guwx guwx0) {
        guww guww0 = guwx0.i == null ? guww.a : guwx0.i;
        gtle gtle0 = guww0.b == null ? gtle.a : guww0.b;
        guww guww1 = guwx0.i == null ? guww.a : guwx0.i;
        gtle gtle1 = guww1.b == null ? gtle.a : guww1.b;
        hjio hjio0 = gtle1.d == null ? hjio.a : gtle1.d;
        return context0.getString(0x7F1522E9, new Object[]{dogk.e(context0, (gtle0.c == null ? hjih.a : gtle0.c)), dogk.c(context0, hjio0)});  // string:pay_upcoming_event_ticket_date_time "%1$s at %2$s"
    }

    public static String b(ValuableGroup valuableGroup0) {
        return efmo.c(new String[]{valuableGroup0.e, valuableGroup0.f});
    }

    public static String c(Context context0, hjio hjio0) {
        try {
            String s = "H:mm";
            String s1 = String.format("%s:%s", ((int)hjio0.b), ((int)hjio0.c));
            Date date0 = new SimpleDateFormat("H:mm", Locale.getDefault()).parse(s1);
            if(date0 == null) {
                return "";
            }
            if(!DateFormat.is24HourFormat(context0)) {
                s = "h:mm a";
            }
            return new SimpleDateFormat(s, Locale.getDefault()).format(date0);
        }
        catch(ParseException unused_ex) {
            ((ggtj)dogk.a.i()).x("Error parsing the event time.");
            return "";
        }
    }

    public static void d(ProtoLiteBuilder hftp0, guxh guxh0) {
        String s = guxh0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        edkr edkr0 = (edkr)hftp0.b_message;
        s.getClass();
        edkr0.j = s;
        hjie hjie0 = guxh0.e == null ? hjie.a : guxh0.e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        hjie0.getClass();
        ((edkr)hftv0).k = hjie0;
        ((edkr)hftv0).b |= 2;
        gukj gukj0 = gukj.b(guxh0.h) == null ? gukj.e : gukj.b(guxh0.h);
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        edkr edkr1 = (edkr)hftp0.b_message;
        edkr1.m = gukj0.a();
    }

    private static String e(Context context0, hjih hjih0) {
        try {
            String s = String.format("%s-%s-%s", ((int)hjih0.b), ((int)hjih0.c), ((int)hjih0.d));
            Date date0 = new SimpleDateFormat("yyyy-M-d", Locale.getDefault()).parse(s);
            if(date0 == null) {
                return "";
            }
            if(edmo.b(new Date().getTime(), date0.getTime())) {
                return "Today";
            }
            long v = new Date().getTime();
            long v1 = date0.getTime();
            return TimeUnit.MILLISECONDS.toDays(edmo.a(v1) - edmo.a(v)) == 1L ? "Tomorrow" : new SimpleDateFormat("EEEE", Locale.getDefault()).format(date0);
        }
        catch(ParseException unused_ex) {
            ((ggtj)dogk.a.i()).x("Error parsing the event time.");
            return "";
        }
    }
}

