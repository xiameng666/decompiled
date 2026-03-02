import j..util.Objects;
import java.util.Iterator;

final class ggey extends ggqj {
    final Iterator a;
    Iterator b;
    final ggfd c;

    public ggey(ggfd ggfd0) {
        Objects.requireNonNull(ggfd0);
        this.c = ggfd0;
        super();
        this.a = ggfd0.map.g().om();
        this.b = gggw.a;
    }

    @Override
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override
    public final Object next() {
        if(!this.b.hasNext()) {
            Object object0 = this.a.next();
            this.b = ((ggds)object0).om();
        }
        return this.b.next();
    }
}

