import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class apsd implements Consumer {
    @Override
    public final void accept(Object object0) {
        ((gmcd)object0).cancel(false);
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

