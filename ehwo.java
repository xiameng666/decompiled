import android.bluetooth.BluetoothGatt;
import android.content.Context;

public final class ehwo implements eieu {
    public ehwj a;
    private static final bboh b;
    private static ehwo c;
    private static final Object d;
    private ehwn e;

    static {
        ehwo.b = eicd.a("FD");
        ehwo.d = new Object();
    }

    final BluetoothGatt a() {
        return this.e == null ? null : this.e.d;
    }

    public static ehwo b() {
        synchronized(ehwo.d) {
            if(ehwo.c == null) {
                ehwo.c = new ehwo();
            }
        }
        return ehwo.c;
    }

    public final void c() {
        if(!this.f()) {
            return;
        }
        ehwn ehwn0 = this.e;
        gftb.check(ehwn0);
        ehwn0.a(true);
        ehwn ehwn1 = this.e;
        gftb.check(ehwn1);
        ehwn1.h = null;
        this.e = null;
    }

    public final void d(Context context0, String s, int v) {
        if(s == null) {
            ((ggtj)ehwo.b.i()).x("MAC address is null.");
            return;
        }
        if(this.f()) {
            BluetoothGatt bluetoothGatt0 = this.a();
            gftb.check(bluetoothGatt0);
            if(gfqz.e(eilt.a(bluetoothGatt0.getDevice().getAddress()), s)) {
                return;
            }
            this.c();
        }
        ehwn ehwn0 = new ehwn(context0, s, v);
        this.e = ehwn0;
        ehwj ehwj0 = this.a;
        if(ehwj0 != null) {
            ehwn0.h = ehwj0;
        }
        ehwn ehwn1 = this.e;
        ehwn1.e = true;
        ehwn1.c();
    }

    @Override  // eieu
    public final void e(Context context0, eiex eiex0) {
        if(hrtd.am() && hrtd.O()) {
            gftb.check(eiex0.b);
            this.d(context0, eiex0.a, eiex0.b.intValue());
            ehwn ehwn0 = this.e;
            gftb.check(ehwn0);
            BluetoothGatt bluetoothGatt0 = ehwn0.d;
            if(bluetoothGatt0 == null) {
                ((ggtj)ehwn.a.i()).x("Failed to ring tag. No GATT connection established.");
                return;
            }
            ehwn0.f = eiex0;
            bluetoothGatt0.discoverServices();
        }
    }

    public final boolean f() {
        return this.a() != null;
    }
}

