import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fcwd implements Consumer {
    public final fcvw a;

    public fcwd(fcvw fcvw0) {
        this.a = fcvw0;
    }

    @Override
    public final void accept(Object object0) {
        this.a.b[2].b(((Boolean)object0));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

