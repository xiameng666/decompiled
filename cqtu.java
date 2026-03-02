import j..util.Collection.-EL;
import java.net.NetworkInterface;
import java.util.List;

public final class cqtu {
    public final NetworkInterface a;

    public cqtu(NetworkInterface networkInterface0) {
        this.a = networkInterface0;
    }

    public final List a() {
        return (List)Collection.-EL.stream(this.a.getInterfaceAddresses()).map(new cqts()).collect(ggaf.a);
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

