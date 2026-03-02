import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

public final class qjt implements qlb {
    @Override  // qlb
    public final void a(Object object0) {
        if(!(((Throwable)object0) instanceof SocketException) && !(((Throwable)object0) instanceof ClosedChannelException) && !(((Throwable)object0) instanceof InterruptedIOException) && !(((Throwable)object0) instanceof ProtocolException) && !(((Throwable)object0) instanceof SSLException) && !(((Throwable)object0) instanceof UnknownHostException) && !(((Throwable)object0) instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", ((Throwable)object0));
        }
        qtq.b("Unable to load composition.", ((Throwable)object0));
    }
}

