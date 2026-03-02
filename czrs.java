import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class czrs extends czlg {
    private final BluetoothSocket h;
    private final czjy i;
    private final OutputStream j;

    public czrs(BluetoothSocket bluetoothSocket0, int v) {
        super(String.format("BluetoothClassicSocket:%s(%s)", bluetoothSocket0, bluetoothSocket0.getRemoteDevice().getAddress()), v);
        this.h = bluetoothSocket0;
        this.i = null;
        this.j = null;
    }

    private czrs(BluetoothSocket bluetoothSocket0, OutputStream outputStream0) {
        super(String.format("BluetoothClassicSocket_Virtual:%s", bluetoothSocket0.getRemoteDevice().getAddress()), 0);
        this.h = null;
        this.i = new czjy();
        this.j = outputStream0;
    }

    @Override  // czlg
    public final int a() {
        return 2;
    }

    @Override  // czlg
    public final czlg d(OutputStream outputStream0) {
        if(!this.j()) {
            return new czrs(this.h, outputStream0);
        }
        throw new IOException("Creating the virtual socket on a virtual socket is not allowed.");
    }

    @Override  // czlg
    public final InputStream e() {
        return this.j() ? this.i : this.h.getInputStream();
    }

    @Override  // czlg
    public final OutputStream f() {
        return this.j() ? this.j : this.h.getOutputStream();
    }

    @Override  // czlg
    public final void h() {
        if(!this.j()) {
            this.h.close();
            return;
        }
        bbpb.b(this.i);
        bbpb.b(this.j);
    }

    @Override  // czlg
    public final void i(byte[] arr_b) {
        czjy czjy0 = this.i;
        if(czjy0 == null) {
            throw new IOException("Feeding data on a physical socket is not allowed.");
        }
        czjy0.a(arr_b);
    }

    @Override  // czlg
    public final boolean j() {
        return this.h == null;
    }
}

