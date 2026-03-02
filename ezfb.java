import android.content.Context;
import com.google.android.gms.trustagent.trustlet.InactivityTracker.1;
import com.google.android.gms.trustagent.trustlet.InactivityTracker.2;

public final class ezfb {
    public static final bboh a;
    public static final String b;
    public static final String c;
    public final Context d;
    public final ezfa e;
    public int f;
    public boolean g;

    static {
        ezfb.a = bboh.b("TrustAgent", bbcu.aR);
        ezfb.b = ezfb.class.getPackage() + ".INACTIVITY_TRIGGERED";
        ezfb.c = ezfb.class.getPackage() + ".INACTIVITY_NOTIFICATION";
    }

    public ezfb(Context context0, ezfa ezfa0) {
        new InactivityTracker.1(this);
        new InactivityTracker.2(this);
        this.d = context0;
        this.e = ezfa0;
    }
}

