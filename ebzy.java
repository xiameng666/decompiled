import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class ebzy implements Consumer {
    public final ibts a;

    public ebzy(ibts ibts0) {
        this.a = ibts0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.a(object0);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

