import j..util.Objects;
import java.util.AbstractList;

public final class ggzo extends AbstractList {
    final int a;
    final int b;
    final ggzr c;

    public ggzo(ggzr ggzr0, int v, int v1) {
        this.a = v;
        this.b = v1;
        Objects.requireNonNull(ggzr0);
        this.c = ggzr0;
        super();
    }

    @Override
    public final Object get(int v) {
        return new ggzn(this, this.a, v);
    }

    @Override
    public final int size() {
        return this.b;
    }
}

