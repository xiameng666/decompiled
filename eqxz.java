import android.bluetooth.BluetoothDevice;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public final class eqxz implements Runnable {
    public final eqyb a;
    public final BluetoothDevice b;

    public eqxz(eqyb eqyb0, BluetoothDevice bluetoothDevice0) {
        this.a = eqyb0;
        this.b = bluetoothDevice0;
    }

    @Override
    public final void run() {
        InputStream inputStream0;
        eqyb eqyb0;
        try {
            eqyb0 = this.a;
            eqyb.a.d("Start connected thread", new Object[0]);
            UUID uUID0 = UUID.fromString(eqyb0.b);
            eqyb0.f = this.b.createInsecureRfcommSocketToServiceRecord(uUID0);
        }
        catch(IOException iOException0) {
            eqyb.a.l(iOException0);
            return;
        }
        if(eqyb0.f != null) {
            try {
                eqyb.a.d("Connect Socket", new Object[0]);
                eqyb0.f.connect();
            }
            catch(IOException iOException1) {
                eqyb.a.l(iOException1);
                return;
            }
        }
        eqyb0.h.e(gjkj.v);
        try {
            inputStream0 = eqyb0.f.getInputStream();
        }
        catch(IOException iOException2) {
            eqyb.a.l(iOException2);
            return;
        }
        if(inputStream0 != null) {
            eqyb0.g = new erpg(inputStream0, new eqxy(eqyb0), 0);
            eqyb0.g.run();
        }
    }
}

