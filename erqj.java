import android.bluetooth.BluetoothAdapter;
import android.content.Context;

public final class erqj {
    public final BluetoothAdapter a;

    public erqj() {
        throw null;
    }

    public erqj(Context context0) {
        this.a = bahu.a(context0);
    }

    public static final erqj a(Context context0) {
        erqj erqj0 = new erqj(context0);
        return erqj0.a == null ? null : erqj0;
    }

    public final String b() {
        return this.a.getAddress();
    }

    public final boolean c() {
        return this.a.enable();
    }

    public final boolean d() {
        return this.a.isEnabled();
    }

    public final void e() {
        this.a.disable();
    }
}

