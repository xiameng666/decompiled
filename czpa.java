import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.SystemClock;
import j..util.Objects;
import java.io.IOException;
import java.util.Set;

final class czpa extends bbln {
    final BluetoothServerSocket a;
    final String b;
    final String c;
    final czph g;
    final cvgg h;

    public czpa(czph czph0, BluetoothServerSocket bluetoothServerSocket0, String s, cvgg cvgg0, String s1) {
        this.a = bluetoothServerSocket0;
        this.b = s;
        this.h = cvgg0;
        this.c = s1;
        Objects.requireNonNull(czph0);
        this.g = czph0;
        super(9);
    }

    @Override
    public final void run() {
        long v = SystemClock.elapsedRealtime();
        try {
            while(true) {
                v = SystemClock.elapsedRealtime();
                BluetoothSocket bluetoothSocket0 = this.a.accept();
                czrs czrs0 = new czrs(bluetoothSocket0, 1);
                String s = czrs0.a;
                String s1 = this.b;
                czwf czwf0 = czwf.d(czrs0, s1);
                BluetoothDevice bluetoothDevice0 = bluetoothSocket0.getRemoteDevice();
                this.g.g.put(bluetoothDevice0, czwf0);
                czvg czvg0 = new czvg(24);
                Set set0 = this.g.f;
                set0.add(czvg0);
                if(czvk.f(this.g.c.a(czvg0))) {
                    czrs0.g(new czoy(this, czvg0, bluetoothSocket0));
                    if(czwf0.c(s1) == null) {
                        this.h.a(s1, czrs0);
                    }
                    else {
                        czlg czlg0 = czwf0.c(s1);
                        gftb.check(czlg0);
                        this.h.a(s1, ((czrs)czlg0));
                    }
                }
                else {
                    set0.remove(czvg0);
                    czkq.a.c().p("Failed to create a BluetoothClassicSocket because we were unable to register the MediumOperation.", new Object[0]);
                    czmk.A(czrs0, "BluetoothClassic", s);
                }
            }
        }
        catch(IOException iOException0) {
            if(SystemClock.elapsedRealtime() - v <= hvog.a.bk().da()) {
                gymd gymd0 = gymd.a;
                if(iOException0.getMessage() == null) {
                    gymd0 = gymd.cn;
                }
                else if(iOException0.getMessage().contains("bt socket is not in listen state")) {
                    gymd0 = gymd.bD;
                }
                else if(iOException0.getMessage().contains("Connection failure, wrong signal size")) {
                    gymd0 = gymd.bE;
                }
                else if(iOException0.getMessage().contains("Connection failure, status")) {
                    gymd0 = gymd.bF;
                }
                czke.a(new cvae(this.b, 4, this.c), gymt.f, gymd0, iOException0.getMessage());
            }
        }
        finally {
            czmk.aa(this.a, this.b);
        }
    }
}

