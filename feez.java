import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.wearable.node.ble.BluetoothGattHelper.LocalBluetoothGattCallbacks;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import jeb.synthetic.FIN;

public final class feez {
    static final long a;
    final BluetoothGattHelper.LocalBluetoothGattCallbacks b;
    public fefa c;
    public final Object d;
    public BluetoothGatt e;
    public boolean f;
    public feex g;
    public int h;
    private static final long i;
    private final ReentrantLock j;
    private final long k;
    private final Context l;
    private final BluetoothManager m;
    private final fefj n;

    static {
        feez.i = hzzi.a.i().a();
        feez.a = TimeUnit.SECONDS.toMillis(1L);
    }

    public feez(Context context0, BluetoothManager bluetoothManager0, ReentrantLock reentrantLock0, Long long0, fefj fefj0) {
        this.b = new BluetoothGattHelper.LocalBluetoothGattCallbacks(this);
        this.d = new Object();
        this.e = null;
        this.f = false;
        this.h = 1;
        this.g = null;
        gftb.check(context0);
        this.l = context0;
        gftb.check(bluetoothManager0);
        this.m = bluetoothManager0;
        this.j = reentrantLock0;
        this.k = (long)long0;
        this.n = fefj0;
    }

    public final BluetoothGatt a(BluetoothGatt bluetoothGatt0) {
        BluetoothGatt bluetoothGatt1 = this.e;
        if(bluetoothGatt1 == null) {
            throw new feex(String.format(Locale.US, "Received an event for device %s when not connected.", bluetoothGatt0.getDevice()));
        }
        if(bluetoothGatt0.getDevice().equals(bluetoothGatt1.getDevice())) {
            return bluetoothGatt1;
        }
        throw new feex(String.format(Locale.US, "Received event for an unexpected device. Expected: %s. Received: %s", bluetoothGatt1.getDevice(), bluetoothGatt0.getDevice()));
    }

