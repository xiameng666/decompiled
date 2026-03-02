import android.bluetooth.BluetoothDevice;
import j..util.Objects;
import java.util.concurrent.atomic.AtomicReference;

final class cyls extends gxum {
    final byte[] a;
    final BluetoothDevice b;
    final hfub c;
    final byte[] d;
    final AtomicReference e;
    final cylw f;

    public cyls(cylw cylw0, byte[] arr_b, BluetoothDevice bluetoothDevice0, hfub hfub0, byte[] arr_b1, AtomicReference atomicReference0) {
        this.a = arr_b;
        this.b = bluetoothDevice0;
        this.c = hfub0;
        this.d = arr_b1;
        this.e = atomicReference0;
        Objects.requireNonNull(cylw0);
        this.f = cylw0;
        super("SendSassEvent");
    }

    @Override
    public final void run() {
        BluetoothDevice bluetoothDevice0 = this.b;
        hfub hfub0 = this.c;
        byte[] arr_b = this.d;
        cylw cylw0 = this.f;
        fgme fgme0 = cylw0.o.b((this.a == null ? new byte[0] : this.a), bluetoothDevice0, 7, ((fgmh)hfub0).p, (arr_b == null ? new byte[0] : arr_b));
        if(fgme0 == null) {
            ((ggtj)cylw0.n.g().ar(7814)).x("NearbyDeviceManager: sendMessageViaEventStream get null, should be test only issue!");
            fgme0 = fgme.d;
        }
        this.e.set(fgme0);
        ((ggtj)cylw0.n.d().ar(7813)).Y("NearbyDeviceManager: sendMessageViaEventStream, device:%s, eventCode:%s, data:%s, result:%s", fgjo.c(bluetoothDevice0.getAddress()), ((Enum)hfub0).name(), cyne.b(arr_b), fgme0.name());
    }
}

