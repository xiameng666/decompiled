import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemProperties;
import android.util.Log;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.Semaphore;
import jeb.synthetic.FIN;

public final class fdye implements ffmd {
    private final Context a;
    private volatile fdxn b;
    private final Semaphore c;
    private final Random d;

    public fdye(Context context0) {
        SecureRandom secureRandom0 = new SecureRandom();
        super();
        this.c = new Semaphore(0, true);
        this.a = context0;
        this.d = secureRandom0;
    }

    @Override  // ffmd
    public final void G() {
        this.c.acquireUninterruptibly();
        try {
            this.a.getSharedPreferences("cw_node", 0).edit().clear().commit();
            this.b();
        }
        finally {
            this.c.release();
        }
    }

    public final fdxn a() {
        this.c.acquireUninterruptibly();
        int v = FIN.finallyOpen$NT();
        if(this.b != null) {
            fdxn fdxn0 = this.b;
            FIN.finallyCodeBegin$NT(v);
            return fdxn0;
        }
        throw new IllegalStateException("this should never be null");
    }

    final void b() {
        String s1;
        Context context0 = this.a;
        boolean z = false;
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("cw_node", 0);
        String s = sharedPreferences0.getString("node_id", null);
        if(s == null) {
            s = Integer.toHexString(this.d.nextInt());
            sharedPreferences0.edit().putString("node_id", s).apply();
            if(Log.isLoggable("WearableNode", 3)) {
                Log.d("WearableNode", "created new node id and saved to preference: " + s);
            }
        }
        else if(Log.isLoggable("WearableNode", 3)) {
            Log.d("WearableNode", "loaded node id from preference: " + s);
        }
        if(cjmf.b(context0, "android.permission.BLUETOOTH_CONNECT") == 0) {
            z = true;
        }
        if(z) {
            BluetoothAdapter bluetoothAdapter0 = bahu.a(context0);
            if(bluetoothAdapter0 == null) {
                Log.e("WearableNode", "Bluetooth adapter is null");
                s1 = s;
            }
            else {
                s1 = bluetoothAdapter0.getName();
                if(s1 == null) {
                    Log.e("WearableNode", "Bluetooth name is null");
                    s1 = s;
                }
            }
        }
        else {
            s1 = s;
        }
        if(!z) {
            Log.e("WearableNode", "BLUETOOTH_CONNECT permission has been revoked.");
        }
        if(bbmq.P()) {
            String s2 = SystemProperties.get("ro.kernel.qemu.avd_name");
            if(gfta.c(s2)) {
                s2 = SystemProperties.get("ro.boot.qemu.avd_name");
            }
            if(!gfta.c(s2)) {
                s1 = s2;
            }
        }
        this.b = new fdxn(s, s1);
        this.c.release();
    }
}

