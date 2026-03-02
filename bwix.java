import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.home.stub.PowerMonitoringChimeraServiceBase.onCreate.1;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;

public abstract class bwix extends Service {
    private boolean a;
    public static final bboh b;
    public TracingBroadcastReceiver c;
    private boolean d;

    static {
        bwix.b = bboh.b("PwrMonitoringSvc", bbcu.fA);
    }

    public abstract void a(String arg1);

    public final void b(String s) {
        if(ibuq.m(s, "high_energy_use")) {
            synchronized(this) {
                if(this.d) {
                    ((ggtj)bwix.b.h()).x("High energy mode detected: un-registering for energy events");
                    TracingBroadcastReceiver tracingBroadcastReceiver0 = this.c;
                    if(tracingBroadcastReceiver0 == null) {
                        ibuq.j("highPowerBroadcastReceiver");
                        tracingBroadcastReceiver0 = null;
                    }
                    this.unregisterReceiver(tracingBroadcastReceiver0);
                    this.d = false;
                }
            }
        }
        this.a(s);
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return null;
    }

    @Override  // com.google.android.chimera.Service
    public void onCreate() {
        ((ggtj)bwix.b.h()).x("Power monitoring service created");
        this.c = new PowerMonitoringChimeraServiceBase.onCreate.1(this, this.getBaseContext());
    }

    @Override  // com.google.android.chimera.Service
    public final void onDestroy() {
        bboh bboh0 = bwix.b;
        ((ggtj)bboh0.h()).x("Power monitor stopping");
        synchronized(this) {
            if(this.d) {
                ((ggtj)bboh0.h()).x("Power monitoring service un-registering for energy events");
                TracingBroadcastReceiver tracingBroadcastReceiver0 = this.c;
                if(tracingBroadcastReceiver0 == null) {
                    ibuq.j("highPowerBroadcastReceiver");
                    tracingBroadcastReceiver0 = null;
                }
                this.unregisterReceiver(tracingBroadcastReceiver0);
                this.d = false;
            }
        }
        this.a = false;
    }

    @Override  // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        if(this.a) {
            ((ggtj)bwix.b.h()).x("Power monitoring service running");
            return 2;
        }
        this.a = true;
        bboh bboh0 = bwix.b;
        ((ggtj)bboh0.h()).x("Power monitoring service started");
        Context context0 = this.getBaseContext();
        ibuq.e(context0, "getBaseContext(...)");
        if(!bwiy.b(context0)) {
            ((ggtj)bboh0.h()).x("Power monitoring is not supported - shutting down");
            this.stopSelf();
            return 2;
        }
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        intentFilter0.addAction("android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED");
        synchronized(this) {
            if(!this.d) {
                ((ggtj)bboh0.h()).x("Power monitoring service registering for energy events");
                TracingBroadcastReceiver tracingBroadcastReceiver0 = this.c;
                if(tracingBroadcastReceiver0 == null) {
                    ibuq.j("highPowerBroadcastReceiver");
                    tracingBroadcastReceiver0 = null;
                }
                this.registerReceiver(tracingBroadcastReceiver0, intentFilter0, 2);
                this.d = true;
            }
        }
        Context context1 = this.getBaseContext();
        ibuq.e(context1, "getBaseContext(...)");
        this.b(bwiy.a(context1));
        return 2;
    }
}

