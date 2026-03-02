import android.bluetooth.BluetoothServerSocket;
import j..util.Objects;
import java.io.IOException;
import java.util.Map;
import jeb.synthetic.TWR;

final class czqx extends czvg {
    public final czsw a;
    public gyxo b;
    private final String c;

    public czqx(String s, bsaq bsaq0, Map map0, czts czts0) {
        super(33);
        this.b = gyxo.b;
        this.c = s;
        this.a = new czsw(bsaq0, map0, czts0);
    }

    @Override  // czvg
    public final czvf a() {
        czle czle0;
        BluetoothServerSocket bluetoothServerSocket0;
        String s;
        czsw czsw0;
        try {
            czsw0 = this.a;
            s = this.c;
            gdqs gdqs0 = czsw0.f.c.k("listenUsingInsecureL2capChannel");
            try {
                bluetoothServerSocket0 = czsw0.f.b.listenUsingInsecureL2capChannel();
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(gdqs0, throwable0);
                throw throwable0;
            }
            if(gdqs0 != null) {
                gdqs0.close();
            }
            czsw0.d = bluetoothServerSocket0;
            czsw0.a = czsw0.d.getPsm();
        }
        catch(IOException iOException0) {
            gymd gymd0 = gymd.a;
            if(iOException0.getMessage() == null) {
                gymd0 = gymd.cn;
            }
            else if(iOException0.getMessage().contains("Error: Unable to assign PSM value")) {
                gymd0 = gymd.by;
            }
            else if(iOException0.getMessage().contains("Error: ")) {
                gymd0 = gymd.bz;
            }
            czke.j(s, 4, gymt.d, gymd0, iOException0.getMessage());
            czle0 = new czle(Boolean.valueOf(false), gyxo.cK);
            goto label_32;
        }
        catch(SecurityException securityException0) {
            czkq.a.b().h("Failed to startListenIncomingSocket : %s", securityException0.getMessage());
            czle0 = new czle(Boolean.valueOf(false), gyxo.cY);
            goto label_32;
        }
        new bbln(9, new czsu(czsw0, s)).start();
        czle0 = new czle(Boolean.valueOf(true), gyxo.b);
    label_32:
        if(Objects.equals(czle0.a.d(), Boolean.valueOf(true))) {
            this.b = gyxo.b;
            return czvf.b;
        }
        this.b = czle0.b;
        return czvf.c;
    }

    @Override  // czvg
    public final void g() {
        this.a.b();
        czkq.a.b().h("Close BLE L2CAP server socket, %s", gxyf.b(gxye.k, this.c));
    }
}

