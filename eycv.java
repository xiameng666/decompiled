import android.bluetooth.BluetoothDevice;
import android.os.CancellationSignal;

final class eycv implements ibts {
    final eycx a;
    final BluetoothDevice b;
    final ibvd c;

    public eycv(eycx eycx0, BluetoothDevice bluetoothDevice0, ibvd ibvd0) {
        this.a = eycx0;
        this.b = bluetoothDevice0;
        this.c = ibvd0;
        super();
    }

    @Override  // ibts
    public final Object a(Object object0) {
        Throwable throwable0 = (Throwable)object0;
        ((ggtj)this.a.a.h()).x("CsRangeValidator cancellationSignal invoked.");
        this.a.e(this.b, ((CancellationSignal)this.c.a));
        return ibom.a;
    }
}

