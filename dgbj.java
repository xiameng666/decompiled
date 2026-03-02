import android.content.Context;
import android.net.Uri;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;

final class dgbj {
    public static final Uri a;
    public static final Object b;
    public final Context c;
    public final TelephonyManager d;
    public final TelecomManager e;

    static {
        dgbj.a = Uri.parse("content://icc/adn/");
        dgbj.b = new Object();
    }

    public dgbj(Context context0) {
        this.c = context0;
        this.d = (TelephonyManager)context0.getSystemService("phone");
        this.e = (TelecomManager)context0.getSystemService("telecom");
    }
}

