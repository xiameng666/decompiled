import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cqka implements Consumer {
    public final cqkb a;

    public cqka(cqkb cqkb0) {
        this.a = cqkb0;
    }

    @Override
    public final void accept(Object object0) {
        cqix.p.a(this.a.a, ((Boolean)object0).booleanValue());
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

