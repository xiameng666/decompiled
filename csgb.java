import android.content.Context;
import android.text.BidiFormatter;
import android.text.TextUtils;
import android.text.format.Formatter;
import java.util.List;
import java.util.Locale;

public final class csgb {
    static {
        bboh.b("MobileDataPlan", bbcu.ck);
    }

    public static String a(Context context0, long v) {
        return csgb.b(context0, v, ((int)hvko.a.q().b()));
    }

    public static String b(Context context0, long v, int v1) {
        int v2;
        String s;
        if(v1 == 0) {
            return Formatter.formatShortFileSize(context0, v);
        }
        if(context0 == null) {
            return "";
        }
        Locale locale0 = Locale.US;
        if((v1 & 0x20) != 0) {
            csgd csgd0 = csgd.a(v, v1, locale0);
            s = context0.getString(0x7F1511E4, new Object[]{csgd0.a, csgd0.b});  // string:file_size_suffix "%1$s %2$s"
            return TextUtils.getLayoutDirectionFromLocale(locale0) == 1 ? BidiFormatter.getInstance(true).unicodeWrap(s) : s;
        }
        locale0 = context0.getResources().getConfiguration().getLocales().get(0);
        csgd csgd1 = csgd.a(v, v1, locale0);
        switch(csgd1.b.ordinal()) {
            case 0: {
                v2 = 0x7F1507F1;  // string:common_byte_short "B"
                break;
            }
            case 1: {
                v2 = 0x7F150877;  // string:common_kilobyte_short "KB"
                break;
            }
            case 2: {
                v2 = 0x7F150885;  // string:common_megabyte_short "MB"
                break;
            }
            case 3: {
                v2 = 0x7F150835;  // string:common_gigabyte_short "GB"
                break;
            }
            case 4: {
                v2 = 0x7F1508EE;  // string:common_terabyte_short "TB"
                break;
            }
            case 5: {
                v2 = 0x7F1508BC;  // string:common_petabyte_short "PB"
                break;
            }
            default: {
                throw new RuntimeException(null, null);
            }
        }
        String s1 = context0.getString(v2);
        s = context0.getString(0x7F1511E4, new Object[]{csgd1.a, s1});  // string:file_size_suffix "%1$s %2$s"
        return TextUtils.getLayoutDirectionFromLocale(locale0) == 1 ? BidiFormatter.getInstance(true).unicodeWrap(s) : s;
    }

    public static String c(Context context0, long v) {
        return csgb.d(context0, v, false);
    }

    public static String d(Context context0, long v, boolean z) {
        if(context0 != null) {
            String s = csgb.b(context0, v, (z ? 57 : 25));
            List list0 = gfud.e(' ').n(s);
            return list0.size() == 2 ? ((String)list0.get(0)) + ((String)list0.get(1)) : "";
        }
        return "";
    }
}

