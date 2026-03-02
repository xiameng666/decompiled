import j..util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ialw {
    public static final iakj a;
    public final List b;
    public final iakk c;
    private final int d;

    static {
        ialw.a = new iakj("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    }

    public ialw(SocketAddress socketAddress0) {
        this(socketAddress0, iakk.a);
    }

    public ialw(SocketAddress socketAddress0, iakk iakk0) {
        this(Collections.singletonList(socketAddress0), iakk0);
    }

    public ialw(List list0, iakk iakk0) {
        gftb.b(((boolean)(list0.isEmpty() ^ 1)), "addrs is empty");
        List list1 = DesugarCollections.unmodifiableList(new ArrayList(list0));
        this.b = list1;
        gftb.z(iakk0, "attrs");
        this.c = iakk0;
        this.d = list1.hashCode();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ialw)) {
            return false;
        }
        List list0 = this.b;
        List list1 = ((ialw)object0).b;
        if(list0.size() == list1.size()) {
            for(int v = 0; v < list0.size(); ++v) {
                if(!((SocketAddress)list0.get(v)).equals(list1.get(v))) {
                    return false;
                }
            }
            return this.c.equals(((ialw)object0).c);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.d;
    }

    @Override
    public final String toString() {
        return "[" + this.b + "/" + this.c.toString() + "]";
    }
}

