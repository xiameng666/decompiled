import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ehvb implements Consumer {
    public final ehvg a;

    public ehvb(ehvg ehvg0) {
        this.a = ehvg0;
    }

    @Override
    public final void accept(Object object0) {
        ehvl ehvl0 = (ehvl)object0;
        this.a.g.k(ehvl0.a, ehvl0.b);
        this.a.f.add(ehvl0.a);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

