import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

final class ibbh extends iaov {
    final SocketAddress a;
    final String b;
    final Collection c;

    public ibbh(SocketAddress socketAddress0, String s) {
        this.a = socketAddress0;
        this.b = s;
        this.c = Collections.singleton(socketAddress0.getClass());
    }

    @Override  // iaop
    public final iaou a(URI uRI0, iaon iaon0) {
        return new ibbg(this);
    }

    @Override  // iaop
    public final String b() {
        return "directaddress";
    }

    @Override  // iaov
    protected final int c() {
        return 5;
    }

    @Override  // iaov
    public final Collection d() {
        return this.c;
    }

    @Override  // iaov
    protected final void e() {
    }
}

