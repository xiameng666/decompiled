import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class fxoz implements Consumer {
    public final fxpa a;

    public fxoz(fxpa fxpa0) {
        this.a = fxpa0;
    }

    @Override
    public final void accept(Object object0) {
        ((Consumer)object0).accept(Integer.valueOf(this.a.a.c));
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

