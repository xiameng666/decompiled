import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.List;

public final class cqsz {
    public final cqtr a;
    public final MulticastSocket b;
    public final InetSocketAddress c;
    public final InetSocketAddress d;
    public boolean e;
    private static final cqwd f;
    private final cqwc g;
    private final int h;

    static {
        cqsz.f = new cqwd("MdnsSocket");
    }

    public cqsz(cqtr cqtr0, int v) {
        MulticastSocket multicastSocket0 = new MulticastSocket(v);
        super();
        this.a = cqtr0;
        cqrh.a.b("add listener %s", cqtr0.b);
        ((cqrh)cqtr0.a).b.add(cqtr0.b);
        this.b = multicastSocket0;
        cqwc cqwc0 = cqwc.b();
        this.g = cqwc0;
        int v1 = cqwc0.a();
        this.h = v1;
        this.c = new InetSocketAddress(cqrp.a, v1);
        this.d = new InetSocketAddress(cqrp.b, v1);
        multicastSocket0.setTimeToLive(0xFF);
        this.e = false;
    }

    final int a() {
        NetworkInterface networkInterface0;
        try {
            networkInterface0 = this.b.getNetworkInterface();
        }
        catch(SocketException socketException0) {
            a.ae(cqsz.f.a.j(), "Failed to retrieve interface index for socket.", socketException0);
            return -1;
        }
        if(networkInterface0 != null) {
            return networkInterface0.getIndex();
        }
        ((ggtj)cqsz.f.a.j()).x("Failed to retrieve interface index for socket.");
        return -1;
    }

    public final void b() {
        this.b.close();
        cqrh.a.b("remove listener %s", this.a.b);
        ((cqrh)this.a.a).b.remove(this.a.b);
    }

    public final void c() {
        List list0 = this.a.b();
        InetSocketAddress inetSocketAddress0 = this.a.c(list0) ? this.d : this.c;
        for(Object object0: list0) {
            this.b.leaveGroup(inetSocketAddress0, ((cqtu)object0).a);
        }
    }
}

