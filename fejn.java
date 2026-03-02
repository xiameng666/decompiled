import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.android.gms.wearable.node.bluetooth.BluetoothClient.1;
import com.google.android.gms.wearable.node.bluetooth.BluetoothClient.2;
import com.google.android.gms.wearable.node.bluetooth.BluetoothClient.3;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

public final class fejn implements ffmj, Closeable {
    public final Map a;
    public final Map b;
    public final BluetoothAdapter c;
    private final Context d;
    private final long e;
    private final boolean f;
    private final BroadcastReceiver g;
    private final BroadcastReceiver h;
    private final BroadcastReceiver i;

    public fejn(Context context0, boolean z) {
        this.a = new HashMap();
        this.b = new HashMap();
        BluetoothClient.1 bluetoothClient$10 = new BluetoothClient.1(this);
        this.g = bluetoothClient$10;
        BluetoothClient.2 bluetoothClient$20 = new BluetoothClient.2(this);
        this.h = bluetoothClient$20;
        BluetoothClient.3 bluetoothClient$30 = new BluetoothClient.3(this);
        this.i = bluetoothClient$30;
        batl.h("BluetoothClient.constructor");
        this.d = context0;
        this.c = bahu.a(context0);
        this.f = z;
        this.e = System.currentTimeMillis();
        jwe.b(context0, bluetoothClient$20, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
        IntentFilter intentFilter0 = new IntentFilter("com.google.android.gms.wearable.node.bluetooth.RETRY_CONNECTION");
        intentFilter0.addDataScheme("content");
        jwe.b(context0, bluetoothClient$10, intentFilter0, 2);
        jwe.b(context0, bluetoothClient$30, new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED"), 2);
    }

    public final void a(fczq fczq0) {
        fejn.f(fczq0);
        Map map0 = this.a;
        String s = fczq0.c;
        if(map0.containsKey(s)) {
            fekb fekb0 = (fekb)this.b.get(s);
            if(fekb0 != null && (this.c != null && this.c.isEnabled())) {
                fekb0.b();
            }
        }
        else {
            map0.put(s, fczq0);
            if(this.c != null && this.c.isEnabled()) {
                this.b(fczq0);
                ffgp.g().b();
            }
        }
    }

    public final void b(fczq fczq0) {
        if(this.f && fczq0.v && Build.VERSION.SDK_INT >= 33) {
            fegb fegb0 = new fegb(this.d, this.c, fczq0);
            this.b.put(fczq0.c, fegb0);
            fegb0.o();
            return;
        }
        String s = fczq0.c;
        fejo fejo0 = new fejo(this.d, fczq0);
        this.b.put(s, fejo0);
    }

    public final void c(fczq fczq0) {
        fejn.f(fczq0);
        ffmn.a("WearableBluetooth", "removeConfiguration(%s)", new Object[]{fczq0});
        Map map0 = this.b;
        String s = fczq0.c;
        fekb fekb0 = (fekb)map0.get(s);
        if(fekb0 != null) {
            fekb0.close();
            map0.remove(s);
            if(map0.isEmpty()) {
                ffgp.g().c();
            }
        }
        this.a.remove(s);
    }

    @Override
    public final void close() {
        batl.h("close");
        this.d.unregisterReceiver(this.h);
        this.d.unregisterReceiver(this.g);
        this.d.unregisterReceiver(this.i);
        Map map0 = this.b;
        for(Object object0: map0.values()) {
            ((fekb)object0).close();
        }
        map0.clear();
        this.a.clear();
        ffgp.g().c();
    }

    public final void d(fczq fczq0, boolean z) {
        fejn.f(fczq0);
        String s = fczq0.c;
        if(this.a.containsKey(s)) {
            fekb fekb0 = (fekb)this.b.get(s);
            if(fekb0 != null && (this.c != null && this.c.isEnabled())) {
                if(z) {
                    fekb0.b();
                    return;
                }
                fekb0.c();
            }
        }
    }

    static void f(fczq fczq0) {
        if(fczq0.i() && (fczq0.d == 1 || fczq0.d == 5) && fczq0.e == 1 && fczq0.c != null) {
            return;
        }
        throw new IllegalStateException("Invalid config: " + fczq0);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        batl.h("dump");
        bbpd0.println("BluetoothClientChimeraService");
        bbpd0.b();
        bbpd0.println("First started: " + ffmi.a(this.e));
        bbpd0.println();
        for(Object object0: this.b.values()) {
            ((fekb)object0).md(bbpd0, z, z1);
        }
        bbpd0.a();
    }
}

