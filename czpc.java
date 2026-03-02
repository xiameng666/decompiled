import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import java.io.PrintWriter;

final class czpc extends czvg {
    public final Context a;
    public final bsaq b;
    public final String c;
    public gyxo d;
    private final String e;
    private int f;

    public czpc(Context context0, BluetoothAdapter bluetoothAdapter0, String s, String s1) {
        super(21);
        this.f = -1;
        this.d = gyxo.b;
        this.a = context0;
        this.b = bsaq.j(context0, bluetoothAdapter0, "BluetoothClassic");
        this.e = s;
        this.c = s1;
    }

    @Override  // czvg
    public final czvf a() {
        bsaq bsaq0 = this.b;
        if(bsaq0 == null) {
            this.d = gyxo.bv;
            return czvf.c;
        }
        Context context0 = this.a;
        String s = this.e;
        String s1 = this.c;
        if(czrv.b().i(context0, bsaq0, s, s1)) {
            this.f = bsaq0.b();
            if(!this.c(23)) {
                this.f = -1;
                czkq.a.c().h("Failed to start Bluetooth Classic advertising because we couldn\'t set the scan mode to %d", Integer.valueOf(23));
                czrv.b().g(context0, bsaq0, s1);
                this.d = gyxo.dQ;
                return czvf.d;
            }
            return czvf.b;
        }
        czkq.a.c().h("Failed to start Bluetooth Classic advertising because we couldn\'t set the device name to %s", s);
        this.d = gyxo.bE;
        return czvf.d;
    }

    private final boolean c(int v) {
        return gxyl.b(new czpb(this, v), "SetBluetoothScanMode", new gxyk(new gxyj(hvog.a.bk().N()), null, 3));
    }

    @Override  // czvg
    public final void g() {
        bsaq bsaq0 = this.b;
        if(bsaq0 != null) {
            if(!this.c(this.f)) {
                czkq.a.e().h("Failed to restore original Bluetooth scan mode to %d", Integer.valueOf(this.f));
            }
            this.f = -1;
            czrv.b().g(this.a, bsaq0, this.c);
        }
    }

    @Override  // czvg
    public final void p(PrintWriter printWriter0) {
        String s;
        super.p(printWriter0);
        printWriter0.write(String.format("    Service ID:%s\n", this.c));
        int v = this.f;
        switch(v) {
            case -1: {
                s = "UNINITIALIZED_SCAN_MODE";
                break;
            }
            case 20: {
                s = "SCAN_MODE_NONE";
                break;
            }
            case 21: {
                s = "SCAN_MODE_CONNECTABLE";
                break;
            }
            case 23: {
                s = "SCAN_MODE_CONNECTABLE_DISCOVERABLE";
                break;
            }
            default: {
                s = "Unrecognizable scan mode: " + v;
            }
        }
        printWriter0.write(String.format("    Scan Mode:%s\n", s));
        printWriter0.write(String.format("    Device Name: %s\n", this.e));
        printWriter0.flush();
    }
}

