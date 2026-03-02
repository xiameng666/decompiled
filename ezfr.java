import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothConnectionTracker.IntervalBasedDeviceTimer.1;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.internal.BluetoothConnectionTrackerTaskService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class ezfr {
    public static final Object a;
    public final Map b;
    public final String c;
    public final Set d;
    private final Context e;
    private final List f;
    private final Map g;
    private final BroadcastReceiver h;
    private int i;

    static {
        ezfr.a = new Object();
    }

    public ezfr(Context context0, List list0, String s) {
        this.i = 0;
        this.e = context0;
        this.f = list0;
        this.g = new HashMap();
        this.b = new HashMap();
        this.c = s;
        this.d = new HashSet();
        this.h = new BluetoothConnectionTracker.IntervalBasedDeviceTimer.1(this);
    }

    public final void a(ezfq ezfq0) {
        this.d.add(ezfq0);
        if(this.d.size() == 1) {
            IntentFilter intentFilter0 = new IntentFilter(this.c);
            jwe.b(this.e, this.h, intentFilter0, 2);
        }
    }

    public final void b(String s) {
        synchronized(ezfr.a) {
            Map map0 = this.g;
            if(map0.containsKey(s)) {
                String s1 = (String)map0.get(s);
                cljp.a(this.e).d(s1, BluetoothConnectionTrackerTaskService.class.getName());
                map0.remove(s);
            }
        }
    }

    public final void c(String s, int v) {
        this.b(s);
        List list0 = this.f;
        if(v >= list0.size()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("key-timer-extra-device-address", s);
        bundle0.putString("CONNECTION_TRACKER_ACTION", this.c);
        String s1 = "BluetoothConnectionTracker" + s + this.i;
        ++this.i;
        long v1 = TimeUnit.MILLISECONDS.toSeconds(((Long)list0.get(v)).longValue());
        clkn clkn0 = new clkn();
        clkn0.w(BluetoothConnectionTrackerTaskService.class.getName());
        clkn0.e(v1, 300L + v1);
        clkn0.p = false;
        clkn0.t(s1);
        clkn0.u = bundle0;
        clkn0.y(2, 2);
        clkn0.x(0, 0);
        clko clko0 = clkn0.a();
        cljp.a(this.e).f(clko0);
        synchronized(ezfr.a) {
            this.g.put(s, s1);
            this.b.put(s, Integer.valueOf(v));
        }
    }

    public final void d(String s) {
        synchronized(ezfr.a) {
            if(this.g.containsKey(s)) {
                ((ggtj)((ggtj)ezfs.a.i()).ar(0x43CB)).x("[BluetoothConnectionTracker] Disconnect called on already disconnected device");
                return;
            }
        }
        this.c(s, 0);
    }

    public final void e(String s) {
        this.b(s);
        synchronized(ezfr.a) {
            this.b.remove(s);
        }
    }

    public final void f(ezfq ezfq0) {
        this.d.remove(ezfq0);
        if(this.d.isEmpty()) {
            this.e.unregisterReceiver(this.h);
        }
    }
}

