import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;

public final class czsu implements Runnable {
    public final czsw a;
    public final String b;

    public czsu(czsw czsw0, String s) {
        this.a = czsw0;
        this.b = s;
    }

    @Override
    public final void run() {
        czsw czsw0 = this.a;
        String s = this.b;
        try {
            BluetoothServerSocket bluetoothServerSocket0;
            while((bluetoothServerSocket0 = czsw0.d) != null) {
                BluetoothSocket bluetoothSocket0 = bluetoothServerSocket0.accept();
                if(bluetoothSocket0 == null) {
                    czkq.a.c().p("Failed! Got null incoming L2CAP socket.", new Object[0]);
                }
                else {
                    czsw0.a(bluetoothSocket0);
                    czsr czsr0 = new czsr(czsw0, s, bluetoothSocket0);
                    czsw0.b.execute(czsr0);
                }
            }
        }
        catch(IOException unused_ex) {
        }
    }
}

