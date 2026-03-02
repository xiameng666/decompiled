import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ehvs implements Consumer {
    public final ehvw a;

    public ehvs(ehvw ehvw0) {
        this.a = ehvw0;
    }

    @Override
    public final void accept(Object object0) {
        evql evql0 = ((emvd)object0).d();
        ehvq ehvq0 = new ehvq(this.a);
        evql0.y(gmap.a, ehvq0);
        ehvr ehvr0 = new ehvr();
        evql0.v(this.a.a, ehvr0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

