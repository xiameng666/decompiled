import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class cqjq extends IntentOperation implements LocationListener, cmob {
    public static final AtomicBoolean a;
    protected Semaphore b;
    public HandlerThread c;
    protected boolean d;
    protected final cqig e;
    protected String f;
    protected cmnh g;

    static {
        cqjq.a = new AtomicBoolean();
    }

    public cqjq(cqig cqig0) {
        this.d = false;
        this.e = cqig0;
    }

    protected abstract gmcd a(hltz arg1, Location arg2);

    protected final void b(String s, String s1, String s2, boolean z) {
        PendingIntent pendingIntent0 = cqjk.a("com.google.android.gms.mdm.notifications.actions.located_actioned", this, this.f);
        cqqu.d(this);
        juo juo0 = cqqu.b(this);
        if(z) {
            juo0.K(true);
        }
        else {
            juo0.h(true);
        }
        juo0.D(s);
        juo0.k(s1);
        juo0.h = pendingIntent0;
        juo0.B = "recommendation";
        juo0.E = 1;
        juk juk0 = new juk();
        juk0.f(s);
        juk0.e(s1);
        juo0.v(juk0);
        this.f(juo0);
        Notification notification0 = juo0.a();
        bayn.f(this).y(s2, 1, evuh.bR, notification0);
    }

    protected abstract void c(Intent arg1);

    public final void d(hltz hltz0) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            cqqt.e(new Object[0]);
        }
        try {
            this.a(hltz0, null).get();
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
        catch(ExecutionException unused_ex) {
        }
    }

    protected final void e() {
        if(fhcd.g(this)) {
            this.b.release();
            return;
        }
        this.g.g(this).b(new cqjn(this));
    }

    protected abstract void f(juo arg1);

    @Override  // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        HandlerThread handlerThread0 = new HandlerThread("LocateService callbacks");
        this.c = handlerThread0;
        handlerThread0.start();
        this.g = new cnjv(this);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        HandlerThread handlerThread0 = this.c;
        if(handlerThread0 != null) {
            handlerThread0.quit();
            this.c = null;
        }
        bayn.f(this).o("mdm.notification_persistent_location", 1, evuh.bR);
        cqqr cqqr0 = cqqr.a();
        cqqr0.a.clear();
        cqqr0.b.set(null);
        cqjq.a.set(false);
    }

    @Override  // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent0) {
        if(!cqqj.a(3) && fhcd.g(this)) {
            return;
        }
        try {
            if(!bbnp.d(this)) {
                if(intent0 == null) {
                    intent0 = null;
                }
                else {
                    this.b("Locating device", "Find Hub is trying to locate this device", "mdm.notification_persistent_location", true);
                    this.c(intent0);
                }
            }
        }
        finally {
            erzp.c(intent0);
            bsoa.b(intent0);
        }
    }

    @Override  // android.location.LocationListener, cmob
    public final void onLocationChanged(Location location0) {
        this.d = true;
        if(fhcd.g(this)) {
            this.a(hltz.a, location0);
            this.e();
            return;
        }
        cqqr.a().b(location0);
        this.a(hltz.a, location0);
        if((((double)location0.getAccuracy()) < 25.0)) {
            this.e();
        }
    }
}

