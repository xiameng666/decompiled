import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.List;

public final class gpsi {
    public static final InetSocketAddress a;
    public static final InetSocketAddress b;
    public final gpsr c;
    public final MulticastSocket d;
    public boolean e;
    private final gpsv f;

    static {
        gpsi.a = new InetSocketAddress(gpqr.a(), 5353);
        gpsi.b = new InetSocketAddress(gpqr.b(), 5353);
    }

    public gpsi(gpsr gpsr0, gpsv gpsv0) {
        MulticastSocket multicastSocket0 = new MulticastSocket(5353);
        super();
        this.c = gpsr0;
        this.d = multicastSocket0;
        this.f = gpsv0;
        multicastSocket0.setTimeToLive(0xFF);
        this.e = false;
    }

    public final int a() {
        MulticastSocket multicastSocket0 = this.d;
        if(!multicastSocket0.isClosed()) {
            try {
                return multicastSocket0.getNetworkInterface().getIndex();
            }
            catch(SocketException | NullPointerException exception0) {
                gpqn.b(this.f, "Failed to retrieve interface index for socket.", exception0);
                return -1;
            }
        }
        gpqn.a(this.f, "Socket is closed");
        return -1;
    }

    public final void b() {
        this.d.close();
    }

    public final void c() {
        List list0 = this.c.b();
        InetSocketAddress inetSocketAddress0 = gpsr.e(list0) ? gpsi.b : gpsi.a;
        for(Object object0: list0) {
            MulticastSocket multicastSocket0 = this.d;
            NetworkInterface networkInterface0 = ((gpss)object0).a;
            multicastSocket0.leaveGroup(inetSocketAddress0, networkInterface0);
            if(!this.e) {
                multicastSocket0.leaveGroup(gpsi.b, networkInterface0);
            }
        }
    }
}

