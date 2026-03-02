import j..util.Objects;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public final class iamc extends iapb {
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;
    private static final long serialVersionUID;

    public iamc(SocketAddress socketAddress0, InetSocketAddress inetSocketAddress0, String s, String s1) {
        gftb.u(((boolean)(((InetSocketAddress)socketAddress0).isUnresolved() ^ 1)), "The proxy address %s is not resolved", socketAddress0);
        this.a = socketAddress0;
        this.b = inetSocketAddress0;
        this.c = s;
        this.d = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof iamc) ? Objects.equals(this.a, ((iamc)object0).a) && Objects.equals(this.b, ((iamc)object0).b) && Objects.equals(this.c, ((iamc)object0).c) && Objects.equals(this.d, ((iamc)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override
    public final String toString() {
        ToStringHelper gfsv0 = MoreObjects.toStringHelper(this);
        gfsv0.add("proxyAddr", this.a);
        gfsv0.add("targetAddr", this.b);
        gfsv0.add("username", this.c);
        gfsv0.addBool("hasPassword", this.d != null);
        return gfsv0.toString();
    }
}

