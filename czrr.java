import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.gms.nearby.mediums.bluetooth.classic.BluetoothClassicScanner.1;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class czrr {
    public final Map a;
    public final bsaq b;
    public final ExecutorService c;
    public boolean d;
    public final ScheduledExecutorService e;
    public int f;
    public cumn g;
    private final Context h;
    private BroadcastReceiver i;
    private final IntentFilter j;
    private final Map k;

    public czrr(Context context0, BluetoothAdapter bluetoothAdapter0, ExecutorService executorService0, ScheduledExecutorService scheduledExecutorService0) {
        this.a = new ArrayMap();
        this.d = false;
        this.k = new HashMap();
        this.f = 0;
        this.g = null;
        this.h = context0;
        this.b = bsaq.j(context0, bluetoothAdapter0, "BluetoothClassicScanner");
        this.c = executorService0;
        this.e = scheduledExecutorService0;
        IntentFilter intentFilter0 = new IntentFilter();
        this.j = intentFilter0;
        intentFilter0.addAction("android.bluetooth.device.action.FOUND");
        intentFilter0.addAction("android.bluetooth.device.action.NAME_CHANGED");
    }

    public final czle a() {
        czle czle4;
        synchronized(this) {
            cumn cumn0 = this.g;
            if(cumn0 != null) {
                cumn0.b();
                this.g = null;
            }
            if(this.a.isEmpty()) {
                czkq.a.e().h("%s start Update fail, empty client.", "[BluetoothClassicScanner]");
                return new czle(czvf.c, gyxo.fG);
            }
            bsaq bsaq0 = this.b;
            if(bsaq0 == null) {
                czkq.a.e().h("%s start Update fail, missing bluetoothAdapter.", "[BluetoothClassicScanner]");
                return new czle(czvf.c, gyxo.bv);
            }
            this.i = new BluetoothClassicScanner.1(this);
            try {
                if(bsaq0.u()) {
                    bsaq0.o();
                }
                Context context0 = this.h;
                jwe.b(context0, this.i, this.j, 2);
                if(!bsaq0.z()) {
                    czkq.a.e().h("%s Failed to start discovery.", "[BluetoothClassicScanner]");
                    cutr.f(context0, this.i);
                    this.i = null;
                    this.d = false;
                    return new czle(czvf.d, gyxo.dI);
                }
                this.d = true;
                this.f(this.f);
                czrp czrp0 = new czrp(this);
                long v1 = hvog.s();
                this.g = cumn.d(czkq.a, czrp0, v1, this.e);
            }
            catch(SecurityException securityException0) {
                czkq.a.e().h("Failed to start bluetooth scanning due to : %s", securityException0.getMessage());
                cutr.f(this.h, this.i);
                this.i = null;
                this.d = false;
                return new czle(czvf.c, gyxo.dI);
            }
            czle4 = new czle(czvf.b, gyxo.b);
        }
        return czle4;
    }

    public final gged_interceptors b() {
        gged_interceptors gged0;
        synchronized(this) {
            gged0 = gged_interceptors.i(this.a.keySet());
        }
        return gged0;
    }

    // Detected as a lambda impl.
    public final void c(int v) {
        synchronized(this) {
            if(this.d) {
                if(v == this.f) {
                    Map map0 = this.k;
                    ggqj ggqj0 = ggeo.k(map0).v().om();
                    while(ggqj0.hasNext()) {
                        Object object0 = ggqj0.next();
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        if(((czrw)map$Entry0.getValue()).b()) {
                            gged_interceptors gged0 = gged_interceptors.i(this.a.values());
                            int v2 = gged0.size();
                            for(int v3 = 0; v3 < v2; ++v3) {
                                cvgq cvgq0 = (cvgq)gged0.get(v3);
                                String s = (String)map$Entry0.getKey();
                                cvle cvle0 = new cvle(cvgq0.a, s);
                                cvgq0.a.e.W(cvle0);
                            }
                            map0.remove(map$Entry0.getKey());
                        }
                    }
                }
                else {
                    czkq.a.a().j("%s Ignore outdated scheduled on lost checking, scheduledCycle = %d, currentCycle = %d.", "[BluetoothClassicScanner]", Integer.valueOf(v), Integer.valueOf(this.f));
                }
                int v4 = this.f + 1;
                this.f = v4;
                this.f(v4);
                return;
            }
            czkq.a.d().h("%s Ignore onLost checking when not scanning.", "[BluetoothClassicScanner]");
        }
    }

    public final void d(Intent intent0) {
        synchronized(this) {
            int v1 = 0;
            Map map0 = this.a;
            if(map0.isEmpty()) {
                czkq.a.d().h("%s Ignoring Bluetooth Classic scan result because there are no clients registered.", "[BluetoothClassicScanner]");
                return;
            }
            if("android.bluetooth.device.action.FOUND".equals(intent0.getAction())) {
                BluetoothDevice bluetoothDevice0 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if(bluetoothDevice0 != null) {
                    String s = bluetoothDevice0.getName();
                    if(!TextUtils.isEmpty(s)) {
                        Map map1 = this.k;
                        czrw czrw0 = (czrw)map1.get(s);
                        if(czrw0 == null) {
                            czrw0 = new czrw();
                            map1.put(s, czrw0);
                        }
                        czrw0.a();
                        gged_interceptors gged0 = gged_interceptors.i(map0.values());
                        int v2 = gged0.size();
                        while(v1 < v2) {
                            cvlh cvlh0 = ((cvgq)gged0.get(v1)).a;
                            cvlg cvlg0 = new cvlg(cvlh0, bluetoothDevice0);
                            cvlh0.e.W(cvlg0);
                            ++v1;
                        }
                    }
                }
            }
            else if("android.bluetooth.device.action.NAME_CHANGED".equals(intent0.getAction())) {
                BluetoothDevice bluetoothDevice1 = (BluetoothDevice)intent0.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if(bluetoothDevice1 != null) {
                    gged_interceptors gged1 = gged_interceptors.i(map0.values());
                    int v3 = gged1.size();
                    while(v1 < v3) {
                        cvlh cvlh1 = ((cvgq)gged1.get(v1)).a;
                        cvlf cvlf0 = new cvlf(cvlh1, bluetoothDevice1);
                        cvlh1.e.W(cvlf0);
                        ++v1;
                    }
                }
            }
        }
    }

    public final void e(String s) {
        synchronized(this) {
            if(TextUtils.isEmpty(s)) {
                czkq.a.e().h("%s Failed to remove empty client from bluetooth scanner.", "[BluetoothClassicScanner]");
                return;
            }
            czkq.a.b().i("%s Client removed from bluetooth classic scanner : %s", "[BluetoothClassicScanner]", s);
            this.a.remove(s);
        }
    }

    public final void f(int v) {
        if(!this.d) {
            czkq.a.d().h("%s Don\'t start onLost timer since is not scanning.", "[BluetoothClassicScanner]");
            return;
        }
        czrn czrn0 = () -> synchronized(this) {
            if(this.d) {
                if(v == this.f) {
                    Map map0 = this.k;
                    ggqj ggqj0 = ggeo.k(map0).v().om();
                    while(ggqj0.hasNext()) {
                        Object object0 = ggqj0.next();
                        Map.Entry map$Entry0 = (Map.Entry)object0;
                        if(((czrw)map$Entry0.getValue()).b()) {
                            gged_interceptors gged0 = gged_interceptors.i(this.a.values());
                            int v2 = gged0.size();
                            for(int v3 = 0; v3 < v2; ++v3) {
                                cvgq cvgq0 = (cvgq)gged0.get(v3);
                                String s = (String)map$Entry0.getKey();
                                cvle cvle0 = new cvle(cvgq0.a, s);
                                cvgq0.a.e.W(cvle0);
                            }
                            map0.remove(map$Entry0.getKey());
                        }
                    }
                }
                else {
                    czkq.a.a().j("%s Ignore outdated scheduled on lost checking, scheduledCycle = %d, currentCycle = %d.", "[BluetoothClassicScanner]", Integer.valueOf(v), Integer.valueOf(this.f));
                }
                int v4 = this.f + 1;
                this.f = v4;
                this.f(v4);
                return;
            }
            czkq.a.d().h("%s Ignore onLost checking when not scanning.", "[BluetoothClassicScanner]");
        };
        ((cuuh)this.e).g(czrn0, 1L, TimeUnit.SECONDS);
    }

    public final boolean g(String s) {
        boolean z;
        synchronized(this) {
            z = this.a.containsKey(s);
        }
        return z;
    }

    public final void h(String s, cvgq cvgq0) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s)) {
                czkq.a.b().i("%s New client added to bluetooth classic scanner : %s", "[BluetoothClassicScanner]", s);
                this.a.put(s, cvgq0);
                return;
            }
            czkq.a.e().i("%s Failed to add client to bluetooth scanner, service id : %s", "[BluetoothClassicScanner]", s);
        }
    }

    public final void i() {
        synchronized(this) {
            cumn cumn0 = this.g;
            if(cumn0 != null) {
                cumn0.b();
                this.g = null;
            }
            cutr.f(this.h, this.i);
            this.i = null;
            if(this.b != null && !this.b.o()) {
                czkq.a.e().h("%s Failed to cancel discovery.", "[BluetoothClassicScanner]");
            }
            else {
                czkq.a.d().h("%s stop Update successfully.", "[BluetoothClassicScanner]");
            }
            this.d = false;
        }
    }
}

