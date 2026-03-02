import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.google.android.gms.backup.BackUpNowConfig;
import j..util.Optional;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public final class asfr {
    public static final baun a;
    public static final bboh b;
    public final BackUpNowConfig c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public BroadcastReceiver f;
    public BroadcastReceiver g;
    public ScheduledExecutorService h;
    private final BatteryManager i;
    private final ConnectivityManager j;
    private final PowerManager k;

    static {
        asfr.a = aqql.a("BackupNowConstraintsChecker");
        asfr.b = bboh.b("BackupNowConstraintsChecker", bbcu.dF);
    }

    public asfr(BackUpNowConfig backUpNowConfig0, Context context0) {
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        this.d = atomicBoolean0;
        AtomicBoolean atomicBoolean1 = new AtomicBoolean(false);
        this.e = atomicBoolean1;
        this.c = backUpNowConfig0;
        this.i = (BatteryManager)context0.getSystemService(BatteryManager.class);
        this.j = (ConnectivityManager)context0.getSystemService(ConnectivityManager.class);
        PowerManager powerManager0 = (PowerManager)context0.getSystemService(PowerManager.class);
        this.k = powerManager0;
        if(backUpNowConfig0.c && powerManager0.isInteractive()) {
            asfr.a.h("Required idle and screen is on, assuming we\'re dreaming", new Object[0]);
            atomicBoolean0.set(true);
        }
        if(backUpNowConfig0.b) {
            atomicBoolean1.set(true);
        }
    }

    public final Optional a() {
        BackUpNowConfig backUpNowConfig0 = this.c;
        if(backUpNowConfig0.a && this.j.isActiveNetworkMetered()) {
            asfr.a.m("Metered network, but wanted unmetered.", new Object[0]);
            return Optional.of(Integer.valueOf(29002));
        }
        if(backUpNowConfig0.b && !this.e.get()) {
            asfr.a.m("Stopped charging, but requires charging.", new Object[0]);
            return Optional.of(Integer.valueOf(29006));
        }
        if(backUpNowConfig0.c && this.k.isInteractive() && !this.d.get()) {
            asfr.a.m("Not idle, but requires idle.", new Object[0]);
            return Optional.of(Integer.valueOf(29007));
        }
        if(!backUpNowConfig0.e && this.k.isPowerSaveMode() && !this.i.isCharging()) {
            asfr.a.m("In power saver and not charging.", new Object[0]);
            return Optional.of(Integer.valueOf(29008));
        }
        return Optional.empty();
    }

    public final void b() {
        asfr.a.j("Stopping", new Object[0]);
        ScheduledExecutorService scheduledExecutorService0 = this.h;
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdown();
        }
    }
}

