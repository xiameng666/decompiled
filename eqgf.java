import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;

public final class eqgf implements Callable {
    public final eqgk a;

    public eqgf(eqgk eqgk0) {
        this.a = eqgk0;
    }

    @Override
    public final Object call() {
        Object[] arr_object = {this.a.b.getHostAddress(), ((int)0xB18E)};
        eqgk.a.d("Opening socket connection to %s:%d...", arr_object);
        InetSocketAddress inetSocketAddress0 = new InetSocketAddress(this.a.b, 0xB18E);
        synchronized(eqgl.a) {
        }
        Socket socket0 = new Socket();
        socket0.setTcpNoDelay(false);
        socket0.setKeepAlive(true);
        this.a.f = socket0;
        this.a.f.connect(inetSocketAddress0, ((int)hyjh.a.b().a()));
        this.a.h = new DataOutputStream(this.a.f.getOutputStream());
        this.a.i.obtainMessage(2).sendToTarget();
        this.a.g = new erpg(this.a.f.getInputStream(), new eqgg(this.a), 1);
        gmbu.t(this.a.d.d(this.a.g), new eqgh(this.a), this.a.d);
        return null;
    }
}

