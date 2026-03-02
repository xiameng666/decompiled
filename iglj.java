import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

public class iglj implements Runnable {
    public final InputStream a;
    public final Socket b;
    private final igln c;

    public iglj(igln igln0, InputStream inputStream0, Socket socket0) {
        this.c = igln0;
        this.a = inputStream0;
        this.b = socket0;
    }

    @Override
    public void run() {
        OutputStream outputStream1;
        Socket socket0;
        OutputStream outputStream0 = null;
        try {
            socket0 = this.b;
            outputStream1 = socket0.getOutputStream();
            goto label_6;
        }
        catch(Exception exception0) {
            goto label_14;
            try {
            label_6:
                iglz iglz0 = new iglz();
                InetAddress inetAddress0 = socket0.getInetAddress();
                iglk iglk0 = new iglk(this.c, iglz0, this.a, outputStream1, inetAddress0);
                while(true) {
                    if(socket0.isClosed()) {
                        goto label_28;
                    }
                    iglk0.a();
                }
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                goto label_22;
            }
            outputStream0 = outputStream1;
            try {
            label_14:
                if((!(exception0 instanceof SocketException) || !"NanoHttpd Shutdown".equals(exception0.getMessage())) && !(exception0 instanceof SocketTimeoutException)) {
                    igln.m.logp(Level.SEVERE, "org.nanohttpd.protocols.http.ClientHandler", "run", "Communication with the client broken, or an bug in the handler code", exception0);
                }
            }
            catch(Throwable throwable0) {
                goto label_23;
            }
        }
        catch(Throwable throwable0) {
            goto label_23;
        }
        igln.h(outputStream0);
        goto label_29;
    label_22:
        outputStream0 = outputStream1;
    label_23:
        igln.h(outputStream0);
        igln.h(this.a);
        igln.h(this.b);
        this.c.t.a(this);
        throw throwable0;
    label_28:
        igln.h(outputStream1);
    label_29:
        igln.h(this.a);
        igln.h(this.b);
        this.c.t.a(this);
    }
}

