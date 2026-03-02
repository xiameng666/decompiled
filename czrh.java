import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.io.IOException;
import java.util.UUID;

final class czrh extends czvg {
    public final String a;
    public final czts b;
    public gyxo c;
    private final Context d;
    private cztg e;

    public czrh(String s, Context context0, czts czts0) {
        super(0x20);
        this.c = gyxo.b;
        this.a = s;
        this.d = context0;
        this.b = czts0;
    }

    @Override  // czvg
    public final czvf a() {
        czle czle0;
        try {
            String s = this.a;
            Context context0 = this.d;
            UUID uUID0 = czup.e(((boolean)(cumz.j(context0) ^ 1)));
            fgvg fgvg0 = new fgvg();
            gemb gemb0 = new gemb(uUID0, czup.f, czup.g, fgvg0);
            if(((BluetoothManager)context0.getSystemService("bluetooth")) == null) {
                czke.i(s, 4, gylz.d, gymd.h);
                czle0 = new czle(gyxo.bt);
            }
            else {
                cupt cupt0 = cupt.b();
                cupt0.f(context0, gemb0.c);
                BluetoothGattServer bluetoothGattServer0 = cupt0.a();
                if(bluetoothGattServer0 == null) {
                    czke.h(s, 4, gymt.b);
                    czle0 = new czle(gyxo.cI);
                }
                else {
                    czle0 = new czle(new cztg(context0, s, bluetoothGattServer0, gemb0, czup.e(((boolean)(cumz.j(context0) ^ 1)))), gyxo.b);
                }
            }
        }
        catch(SecurityException securityException0) {
            czkq.a.e().f(securityException0).h("Failed to create a BLE server socket, %s", gxyf.b(gxye.k, this.a));
            this.c = gyxo.bk;
            return czvf.d;
        }
        cztg cztg0 = (cztg)czle0.a.g();
        if(cztg0 == null) {
            czkq.a.e().h("Failed to create a BLE server socket, %s", gxyf.b(gxye.k, this.a));
            this.c = czle0.b;
            return czvf.d;
        }
        new czrg(this, cztg0).start();
        this.e = cztg0;
        return czvf.b;
    }

    @Override  // czvg
    public final void g() {
        try {
            czri.n();
            cztg cztg0 = this.e;
            if(cztg0 == null) {
                czkq.a.d().p("Cannot close BLE server socket because bleServerSocket is null.", new Object[0]);
            }
            else {
                cztg0.close();
                czkq.a.b().h("Close BLE GATT server socket, %s", gxyf.b(gxye.k, this.a));
            }
        }
        catch(IOException | SecurityException exception0) {
            czkq.a.e().f(exception0).h("Failed to close the existing BLE server socket, %s", gxyf.b(gxye.k, this.a));
        }
        finally {
            this.e = null;
        }
    }
}

