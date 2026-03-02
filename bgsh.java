import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class bgsh implements Consumer {
    @Override
    public final void accept(Object object0) {
        ((gmcf)object0).cancel(false);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

