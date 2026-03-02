import j..util.Objects;
import java.util.NoSuchElementException;

public final class ggyk extends ggqj {
    final ggyl a;
    private ggym b;
    private final long c;

    public ggyk(ggyl ggyl0) {
        Objects.requireNonNull(ggyl0);
        this.a = ggyl0;
        super();
        this.b = ggyl0.a.v(12);
        this.c = ggyl0.a.w(12).c;
    }

    @Override
    public final boolean hasNext() {
        return this.b.c != this.c;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.b;
        this.b = ((ggym)object0).C();
        return object0;
    }
}

