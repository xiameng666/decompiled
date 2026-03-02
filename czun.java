import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class czun {
    public boolean a;
    protected final String b;
    public final CountDownLatch c;
    public final CountDownLatch d;
    public final czuo e;
    public final ExecutorService f;
    public final ExecutorService g;
    public final ExecutorService h;
    public gekx i;
    public fgvb j;
    public gelh k;
    public gelg l;
    public czsg m;
    public final BluetoothSocket n;
    public final int o;
    public final int p;
    private final Context q;

    public czun(String s, Context context0, String s1, gekx gekx0, BluetoothSocket bluetoothSocket0, czuo czuo0, int v, int v1) {
        this.a = false;
        this.c = new CountDownLatch(1);
        this.d = new CountDownLatch(1);
        this.f = cuui.d();
        this.g = cuui.d();
        this.h = cuui.d();
        this.q = context0;
        this.b = s1;
        this.i = gekx0;
        this.n = bluetoothSocket0;
        this.e = czuo0;
        this.o = v;
        this.p = v1;
        if((gekx0 instanceof gelz)) {
            this.l = new czum(this, s, 4);
            this.k = new gemh(this.i, this.l);
        }
        if((this.i instanceof gelq)) {
            this.l = new czum(this, s, 8);
            this.k = new gemf(this.i, this.l);
        }
    }

    protected abstract void e();

    // Detected as a lambda impl.
    protected abstract void f(czsx arg1, boolean arg2);

    protected abstract boolean g(czsx arg1);

    public final gekx i(czql czql0) {
        Future future0;
        Context context0 = this.q;
        if(context0 == null) {
            czkq.a.e().p("Server socket should not be used to create connection.", new Object[0]);
            return null;
        }
        czui czui0 = (Context context0, String s1, fgvd fgvd0) -> {
            BluetoothDevice bluetoothDevice0 = (BluetoothDevice)czup.a(context0, czql0.a, s1, false).a.g();
            if(bluetoothDevice0 == null) {
                throw new IOException(String.format("WeaveGattProvider unable to retrieve BluetoothDevice for macAddress %s", s1));
            }
            long v1 = SystemClock.elapsedRealtime();
            int v2 = 2;
            BluetoothGatt bluetoothGatt0 = bluetoothDevice0.connectGatt(context0, false, fgvd0.b, 2);
            if(bluetoothGatt0 != null) {
                czkq.a.b().h("[Performance][connectGatt] finishing bluetoothDevice.connectGatt takes %s ms.", Long.valueOf(SystemClock.elapsedRealtime() - v1));
                fgvb fgvb0 = new fgvb(bluetoothGatt0);
                try {
                    Thread.sleep(hvog.a.bk().F());
                }
                catch(InterruptedException unused_ex) {
                    fgvb0.e();
                    czke.h(czql0.a, 8, gymb.f);
                    Thread.currentThread().interrupt();
                }
                if(czql0.f != 1) {
                    v2 = 1;
                }
                if(!fgvb0.h(v2)) {
                    czke.h(czql0.a, 8, gymb.g);
                }
                czkq.a.b().h("[Performance][connectGatt] creating gatt successfully takes %s ms.", Long.valueOf(SystemClock.elapsedRealtime() - v1));
                return fgvb0;
            }
            czke.j(czql0.a, 8, gymb.b, gymd.Z, String.format("Failed to create BluetoothGatt with MAC address %s", s1));
            throw new IOException(String.format("WeaveGattProvider unable to BluetoothDevice#createGatt for macAddress %s", s1));
        };
        int v = (int)hvog.i();
        gels gels0 = new gels(context0, czui0, czql0.e, czup.d, czup.e, v);
        try {
            future0 = null;
            future0 = gels0.l(this.b);
            return (gekx)future0.get(hvog.l(), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
            czke.i(czql0.a, 8, gymb.b, gymd.t);
            Thread.currentThread().interrupt();
        }
        catch(ExecutionException unused_ex) {
            czke.j(czql0.a, 8, gymb.b, gymd.u, String.format("LE MAC Address : %s", this.b));
        }
        catch(TimeoutException unused_ex) {
            czke.j(czql0.a, 8, gymb.b, gymd.y, String.format("LE MAC Address : %s", this.b));
        }
        if(future0 != null) {
            czkq.a.b().p("Cancel Gatt connection establishing.", new Object[0]);
            future0.cancel(false);
        }
        return null;
    }

    public final void j(Runnable runnable0) {
        this.f.execute(runnable0);
    }

    protected final boolean k(String s) {
        BluetoothSocket bluetoothSocket0 = this.n;
        if(bluetoothSocket0 != null) {
            try {
                this.o(s, 4, bluetoothSocket0.getInputStream());
                return true;
            }
            catch(IOException unused_ex) {
                return false;
            }
        }
        return this.k == null ? false : this.p(s, 4);
    }

    // Detected as a lambda impl.
    public static fgvb l(Context context0, String s, String s1, int v, fgvd fgvd0) {
        BluetoothDevice bluetoothDevice0 = (BluetoothDevice)czup.a(context0, s, s1, false).a.g();
        if(bluetoothDevice0 == null) {
            throw new IOException(String.format("WeaveGattProvider unable to retrieve BluetoothDevice for macAddress %s", s1));
        }
        long v1 = SystemClock.elapsedRealtime();
        int v2 = 2;
        BluetoothGatt bluetoothGatt0 = bluetoothDevice0.connectGatt(context0, false, fgvd0.b, 2);
        if(bluetoothGatt0 != null) {
            czkq.a.b().h("[Performance][connectGatt] finishing bluetoothDevice.connectGatt takes %s ms.", Long.valueOf(SystemClock.elapsedRealtime() - v1));
            fgvb fgvb0 = new fgvb(bluetoothGatt0);
            try {
                Thread.sleep(hvog.a.bk().F());
            }
            catch(InterruptedException unused_ex) {
                fgvb0.e();
                czke.h(s, 8, gymb.f);
                Thread.currentThread().interrupt();
            }
            if(v != 1) {
                v2 = 1;
            }
            if(!fgvb0.h(v2)) {
                czke.h(s, 8, gymb.g);
            }
            czkq.a.b().h("[Performance][connectGatt] creating gatt successfully takes %s ms.", Long.valueOf(SystemClock.elapsedRealtime() - v1));
            return fgvb0;
        }
        czke.j(s, 8, gymb.b, gymd.Z, String.format("Failed to create BluetoothGatt with MAC address %s", s1));
        throw new IOException(String.format("WeaveGattProvider unable to BluetoothDevice#createGatt for macAddress %s", s1));
    }

    public static hfub m(int v, boolean z) {
        if(z) {
            return v == 8 ? gymb.b : gymt.c;
        }
        return v == 8 ? gymb.c : gymt.d;
    }

    public final void n(String s, int v, boolean z, byte[] arr_b) {
        czsx czsx0;
        if(arr_b.length < 3) {
            czkq.a.b().i("Cannot deserialize BlePacket: expecting min %d raw bytes, got %d", Integer.valueOf(3), Integer.valueOf(arr_b.length));
            czsx0 = null;
        }
        else {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            byte[] arr_b1 = new byte[3];
            byteBuffer0.get(arr_b1);
            byte[] arr_b2 = new byte[arr_b.length - 3];
            byteBuffer0.get(arr_b2);
            czsx0 = new czsx(arr_b1, arr_b2);
        }
        if(czsx0 == null) {
            czke.j(s, v, czun.m(v, z), gymd.ai, String.format("Remote MAC Address : %s", this.b));
            return;
        }
        if(hvol.O()) {
            this.j(() -> ;);
            return;
        }
        if(this.g(czsx0)) {
            this.j(() -> ;);
            return;
        }
        hfub hfub0 = czun.m(v, z);
        Boolean boolean0 = Boolean.valueOf(czsx0.b());
        String s1 = czmk.g(czsx0.b);
        czke.j(s, v, hfub0, gymd.bA, String.format("Remote MAC Address : %s, Is control packet ? %b, Service ID Hash : %s", this.b, boolean0, s1));
    }

    public final void o(String s, int v, InputStream inputStream0) {
        czud czud0 = new czud(this, inputStream0, s, v);
        this.g.execute(czud0);
    }

    public final boolean p(String s, int v) {
        try {
            long v1 = hvog.l();
            if(!this.c.await(v1, TimeUnit.MILLISECONDS)) {
                gymb gymb0 = v == 8 ? gymb.i : gymt.e;
                czke.j(s, v, gymb0, gymd.y, String.format("MAC address : %s", this.b));
                return false;
            }
            return true;
        }
        catch(InterruptedException unused_ex) {
            gymb gymb1 = v == 8 ? gymb.i : gymt.e;
            czke.i(s, v, gymb1, gymd.t);
            Thread.currentThread().interrupt();
            return false;
        }
    }
}

