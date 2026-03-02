import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class czpf extends czvg {
    public final BluetoothDevice a;
    public final String b;
    public final String c;
    public czrs d;
    public final bsaq e;
    public int f;
    public final Map g;
    public gyxo h;
    private final cump i;
    private final SecureRandom j;
    private final String k;
    private final boolean l;

    public czpf(BluetoothDevice bluetoothDevice0, String s, cump cump0, bsaq bsaq0, String s1, Map map0, boolean z) {
        super(23, cump0);
        this.h = gyxo.ca;
        this.j = new SecureRandom();
        this.a = bluetoothDevice0;
        this.b = s;
        this.c = String.format("{%s:%s}", bluetoothDevice0.getName(), s);
        this.i = cump0;
        this.e = bsaq0;
        this.k = s1;
        this.g = map0;
        this.l = z;
    }

    @Override  // czvg
    public final czvf a() {
        bsaq bsaq0 = this.e;
        if(bsaq0 != null && bsaq0.u()) {
            boolean z = bsaq0.o();
            czkq.a.b().h("Cancel bluetooth scanning before connecting, result = %s", Boolean.valueOf(z));
        }
        czpe czpe0 = new czpe(this);
        long v = hvog.a.bk().K();
        int v1 = (int)hvog.a.bk().J();
        czrs czrs0 = (czrs)gxyl.a(czpe0, "ConnectToBluetoothDevice", new gxyk(new gxyj(v + ((long)this.j.nextInt(v1))), this.i.a, 3));
        this.d = czrs0;
        if(czrs0 == null) {
            return czvf.c;
        }
        czkq.a.d().h("Successfully created client Bluetooth socket to %s", this.c);
        return this.i(24);
    }

    public final czrs c() {
        BluetoothSocket bluetoothSocket0;
        gmcu gmcu0 = new gmcu();
        try {
            bluetoothSocket0 = this.a.createInsecureRfcommSocketToServiceRecord(czph.e(czph.d(this.b, this.l)));
        }
        catch(IOException iOException0) {
            bsaq bsaq0 = this.e;
            if(bsaq0 == null) {
                czke.k(this.b, 8, gylz.d, gymd.aa);
            }
            else if(bsaq0.v()) {
                gymd gymd0 = czki.a(iOException0);
                czke.l(this.b, 8, gymb.j, gymd0, String.format("BluetoothSocketName : %s, Exception : %s", this.c, iOException0.getMessage()));
            }
            else {
                czke.k(this.b, 8, gylz.d, gymd.aa);
            }
            this.h = gyxo.do;
            bluetoothSocket0 = null;
        }
        new bbln(9, new czpd(this, bluetoothSocket0, gmcu0)).start();
        try {
            return (czrs)gmcu0.v(hvog.a.bk().H(), TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException unused_ex) {
            czke.a(new cvae(this.b, 8, this.k), gymb.j, gymd.t, null);
            Thread.currentThread().interrupt();
            if(this.h == gyxo.ca) {
                this.h = gyxo.dq;
            }
        }
        catch(ExecutionException unused_ex) {
            czke.a(new cvae(this.b, 8, this.k), gymb.j, gymd.u, null);
            if(this.h == gyxo.ca) {
                this.h = gyxo.dr;
            }
        }
        catch(TimeoutException unused_ex) {
            czke.a(new cvae(this.b, 8, this.k), gymb.j, gymd.y, null);
            if(this.h == gyxo.ca) {
                this.h = gyxo.ds;
            }
        }
        gmcu0.cancel(false);
        czmk.z(bluetoothSocket0, "Bluetooth", this.c);
        return null;
    }
}

