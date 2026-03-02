import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import jeb.synthetic.TWR;

public final class ejyu {
    public static final Uri a;
    static final String[] b;
    public final Context c;
    private static final bboh d;
    private static final Map e;
    private static volatile boolean f;
    private final String g;

    static {
        ejyu.d = bboh.b("ROM_CidGenerator", bbcu.bN);
        ejyu.a = Uri.parse("content://com.google.android.gsf.gservices");
        ejyu.b = new String[]{"android_id"};
        ejyu.e = new HashMap();
    }

    public ejyu(Context context0) {
        this.c = context0;
        synchronized(ejyu.class) {
            String s = ejyu.c(context0);
            this.g = s == null ? null : String.format(Locale.US, "%016x", ((long)(Long.parseLong(s) & -2L)));
        }
    }

    public static gfsx a(Context context0) {
        String s = ejyu.c(context0);
        if(s == null) {
            return gfqx.a;
        }
        try {
            return gfsx.m(Long.valueOf(Long.parseLong(s)));
        }
        catch(NumberFormatException numberFormatException0) {
            a.ae(ejyu.d.i(), "Invalid Android Id", numberFormatException0);
            return gfqx.a;
        }
    }

    public final String b(String s) {
        synchronized(ejyu.class) {
            String s1 = this.g;
            if(s1 != null) {
                String s2 = (String)ejyu.e.get(s);
                if(s2 == null) {
                    try {
                        s2 = fgvs.a(s, s1);
                    }
                    catch(Exception exception0) {
                        a.ae(ejyu.d.i(), "calculate failed", exception0);
                    }
                    ejyu.e.put(s, s2);
                }
                return s2;
            }
        }
        return null;
    }

    private static String c(Context context0) {
        String s;
        Cursor cursor0 = null;
        try {
            cursor0 = context0.getContentResolver().query(ejyu.a, null, null, ejyu.b, null);
            goto label_6;
        }
        catch(SecurityException securityException0) {
            goto label_11;
        }
        catch(Throwable throwable0) {
        }
        TWR.safeClose$NT(null, throwable0);
        throw throwable0;
    label_6:
        if(cursor0 != null) {
            try {
                try {
                    if(cursor0.moveToFirst() && cursor0.getColumnCount() >= 2) {
                        s = cursor0.getString(1);
                        goto label_16;
                    }
                }
                catch(SecurityException securityException0) {
                label_11:
                    a.ae(ejyu.d.i(), "Unable to get android ID", securityException0);
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_16:
            cursor0.close();
            return s;
        }
    label_18:
        if(cursor0 != null) {
            cursor0.close();
        }
        return null;
    }
}

