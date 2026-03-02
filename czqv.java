import com.google.android.libraries.bluetooth.BluetoothException;
import j..util.Objects;
import java.io.IOException;
import java.util.Locale;

final class czqv extends bbln {
    final czqw a;
    private final gmcu b;

    public czqv(czqw czqw0, gmcu gmcu0) {
        Objects.requireNonNull(czqw0);
        this.a = czqw0;
        super(9);
        this.b = gmcu0;
    }

    @Override
    public final void run() {
        try {
            czqw czqw0 = this.a;
            fguz fguz0 = fguz.a(czqw0.a.b);
            if(fguz0 == null) {
                czkq.a.c().p("Failed to fetch advertisements due to bluetooth adapter missing.", new Object[0]);
                return;
            }
            fgud fgud0 = new fguk(czqw0.d, fguz0).a(czqw0.b, czqw0.c);
            fgud0.k(hvog.m());
            if(!this.b.q(fgud0)) {
                fgud0.close();
            }
        }
        catch(BluetoothException bluetoothException0) {
            if(bluetoothException0.getMessage() == null) {
                czke.j(new gfss(", ").b(this.a.e), 6, gymr.g, gymd.cn, String.format(Locale.US, "BluetoothDevice : %s", this.a.b));
            }
            else if(bluetoothException0.getMessage().contains("connectGatt() returned null")) {
                czke.j(new gfss(", ").b(this.a.e), 6, gymr.g, gymd.Z, String.format(Locale.US, "BluetoothDevice : %s", this.a.b));
            }
            else if(bluetoothException0.getMessage().contains("Failed to set connectionPriority")) {
                czke.i(new gfss(", ").b(this.a.e), 6, gymr.g, gymd.ap);
            }
            else if(bluetoothException0.getMessage().contains("connect() operation interrupted.")) {
                czke.i(new gfss(", ").b(this.a.e), 6, gymr.g, gymd.aq);
            }
            else {
                czke.j(new gfss(", ").b(this.a.e), 6, gymr.g, gymd.a, String.format(Locale.US, "BluetoothDevice : %s, Exception : %s", this.a.b, bluetoothException0.getMessage()));
            }
            IOException iOException0 = new IOException();
            this.b.r(iOException0);
        }
    }
}

