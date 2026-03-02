import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.WorkSource;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.trustlet.onbody.internal.PhonePositionTracker.PhonePositionReceiver;
import java.util.concurrent.atomic.AtomicLong;

public final class ezkz {
    public static final bboh a;
    public final AtomicLong b;
    public final Context c;
    public final ezky d;
    protected final PhonePositionTracker.PhonePositionReceiver e;
    public boolean f;
    public long g;
    public final PowerManager h;
    public long i;
    public long j;
    public boolean k;
    private PendingIntent l;
    private final cmmn m;

    static {
        ezkz.a = bboh.b("Trustlet_Onbody", bbcu.eL);
    }

    public ezkz(Context context0, ezky ezky0) {
        this.b = new AtomicLong(-1L);
        this.k = false;
        this.c = context0;
        this.d = ezky0;
        this.e = new PhonePositionTracker.PhonePositionReceiver(this);
        this.h = (PowerManager)context0.getSystemService("power");
        this.g = 0L;
        this.i = -1L;
        this.f = false;
        this.m = new cniy(context0);
    }

    public final void a() {
        if(!this.f) {
            Intent intent0 = new Intent("com.google.android.gms.auth.trustagent.trustlet.ACTION_ACTIVITY_DETECTED");
            this.c.getPackageName();
            intent0.setPackage("com.google.android.gms");
            this.l = PendingIntent.getBroadcast(this.c, 0, intent0, 0xA000000);
            cmmo cmmo0 = new cmmo();
            cmmo0.c(60000L);
            cmmo0.e = "Coffee-PhonePositionTracker";
            cmmo0.b(9);
            WorkSource workSource0 = bbrd.b(this.c, "com.google.android.gms");
            if(workSource0 != null) {
                cmmo0.d = workSource0;
            }
            ActivityRecognitionRequest activityRecognitionRequest0 = cmmo0.a();
            evql evql0 = this.m.f(activityRecognitionRequest0, this.l);
            evql0.b(new ezkw(this));
            evql0.A(new ezkx(this));
            this.k = true;
        }
    }

    public final void b() {
        this.k = false;
        if(this.f) {
            this.f = false;
            evql evql0 = this.m.d(this.l);
            evql0.b(new ezku());
            evql0.A(new ezkv());
            this.c.unregisterReceiver(this.e);
        }
    }
}

