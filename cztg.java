import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import j..util.Objects;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cztg implements Closeable {
    public static final czth a;
    public final Map b;
    public final BlockingQueue c;
    public final AtomicBoolean d;
    private final gemb e;
    private final ExecutorService f;
    private final UUID g;

    static {
        cztg.a = new cztr();
    }

    public cztg(Context context0, String s, BluetoothGattServer bluetoothGattServer0, gemb gemb0, UUID uUID0) {
        this.b = new bxd();
        this.c = new LinkedBlockingQueue();
        this.f = cuui.d();
        this.d = new AtomicBoolean(false);
        this.e = gemb0;
        this.g = uUID0;
        fgve fgve0 = fgve.a(bluetoothGattServer0);
        if(fgve0 == null) {
            return;
        }
        czte czte0 = new czte(this, s);
        BluetoothGattService bluetoothGattService0 = new BluetoothGattService(czup.e(((boolean)(cumz.j(context0) ^ 1))), 0);
        BluetoothGattDescriptor bluetoothGattDescriptor0 = new BluetoothGattDescriptor(czup.h, 16);
        BluetoothGattCharacteristic bluetoothGattCharacteristic0 = new BluetoothGattCharacteristic(czup.f, 0x20, 0);
        bluetoothGattCharacteristic0.addDescriptor(bluetoothGattDescriptor0);
        BluetoothGattCharacteristic bluetoothGattCharacteristic1 = new BluetoothGattCharacteristic(czup.g, 8, 16);
        bluetoothGattService0.addCharacteristic(bluetoothGattCharacteristic0);
        bluetoothGattService0.addCharacteristic(bluetoothGattCharacteristic1);
        if(bluetoothGattServer0.getService(czup.e(((boolean)(cumz.j(context0) ^ 1)))) != null) {
            gged_interceptors gged0 = gged_interceptors.i(bluetoothGattServer0.getServices());
            int v = gged0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                BluetoothGattService bluetoothGattService1 = (BluetoothGattService)gged0.get(v1);
                if(cztg.b(this.g, bluetoothGattService1)) {
                    czri.n();
                    cupt.b().d(bluetoothGattService1);
                    czkq.a.b().p("Removes existing GATT service", new Object[0]);
                }
            }
        }
        czri.n();
        cupt.b().c(bluetoothGattService0);
        this.e.l(fgve0, czte0);
    }

    public final void a(Runnable runnable0) {
        this.f.execute(runnable0);
    }

    private static boolean b(UUID uUID0, BluetoothGattService bluetoothGattService0) {
        if(!Objects.equals(uUID0, bluetoothGattService0.getUuid())) {
            return false;
        }
        List list0 = bluetoothGattService0.getCharacteristics();
        if(list0.size() != 2) {
            return false;
        }
        for(Object object0: list0) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic0 = (BluetoothGattCharacteristic)object0;
            if(!Objects.equals(bluetoothGattCharacteristic0.getUuid(), czup.g) && !Objects.equals(bluetoothGattCharacteristic0.getUuid(), czup.f)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void close() {
        if(!this.d.compareAndSet(false, true)) {
            return;
        }
        cuui.h(this.f, "BleServerSocket.weaveThreadOffloader");
        cupt cupt0 = cupt.b();
        cupt0.g(this.e.c);
        BluetoothGattServer bluetoothGattServer0 = cupt0.a();
        if(bluetoothGattServer0 != null && bluetoothGattServer0.getServices() != null) {
            gged_interceptors gged0 = gged_interceptors.i(bluetoothGattServer0.getServices());
            int v1 = gged0.size();
            for(int v = 0; v < v1; ++v) {
                BluetoothGattService bluetoothGattService0 = (BluetoothGattService)gged0.get(v);
                if(cztg.b(this.g, bluetoothGattService0)) {
                    czri.n();
                    cupt.b().d(bluetoothGattService0);
                }
            }
        }
        this.c.add(cztg.a);
    }
}

