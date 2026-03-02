import android.bluetooth.BluetoothAdapter;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public final class fekd implements ffmj {
    final Set a;
    final Set b;
    private final BluetoothAdapter c;
    private final Method d;
    private final feft e;

    public fekd(BluetoothAdapter bluetoothAdapter0, feft feft0) {
        this.c = bluetoothAdapter0;
        this.e = feft0;
        this.d = feju.a();
        this.a = new HashSet();
        this.b = new HashSet();
    }

    public final void a(fekc fekc0, boolean z) {
        synchronized(this) {
            ffmn.a("ConnectableStateManager", "requestConnectable: %s %s", new Object[]{Boolean.valueOf(z), fekc0});
            if(z) {
                this.a.add(fekc0);
            }
            else {
                this.a.remove(fekc0);
            }
            this.f();
        }
    }

    public final void b(fekc fekc0, boolean z) {
        this.d(fekc0, z, true);
    }

    public final void c(fekc fekc0, boolean z) {
        this.d(fekc0, z, false);
    }

    private final void d(fekc fekc0, boolean z, boolean z1) {
        synchronized(this) {
            ffmn.a("ConnectableStateManager", "setConnected: %s %s", new Object[]{Boolean.valueOf(z), fekc0});
            if(z) {
                this.b.add(fekc0);
            }
            else {
                this.b.remove(fekc0);
            }
            if(z1) {
                this.f();
            }
        }
    }

    private final void f() {
        boolean z = !this.a.isEmpty() && this.b.isEmpty();
        ffmn.a("ConnectableStateManager", "connectable: %s", new Object[]{Boolean.valueOf(z)});
        feju.b(z, this.c, this.d, this.e);
    }

    @Override  // ffmj
    public final void md(bbpd bbpd0, boolean z, boolean z1) {
        bbpd0.println("ConnectableStateManager:");
        bbpd0.b();
        bbpd0.println("connectable servers: " + this.a.toString());
        bbpd0.println("connected servers: " + this.b.toString());
        bbpd0.a();
    }
}

