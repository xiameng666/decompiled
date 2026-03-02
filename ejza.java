import android.content.Context;
import android.telephony.TelephonyManager;

public final class ejza {
    public final ejyz a;
    public final TelephonyManager b;
    private static ejza c;

    private ejza(Context context0) {
        TelephonyManager telephonyManager0 = (TelephonyManager)context0.getSystemService("phone");
        ejyz ejyz0 = new ejyz();
        super();
        this.b = telephonyManager0;
        this.a = ejyz0;
    }

    public static ejza a(Context context0) {
        synchronized(ejza.class) {
            if(ejza.c == null) {
                ejza.c = new ejza(context0.getApplicationContext());
            }
        }
        return ejza.c;
    }
}

