import j..util.Objects;
import java.io.IOException;

final class czrg extends bbln {
    final cztg a;
    final czrh b;

    public czrg(czrh czrh0, cztg cztg0) {
        this.a = cztg0;
        Objects.requireNonNull(czrh0);
        this.b = czrh0;
        super(9);
    }

    @Override
    public final void run() {
        czth czth0;
        try {
            while(true) {
                czts czts0 = this.b.b;
                cztg cztg0 = this.a;
                String s = this.b.a;
                if(cztg0.d.get()) {
                    czke.i(s, 4, gylz.g, gymd.ay);
                    throw new cztf();
                }
                try {
                    czth0 = (czth)cztg0.c.take();
                }
                catch(InterruptedException interruptedException0) {
                    czke.i(s, 4, gymt.c, gymd.t);
                    throw new IOException("BleServerSocket interrupted while waiting for incoming BLE sockets", interruptedException0);
                }
                if(czth0 == cztg.a) {
                    throw new cztf();
                }
                czts0.a(czth0);
            }
        }
        catch(IOException unused_ex) {
            try {
                this.a.close();
            }
            catch(IOException iOException0) {
                czkq.a.e().f(iOException0).i("Failed to close %sSocket %s", "BLE", "Server Socket");
                return;
            }
            czkq.a.d().i("Closed %sSocket %s", "BLE", "Server Socket");
        }
    }
}

