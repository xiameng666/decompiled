import android.bluetooth.BluetoothSocket;
import java.io.IOException;

public final class czpd implements Runnable {
    public final czpf a;
    public final BluetoothSocket b;
    public final gmcu c;

    public czpd(czpf czpf0, BluetoothSocket bluetoothSocket0, gmcu gmcu0) {
        this.a = czpf0;
        this.b = bluetoothSocket0;
        this.c = gmcu0;
    }

    @Override
    public final void run() {
        czpf czpf0 = this.a;
        BluetoothSocket bluetoothSocket0 = this.b;
        czrs czrs0 = null;
        if(bluetoothSocket0 != null) {
            try {
                bluetoothSocket0.connect();
                czwf czwf0 = czwf.e(new czrs(bluetoothSocket0, czpf0.f), czpf0.b);
                czlg czlg0 = czwf0.c(czpf0.b);
                if(czlg0 == null) {
                    czmk.z(bluetoothSocket0, "Bluetooth", czpf0.c);
                    czpf0.h = gyxo.fk;
                }
                else {
                    czpf0.g.put(czpf0.a, czwf0);
                    czrs0 = (czrs)czlg0;
                }
            }
            catch(IOException iOException0) {
                bsaq bsaq0 = czpf0.e;
                if(bsaq0 == null) {
                    czke.k(czpf0.b, 8, gylz.d, gymd.aa);
                }
                else if(bsaq0.v()) {
                    gymd gymd0 = czki.a(iOException0);
                    czke.l(czpf0.b, 8, gymb.j, gymd0, String.format("BluetoothSocketName : %s, Exception : %s", czpf0.c, iOException0.getMessage()));
                }
                else {
                    czke.k(czpf0.b, 8, gylz.d, gymd.aa);
                }
                czpf0.h = gyxo.dp;
                czmk.z(bluetoothSocket0, "Bluetooth", czpf0.c);
            }
            catch(SecurityException securityException0) {
                czkq.a.b().f(securityException0).p("Failed to connect to bluetooth socket.", new Object[0]);
                czpf0.h = gyxo.bk;
                czmk.z(bluetoothSocket0, "Bluetooth", czpf0.c);
            }
        }
        gmcu gmcu0 = this.c;
        if(czrs0 == null) {
            gmcu0.r(new IOException());
            return;
        }
        if(gmcu0.isCancelled()) {
            czmk.A(czrs0, "Bluetooth", czpf0.c);
            gmcu0.r(new IOException());
            return;
        }
        gmcu0.q(czrs0);
    }
}

