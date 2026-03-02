import android.net.TrafficStats;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.net.ssl.SSLSocketFactory;
import jeb.synthetic.FIN;

public final class bnhh {
    public static final bboh a;
    public static final Charset b;
    public volatile bnhg c;
    public volatile Socket d;
    public final bnhi e;
    public final bnhl f;
    public final bnhm g;
    public final bnhk h;
    private static final ThreadFactory i;
    private final URI j;
    private Thread k;

    static {
        bnhh.a = bnaa.e("WebSocket");
        bnhh.b = Charset.forName("UTF-8");
        bnhh.i = Executors.defaultThreadFactory();
    }

    public bnhh(URI uRI0, bnhi bnhi0) {
        this(uRI0, bnhi0, new HashMap());
    }

    public bnhh(URI uRI0, bnhi bnhi0, Map map0) {
        this.c = bnhg.a;
        this.j = uRI0;
        this.h = new bnhk(uRI0, map0);
        this.f = new bnhl(bnhi0);
        this.g = new bnhm();
        this.e = bnhi0;
    }

    protected final Socket a() {
        int v;
        ((ggtj)bnhh.a.h()).x("createSocket()");
        URI uRI0 = this.j;
        String s = uRI0.getScheme();
        String s1 = uRI0.getHost();
        if(s != null && s1 != null) {
            if(uRI0.getPort() != -1) {
                v = uRI0.getPort();
            }
            else if("wss".equals(s)) {
                v = 443;
            }
            else {
                v = 80;
            }
            try {
                Socket socket0 = SSLSocketFactory.getDefault().createSocket(s1, v);
                bmzx.c("HYBRID_WEBSOCKET_CREATED", null);
                return socket0;
            }
            catch(UnknownHostException unknownHostException0) {
                bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_HOST");
                throw new bnhj("unknown host: " + s1, unknownHostException0);
            }
            catch(IOException iOException0) {
                bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_PROTOCOL");
                throw new bnhj("unsupported protocol: " + s, iOException0);
            }
        }
        bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_HOST");
        throw new bnhj("null scheme or host");
    }

    public final void b() {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        ((ggtj)bnhh.a.h()).B("close() with state=%s", this.c);
        switch(this.c.ordinal()) {
            case 0: {
                this.c = bnhg.e;
                FIN.finallyExec$NT(v);
                return;
            }
            case 1: {
                this.c();
                FIN.finallyExec$NT(v);
                return;
            }
            case 2: {
                this.c();
                FIN.finallyExec$NT(v);
                return;
            }
            default: {
                FIN.finallyCodeBegin$NT(v);
            }
        }
    }

    public final void c() {
        synchronized(this) {
            bmzx.c("HYBRID_WEBSOCKET_CLOSED", null);
            if(this.c == bnhg.e) {
                return;
            }
            this.f.b();
            if(this.d != null) {
                try {
                    this.d.close();
                }
                catch(IOException iOException0) {
                    a.ae(bnhh.a.i(), "Socket failed to close", iOException0);
                }
                finally {
                    TrafficStats.clearThreadStatsTag();
                }
            }
            this.c = bnhg.e;
            this.e.c();
        }
    }

    public final void d() {
        synchronized(this) {
            bboh bboh0 = bnhh.a;
            ((ggtj)bboh0.h()).x("connect()");
            if(this.c != bnhg.a) {
                ((ggtj)bboh0.i()).x("connect() has already been called");
                bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_STATE");
                bnhj bnhj0 = new bnhj("connect() has already been called");
                this.e.d(bnhj0);
                this.b();
                return;
            }
            this.f.b = new bnhf(this);
            bnhe bnhe0 = new bnhe(this);
            Thread thread0 = bnhh.i.newThread(bnhe0);
            this.k = thread0;
            thread0.setName("WebSocket");
            this.c = bnhg.b;
            this.k.start();
        }
    }

    public final void e(byte[] arr_b) {
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        bboh bboh0 = bnhh.a;
        ((ggtj)bboh0.h()).x("send()");
        if(this.c != bnhg.c) {
            ((ggtj)bboh0.i()).x("send() called when websocket is not connected");
            bmzx.c("UNKNOWN", "WEBSOCKET_INVALID_STATE");
            bnhj bnhj0 = new bnhj("sending data error: websocket is not connected");
            this.e.d(bnhj0);
            FIN.finallyExec$NT(v);
            return;
        }
        try {
            this.g.a(arr_b);
            FIN.finallyExec$NT(v);
        }
        catch(IOException iOException0) {
            a.ae(bnhh.a.i(), "Failed to send frame", iOException0);
            bmzx.c("UNKNOWN", "WEBSOCKET_SENDING_ERROR");
            bnhj bnhj2 = new bnhj("Failed to send frame", iOException0);
            this.e.d(bnhj2);
            this.b();
            FIN.finallyExec$NT(v);
        }
        catch(bnhj bnhj1) {
            a.ae(bnhh.a.i(), "Failed to send frame", bnhj1);
            bmzx.c("UNKNOWN", "WEBSOCKET_SENDING_ERROR");
            this.e.d(bnhj1);
            this.b();
            FIN.finallyCodeBegin$NT(v);
        }
    }
}

