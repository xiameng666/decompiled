import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import java.util.Locale;

public final class edpi {
    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public static Intent a(String s) {
        return new Intent("android.intent.action.DIAL", Uri.parse(String.format("tel:%s", s)));
    }

    public static String b(String s) {
        String s1 = PhoneNumberUtils.formatNumber(s, Locale.getDefault().getCountry());
        return s1 == null ? s : s1;
    }

    public static boolean c(Context context0) {
        return context0.getPackageManager().resolveActivity(new Intent("android.intent.action.DIAL", Uri.parse(String.format("tel:%s", "555-555-5555"))), 0x10000) != null;
    }
}

