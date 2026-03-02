import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class czud implements Runnable {
    public final czun a;
    public final InputStream b;
    public final String c;
    public final int d;

    public czud(czun czun0, InputStream inputStream0, String s, int v) {
        this.a = czun0;
        this.b = inputStream0;
        this.c = s;
        this.d = v;
    }

    @Override
    public final void run() {
        int v1;
        int v;
        String s;
        czun czun0;
        try {
            czun0 = this.a;
            s = this.c;
            v = this.d;
            DataInputStream dataInputStream0 = new DataInputStream(new BufferedInputStream(this.b));
            while(true) {
                v1 = dataInputStream0.readInt();
                if(((long)v1) <= hvog.X() && v1 > 3) {
                    byte[] arr_b = new byte[v1];
                    dataInputStream0.readFully(arr_b);
                    czun0.n(s, v, false, arr_b);
                }
                else {
                    if(!hvol.ap() || v1 != 0) {
                        break;
                    }
                    czkq.a.e().p("Received a garbage packet from L2CAP socket.", new Object[0]);
                }
            }
            czke.j(s, v, czun.m(v, false), gymd.ah, String.format("Received Length : %s, Remote MAC Address : %s", v1, czun0.b));
            czun0.e.a();
        }
        catch(IOException iOException0) {
            czke.j(s, v, czun.m(v, false), gymd.bx, String.format("Remote MAC Address : %s, IOException : %s", czun0.b, iOException0.getMessage()));
            czun0.e.a();
        }
    }
}

