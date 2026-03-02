import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class udq implements Iterable {
    public final List a;

    public udq() {
        this(new ArrayList(2));
    }

    public udq(List list0) {
        this.a = list0;
    }

    final int a() {
        return this.a.size();
    }

    final udq b() {
        return new udq(new ArrayList(this.a));
    }

    final boolean c() {
        return this.a.isEmpty();
    }

    final boolean d(uoz uoz0) {
        udp udp0 = new udp(uoz0, uqg.b);
        return this.a.contains(udp0);
    }

    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}

