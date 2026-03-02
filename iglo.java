import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;

public final class iglo implements Runnable {
    public IOException a;
    public volatile boolean b;
    private final igln c;

    public iglo(igln igln0) {
        this.b = false;
        this.c = igln0;
    }

    @Override
    public final void run() {
        try {
            this.c.o.bind(new InetSocketAddress(this.c.n));
            this.b = true;
        }
        catch(IOException iOException0) {
            this.a = iOException0;
            return;
        }
        do {
            try {
                igln igln0 = this.c;
                Socket socket0 = igln0.o.accept();
                socket0.setSoTimeout(5000);
                InputStream inputStream0 = socket0.getInputStream();
                igmb igmb0 = igln0.t;
                if(!hvol.B()) {
                    cvwe.g(socket0, ((int)hvog.C()), ((int)hvog.E()), ((int)hvog.D()));
                }
                cvwd cvwd0 = new cvwd(igln0, inputStream0, socket0, new cvvt(((cvwc)igln0)));
                ++igmb0.a;
                igmb0.b.add(cvwd0);
                Thread thread0 = new Thread(cvwd0);
                thread0.setDaemon(true);
                thread0.setName("NanoHttpd Request Processor (#" + igmb0.a + ")");
                thread0.start();
            }
            catch(IOException iOException1) {
                igln.m.logp(Level.FINE, "org.nanohttpd.protocols.http.ServerRunnable", "run", "Communication with the client broken", iOException1);
            }
        }
        while(!this.c.o.isClosed());
    }
}

