import java.util.AbstractSet;
import java.util.Iterator;

final class bwx extends AbstractSet {
    final bxd a;

    public bwx(bxd bxd0) {
        this.a = bxd0;
        super();
    }

    @Override
    public final Iterator iterator() {
        return new bxa(this.a);
    }

    @Override
    public final int size() {
        return this.a.d_num;
    }
}

