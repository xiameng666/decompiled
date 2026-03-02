import j..util.Objects;
import java.util.Iterator;

public final class ggyl implements Iterable {
    final ggym a;

    public ggyl(ggym ggym0) {
        Objects.requireNonNull(ggym0);
        this.a = ggym0;
        super();
    }

    @Override
    public final Iterator iterator() {
        return new ggyk(this);
    }
}