    public final BluetoothGattService b(UUID uUID0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        gftb.check(uUID0);
        this.c();
        int v1 = FIN.finallyOpen$NT();
        Object object0 = this.d;
        __monitor_enter(object0);
        int v2 = FIN.finallyOpen$NT();
        BluetoothGatt bluetoothGatt0 = this.n();
        if(!this.f) {
            this.f();
        }
        BluetoothGattService bluetoothGattService0 = bluetoothGatt0.getService(uUID0);
        if(bluetoothGattService0 != null) {
            FIN.finallyCodeBegin$NT(v2);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v2);
            FIN.finallyCodeBegin$NT(v1);
            this.p();
            FIN.finallyCodeEnd$NT(v1);
            FIN.finallyCodeBegin$NT(v);
            return bluetoothGattService0;
        }
        throw new feex("Couldn\'t find service: " + uUID0, 260);
    }

    final void c() {
        try {
            long v = feez.a;
            if(this.j.tryLock(v, TimeUnit.MILLISECONDS)) {
                return;
            }
            throw new fefb(String.format(Locale.US, "Cannot acquire bluetooth operation lock after %dms.", v));
        }
        catch(InterruptedException interruptedException0) {
            throw new feex(interruptedException0);
        }
    }

    public final void d(BluetoothDevice bluetoothDevice0) {
        BluetoothGatt bluetoothGatt0;
        Object object0;
        feez feez0;
        __monitor_enter(this);
        try {
            gftb.check(bluetoothDevice0);
            this.c();
        }
        catch(Throwable throwable0) {
            try {
                feez0 = this;
            }
            catch(Throwable throwable0) {
            }
            goto label_40;
        }
        try {
            object0 = this.d;
            __monitor_enter(object0);
        }
        catch(Throwable throwable1) {
            feez0 = this;
            goto label_37;
        }
        try {
            this.f = false;
            if(!this.j()) {
                bluetoothGatt0 = bluetoothDevice0.connectGatt(this.l, false, this.b, 2);
                if(bluetoothGatt0 != null) {
                    this.e = bluetoothGatt0;
                    this.n.a();
                    feez0 = this;
                    goto label_24;
                }
                feez0 = this;
                throw new feex(String.format(Locale.US, "Cannot connect to device %s.", bluetoothDevice0.getAddress()));
            }
            feez0 = this;
            throw new feex(String.format(Locale.US, "Device %s already connected.", bluetoothDevice0.getAddress()));
        }
        catch(Throwable throwable2) {
            try {
                feez0 = this;
                goto label_34;
            label_24:
                feez0.q(bluetoothGatt0, 2, null, feez.i);
                __monitor_exit(object0);
            }
            catch(Throwable throwable2) {
                goto label_34;
            }
        }
        try {
            feez0.p();
        }
        catch(Throwable throwable0) {
            goto label_40;
        }
        __monitor_exit(feez0);
        return;
        try {
            feez0 = this;
            throw new feex(String.format(Locale.US, "Cannot connect to device %s.", bluetoothDevice0.getAddress()));
        label_34:
            __monitor_exit(object0);
        }
        catch(Throwable throwable2) {
            goto label_34;
        }
        try {
            throw throwable2;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_37:
            feez0.p();
            throw throwable1;
        label_40:
            __monitor_exit(feez0);
        }
        catch(Throwable throwable0) {
            goto label_40;
        }
        throw throwable0;
    }

    public final void e() {
        BluetoothGatt bluetoothGatt0;
        Object object0;
        feez feez0;
        __monitor_enter(this);
        try {
            this.c();
        }
        catch(Throwable throwable0) {
            try {
                feez0 = this;
            }
            catch(Throwable throwable0) {
            }
            goto label_43;
        }
        try {
            object0 = this.d;
            __monitor_enter(object0);
        }
        catch(Throwable throwable1) {
            feez0 = this;
            goto label_40;
        }
        try {
            bluetoothGatt0 = this.e;
            if(bluetoothGatt0 != null) {
                BluetoothDevice bluetoothDevice0 = bluetoothGatt0.getDevice();
                int v = this.m.getConnectionState(bluetoothDevice0, 7);
                bluetoothGatt0.disconnect();
                if(v == 0) {
                    feez0 = this;
                }
                else {
                    feez0 = this;
                    goto label_19;
                }
                goto label_29;
            }
            feez0 = this;
            throw new feex("BluetoothGattHelper not connected.");
        }
        catch(Throwable throwable2) {
            goto label_26;
        }
        try {
        label_19:
            feez0.q(bluetoothGatt0, 3, null, this.k);
            goto label_29;
        }
        catch(Throwable throwable2) {
            goto label_27;
        }
        try {
            feez0 = this;
            goto label_29;
        }
        catch(Throwable throwable2) {
        label_26:
            feez0 = this;
        }
        try {
        label_27:
            feez0.o(bluetoothGatt0);
            throw throwable2;
        label_29:
            feez0.o(bluetoothGatt0);
        }
        catch(Throwable throwable3) {
            goto label_37;
        }
        try {
            __monitor_exit(object0);
        }
        catch(Throwable throwable1) {
            goto label_40;
        }
        try {
            feez0.p();
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
        __monitor_exit(feez0);
        return;
        try {
            feez0 = this;
            throw new feex("BluetoothGattHelper not connected.");
        }
        catch(Throwable throwable3) {
            try {
            label_37:
                __monitor_exit(object0);
                throw throwable3;
            }
            catch(Throwable throwable1) {
            }
        }
        try {
        label_40:
            feez0.p();
            throw throwable1;
        label_43:
            __monitor_exit(feez0);
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
        throw throwable0;
    }

    public final void f() {
        synchronized(this) {
            this.g(this.k);
        }
    }

    public final void g(long v) {
        BluetoothGatt bluetoothGatt0;
        Object object0;
        feez feez0;
        __monitor_enter(this);
        try {
            this.c();
        }
        catch(Throwable throwable0) {
            try {
                feez0 = this;
            }
            catch(Throwable throwable0) {
            }
            goto label_35;
        }
        try {
            object0 = this.d;
            __monitor_enter(object0);
        }
        catch(Throwable throwable1) {
            feez0 = this;
            goto label_32;
        }
        try {
            bluetoothGatt0 = this.n();
            feez.k("Discovering services");
            if(bluetoothGatt0.discoverServices()) {
                goto label_19;
            }
            feez0 = this;
            throw new feex(String.format(Locale.US, "Cannot start discovering services on device %s.", bluetoothGatt0.getDevice().getAddress()));
        }
        catch(Throwable throwable2) {
            try {
                feez0 = this;
                goto label_29;
            label_19:
                feez0 = this;
                feez0.q(bluetoothGatt0, 4, null, v);
                feez0.f = true;
                __monitor_exit(object0);
            }
            catch(Throwable throwable2) {
                goto label_29;
            }
        }
        try {
            feez0.p();
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        __monitor_exit(feez0);
        return;
        try {
            feez0 = this;
            throw new feex(String.format(Locale.US, "Cannot start discovering services on device %s.", bluetoothGatt0.getDevice().getAddress()));
        label_29:
            __monitor_exit(object0);
        }
        catch(Throwable throwable2) {
            goto label_29;
        }
        try {
            throw throwable2;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_32:
            feez0.p();
            throw throwable1;
        label_35:
            __monitor_exit(feez0);
        }
        catch(Throwable throwable0) {
            goto label_35;
        }
        throw throwable0;
    }

    public final void h() {
        this.d.notify();
        this.h = 1;
    }

    public final void i(BluetoothGattDescriptor bluetoothGattDescriptor0) {
        UUID uUID0;
        BluetoothGatt bluetoothGatt0;
        Object object0;
        feez feez0;
        __monitor_enter(this);
        try {
            this.c();
        }
        catch(Throwable throwable0) {
            try {
                feez0 = this;
            }
            catch(Throwable throwable0) {
            }
            goto label_34;
        }
        try {
            object0 = this.d;
            __monitor_enter(object0);
        }
        catch(Throwable throwable1) {
            feez0 = this;
            goto label_31;
        }
        try {
            bluetoothGatt0 = this.n();
            if(bluetoothGatt0.writeDescriptor(bluetoothGattDescriptor0)) {
                uUID0 = bluetoothGattDescriptor0.getUuid();
                feez0 = this;
                goto label_20;
            }
            feez0 = this;
            throw new feex(String.format(Locale.US, "Cannot write descriptor %s on device %s.", bluetoothGattDescriptor0, bluetoothGatt0.getDevice().getAddress()));
        }
        catch(Throwable throwable2) {
            try {
                feez0 = this;
                goto label_28;
            label_20:
                feez0.q(bluetoothGatt0, 8, uUID0, this.k);
                __monitor_exit(object0);
            }
            catch(Throwable throwable2) {
                goto label_28;
            }
        }
        try {
            feez0.p();
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        __monitor_exit(feez0);
        return;
        try {
            feez0 = this;
            throw new feex(String.format(Locale.US, "Cannot write descriptor %s on device %s.", bluetoothGattDescriptor0, bluetoothGatt0.getDevice().getAddress()));
        label_28:
            __monitor_exit(object0);
        }
        catch(Throwable throwable2) {
            goto label_28;
        }
        try {
            throw throwable2;
        }
        catch(Throwable throwable1) {
        }
        try {
        label_31:
            feez0.p();
            throw throwable1;
        label_34:
            __monitor_exit(feez0);
        }
        catch(Throwable throwable0) {
            goto label_34;
        }
        throw throwable0;
    }

    public final boolean j() {
        BluetoothGatt bluetoothGatt0 = this.e;
        if(bluetoothGatt0 == null) {
            return false;
        }
        BluetoothDevice bluetoothDevice0 = bluetoothGatt0.getDevice();
        return this.m.getConnectionState(bluetoothDevice0, 7) == 2;
    }

    public static final void k(String s) {
        if(Log.isLoggable("BluetoothGattHelper", 3)) {
            Log.d("BluetoothGattHelper", s);
        }
    }

    public final void l() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        this.c();
        int v1 = FIN.finallyOpen$NT();
        if(this.n().requestConnectionPriority(0)) {
            FIN.finallyCodeBegin$NT(v1);
            this.p();
            FIN.finallyCodeEnd$NT(v1);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new feex("Error calling requestConnectionPriority()");
    }

    public final void m(BluetoothGattCharacteristic bluetoothGattCharacteristic0) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        this.c();
        int v1 = FIN.finallyOpen$NT();
        BluetoothGatt bluetoothGatt0 = this.n();
        if(bluetoothGatt0.setCharacteristicNotification(bluetoothGattCharacteristic0, true)) {
            FIN.finallyCodeBegin$NT(v1);
            this.p();
            FIN.finallyCodeEnd$NT(v1);
            FIN.finallyCodeBegin$NT(v);
            return;
        }
        throw new feex(String.format(Locale.US, "Cannot set characteristic notification %s on device %s.", bluetoothGattCharacteristic0, bluetoothGatt0.getDevice().getAddress()));
    }

    private final BluetoothGatt n() {
        feex feex0 = this.g;
        if(feex0 == null) {
            BluetoothGatt bluetoothGatt0 = this.e;
            if(bluetoothGatt0 != null) {
                return bluetoothGatt0;
            }
            throw new feex("BluetoothGattHelper not connected");
        }
        try {
            throw feex0;
        }
        catch(Throwable throwable0) {
            this.g = null;
            throw throwable0;
        }
    }

    private final void o(BluetoothGatt bluetoothGatt0) {
        try {
            bluetoothGatt0.close();
            this.e = null;
            this.f = false;
        }
        catch(Throwable throwable0) {
            this.e = null;
            this.f = false;
            throw throwable0;
        }
    }

    private final void p() {
        this.j.unlock();
    }

    private final void q(BluetoothGatt bluetoothGatt0, int v, UUID uUID0, long v1) {
        try {
            this.h = v;
            this.g = null;
            long v3 = System.currentTimeMillis();
            long v4 = v3 + v1;
            int v5;
            while((v5 = this.h) != 1) {
                if(v3 >= v4) {
                    if(v5 != 1) {
                        throw new fefb(String.format(Locale.US, "Operation %s on device %s uuid %s timed out after %dms.", feey.a(this.h), bluetoothGatt0.getDevice().getAddress(), uUID0, v1));
                    }
                    break;
                }
                this.d.wait(v4 - v3);
                v3 = System.currentTimeMillis();
            }
            feex feex0 = this.g;
            if(feex0 != null) {
                throw feex0;
            }
            FIN.finallyCodeBegin$NT(v2);
            this.h = 1;
            this.g = null;
            FIN.finallyCodeEnd$NT(v2);
        }
        catch(InterruptedException interruptedException0) {
            feez.k("Caught InterruptedException; throwing RuntimeException");
            throw new RuntimeException(interruptedException0);
        }
    }
}

