import j..net.URLDecoder;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class igln {
    public static final Logger m;
    public final int n;
    public volatile ServerSocket o;
    public igmc p;
    public Thread q;
    protected final List r;
    public final igll s;
    public final igmb t;

    static {
        igln.m = Logger.getLogger(igln.class.getName());
    }

    public igln(int v) {
        this.p = new iglx();
        this.r = new ArrayList(4);
        this.n = v;
        this.t = new igmb();
        this.s = new igll(this);
    }

    @Deprecated
    protected iglv d(iglk iglk0) {
        throw null;
    }

    public static String g(String s) {
        try {
            return URLDecoder.decode(s, "UTF8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            igln.m.logp(Level.WARNING, "org.nanohttpd.protocols.http.NanoHTTPD", "decodePercent", "Encoding not supported, ignored", unsupportedEncodingException0);
            return null;
        }
    }

    public static final void h(Object object0) {
        if(object0 != null) {
            try {
                if((object0 instanceof Closeable)) {
                    ((Closeable)object0).close();
                    return;
                }
                if((object0 instanceof Socket)) {
                    ((Socket)object0).close();
                    return;
                }
                if(!(object0 instanceof ServerSocket)) {
                    throw new IllegalArgumentException("Unknown object to close");
                }
                ((ServerSocket)object0).close();
            }
            catch(IOException iOException0) {
                igln.m.logp(Level.SEVERE, "org.nanohttpd.protocols.http.NanoHTTPD", "safeClose", "Could not close", iOException0);
            }
        }
    }
}

